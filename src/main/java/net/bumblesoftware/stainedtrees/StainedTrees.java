package net.bumblesoftware.stainedtrees;

import net.bumblesoftware.stainedtrees.block.StainedTreeBlocks;
import net.bumblesoftware.stainedtrees.util.BlockRegistry;
import net.bumblesoftware.stainedtrees.world.gen.WorldGen;
import net.fabricmc.api.ModInitializer;

public class StainedTrees implements ModInitializer {
    public static String MOD_ID = "stained_trees";
    @Override
    public void onInitialize() {
        WorldGen.generateWorldGen();
        StainedTreeBlocks.RegisterBlocks();
        BlockRegistry.registerFlammableBlock();
    }
}
