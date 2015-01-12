package com.github.anansii.tenebrae.blocks;

import com.github.anansii.tenebrae.items.ItemRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;


public class BlockRecipeRegistry {

	//Self explanatory. Continue these how you wish. EG: registerPulverizerRecipes
		public static void registerBlockRecipes() {
			GameRegistry.addRecipe(new ItemStack(BlockRegistry.blockTenebrium), new Object[]{"XXX", "XXX", "XXX", 'X', ItemRegistry.tenebrium});
			GameRegistry.addRecipe(new ItemStack(Blocks.bedrock), new Object[]{"XXX", "XXX", "XXX", 'X', Blocks.dirt});
		}

}
