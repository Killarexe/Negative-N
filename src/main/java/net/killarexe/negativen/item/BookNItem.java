
package net.killarexe.negativen.item;

@NegativeNModElements.ModElement.Tag
public class BookNItem extends NegativeNModElements.ModElement {

	@ObjectHolder("negative_n:book_n")
	public static final Item block = null;

	public BookNItem(NegativeNModElements instance) {
		super(instance, 28);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(NegativeNRessouresItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("book_n");
		}

		@Override
		public int getItemEnchantability() {
			return 1;
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
