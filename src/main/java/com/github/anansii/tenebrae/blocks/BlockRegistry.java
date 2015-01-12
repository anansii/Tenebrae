package com.github.anansii.tenebrae.blocks;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockRegistry {

	// Blocks
	public static BlockTenebrium blockTenebrium;
	public static BlockTenebriumOre oreTenebrium;

	public static void registerBlocks() {
		blockTenebrium = new BlockTenebrium();
		GameRegistry.registerBlock(blockTenebrium, blockTenebrium.getInternalName());

		oreTenebrium = new BlockTenebriumOre();
		GameRegistry.registerBlock(oreTenebrium, oreTenebrium.getInternalName());
	}

}
