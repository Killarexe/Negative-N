
package net.killarexe.negativen.item;

@NegativeNModElements.ModElement.Tag
public class DiamondningotItem extends NegativeNModElements.ModElement {

	@ObjectHolder("negative_n:diamond_n_ingot")
	public static final Item block = null;

	public DiamondningotItem(NegativeNModElements instance) {
		super(instance, 3);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(NegativeNRessouresItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("diamond_n_ingot");
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
