package com.silvermatch.advancedMod.block;

import com.silvermatch.advancedMod.reference.Reference;
import com.silvermatch.advancedMod.utility.Names;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockFrenchFlag extends BlockAdvancedMod{

	public BlockFrenchFlag() {
		setBlockName(Names.Blocks.FRENCH_FLAG);
		setBlockTextureName(Reference.MOD_ID_LOWER + ":" + Names.Blocks.FRENCH_FLAG);
	}
}
