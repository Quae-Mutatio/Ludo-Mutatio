package dev.quae.mods.ludo.block;

import net.minecraft.block.*;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.DyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.state.properties.BedPart;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.BedTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.Direction.Plane;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class LeavesPileBlock extends BedBlock {
    private static final VoxelShape SHAPE = makeCuboidShape(0, 0, 0, 16, 1, 16);
    private static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
    private static final BooleanProperty ATTACHED = BlockStateProperties.ATTACHED;
    private static final BooleanProperty OCCUPIED = BlockStateProperties.OCCUPIED;

    public LeavesPileBlock(final Properties properties) {
        super(DyeColor.GREEN, properties);
        this.setDefaultState(this.getStateContainer().getBaseState().with(FACING, Direction.NORTH).with(ATTACHED, false).with(OCCUPIED, false).with(PART, BedPart.FOOT));
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(final BlockItemUseContext context) {
        final World world = context.getWorld();
        final BlockPos pos = context.getPos();
        for (final Direction direction : Plane.HORIZONTAL) {
            final BlockPos neighbourPos = pos.offset(direction);
            final BlockState neighbourState = world.getBlockState(neighbourPos);
            if (neighbourState.isIn(this) && !neighbourState.get(ATTACHED)) {
                return this.getDefaultState().with(FACING, direction).with(ATTACHED, true);
            }
        }
        return this.getDefaultState();
    }

    @Override
    public void onBlockPlacedBy(final World world, final BlockPos pos, final BlockState state, @Nullable final LivingEntity placer, final ItemStack stack) {
        if (state.get(ATTACHED)) {
            final Direction facing = state.get(FACING);
            final BlockPos linked = pos.offset(facing);
            world.setBlockState(linked, world.getBlockState(linked).with(FACING, facing).with(ATTACHED, true).with(PART, BedPart.HEAD));
        }
    }

    @Override
    protected void fillStateContainer(final Builder<Block, BlockState> builder) {
        builder.add(FACING, ATTACHED, OCCUPIED, PART);
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }

    public VoxelShape getCollisionShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return VoxelShapes.empty();
    }

    public VoxelShape getCollisionShape(BlockState state, IBlockReader reader, BlockPos pos) {
        return SHAPE;
    }

    public VoxelShape getRayTraceShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }

    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    public boolean hasTileEntity(final BlockState state) {
        return false;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(final BlockState state, final IBlockReader world) {
        return null;
    }
}
