package com.frnk1996.tf2dispensermod.blocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.AxisAlignedBB;

import java.util.List;

public class TFDispenserTileEntity extends TileEntity implements ITickable {
    @Override
    public void update() {
        if (world.isRemote) return;
        if (world.getTotalWorldTime() % 20 == 0) {
            List<EntityPlayer> playersAround = world.getEntitiesWithinAABB(EntityPlayer.class, new AxisAlignedBB(getPos().add(-2, -2, -2), getPos().add(2, 2, 2)));
            for (EntityPlayer player : playersAround) {
                if (!player.capabilities.isCreativeMode) {
                    player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 1, 10));
                    player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 1));

                    int count = 0;
                    for (int slot = 0; slot < player.inventory.getSizeInventory(); slot++) {
                        ItemStack Stack = player.inventory.getStackInSlot(slot);

                        if (Stack != null && Stack.getItem().equals(Items.ARROW)) {
                            count += Stack.getCount();
                        }
                    }

                    if(count > 0 && count < 64){
                        player.addItemStackToInventory(new ItemStack(Items.ARROW, 1));
                    }
                }
            }
        }
    }
}