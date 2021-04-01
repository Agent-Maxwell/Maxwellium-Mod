package com.lamarusgames.maxwelliummod.util;


import com.lamarusgames.maxwelliummod.init.TutorialItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(Side.CLIENT)
public class ModelRegistryHandler {
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event){

        registerModel(TutorialItems.BASIC_ITEM, 0);
    }

    private static void registerModel(Item item, int meta){

        ModelLoader.setCustomModelResourceLocation(item, meta,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}
