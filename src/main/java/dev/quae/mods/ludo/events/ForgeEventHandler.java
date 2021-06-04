package dev.quae.mods.ludo.events;

import dev.quae.mods.ludo.Ludo;
import dev.quae.mods.ludo.Ludo.RecipeTypes;
import dev.quae.mods.ludo.materials.elements.Element;
import dev.quae.mods.ludo.materials.isotopes.IIsotope;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.stats.Stats;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.LeftClickBlock;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.event.entity.player.PlayerWakeUpEvent;
import net.minecraftforge.eventbus.api.Event.Result;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.items.ItemHandlerHelper;

@EventBusSubscriber(bus = Bus.FORGE, modid = Ludo.ID)
public final class ForgeEventHandler {
    @SubscribeEvent
    public static void onStartBreakingStone(final LeftClickBlock event) {
        final World world = event.getWorld();
        final ItemStack stack = event.getItemStack();
        if (world.isRemote() || !stack.isEmpty()) {
            return;
        }
        final BlockPos pos = event.getPos();
        final BlockState state = world.getBlockState(pos);
        if (state.getBlock() != Blocks.STONE) {
            return;
        }
        if(event.getPlayer().isCreative()){
            return;
        }
        event.setUseBlock(Result.DENY);
        event.setUseItem(Result.DENY);
        event.setCanceled(true);
        final PlayerEntity player = event.getPlayer();
        final int chance = world.rand.nextInt(100);
        if (chance < 5) {
            ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(Ludo.Items.HARD_PEBBLE));
        } else if (chance < 25) {
            ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(Ludo.Items.SOFT_PEBBLE));
        }
    }

    @SubscribeEvent
    public static void onPlayerRightClickItem(final PlayerInteractEvent.RightClickItem event) {
        final PlayerEntity player = event.getPlayer();
        final PlayerInventory playerInv = player.inventory;
        final World world = event.getWorld();
        final ActionResultType actionResultType = world.getRecipeManager().getRecipe(RecipeTypes.TWO_HANDED, playerInv, world)
                .filter(recipe -> recipe.matches(playerInv, world))
                .map(recipe -> recipe.getCraftingResult(playerInv))
                .filter(it -> !it.isEmpty())
                .map(result -> {
                    final ItemStack mainHand = playerInv.getCurrentItem();
                    final ItemStack offHand = playerInv.offHandInventory.get(0);
                    if (!mainHand.getToolTypes().isEmpty()) {
                        mainHand.damageItem(1, player, it -> it.sendBreakAnimation(Hand.MAIN_HAND));
                    } else {
                        mainHand.split(1);
                    }
                    if (!offHand.getToolTypes().isEmpty()) {
                        offHand.damageItem(1, player, it -> it.sendBreakAnimation(Hand.OFF_HAND));
                    } else {
                        offHand.split(1);
                    }
                    playerInv.addItemStackToInventory(result);
                    player.addStat(Stats.ITEM_CRAFTED.get(result.getItem()), result.getCount());
                    return ActionResultType.SUCCESS;
                }).orElse(ActionResultType.FAIL);
        if (actionResultType.isSuccessOrConsume()) {
            event.setCancellationResult(actionResultType);
            event.setCanceled(true);
            event.setResult(Result.DENY);
        }
    }

    @SubscribeEvent
    public static void onAddToTooltip(final ItemTooltipEvent event) {
        final ClientWorld world = Minecraft.getInstance().world;
        world.getRecipeManager().getRecipe(IRecipeType.BLASTING, new Inventory(event.getItemStack()), world).ifPresent(recipe -> {
            event.getToolTip().add(new TranslationTextComponent("tooltip.campfire_smelter.recipe", I18n.format(recipe.getRecipeOutput().getTranslationKey())));
        });
    }

    @SubscribeEvent
    public static void onRightClickLeaves(final RightClickBlock event) {
        // Do nothing on the client
        final World world = event.getWorld();
        if (world.isRemote()) {
            return;
        }
        // Do nothing on anything that isn't a leaves block.
        final BlockPos pos = event.getPos();
        final BlockState leaves = world.getBlockState(pos);
        if (!leaves.isIn(BlockTags.LEAVES)) {
            return;
        }
        // Only work if the player is holding a leaf or nothing.
        final PlayerEntity player = event.getPlayer();
        final ItemStack mainHandItem = player.getHeldItemMainhand();
        if (!(mainHandItem.isEmpty() || Ludo.Tags.Items.LEAVES.contains(mainHandItem.getItem()))) {
            return;
        }
        // Give the player a leaf
        ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(Ludo.Items.LEAF));
        // Have a chance to break the leaves block
        if (world.getRandom().nextInt(100) < 40) {
            world.destroyBlock(pos, true);
        }
        event.setCancellationResult(ActionResultType.SUCCESS);
        event.setCanceled(true);
        event.setUseItem(Result.DENY);
        event.setUseBlock(Result.DENY);
    }

    @SubscribeEvent
    public static void onPlayerWakeUp(final PlayerWakeUpEvent event) {
        final PlayerEntity player = event.getPlayer();
        final World world = player.getEntityWorld();
        if (event.updateWorld() || world.isRemote()) {
            return;
        }
        player.getBedPosition().ifPresent(bedPos -> {
            final BlockState state = world.getBlockState(bedPos);
            if (state.matchesBlock(Ludo.Blocks.LEAVES_PILE)) {
                world.destroyBlock(bedPos, false);
            }
        });
    }
}
