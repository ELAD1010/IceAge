package net.elad1010.ice_age.datagen;

import net.elad1010.ice_age.IceAge;
import net.elad1010.ice_age.block.ModBlocks;
import net.elad1010.ice_age.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, IceAge.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.MELTER_MACHINE_INPUTS);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.ICE_STONE.get());
        this.tag(BlockTags.NEEDS_STONE_TOOL).add(ModBlocks.ICE_STONE.get());
    }
}
