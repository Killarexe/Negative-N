
package net.killarexe.negativen.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.killarexe.negativen.NegativeNModElements;

@NegativeNModElements.ModElement.Tag
public class MineingEnchantment extends NegativeNModElements.ModElement {
	@ObjectHolder("negative_n:mineing")
	public static final Enchantment enchantment = null;
	public MineingEnchantment(NegativeNModElements instance) {
		super(instance, 891);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("mineing"));
	}
	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.VERY_RARE, EnchantmentType.DIGGER, slots);
		}

		@Override
		public int getMinLevel() {
			return 1;
		}

		@Override
		public int getMaxLevel() {
			return 1;
		}

		@Override
		protected boolean canApplyTogether(Enchantment ench) {
			if (ench == PoisonusEnchantment.enchantment)
				return true;
			if (ench == BurnProtectionEnchantment.enchantment)
				return true;
			if (ench == MineingEnchantment.enchantment)
				return true;
			if (ench == EyewearEnchantment.enchantment)
				return true;
			if (ench == WitheredEnchantment.enchantment)
				return true;
			if (ench == AntiPotionEnchantment.enchantment)
				return true;
			if (ench == ResistantEnchantment.enchantment)
				return true;
			if (ench == PrimedStageEnchantment.enchantment)
				return true;
			if (ench == Enchantments.PROTECTION)
				return true;
			if (ench == Enchantments.FIRE_PROTECTION)
				return true;
			if (ench == Enchantments.FEATHER_FALLING)
				return true;
			if (ench == Enchantments.BLAST_PROTECTION)
				return true;
			if (ench == Enchantments.PROJECTILE_PROTECTION)
				return true;
			if (ench == Enchantments.RESPIRATION)
				return true;
			if (ench == Enchantments.AQUA_AFFINITY)
				return true;
			if (ench == Enchantments.THORNS)
				return true;
			if (ench == Enchantments.DEPTH_STRIDER)
				return true;
			if (ench == Enchantments.FROST_WALKER)
				return true;
			if (ench == Enchantments.BINDING_CURSE)
				return true;
			if (ench == Enchantments.SHARPNESS)
				return true;
			if (ench == Enchantments.SMITE)
				return true;
			if (ench == Enchantments.BANE_OF_ARTHROPODS)
				return true;
			if (ench == Enchantments.KNOCKBACK)
				return true;
			if (ench == Enchantments.FIRE_ASPECT)
				return true;
			if (ench == Enchantments.LOOTING)
				return true;
			if (ench == Enchantments.SWEEPING)
				return true;
			if (ench == Enchantments.EFFICIENCY)
				return true;
			if (ench == Enchantments.SILK_TOUCH)
				return true;
			if (ench == Enchantments.UNBREAKING)
				return true;
			if (ench == Enchantments.FORTUNE)
				return true;
			if (ench == Enchantments.POWER)
				return true;
			if (ench == Enchantments.PUNCH)
				return true;
			if (ench == Enchantments.FLAME)
				return true;
			if (ench == Enchantments.INFINITY)
				return true;
			if (ench == Enchantments.LUCK_OF_THE_SEA)
				return true;
			if (ench == Enchantments.LURE)
				return true;
			if (ench == Enchantments.LOYALTY)
				return true;
			if (ench == Enchantments.IMPALING)
				return true;
			if (ench == Enchantments.RIPTIDE)
				return true;
			if (ench == Enchantments.CHANNELING)
				return true;
			if (ench == Enchantments.MULTISHOT)
				return true;
			if (ench == Enchantments.QUICK_CHARGE)
				return true;
			if (ench == Enchantments.PIERCING)
				return true;
			if (ench == Enchantments.MENDING)
				return true;
			if (ench == Enchantments.VANISHING_CURSE)
				return true;
			if (ench == Enchantments.SOUL_SPEED)
				return true;
			return false;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return false;
		}

		@Override
		public boolean isCurse() {
			return false;
		}

		@Override
		public boolean isAllowedOnBooks() {
			return true;
		}
	}
}
