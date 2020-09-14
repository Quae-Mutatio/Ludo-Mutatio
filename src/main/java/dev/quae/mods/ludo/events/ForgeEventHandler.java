package dev.quae.mods.ludo.events;

import dev.quae.mods.ludo.Ludo;
import dev.quae.mods.ludo.Ludo.RecipeTypes;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.LeftClickBlock;
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
                    player.getHeldItem(Hand.MAIN_HAND).split(1);
                    player.getHeldItem(Hand.OFF_HAND).split(1);
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
}
