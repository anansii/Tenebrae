package com.github.anansii.tenebrae.items;

import com.github.anansii.tenebrae.TenebraeMod;
import com.github.anansii.tenebrae.reference.Reference;
import net.minecraft.item.ItemHoe;

public class ItemTenebriumHoe extends ItemHoe {

	public ItemTenebriumHoe() {
		super(ItemMaterials.tenebriumToolMaterial);
		
		final String internalName = ItemNames.tenebriumHoe;
		
		setUnlocalizedName(Reference.MOD_ID + "." + internalName);
		setTextureName(Reference.MOD_ID + ":" + internalName);
		setCreativeTab(TenebraeMod.creativeTab);
	}

	

}
