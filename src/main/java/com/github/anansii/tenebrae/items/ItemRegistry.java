package com.github.anansii.tenebrae.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemRegistry {
	
	public static Item tenebrium;
	
	public static Item tenebriumAxe;
	public static Item tenebriumPickaxe;
	public static Item tenebriumShovel;
	public static Item tenebriumHoe;
	public static Item tenebriumSword;
	
	public static ItemFoodBlackCoffee blackCoffee;
	
	public static void registerItems() {
		tenebrium = new ItemTenebrium();
		GameRegistry.registerItem(tenebrium, ItemNames.tenebrium);
		
		tenebriumAxe = new ItemTenebriumAxe();
		GameRegistry.registerItem(tenebriumAxe, ItemNames.tenebriumAxe);
		
		tenebriumPickaxe = new ItemTenebriumPickaxe();
		GameRegistry.registerItem(tenebriumPickaxe, ItemNames.tenebriumPickaxe);
		
		tenebriumShovel = new ItemTenebriumShovel();
		GameRegistry.registerItem(tenebriumShovel, ItemNames.tenebriumShovel);
		
		tenebriumHoe = new ItemTenebriumHoe();
		GameRegistry.registerItem(tenebriumHoe, ItemNames.tenebriumHoe);
		
		tenebriumSword = new ItemTenebriumSword();
		GameRegistry.registerItem(tenebriumSword, ItemNames.tenebriumSword);
		
		blackCoffee = new ItemFoodBlackCoffee();
		GameRegistry.registerItem(blackCoffee, ItemNames.blackCoffee);
		
	}

}
