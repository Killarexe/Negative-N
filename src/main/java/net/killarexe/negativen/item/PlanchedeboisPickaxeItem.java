
package net.killarexe.negativen.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.killarexe.negativen.itemgroup.NeagtiveNOuilsItemGroup;
import net.killarexe.negativen.block.SprucePlanksNBlock;
import net.killarexe.negativen.block.PlanchedeboisNBlock;
import net.killarexe.negativen.block.JunglePlanksNBlock;
import net.killarexe.negativen.block.DarkoakplanksNBlock;
import net.killarexe.negativen.block.BirchplanksnBlock;
import net.killarexe.negativen.block.AcaciaplanksnBlock;
import net.killarexe.negativen.NegativeNModElements;

@NegativeNModElements.ModElement.Tag
public class PlanchedeboisPickaxeItem extends NegativeNModElements.ModElement {
	@ObjectHolder("negative_n:wooden_n_pickaxe")
	public static final Item block = null;
	public PlanchedeboisPickaxeItem(NegativeNModElements instance) {
		super(instance, 370);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 118;
			}

			public float getEfficiency() {
				return 2f;
			}

			public float getAttackDamage() {
				return -1f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PlanchedeboisNBlock.block, (int) (1)), new ItemStack(AcaciaplanksnBlock.block, (int) (1)),
						new ItemStack(BirchplanksnBlock.block, (int) (1)), new ItemStack(DarkoakplanksNBlock.block, (int) (1)),
						new ItemStack(JunglePlanksNBlock.block, (int) (1)), new ItemStack(SprucePlanksNBlock.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(NeagtiveNOuilsItemGroup.tab)) {
		}.setRegistryName("wooden_n_pickaxe"));
	}
}
