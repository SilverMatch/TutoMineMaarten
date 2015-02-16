package com.silvermatch.advancedMod.init;

import net.minecraft.block.Block;

import com.silvermatch.advancedMod.block.BlockFrenchFlag;
import com.silvermatch.advancedMod.reference.Reference;
import com.silvermatch.advancedMod.utility.LogHelper;
import com.silvermatch.advancedMod.utility.Names;

import cpw.mods.fml.common.registry.GameRegistry;
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

	public static final Block frenchFlag = new BlockFrenchFlag();
	public static void init(){
		GameRegistry.registerBlock(frenchFlag, Names.Blocks.FRENCH_FLAG);
		LogHelper.info("Init Blocks Complete!");
	}
}
