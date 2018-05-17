package com.frnk1996.tf2dispensermod.items;

import com.frnk1996.tf2dispensermod.Main;
import com.frnk1996.tf2dispensermod.init.ModItems;
import com.frnk1996.tf2dispensermod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.REDSTONE);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels(){

        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }


}
