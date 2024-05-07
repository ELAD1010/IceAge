package net.elad1010.ice_age.util;

import net.elad1010.ice_age.IceAge;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Items {}

    public static class Blocks {

        public static final TagKey<Block> MELTER_MACHINE_INPUTS = tag("melter_machine_inputs");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(IceAge.MOD_ID, name));
        }
    }
}
