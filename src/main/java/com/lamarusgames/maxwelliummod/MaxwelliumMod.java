package com.lamarusgames.maxwelliummod;

import com.lamarusgames.maxwelliummod.proxy.IProxy;
import org.apache.logging.log4j.Logger;

import com.lamarusgames.maxwelliummod.proxy.ServerProxy;
import com.lamarusgames.maxwelliummod.proxy.ClientProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MaxwelliumMod.MODID, name = MaxwelliumMod.NAME, version = MaxwelliumMod.VERSION, acceptedMinecraftVersions = MaxwelliumMod.MC_VERSION)
public class MaxwelliumMod {

    public static final String MODID = "maxmod";
    public static final String NAME = "Maxwellium Mod";
    public static final String VERSION = "1.0.0";
    public static final String MC_VERSION = "[1.12.2]";

    public static final String CLIENT = "com/lamarusgames/maxwelliummod/proxy/ClientProxy.java";
    public static final String SERVER = "com/lamarusgames/maxwelliummod/proxy/ServerProxy.java";

    @SidedProxy(clientSide = MaxwelliumMod.CLIENT, serverSide = MaxwelliumMod.SERVER)
    public static IProxy proxy;

    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info(MaxwelliumMod.NAME + " initialized, why did you even install this?");
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

}