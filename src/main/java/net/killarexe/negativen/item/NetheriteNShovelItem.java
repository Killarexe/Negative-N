
package net.killarexe.negativen.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.killarexe.negativen.itemgroup.NeagtiveNOuilsItemGroup;
import net.killarexe.negativen.NegativeNModElements;

@NegativeNModElements.ModElement.Tag
public class NetheriteNShovelItem extends NegativeNModElements.ModElement {
	@ObjectHolder("negative_n:netherite_n_shovel")
	public static final Item block = null;
	public NetheriteNShovelItem(NegativeNModElements instance) {
		super(instance, 360);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 4683;
			}

			public float getEfficiency() {
				return 24f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 9;
			}

			public int getEnchantability() {
				return 30;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(NetheriteNItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(NeagtiveNOuilsItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("netherite_n_shovel"));
	}
}
