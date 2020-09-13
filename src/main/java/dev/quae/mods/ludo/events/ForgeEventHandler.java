package dev.quae.mods.ludo.events;

import dev.quae.mods.ludo.Ludo;
import dev.quae.mods.ludo.setup.Registry.Items;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.LeftClickBlock;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickItem;
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
            ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(Items.HARD_PEBBLE));
        } else if (chance < 25) {
            ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(Items.SOFT_PEBBLE));
        }
    }

    @SubscribeEvent
    public static void onSmashPebbles(final RightClickItem event) {
        final World world = event.getWorld();
        if (world.isRemote()) {
            return;
        }
        final PlayerEntity player = event.getPlayer();
        final ItemStack mainHand = player.getHeldItem(Hand.MAIN_HAND);
        final ItemStack offHand = player.getHeldItem(Hand.OFF_HAND);
        if ((mainHand.getItem() == Items.HARD_PEBBLE && offHand.getItem() == Items.SOFT_PEBBLE) ||
                (mainHand.getItem() == Items.SOFT_PEBBLE && offHand.getItem() == Items.HARD_PEBBLE)) {
            mainHand.shrink(1);
            offHand.shrink(1);
            ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(Items.STONE_BOWL));
            // TODO: play a click sound for stones hitting each other.
        }
    }
}