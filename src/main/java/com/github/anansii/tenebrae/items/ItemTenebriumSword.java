package com.github.anansii.tenebrae.items;

import com.github.anansii.tenebrae.TenebraeMod;
import com.github.anansii.tenebrae.reference.Reference;
import net.minecraft.item.ItemSword;

public class ItemTenebriumSword extends ItemSword {

	public ItemTenebriumSword() {
		super(ItemMaterials.tenebriumToolMaterial);
		
		final String internalName = ItemNames.tenebriumSword;
		
		setUnlocalizedName(Reference.MOD_ID + "." + internalName);
		setTextureName(Reference.MOD_ID + ":" + internalName);
		setCreativeTab(TenebraeMod.creativeTab);
	}

	

}
