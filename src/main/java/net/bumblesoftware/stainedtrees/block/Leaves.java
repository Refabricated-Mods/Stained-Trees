package net.bumblesoftware.stainedtrees.block;

import net.bumblesoftware.stainedtrees.util.Util;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.sound.BlockSoundGroup;

public class Leaves extends LeavesBlock {
    public Leaves(Settings settings) {
        super(Settings.copy(Blocks.OAK_LEAVES).nonOpaque().sounds(BlockSoundGroup.GRASS).suffocates(Util::never).allowsSpawning(Util::canSpawnOnLeaves).blockVision(Util::never));
    }
}
