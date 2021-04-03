package com.lamarusgames.maxwelliummod.client;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.lamarusgames.maxwelliummod.MaxwelliumMod;
import com.lamarusgames.maxwelliummod.init.ModItems;

import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(value = Side.CLIENT, modid = MaxwelliumMod.MODID)
public class ModelRegistrationhandler {
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		registerModel(ModItems.FIRST_ITEM, 0);
	}
	
	private static void registerModel(Item item, int meta) {
		ModelLoader.setCustomModelResourceLocation(item, meta,
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
