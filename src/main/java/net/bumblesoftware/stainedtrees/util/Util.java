package net.bumblesoftware.stainedtrees.util;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class Util {
    public static boolean never(BlockState blockState, net.minecraft.world.BlockView blockView, BlockPos blockPos) {return false;}
    public static Boolean canSpawnOnLeaves(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {return type == EntityType.OCELOT || type == EntityType.PARROT;}
}
