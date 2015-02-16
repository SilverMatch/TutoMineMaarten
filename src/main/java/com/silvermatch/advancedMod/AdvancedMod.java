package com.silvermatch.advancedMod;

import com.silvermatch.advancedMod.init.ModBlocks;
import com.silvermatch.advancedMod.proxy.CommonProxy;
import com.silvermatch.advancedMod.reference.Reference;
import com.silvermatch.advancedMod.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class AdvancedMod
{
	@Mod.Instance("Reference.MOD_ID")
	public static AdvancedMod instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS , serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	// Registration items, sounds, etc.
	// Read config
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModBlocks.init();
		proxy.preInit();
		LogHelper.info("PreInit Complete!");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.init();
		LogHelper.info("Init Complete!");

	}

	// Access to other mods
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		proxy.postInit();
		LogHelper.info("PostInit Complete!");
	}

}
