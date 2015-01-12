package com.github.anansii.tenebrae.blocks;

import net.minecraft.block.material.Material;

public class BlockTenebriumOre extends BlockBase {

	public BlockTenebriumOre() {
		super("oreTenebrium", Material.iron, soundTypeStone, 3.0F);
	}
	
//	@Override
//	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
//		return ItemRegistry.tenebrium;
//	}
//
//	// Drops the amount of items you get here.
//	@Override
//	public int quantityDropped(Random random) {
//		return 4 + random.nextInt(5);
//	}

}