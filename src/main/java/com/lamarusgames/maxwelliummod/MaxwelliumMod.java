package com.lamarusgames.maxwelliummod;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MaxwelliumMod.MODID, name = MaxwelliumMod.NAME, version = MaxwelliumMod.VERSION, acceptedMinecraftVersions = MaxwelliumMod.MC_VERSION)

public class MaxwelliumMod {
	public static final String MODID = "maxmod";
	public static final String NAME = "Maxwellium Mod";
	public static final String VERSION = "1.0.0";
	public static final String MC_VERSION = "1.12.2";
	
	public static final Logger LOGGER = LogManager.getLogger(MaxwelliumMod.MODID);
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		LOGGER.info(MaxwelliumMod.NAME + "initialized, why did you even install this?");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}

}