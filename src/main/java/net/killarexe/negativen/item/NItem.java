
package net.killarexe.negativen.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.killarexe.negativen.itemgroup.NegativeNRessouresItemGroup;
import net.killarexe.negativen.NegativeNModElements;

@NegativeNModElements.ModElement.Tag
public class NItem extends NegativeNModElements.ModElement {
	@ObjectHolder("negative_n:n")
	public static final Item block = null;
	public NItem(NegativeNModElements instance) {
		super(instance, 60);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, NegativeNModElements.sounds.get(new ResourceLocation("negative_n:sweden_80s")),
					new Item.Properties().group(NegativeNRessouresItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("n");
		}
	}
}
