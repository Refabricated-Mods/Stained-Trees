package net.bumblesoftware.stainedtrees.util;

import net.bumblesoftware.stainedtrees.block.StainedTreeBlocks;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class BlockRegistry {
    public static void registerFlammableBlock() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(StainedTreeBlocks.BLACK_LEAVES, 30, 60);
        instance.add(StainedTreeBlocks.BLUE_LEAVES, 30, 60);
        instance.add(StainedTreeBlocks.BROWN_LEAVES, 30, 60);
        instance.add(StainedTreeBlocks.CYAN_LEAVES, 30, 60);
        instance.add(StainedTreeBlocks.GRAY_LEAVES, 30, 60);
        instance.add(StainedTreeBlocks.LIGHT_BLUE_LEAVES, 30, 60);
        instance.add(StainedTreeBlocks.LIGHT_GRAY_LEAVES, 30, 60);
        instance.add(StainedTreeBlocks.LIME_LEAVES, 30, 60);
        instance.add(StainedTreeBlocks.MAGENTA_LEAVES, 30, 60);
        instance.add(StainedTreeBlocks.ORANGE_LEAVES, 30, 60);
        instance.add(StainedTreeBlocks.PINK_LEAVES, 30, 60);
        instance.add(StainedTreeBlocks.PURPLE_LEAVES, 30, 60);
        instance.add(StainedTreeBlocks.RED_LEAVES, 30, 60);
        instance.add(StainedTreeBlocks.WHITE_LEAVES, 30, 60);
        instance.add(StainedTreeBlocks.YELLOW_LEAVES, 30, 60);


    }
}
