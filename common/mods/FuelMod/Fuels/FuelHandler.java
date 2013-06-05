package mods.FuelMod.Fuels;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler
{

	@Override
	public int getBurnTime(ItemStack fuel)
	{
		if (fuel.itemID == FuelsHandler.FuelRedCoal.itemID)
			return 3200;
		else if (fuel.itemID == FuelsHandler.FuelGreenCoal.itemID)
			return 4800;
		else if (fuel.itemID == FuelsHandler.FuelBlueCoal.itemID)
			return 6400;
		else if (fuel.itemID == FuelsHandler.FuelYellowCoal.itemID)
			return 8000;
		else if (fuel.itemID ==FuelsHandler.FuelRedStoneInfusedCoal.itemID)
			return 9600;
		else if (fuel.itemID == FuelsHandler.FuelBoneMealInfusedCoal.itemID)
			return 11200;
		else if (fuel.itemID == FuelsHandler.FuelDiamondInfusedCoal.itemID)
			return 12800;
		else
			return 0;

	}

}
