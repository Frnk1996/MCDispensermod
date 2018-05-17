package com.frnk1996.tf2dispensermod;


import com.frnk1996.tf2dispensermod.proxy.CommonProxy;
import com.frnk1996.tf2dispensermod.util.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {


    @Instance
    public static Main Instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    }


    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    }


    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }



}

