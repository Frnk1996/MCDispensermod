package com.frnk1996.tf2dispensermod.init;

import com.frnk1996.tf2dispensermod.blocks.BlockBase;

import com.frnk1996.tf2dispensermod.blocks.TFDispenserBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block TFDISPENSER_BLOCK = new TFDispenserBlock("tfdispenser_block", Material.ANVIL);

}
