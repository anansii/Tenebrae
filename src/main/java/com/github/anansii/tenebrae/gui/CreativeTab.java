package com.github.anansii.tenebrae.gui;

import com.github.anansii.tenebrae.items.ItemRegistry;
import com.github.anansii.tenebrae.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTab extends CreativeTabs {

	public CreativeTab() {
		super(Reference.MOD_ID + ".creativeTab");
		setBackgroundImageName(Reference.MOD_ID + ".png"); // Automagically has tab_ applied to it
	}

	public boolean hasSearchBar() {
		return true;
	}

	//The tab icon is what you return here.
	@Override
	public ItemStack getIconItemStack() {
		return new ItemStack(ItemRegistry.blackCoffee);
	}

	@Override
	public Item getTabIconItem() {
		return ItemRegistry.blackCoffee;
	}
}
