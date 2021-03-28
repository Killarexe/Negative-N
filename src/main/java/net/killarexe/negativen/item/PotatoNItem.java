
package net.killarexe.negativen.item;

@NegativeNModElements.ModElement.Tag
public class PotatoNItem extends NegativeNModElements.ModElement {

	@ObjectHolder("negative_n:potato_n")
	public static final Item block = null;

	public PotatoNItem(NegativeNModElements instance) {
		super(instance, 322);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(NegativeNFoodItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(5).saturation(0.2f)

							.build()));
			setRegistryName("potato_n");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

	}

}
