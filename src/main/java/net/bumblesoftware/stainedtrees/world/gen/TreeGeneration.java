package net.bumblesoftware.stainedtrees.world.gen;

import net.bumblesoftware.stainedtrees.world.feature.PlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;

public class TreeGeneration {
    public static void generateBlackTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, PlacedFeatures.BLACK_OAK_PLACED.getKey().get());
    }
    public static void generateBlueTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, PlacedFeatures.BLUE_OAK_PLACED.getKey().get());
    }
    public static void generateBrownTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, PlacedFeatures.BROWN_OAK_PLACED.getKey().get());
    }
    public static void generateCyanTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, PlacedFeatures.CYAN_OAK_PLACED.getKey().get());
    }
    public static void generateGrayTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, PlacedFeatures.GRAY_OAK_PLACED.getKey().get());
    }
    public static void generateLightBlueTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, PlacedFeatures.LIGHT_BLUE_OAK_PLACED.getKey().get());
    }
    public static void generateLightGrayTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, PlacedFeatures.LIGHT_GRAY_OAK_PLACED.getKey().get());
    }public static void generateLimeTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, PlacedFeatures.LIME_OAK_PLACED.getKey().get());
    }
    public static void generateMagentaTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, PlacedFeatures.MAGENTA_OAK_PLACED.getKey().get());
    }
    public static void generateOrangeTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, PlacedFeatures.ORANGE_OAK_PLACED.getKey().get());
    }
    public static void generatePinkTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, PlacedFeatures.PINK_OAK_PLACED.getKey().get());
    }
    public static void generatePurpleTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, PlacedFeatures.PURPLE_OAK_PLACED.getKey().get());
    }
    public static void generateRedTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, PlacedFeatures.RED_OAK_PLACED.getKey().get());
    }
    public static void generateWhiteTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, PlacedFeatures.WHITE_OAK_PLACED.getKey().get());
    }
    public static void generateYellowTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, PlacedFeatures.YELLOW_OAK_PLACED.getKey().get());
    }
}
