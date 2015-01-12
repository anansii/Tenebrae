package com.github.anansii.tenebrae.items;

import com.github.anansii.tenebrae.TenebraeMod;
import com.github.anansii.tenebrae.reference.Reference;
import net.minecraft.item.ItemAxe;

public class ItemTenebriumAxe extends ItemAxe {

	public ItemTenebriumAxe() {
		super(ItemMaterials.tenebriumToolMaterial);
		
		final String internalName = ItemNames.tenebriumAxe;
		
		setUnlocalizedName(Reference.MOD_ID + "." + internalName);
		setTextureName(Reference.MOD_ID + ":" + internalName);
		setCreativeTab(TenebraeMod.creativeTab);
	}

	

}
