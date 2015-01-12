package com.github.anansii.tenebrae.items;

import com.github.anansii.tenebrae.TenebraeMod;
import com.github.anansii.tenebrae.reference.Reference;
import net.minecraft.item.ItemSpade;

public class ItemTenebriumShovel extends ItemSpade {

	public ItemTenebriumShovel() {
		super(ItemMaterials.tenebriumToolMaterial);
		
		final String internalName = ItemNames.tenebriumShovel;
		
		setUnlocalizedName(Reference.MOD_ID + "." + internalName);
		setTextureName(Reference.MOD_ID + ":" + internalName);
		setCreativeTab(TenebraeMod.creativeTab);
	}

	

}
