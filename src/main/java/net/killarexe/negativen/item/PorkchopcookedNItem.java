
package net.killarexe.negativen.item;

@NegativeNModElements.ModElement.Tag
public class PorkchopcookedNItem extends NegativeNModElements.ModElement {

	@ObjectHolder("negative_n:porkchopcookedn")
	public static final Item block = null;

	public PorkchopcookedNItem(NegativeNModElements instance) {
		super(instance, 314);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(NegativeNFoodItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(4).saturation(0.3f)

							.meat().build()));
			setRegistryName("porkchopcookedn");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

	}

}
