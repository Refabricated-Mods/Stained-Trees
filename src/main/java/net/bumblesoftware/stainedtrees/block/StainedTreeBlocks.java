package net.bumblesoftware.stainedtrees.block;

import net.bumblesoftware.stainedtrees.world.feature.tree.*;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.bumblesoftware.stainedtrees.StainedTrees.MOD_ID;

public class StainedTreeBlocks {
    public static final ItemGroup STAINED_TREES = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "general"))
            .icon(() -> new ItemStack(StainedTreeBlocks.PURPLE_LEAVES))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(StainedTreeBlocks.BLACK_LEAVES));
                stacks.add(new ItemStack(StainedTreeBlocks.BLUE_LEAVES));
                stacks.add(new ItemStack(StainedTreeBlocks.BROWN_LEAVES));
                stacks.add(new ItemStack(StainedTreeBlocks.CYAN_LEAVES));
                stacks.add(new ItemStack(StainedTreeBlocks.GRAY_LEAVES));
                stacks.add(new ItemStack(StainedTreeBlocks.LIGHT_BLUE_LEAVES));
                stacks.add(new ItemStack(StainedTreeBlocks.LIGHT_GRAY_LEAVES));
                stacks.add(new ItemStack(StainedTreeBlocks.LIME_LEAVES));
                stacks.add(new ItemStack(StainedTreeBlocks.MAGENTA_LEAVES));
                stacks.add(new ItemStack(StainedTreeBlocks.ORANGE_LEAVES));
                stacks.add(new ItemStack(StainedTreeBlocks.PINK_LEAVES));
                stacks.add(new ItemStack(StainedTreeBlocks.PURPLE_LEAVES));
                stacks.add(new ItemStack(StainedTreeBlocks.RED_LEAVES));
                stacks.add(new ItemStack(StainedTreeBlocks.WHITE_LEAVES));
                stacks.add(new ItemStack(StainedTreeBlocks.YELLOW_LEAVES));
                stacks.add(new ItemStack(StainedTreeBlocks.BLACK_SAPLING));
                stacks.add(new ItemStack(StainedTreeBlocks.BLUE_SAPLING));
                stacks.add(new ItemStack(StainedTreeBlocks.BROWN_SAPLING));
                stacks.add(new ItemStack(StainedTreeBlocks.CYAN_SAPLING));
                stacks.add(new ItemStack(StainedTreeBlocks.GRAY_SAPLING));
                stacks.add(new ItemStack(StainedTreeBlocks.LIGHT_BLUE_SAPLING));
                stacks.add(new ItemStack(StainedTreeBlocks.LIGHT_GRAY_SAPLING));
                stacks.add(new ItemStack(StainedTreeBlocks.LIME_SAPLING));
                stacks.add(new ItemStack(StainedTreeBlocks.MAGENTA_SAPLING));
                stacks.add(new ItemStack(StainedTreeBlocks.ORANGE_SAPLING));
                stacks.add(new ItemStack(StainedTreeBlocks.PINK_SAPLING));
                stacks.add(new ItemStack(StainedTreeBlocks.PURPLE_SAPLING));
                stacks.add(new ItemStack(StainedTreeBlocks.RED_SAPLING));
                stacks.add(new ItemStack(StainedTreeBlocks.WHITE_SAPLING));
                stacks.add(new ItemStack(StainedTreeBlocks.YELLOW_SAPLING));
            }).build();

    public static final Leaves BLACK_LEAVES = new Leaves(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES));
    public static final Leaves BLUE_LEAVES = new Leaves(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES));
    public static final Leaves BROWN_LEAVES = new Leaves(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES));
    public static final Leaves CYAN_LEAVES = new Leaves(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES));
    public static final Leaves GRAY_LEAVES = new Leaves(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES));
    public static final Leaves LIGHT_BLUE_LEAVES = new Leaves(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES));
    public static final Leaves LIGHT_GRAY_LEAVES = new Leaves(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES));
    public static final Leaves LIME_LEAVES = new Leaves(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES));
    public static final Leaves MAGENTA_LEAVES = new Leaves(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES));
    public static final Leaves ORANGE_LEAVES = new Leaves(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES));
    public static final Leaves PINK_LEAVES = new Leaves(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES));
    public static final Leaves PURPLE_LEAVES = new Leaves(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES));
    public static final Leaves RED_LEAVES = new Leaves(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES));
    public static final Leaves WHITE_LEAVES = new Leaves(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES));
    public static final Leaves YELLOW_LEAVES = new Leaves(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES));
    public static final Sapling BLACK_SAPLING = new Sapling(new BlackSaplingGenerator(), AbstractBlock.Settings.copy(Blocks.OAK_SAPLING));
    public static final Sapling BLUE_SAPLING = new Sapling(new BlueSaplingGenerator(), AbstractBlock.Settings.copy(Blocks.OAK_SAPLING));
    public static final Sapling BROWN_SAPLING = new Sapling(new BrownSaplingGenerator(), AbstractBlock.Settings.copy(Blocks.OAK_SAPLING));
    public static final Sapling CYAN_SAPLING = new Sapling(new CyanSaplingGenerator(), AbstractBlock.Settings.copy(Blocks.OAK_SAPLING));
    public static final Sapling GRAY_SAPLING = new Sapling(new GraySaplingGenerator(), AbstractBlock.Settings.copy(Blocks.OAK_SAPLING));
    public static final Sapling LIGHT_BLUE_SAPLING = new Sapling(new LightBlueSaplingGenerator(), AbstractBlock.Settings.copy(Blocks.OAK_SAPLING));
    public static final Sapling LIGHT_GRAY_SAPLING = new Sapling(new LightGraySaplingGenerator(), AbstractBlock.Settings.copy(Blocks.OAK_SAPLING));
    public static final Sapling LIME_SAPLING = new Sapling(new LimeSaplingGenerator(), AbstractBlock.Settings.copy(Blocks.OAK_SAPLING));
    public static final Sapling MAGENTA_SAPLING = new Sapling(new MagentaSaplingGenerator(), AbstractBlock.Settings.copy(Blocks.OAK_SAPLING));
    public static final Sapling ORANGE_SAPLING = new Sapling(new OrangeSaplingGenerator(), AbstractBlock.Settings.copy(Blocks.OAK_SAPLING));
    public static final Sapling PINK_SAPLING = new Sapling(new PinkSaplingGenerator(), AbstractBlock.Settings.copy(Blocks.OAK_SAPLING));
    public static final Sapling PURPLE_SAPLING = new Sapling(new PurpleSaplingGenerator(), AbstractBlock.Settings.copy(Blocks.OAK_SAPLING));
    public static final Sapling RED_SAPLING = new Sapling(new RedSaplingGenerator(), AbstractBlock.Settings.copy(Blocks.OAK_SAPLING));
    public static final Sapling WHITE_SAPLING = new Sapling(new WhiteSaplingGenerator(), AbstractBlock.Settings.copy(Blocks.OAK_SAPLING));
    public static final Sapling YELLOW_SAPLING = new Sapling(new YellowSaplingGenerator(), AbstractBlock.Settings.copy(Blocks.OAK_SAPLING));
    //Register
    public static void RegisterBlocks() {
        //Leaves
        Registry.register(Registry.BLOCK, new Identifier("stained_trees", "black_leaves"), BLACK_LEAVES);
        Registry.register(Registry.ITEM, new Identifier("stained_trees", "black_leaves"), new BlockItem(BLACK_LEAVES, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("stained_trees", "blue_leaves"), BLUE_LEAVES);
        Registry.register(Registry.ITEM, new Identifier("stained_trees", "blue_leaves"), new BlockItem(BLUE_LEAVES, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("stained_trees", "brown_leaves"), BROWN_LEAVES);
        Registry.register(Registry.ITEM, new Identifier("stained_trees", "brown_leaves"), new BlockItem(BROWN_LEAVES, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("stained_trees", "cyan_leaves"), CYAN_LEAVES);
        Registry.register(Registry.ITEM, new Identifier("stained_trees", "cyan_leaves"), new BlockItem(CYAN_LEAVES, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("stained_trees", "gray_leaves"), GRAY_LEAVES);
        Registry.register(Registry.ITEM, new Identifier("stained_trees", "gray_leaves"), new BlockItem(GRAY_LEAVES, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("stained_trees", "light_blue_leaves"), LIGHT_BLUE_LEAVES);
        Registry.register(Registry.ITEM, new Identifier("stained_trees", "light_blue_leaves"), new BlockItem(LIGHT_BLUE_LEAVES, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("stained_trees", "light_gray_leaves"), LIGHT_GRAY_LEAVES);
        Registry.register(Registry.ITEM, new Identifier("stained_trees", "light_gray_leaves"), new BlockItem(LIGHT_GRAY_LEAVES, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("stained_trees", "lime_leaves"), LIME_LEAVES);
        Registry.register(Registry.ITEM, new Identifier("stained_trees", "lime_leaves"), new BlockItem(LIME_LEAVES, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("stained_trees", "magenta_leaves"), MAGENTA_LEAVES);
        Registry.register(Registry.ITEM, new Identifier("stained_trees", "magenta_leaves"), new BlockItem(MAGENTA_LEAVES, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("stained_trees", "orange_leaves"), ORANGE_LEAVES);
        Registry.register(Registry.ITEM, new Identifier("stained_trees", "orange_leaves"), new BlockItem(ORANGE_LEAVES, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("stained_trees", "pink_leaves"), PINK_LEAVES);
        Registry.register(Registry.ITEM, new Identifier("stained_trees", "pink_leaves"), new BlockItem(PINK_LEAVES, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("stained_trees", "purple_leaves"), PURPLE_LEAVES);
        Registry.register(Registry.ITEM, new Identifier("stained_trees", "purple_leaves"), new BlockItem(PURPLE_LEAVES, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("stained_trees", "red_leaves"), RED_LEAVES);
        Registry.register(Registry.ITEM, new Identifier("stained_trees", "red_leaves"), new BlockItem(RED_LEAVES, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("stained_trees", "white_leaves"), WHITE_LEAVES);
        Registry.register(Registry.ITEM, new Identifier("stained_trees", "white_leaves"), new BlockItem(WHITE_LEAVES, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("stained_trees", "yellow_leaves"), YELLOW_LEAVES);
        Registry.register(Registry.ITEM, new Identifier("stained_trees", "yellow_leaves"), new BlockItem(YELLOW_LEAVES, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        //Saplings
        Registry.register(Registry.BLOCK, new Identifier("stained_trees", "black_sapling"), BLACK_SAPLING);
        Registry.register(Registry.ITEM, new Identifier("stained_trees", "black_sapling"), new BlockItem(BLACK_SAPLING, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("stained_trees", "blue_sapling"), BLUE_SAPLING);
        Registry.register(Registry.ITEM, new Identifier("stained_trees", "blue_sapling"), new BlockItem(BLUE_SAPLING, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("stained_trees", "brown_sapling"), BROWN_SAPLING);
        Registry.register(Registry.ITEM, new Identifier("stained_trees", "brown_sapling"), new BlockItem(BROWN_SAPLING, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("stained_trees", "cyan_sapling"), CYAN_SAPLING);
        Registry.register(Registry.ITEM, new Identifier("stained_trees", "cyan_sapling"), new BlockItem(CYAN_SAPLING, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("stained_trees", "gray_sapling"), GRAY_SAPLING);
        Registry.register(Registry.ITEM, new Identifier("stained_trees", "gray_sapling"), new BlockItem(GRAY_SAPLING, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("stained_trees", "light_blue_sapling"), LIGHT_BLUE_SAPLING);
        Registry.register(Registry.ITEM, new Identifier("stained_trees", "light_blue_sapling"), new BlockItem(LIGHT_BLUE_SAPLING, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("stained_trees", "light_gray_sapling"), LIGHT_GRAY_SAPLING);
        Registry.register(Registry.ITEM, new Identifier("stained_trees", "light_gray_sapling"), new BlockItem(LIGHT_GRAY_SAPLING, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("stained_trees", "lime_sapling"), LIME_SAPLING);
        Registry.register(Registry.ITEM, new Identifier("stained_trees", "lime_sapling"), new BlockItem(LIME_SAPLING, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("stained_trees", "magenta_sapling"), MAGENTA_SAPLING);
        Registry.register(Registry.ITEM, new Identifier("stained_trees", "magenta_sapling"), new BlockItem(MAGENTA_SAPLING, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("stained_trees", "orange_sapling"), ORANGE_SAPLING);
        Registry.register(Registry.ITEM, new Identifier("stained_trees", "orange_sapling"), new BlockItem(ORANGE_SAPLING, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("stained_trees", "pink_sapling"), PINK_SAPLING);
        Registry.register(Registry.ITEM, new Identifier("stained_trees", "pink_sapling"), new BlockItem(PINK_SAPLING, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("stained_trees", "purple_sapling"), PURPLE_SAPLING);
        Registry.register(Registry.ITEM, new Identifier("stained_trees", "purple_sapling"), new BlockItem(PURPLE_SAPLING, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("stained_trees", "red_sapling"), RED_SAPLING);
        Registry.register(Registry.ITEM, new Identifier("stained_trees", "red_sapling"), new BlockItem(RED_SAPLING, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("stained_trees", "white_sapling"), WHITE_SAPLING);
        Registry.register(Registry.ITEM, new Identifier("stained_trees", "white_sapling"), new BlockItem(WHITE_SAPLING, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("stained_trees", "yellow_sapling"), YELLOW_SAPLING);
        Registry.register(Registry.ITEM, new Identifier("stained_trees", "yellow_sapling"), new BlockItem(YELLOW_SAPLING, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
    }
}
