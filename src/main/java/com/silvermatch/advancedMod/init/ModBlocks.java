package com.silvermatch.advancedMod.init;

import com.silvermatch.advancedMod.reference.Reference;
import com.silvermatch.advancedMod.utility.LogHelper;

import cpw.mods.fml.common.registry.GameRegistry;
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

	public static void init(){
		//test
		LogHelper.info("Init Blocks Complete!");
	}
}
