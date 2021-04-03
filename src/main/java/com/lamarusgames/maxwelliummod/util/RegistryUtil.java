package com.lamarusgames.maxwelliummod.util;

import com.lamarusgames.maxwelliummod.MaxwelliumMod;

import net.minecraft.item.Item;

public class RegistryUtil {
	
	public static Item setItemName(final Item item, final String name) {
		item.setRegistryName(MaxwelliumMod.MODID, name).setUnlocalizedName(MaxwelliumMod.MODID + "." + "name");
		return item;
	}
	
	public static Block setBlockName(final Block block, final String name) {
		block.setRegistryName(MaxwelliumMod.MODID, name).setUnlocalizedName(MaxwelliumMod.MODID + "." + "name");
		return block;
	}
}
