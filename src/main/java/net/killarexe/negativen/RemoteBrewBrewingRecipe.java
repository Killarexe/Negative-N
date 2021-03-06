
package net.killarexe.negativen;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.killarexe.negativen.item.WaterNBottleNItem;
import net.killarexe.negativen.item.RemoteBottleNItem;

@NegativeNModElements.ModElement.Tag
public class RemoteBrewBrewingRecipe extends NegativeNModElements.ModElement {
	public RemoteBrewBrewingRecipe(NegativeNModElements instance) {
		super(instance, 1015);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(Ingredient.fromStacks(new ItemStack(WaterNBottleNItem.block, (int) (1))),
				Ingredient.fromStacks(new ItemStack(Items.ENDER_PEARL, (int) (1))), new ItemStack(RemoteBottleNItem.block, (int) (1)));
	}
}
