package com.github.anansii.tenebrae.items;

import com.github.anansii.tenebrae.TenebraeMod;
import com.github.anansii.tenebrae.reference.Reference;
import net.minecraft.item.ItemFood;

public class ItemFoodBase extends ItemFood {
	
	/**
	 * @param internalName 
	 * @param healAmount X * 20 = filled hunger
	 * @param saturationModifier default seems to be 0.6
	 * @param isWolfsFavoriteMeat
	 */
	public ItemFoodBase(String internalName, int healAmount, float saturationModifier, boolean isWolfsFavoriteMeat) {
		super(healAmount, saturationModifier, isWolfsFavoriteMeat);
		
		setUnlocalizedName(Reference.MOD_ID + "." + internalName);
		setTextureName(Reference.MOD_ID + ":" + internalName);
		setCreativeTab(TenebraeMod.creativeTab);
	}
	
}