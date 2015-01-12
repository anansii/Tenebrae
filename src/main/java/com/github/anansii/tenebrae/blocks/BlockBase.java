package com.github.anansii.tenebrae.blocks;

import com.github.anansii.tenebrae.TenebraeMod;
import com.github.anansii.tenebrae.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBase extends Block {
	
	private final String internalName;

	public BlockBase(String internalName, Material material, SoundType soundType, float hardness) {
		super(material);
		
		this.internalName = internalName;
		setBlockName(Reference.MOD_ID + "." + internalName);
		setBlockTextureName(Reference.MOD_ID + ":" + internalName);
		setCreativeTab(TenebraeMod.creativeTab);
		setStepSound(soundType);
		setHardness(hardness);
	}
	
	public String getInternalName() {
		return internalName;
	}
}
