package net.bumblesoftware.stainedtrees.world.feature.tree;

import com.google.common.base.Supplier;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;


public class STSaplingGenerator extends SaplingGenerator {
    private final  Supplier<RegistryEntry<? extends ConfiguredFeature<?, ?>>> colour;
    public STSaplingGenerator(Supplier<RegistryEntry<? extends ConfiguredFeature<?, ?>>> colour) {
        this.colour = colour;
    }
    @Nullable @Override
    protected RegistryEntry<? extends ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return colour.get();
    }
}
