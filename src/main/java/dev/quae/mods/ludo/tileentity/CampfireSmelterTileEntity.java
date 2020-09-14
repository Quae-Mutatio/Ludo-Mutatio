package dev.quae.mods.ludo.tileentity;

import dev.quae.mods.ludo.Ludo;
import dev.quae.mods.ludo.block.CampfireSmelterBlock;
import net.minecraft.block.BlockState;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.BlastingRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnull;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;

public class CampfireSmelterTileEntity extends TileEntity implements ITickableTileEntity {
    private final LazyOptional<IItemHandler> inventoryLO = LazyOptional.of(this::getInventory);
    private final ItemStackHandler inventory = new ItemStackHandler(1) {
        @Override
        public int getSlotLimit(final int slot) {
            return 1;
        }

        @Override
        protected void onContentsChanged(int slot) {
            CampfireSmelterTileEntity.this.inventoryChanged();
        }
    };
    private int cookingTime;
    private int requiredCookingTime;

    public CampfireSmelterTileEntity() {
        super(Ludo.TileEntityTypes.CAMPFIRE_SMELTER);
    }

    private void inventoryChanged() {
        this.markDirty();
        this.getWorld().notifyBlockUpdate(this.getPos(), this.getBlockState(), this.getBlockState(), 3);
    }

    private IItemHandler getInventory() {
        return this.inventory;
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        if (Objects.equals(Ludo.INV_CAP, cap)) {
            return this.inventoryLO.cast();
        }
        return super.getCapability(cap, side);
    }

    @Override
    protected void invalidateCaps() {
        this.inventoryLO.invalidate();
    }

    @Override
    public void read(BlockState state, CompoundNBT nbt) {
        super.read(state, nbt);
        this.inventory.deserializeNBT(nbt.getCompound("inventory"));
        this.cookingTime = nbt.getInt("cookingTime");
        this.requiredCookingTime = nbt.getInt("requiredCookingTime");
    }

    @Override
    public CompoundNBT write(CompoundNBT compound) {
        compound.put("inventory", this.inventory.serializeNBT());
        compound.putInt("cookingTime", this.cookingTime);
        compound.putInt("requiredCookingTime", this.requiredCookingTime);
        return super.write(compound);
    }

    @Override
    public void tick() {
        final boolean onClient = this.getWorld().isRemote();
        final boolean isLit = this.getBlockState().get(CampfireSmelterBlock.LIT);
        if (onClient) {
            if (isLit) {
                this.addParticles();
            }
        } else {
            if (isLit) {
                this.cookItems();
            } else if (this.cookingTime > 0) {
                this.coolOff();
            }
        }
    }

    private void addParticles() {
        final Random random = this.getWorld().getRandom();
        if (random.nextFloat() < 0.9) {
            return;
        }
        final Vector3d position = Vector3d.copyCentered(this.getPos()).add(random.nextGaussian() / 3D, 0, random.nextGaussian() / 3D);
        final Vector3d speed = new Vector3d(0, 0.07, 0);
        this.getWorld().addOptionalParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, position.x, position.y, position.z, speed.x, speed.y, speed.z);
    }

    private void cookItems() {
        ItemStack input = this.inventory.getStackInSlot(0);
        if (input.isEmpty()) {
            return;
        }
        if (++this.cookingTime >= this.requiredCookingTime) {
            final Inventory craftingInv = new Inventory(input);
            final ItemStack result = this.getWorld().getRecipeManager().getRecipe(IRecipeType.BLASTING, craftingInv, this.getWorld())
                    .map(it -> it.getCraftingResult(craftingInv))
                    .orElse(input);
            final BlockPos pos = this.getPos();
            InventoryHelper.spawnItemStack(this.getWorld(), pos.getX(), pos.getY(), pos.getZ(), result);
            this.inventory.setStackInSlot(0, ItemStack.EMPTY);
        }
    }

    private void coolOff() {
        this.cookingTime = MathHelper.clamp(this.cookingTime - 2, 0, this.requiredCookingTime);
    }

    // TODO: Change this to a custom recipe type
    public Optional<BlastingRecipe> getRecipe(ItemStack input) {
        if (!this.inventory.getStackInSlot(0).isEmpty()) {
            return Optional.empty();
        }
        return this.getWorld().getRecipeManager().getRecipe(IRecipeType.BLASTING, new Inventory(input), this.getWorld());
    }

    public boolean addItem(ItemStack input, int cookTime) {
        if (!this.inventory.getStackInSlot(0).isEmpty()) {
            return false;
        }
        this.requiredCookingTime = cookTime;
        this.cookingTime = 0;
        this.inventory.setStackInSlot(0, input.split(1));
        return true;
    }
}
