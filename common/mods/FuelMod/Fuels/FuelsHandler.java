package mods.FuelMod.Fuels;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class FuelsHandler
{

	public void loadFuels()
	{
		defineFuels();
		addNames();
		registerFuelHandler();
		addRecipes();
	}

	// ---Fuels---
	public static Item FuelBoneMealInfusedCoal;
	public static Item FuelRedCoal;
	public static Item FuelGreenCoal;
	public static Item FuelDiamondInfusedCoal;
	public static Item FuelBlueCoal;
	public static Item FuelYellowCoal;
	public static Item FuelRedStoneInfusedCoal;

	private void defineFuels()
	{
		FuelBoneMealInfusedCoal = (new FuelBoneMealInfusedCoal(3006).setUnlocalizedName("FuelBoneMealInfusedCoal"));
		FuelRedCoal = (new FuelRedCoal(3001).setUnlocalizedName("FuelRedCoal"));
		FuelGreenCoal = (new FuelGreenCoal(3002).setUnlocalizedName("FuelGreenCoal"));
		FuelDiamondInfusedCoal = (new FuelDiamondInfusedCoal(3007).setUnlocalizedName("FuelDiamondInfusedCoal"));
		FuelBlueCoal = (new FuelBlueCoal(3003).setUnlocalizedName("FuelBlueCoal"));
		FuelYellowCoal = (new FuelBlueCoal(3004).setUnlocalizedName("FuelYellowCoal"));
		FuelRedStoneInfusedCoal = (new FuelRedStoneInfusedCoal(3005).setUnlocalizedName("FuelRedStoneInfusedCoal"));

	}

	private void addNames()
	{
		LanguageRegistry.addName(FuelBoneMealInfusedCoal, "Bonemeal Infused Coal");
		LanguageRegistry.addName(FuelRedCoal, "Red Coal");
		LanguageRegistry.addName(FuelGreenCoal, "Green Coal");
		LanguageRegistry.addName(FuelDiamondInfusedCoal, "Diamond Infused Coal");
		LanguageRegistry.addName(FuelBlueCoal, "Blue Coal");
		LanguageRegistry.addName(FuelYellowCoal, "Yellow Coal");
		LanguageRegistry.addName(FuelRedStoneInfusedCoal, "Redstone Infused Coal");

	}

	private void registerFuelHandler()
	{
		GameRegistry.registerFuelHandler(new FuelHandler());
	}

	private void addRecipes()
	{

		GameRegistry.addShapelessRecipe(new ItemStack(FuelsHandler.FuelRedCoal, 1), Item.coal, Item.coal, new ItemStack(
				Item.dyePowder, 1, 1));

		GameRegistry.addShapelessRecipe(new ItemStack(FuelsHandler.FuelGreenCoal, 1), Item.coal, Item.coal, Item.coal,
				new ItemStack(Item.dyePowder, 1, 2));

		GameRegistry.addShapelessRecipe(new ItemStack(FuelsHandler.FuelBlueCoal, 1), Item.coal, Item.coal, Item.coal, Item.coal,
				new ItemStack(Item.dyePowder, 1, 4));

		GameRegistry.addShapelessRecipe(new ItemStack(FuelsHandler.FuelYellowCoal, 1), Item.coal, Item.coal, Item.coal,
				Item.coal, Item.coal, new ItemStack(Item.dyePowder, 1, 11));

		GameRegistry.addShapelessRecipe(new ItemStack(FuelsHandler.FuelRedStoneInfusedCoal, 1), Item.coal, Item.coal, Item.coal,
				Item.coal, Item.coal, Item.coal, Item.redstone);

		GameRegistry.addShapelessRecipe(new ItemStack(FuelsHandler.FuelBoneMealInfusedCoal, 1), Item.coal, Item.coal, Item.coal,
				Item.coal, Item.coal, Item.coal, Item.coal, new ItemStack(Item.dyePowder, 1, 15));
		
		GameRegistry.addShapelessRecipe(new ItemStack(FuelsHandler.FuelDiamondInfusedCoal, 1), Item.coal, Item.coal, Item.coal,
				Item.coal, Item.coal, Item.coal, Item.coal, Item.coal, Item.diamond);

	}
}
