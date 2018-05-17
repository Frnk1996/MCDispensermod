package com.frnk1996.tf2dispensermod.blocks;

import com.frnk1996.tf2dispensermod.Main;
import com.frnk1996.tf2dispensermod.init.ModBlocks;
import com.frnk1996.tf2dispensermod.init.ModItems;
import com.frnk1996.tf2dispensermod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {


    public BlockBase(String name, Material material){
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.REDSTONE);

        ModBlocks.BLOCKS.add(this);

        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }


}
