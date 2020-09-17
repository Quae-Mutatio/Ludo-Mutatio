package dev.quae.mods.ludo.data;

import dev.quae.mods.ludo.Ludo;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public final class LudoBlockStateProvider extends BlockStateProvider {
    public LudoBlockStateProvider(final DataGenerator gen, final ExistingFileHelper exFileHelper) {
        super(gen, Ludo.ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // ORES
        //this.simpleBlock(Ludo.Blocks.ACANTHITE_ORE);
        //this.simpleBlock(Ludo.Blocks.BARYTE_ORE);
        //this.simpleBlock(Ludo.Blocks.BAUXITE_ORE);
        //this.simpleBlock(Ludo.Blocks.BERYL_ORE);
        //this.simpleBlock(Ludo.Blocks.BORNITE_ORE);
        //this.simpleBlock(Ludo.Blocks.CASSITERITE_ORE);
        //this.simpleBlock(Ludo.Blocks.CHALCOCITE_ORE);
        //this.simpleBlock(Ludo.Blocks.CHALCOPYRITE_ORE);
        //this.simpleBlock(Ludo.Blocks.CHROMITE_ORE);
        //this.simpleBlock(Ludo.Blocks.CINNABAR_ORE);
        //this.simpleBlock(Ludo.Blocks.COBALTITE_ORE);
        //this.simpleBlock(Ludo.Blocks.COLTAN_ORE);
        //this.simpleBlock(Ludo.Blocks.GALENA_ORE);
        //this.simpleBlock(Ludo.Blocks.HEMATITE_ORE);
        //this.simpleBlock(Ludo.Blocks.ILMENITE_ORE);
        //this.simpleBlock(Ludo.Blocks.MAGNETITE_ORE);
        //this.simpleBlock(Ludo.Blocks.MALACHITE_ORE);
        //this.simpleBlock(Ludo.Blocks.MOLYBDENITE_ORE);
        //this.simpleBlock(Ludo.Blocks.PENTALANDITE_ORE);
        //this.simpleBlock(Ludo.Blocks.PYROLUSITE_ORE);
        //this.simpleBlock(Ludo.Blocks.SCHEELITE_ORE);
        //this.simpleBlock(Ludo.Blocks.SPERRYLITE_ORE);
        //this.simpleBlock(Ludo.Blocks.SPHALERITE_ORE);
        //this.simpleBlock(Ludo.Blocks.URANITITE_ORE);
        //this.simpleBlock(Ludo.Blocks.WOLFRAMITE_ORE);
        
        this.simpleBlock(Ludo.Blocks.LEAVES_PILE, this.models().getBuilder("leaves_pile")
                .parent(this.models().getExistingFile(this.mcLoc("block/thin_block")))
                .texture("particle", this.blockTexture(Blocks.OAK_LEAVES))
                .element().from(0, 0, 0).to(16, 1, 16)
                .allFaces((direction, faceBuilder) -> {
                    switch (direction) {
                        case DOWN:
                        case UP:
                            faceBuilder.uvs(0, 0, 16, 16);
                            break;
                        case NORTH:
                        case SOUTH:
                        case WEST:
                        case EAST:
                            faceBuilder.uvs(0, 15, 16, 16);
                            break;
                    }
                    faceBuilder.texture("#particle").cullface(direction).tintindex(0).end();
                }).end());
    }
}
