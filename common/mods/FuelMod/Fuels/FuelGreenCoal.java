package mods.FuelMod.Fuels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.FuelMod.FM_References;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class FuelGreenCoal extends Item
{

	public FuelGreenCoal(int id)
	{
		super(id);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconReg)
    {
        this.itemIcon = iconReg.registerIcon(FM_References.textureLocation + this.getUnlocalizedName().substring(5));
    }

}
