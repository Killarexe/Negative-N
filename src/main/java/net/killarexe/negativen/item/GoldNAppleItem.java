
package net.killarexe.negativen.item;

@NegativeNModElements.ModElement.Tag
public class GoldNAppleItem extends NegativeNModElements.ModElement {

	@ObjectHolder("negative_n:gold_n_apple")
	public static final Item block = null;

	public GoldNAppleItem(NegativeNModElements instance) {
		super(instance, 316);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(NegativeNFoodItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(20).saturation(1f).setAlwaysEdible()

							.build()));
			setRegistryName("gold_n_apple");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 64;
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemstack, world, entity);

			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();

				$_dependencies.put("entity", entity);

				GoldNAppleFoodEatenProcedure.executeProcedure($_dependencies);
			}

			return retval;
		}

	}

}
