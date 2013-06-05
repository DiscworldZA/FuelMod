package mods.FuelMod;

import mods.FuelMod.Fuels.FuelsHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(modid = FM_References.ModID, name = FM_References.ModName, version = FM_References.version)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)


public class FuelMod
{
	
	//---Classes---
	FuelsHandler fh = new FuelsHandler();
	
	@Instance(FM_References.ModName)
	public static FuelMod instance;
	
	@SidedProxy(clientSide = "mods.FuelMod.Client.ClientProxy", serverSide = "mods.FuelMod.CommonProxy")
	public static CommonProxy proxy;
	@PreInit
	public void preInit(FMLPreInitializationEvent e)
	{

	}
	
	@Init
	public void load(FMLInitializationEvent e)
	{
		fh.loadFuels();
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent e)
	{
		
	}
}
