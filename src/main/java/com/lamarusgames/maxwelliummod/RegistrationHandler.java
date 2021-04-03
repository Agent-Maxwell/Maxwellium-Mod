package com.lamarusgames.maxwelliummod;

import com.lamarusgames.maxwelliummod.util.RegistryUtil;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = MaxwelliumMod.MODID)
public class RegistrationHandler {
	
	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		final Item[] items =  {
				RegistryUtil.setItemName(new Item(), "first_item").setCreativeTab(CreativeTabs.MISC)
		};
		
		event.getRegistry().registerAll(items);
	}
}
