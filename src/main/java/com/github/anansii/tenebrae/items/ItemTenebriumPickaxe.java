package com.github.anansii.tenebrae.items;

import com.github.anansii.tenebrae.TenebraeMod;
import com.github.anansii.tenebrae.reference.Reference;
import net.minecraft.item.ItemPickaxe;

public class ItemTenebriumPickaxe extends ItemPickaxe {

	public ItemTenebriumPickaxe() {
		super(ItemMaterials.tenebriumToolMaterial);
		
		final String internalName = ItemNames.tenebriumPickaxe;
		
		setUnlocalizedName(Reference.MOD_ID + "." + internalName);
		setTextureName(Reference.MOD_ID + ":" + internalName);
		setCreativeTab(TenebraeMod.creativeTab);
	}

	

}
