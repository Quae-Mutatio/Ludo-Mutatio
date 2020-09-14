package dev.quae.mods.ludo.item;

import dev.quae.mods.ludo.Ludo;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemHandlerHelper;

public class PebbleItem extends Item {
    public PebbleItem(final Properties properties) {
        super(properties);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(final World world, final PlayerEntity player, final Hand hand) {
        final ItemStack mainHand = player.getHeldItem(Hand.MAIN_HAND);
        final ItemStack offHand = player.getHeldItem(Hand.OFF_HAND);
        if ((mainHand.getItem() == Ludo.Items.HARD_PEBBLE && offHand.getItem() == Ludo.Items.SOFT_PEBBLE) ||
                (mainHand.getItem() == Ludo.Items.SOFT_PEBBLE && offHand.getItem() == Ludo.Items.HARD_PEBBLE)) {
            mainHand.shrink(1);
            offHand.shrink(1);
            ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(Ludo.Items.STONE_BOWL));
            // TODO: play a click sound for stones hitting each other.
            // player.addStat(LudoStats.CRAFT_STONE_BOWL);
            player.swingArm(Hand.OFF_HAND);
            player.swingArm(Hand.MAIN_HAND);
            return ActionResult.resultSuccess(hand == Hand.MAIN_HAND ? mainHand : offHand);
        }
        return ActionResult.resultPass(hand == Hand.MAIN_HAND ? mainHand : offHand);
    }
}
