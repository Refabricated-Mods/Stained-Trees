package net.bumblesoftware.stainedtrees.world.feature;

import net.bumblesoftware.stainedtrees.block.StainedTreeBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ConfiguredFeatures {

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> BLACK_TREE = net.minecraft.world.gen.feature.ConfiguredFeatures.register("black_tree", Feature.TREE, new TreeFeatureConfig.Builder(
            BlockStateProvider.of(Blocks.OAK_LOG.getDefaultState()),
            new StraightTrunkPlacer(4,2,0),
            BlockStateProvider.of(StainedTreeBlocks.BLACK_LEAVES.getDefaultState()),
            new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
            new TwoLayersFeatureSize(1,0,1)).build());

    public static final RegistryEntry<PlacedFeature> BLACK_OAK_CHECKED =
            net.minecraft.world.gen.feature.PlacedFeatures.register("black_oak_checked", BLACK_TREE,
                    PlacedFeatures.wouldSurvive(StainedTreeBlocks.BLACK_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> BLACK_OAK_SPAWN =
            net.minecraft.world.gen.feature.ConfiguredFeatures.register("black_oak_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(BLACK_OAK_CHECKED, 0.5f)),
                            BLACK_OAK_CHECKED));
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> BLUE_TREE = net.minecraft.world.gen.feature.ConfiguredFeatures.register("blue_tree", Feature.TREE, new TreeFeatureConfig.Builder(
            BlockStateProvider.of(Blocks.OAK_LOG.getDefaultState()),
            new StraightTrunkPlacer(4,2,0),
            BlockStateProvider.of(StainedTreeBlocks.BLUE_LEAVES.getDefaultState()),
            new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
            new TwoLayersFeatureSize(1,0,1)).build());

    public static final RegistryEntry<PlacedFeature> BLUE_OAK_CHECKED =
            net.minecraft.world.gen.feature.PlacedFeatures.register("blue_oak_checked", BLUE_TREE,
                    PlacedFeatures.wouldSurvive(StainedTreeBlocks.BLACK_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> BLUE_OAK_SPAWN =
            net.minecraft.world.gen.feature.ConfiguredFeatures.register("blue_oak_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(BLUE_OAK_CHECKED, 0.5f)),
                            BLUE_OAK_CHECKED));
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> BROWN_TREE = net.minecraft.world.gen.feature.ConfiguredFeatures.register("brown_tree", Feature.TREE, new TreeFeatureConfig.Builder(
            BlockStateProvider.of(Blocks.OAK_LOG.getDefaultState()),
            new StraightTrunkPlacer(4,2,0),
            BlockStateProvider.of(StainedTreeBlocks.BROWN_LEAVES.getDefaultState()),
            new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
            new TwoLayersFeatureSize(1,0,1)).build());

    public static final RegistryEntry<PlacedFeature> BROWN_OAK_CHECKED =
            net.minecraft.world.gen.feature.PlacedFeatures.register("brown_oak_checked", BROWN_TREE,
                    PlacedFeatures.wouldSurvive(StainedTreeBlocks.BROWN_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> BROWN_OAK_SPAWN =
            net.minecraft.world.gen.feature.ConfiguredFeatures.register("brown_oak_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(BROWN_OAK_CHECKED, 0.5f)),
                            BROWN_OAK_CHECKED));
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> CYAN_TREE = net.minecraft.world.gen.feature.ConfiguredFeatures.register("cyan_tree", Feature.TREE, new TreeFeatureConfig.Builder(
            BlockStateProvider.of(Blocks.OAK_LOG.getDefaultState()),
            new StraightTrunkPlacer(4,2,0),
            BlockStateProvider.of(StainedTreeBlocks.CYAN_LEAVES.getDefaultState()),
            new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
            new TwoLayersFeatureSize(1,0,1)).build());

    public static final RegistryEntry<PlacedFeature> CYAN_OAK_CHECKED =
            net.minecraft.world.gen.feature.PlacedFeatures.register("cyan_oak_checked", CYAN_TREE,
                    PlacedFeatures.wouldSurvive(StainedTreeBlocks.CYAN_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> CYAN_OAK_SPAWN =
            net.minecraft.world.gen.feature.ConfiguredFeatures.register("cyan_oak_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(CYAN_OAK_CHECKED, 0.5f)),
                            CYAN_OAK_CHECKED));
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> GRAY_TREE = net.minecraft.world.gen.feature.ConfiguredFeatures.register("gray_tree", Feature.TREE, new TreeFeatureConfig.Builder(
            BlockStateProvider.of(Blocks.OAK_LOG.getDefaultState()),
            new StraightTrunkPlacer(4,2,0),
            BlockStateProvider.of(StainedTreeBlocks.GRAY_LEAVES.getDefaultState()),
            new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
            new TwoLayersFeatureSize(1,0,1)).build());

    public static final RegistryEntry<PlacedFeature> GRAY_OAK_CHECKED =
            net.minecraft.world.gen.feature.PlacedFeatures.register("gray_oak_checked", GRAY_TREE,
                    PlacedFeatures.wouldSurvive(StainedTreeBlocks.GRAY_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> GRAY_OAK_SPAWN =
            net.minecraft.world.gen.feature.ConfiguredFeatures.register("gray_oak_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(GRAY_OAK_CHECKED, 0.5f)),
                            GRAY_OAK_CHECKED));
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> LIGHT_BLUE_TREE = net.minecraft.world.gen.feature.ConfiguredFeatures.register("light_blue_tree", Feature.TREE, new TreeFeatureConfig.Builder(
            BlockStateProvider.of(Blocks.OAK_LOG.getDefaultState()),
            new StraightTrunkPlacer(4,2,0),
            BlockStateProvider.of(StainedTreeBlocks.LIGHT_BLUE_LEAVES.getDefaultState()),
            new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
            new TwoLayersFeatureSize(1,0,1)).build());

    public static final RegistryEntry<PlacedFeature> LIGHT_BLUE_OAK_CHECKED =
            net.minecraft.world.gen.feature.PlacedFeatures.register("light_blue_oak_checked", LIGHT_BLUE_TREE,
                    PlacedFeatures.wouldSurvive(StainedTreeBlocks.LIGHT_BLUE_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> LIGHT_BLUE_OAK_SPAWN =
            net.minecraft.world.gen.feature.ConfiguredFeatures.register("light_blue_oak_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(LIGHT_BLUE_OAK_CHECKED, 0.5f)),
                            LIGHT_BLUE_OAK_CHECKED));
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> LIGHT_GRAY_TREE = net.minecraft.world.gen.feature.ConfiguredFeatures.register("light_gray_tree", Feature.TREE, new TreeFeatureConfig.Builder(
            BlockStateProvider.of(Blocks.OAK_LOG.getDefaultState()),
            new StraightTrunkPlacer(4,2,0),
            BlockStateProvider.of(StainedTreeBlocks.LIGHT_GRAY_LEAVES.getDefaultState()),
            new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
            new TwoLayersFeatureSize(1,0,1)).build());

    public static final RegistryEntry<PlacedFeature> LIGHT_GRAY_OAK_CHECKED =
            net.minecraft.world.gen.feature.PlacedFeatures.register("light_gray_oak_checked", LIGHT_GRAY_TREE,
                    PlacedFeatures.wouldSurvive(StainedTreeBlocks.LIGHT_GRAY_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> LIGHT_GRAY_OAK_SPAWN =
            net.minecraft.world.gen.feature.ConfiguredFeatures.register("light_gray_oak_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(LIGHT_GRAY_OAK_CHECKED, 0.5f)),
                            LIGHT_GRAY_OAK_CHECKED));
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> LIME_TREE = net.minecraft.world.gen.feature.ConfiguredFeatures.register("lime_tree", Feature.TREE, new TreeFeatureConfig.Builder(
            BlockStateProvider.of(Blocks.OAK_LOG.getDefaultState()),
            new StraightTrunkPlacer(4,2,0),
            BlockStateProvider.of(StainedTreeBlocks.LIME_LEAVES.getDefaultState()),
            new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
            new TwoLayersFeatureSize(1,0,1)).build());

    public static final RegistryEntry<PlacedFeature> LIME_OAK_CHECKED =
            net.minecraft.world.gen.feature.PlacedFeatures.register("lime_oak_checked", LIME_TREE,
                    PlacedFeatures.wouldSurvive(StainedTreeBlocks.LIME_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> LIME_OAK_SPAWN =
            net.minecraft.world.gen.feature.ConfiguredFeatures.register("lime_oak_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(LIME_OAK_CHECKED, 0.5f)),
                            LIME_OAK_CHECKED));
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> MAGENTA_TREE = net.minecraft.world.gen.feature.ConfiguredFeatures.register("magenta_tree", Feature.TREE, new TreeFeatureConfig.Builder(
            BlockStateProvider.of(Blocks.OAK_LOG.getDefaultState()),
            new StraightTrunkPlacer(4,2,0),
            BlockStateProvider.of(StainedTreeBlocks.MAGENTA_LEAVES.getDefaultState()),
            new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
            new TwoLayersFeatureSize(1,0,1)).build());

    public static final RegistryEntry<PlacedFeature> MAGENTA_OAK_CHECKED =
            net.minecraft.world.gen.feature.PlacedFeatures.register("magenta_oak_checked", MAGENTA_TREE,
                    PlacedFeatures.wouldSurvive(StainedTreeBlocks.MAGENTA_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> MAGENTA_OAK_SPAWN =
            net.minecraft.world.gen.feature.ConfiguredFeatures.register("magenta_oak_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(MAGENTA_OAK_CHECKED, 0.5f)),
                            MAGENTA_OAK_CHECKED));
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> ORANGE_TREE = net.minecraft.world.gen.feature.ConfiguredFeatures.register("orange_tree", Feature.TREE, new TreeFeatureConfig.Builder(
            BlockStateProvider.of(Blocks.OAK_LOG.getDefaultState()),
            new StraightTrunkPlacer(4,2,0),
            BlockStateProvider.of(StainedTreeBlocks.ORANGE_LEAVES.getDefaultState()),
            new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
            new TwoLayersFeatureSize(1,0,1)).build());

    public static final RegistryEntry<PlacedFeature> ORANGE_OAK_CHECKED =
            net.minecraft.world.gen.feature.PlacedFeatures.register("orange_oak_checked", ORANGE_TREE,
                    PlacedFeatures.wouldSurvive(StainedTreeBlocks.ORANGE_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> ORANGE_OAK_SPAWN =
            net.minecraft.world.gen.feature.ConfiguredFeatures.register("orange_oak_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(ORANGE_OAK_CHECKED, 0.5f)),
                            ORANGE_OAK_CHECKED));
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> PINK_TREE = net.minecraft.world.gen.feature.ConfiguredFeatures.register("pink_tree", Feature.TREE, new TreeFeatureConfig.Builder(
            BlockStateProvider.of(Blocks.OAK_LOG.getDefaultState()),
            new StraightTrunkPlacer(4,2,0),
            BlockStateProvider.of(StainedTreeBlocks.PINK_LEAVES.getDefaultState()),
            new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
            new TwoLayersFeatureSize(1,0,1)).build());

    public static final RegistryEntry<PlacedFeature> PINK_OAK_CHECKED =
            net.minecraft.world.gen.feature.PlacedFeatures.register("pink_oak_checked", PINK_TREE,
                    PlacedFeatures.wouldSurvive(StainedTreeBlocks.PINK_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> PINK_OAK_SPAWN =
            net.minecraft.world.gen.feature.ConfiguredFeatures.register("pink_oak_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(PINK_OAK_CHECKED, 0.5f)),
                            PINK_OAK_CHECKED));
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> PURPLE_TREE = net.minecraft.world.gen.feature.ConfiguredFeatures.register("purple_tree", Feature.TREE, new TreeFeatureConfig.Builder(
            BlockStateProvider.of(Blocks.OAK_LOG.getDefaultState()),
            new StraightTrunkPlacer(4,2,0),
            BlockStateProvider.of(StainedTreeBlocks.PURPLE_LEAVES.getDefaultState()),
            new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
            new TwoLayersFeatureSize(1,0,1)).build());

    public static final RegistryEntry<PlacedFeature> PURPLE_OAK_CHECKED =
            net.minecraft.world.gen.feature.PlacedFeatures.register("purple_oak_checked", CYAN_TREE,
                    PlacedFeatures.wouldSurvive(StainedTreeBlocks.PURPLE_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> PURPLE_OAK_SPAWN =
            net.minecraft.world.gen.feature.ConfiguredFeatures.register("purple_oak_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(PURPLE_OAK_CHECKED, 0.5f)),
                            PURPLE_OAK_CHECKED));
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> RED_TREE = net.minecraft.world.gen.feature.ConfiguredFeatures.register("red_tree", Feature.TREE, new TreeFeatureConfig.Builder(
            BlockStateProvider.of(Blocks.OAK_LOG.getDefaultState()),
            new StraightTrunkPlacer(4,2,0),
            BlockStateProvider.of(StainedTreeBlocks.RED_LEAVES.getDefaultState()),
            new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
            new TwoLayersFeatureSize(1,0,1)).build());

    public static final RegistryEntry<PlacedFeature> RED_OAK_CHECKED =
            net.minecraft.world.gen.feature.PlacedFeatures.register("red_oak_checked", RED_TREE,
                    PlacedFeatures.wouldSurvive(StainedTreeBlocks.RED_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> RED_OAK_SPAWN =
            net.minecraft.world.gen.feature.ConfiguredFeatures.register("red_oak_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(RED_OAK_CHECKED, 0.5f)),
                            RED_OAK_CHECKED));
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> WHITE_TREE = net.minecraft.world.gen.feature.ConfiguredFeatures.register("white_tree", Feature.TREE, new TreeFeatureConfig.Builder(
            BlockStateProvider.of(Blocks.OAK_LOG.getDefaultState()),
            new StraightTrunkPlacer(4,2,0),
            BlockStateProvider.of(StainedTreeBlocks.WHITE_LEAVES.getDefaultState()),
            new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
            new TwoLayersFeatureSize(1,0,1)).build());

    public static final RegistryEntry<PlacedFeature> WHITE_OAK_CHECKED =
            net.minecraft.world.gen.feature.PlacedFeatures.register("white_oak_checked", WHITE_TREE,
                    PlacedFeatures.wouldSurvive(StainedTreeBlocks.WHITE_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> WHITE_OAK_SPAWN =
            net.minecraft.world.gen.feature.ConfiguredFeatures.register("white_oak_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(WHITE_OAK_CHECKED, 0.5f)),
                            WHITE_OAK_CHECKED));
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> YELLOW_TREE = net.minecraft.world.gen.feature.ConfiguredFeatures.register("yellow_tree", Feature.TREE, new TreeFeatureConfig.Builder(
            BlockStateProvider.of(Blocks.OAK_LOG.getDefaultState()),
            new StraightTrunkPlacer(4,2,0),
            BlockStateProvider.of(StainedTreeBlocks.YELLOW_LEAVES.getDefaultState()),
            new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
            new TwoLayersFeatureSize(1,0,1)).build());

    public static final RegistryEntry<PlacedFeature> YELLOW_OAK_CHECKED =
            net.minecraft.world.gen.feature.PlacedFeatures.register("yellow_oak_checked", YELLOW_TREE,
                    PlacedFeatures.wouldSurvive(StainedTreeBlocks.YELLOW_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> YELLOW_OAK_SPAWN =
            net.minecraft.world.gen.feature.ConfiguredFeatures.register("yellow_oak_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(YELLOW_OAK_CHECKED, 0.5f)),
                            YELLOW_OAK_CHECKED));
}
