
package net.killarexe.negativen.item;

@NegativeNModElements.ModElement.Tag
public class PumpkinNSeedItem extends NegativeNModElements.ModElement {

	@ObjectHolder("negative_n:pumpkin_n_seed")
	public static final Item block = null;

	public PumpkinNSeedItem(NegativeNModElements instance) {
		super(instance, 906);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(NegativeNRessouresItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("pumpkin_n_seed");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}
