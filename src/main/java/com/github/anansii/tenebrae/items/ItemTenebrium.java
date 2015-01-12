package com.github.anansii.tenebrae.items;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemTenebrium extends ItemBase {

	public ItemTenebrium() {
		super(ItemNames.tenebrium);
	}
	
	public static ItemTenebrium create() {
		ItemTenebrium tenebrium = new ItemTenebrium();
		GameRegistry.registerItem(tenebrium, ItemNames.tenebrium);
		
		return tenebrium;
	}

}
