package com.github.anansii.tenebrae;

import com.github.anansii.tenebrae.blocks.BlockRecipeRegistry;
import com.github.anansii.tenebrae.blocks.BlockRegistry;
import com.github.anansii.tenebrae.gui.CreativeTab;
import com.github.anansii.tenebrae.items.ItemRegistry;
import com.github.anansii.tenebrae.proxy.Proxy;
import com.github.anansii.tenebrae.reference.Reference;
import com.github.anansii.tenebrae.util.TextHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class TenebraeMod {
	
	//public static Logger logger = LogManager.getLogger(Reference.MOD_NAME);
	public static final CreativeTabs creativeTab = new CreativeTab();

	@Mod.Instance(Reference.MOD_ID)
	public static TenebraeMod instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static Proxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// Item, Block init and registering
		// config handling
		logger.info(TextHelper.localize("info." + Reference.MOD_ID + ".console.load.preInit"));
		
		ItemRegistry.registerItems();
		BlockRegistry.registerBlocks();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		//Proxy, TileEntity, Entity, GUI and Packet Registering
		logger.info(TextHelper.localize("info." + Reference.MOD_ID + ".console.load.init"));

		//ItemRecipeRegistry.registerItemRecipes();
		BlockRecipeRegistry.registerBlockRecipes();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		logger.info(TextHelper.localize("info." + Reference.MOD_ID + ".console.load.postInit"));
		
		
	}

}
