package com.lamarusgames.maxwelliummod.item;

import com.lamarusgames.maxwelliummod.MaxwelliumMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBasic extends Item {

    public ItemBasic(String unlocalizedName, String registryName) {
        setUnlocalizedName(MaxwelliumMod.MODID + "." + unlocalizedName);

        setRegistryName(registryName);

        setCreativeTab(CreativeTabs.MISC);

    }
}
