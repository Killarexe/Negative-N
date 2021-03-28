
package net.killarexe.negativen.item;

@NegativeNModElements.ModElement.Tag
public class NetheriteNHoeItem extends NegativeNModElements.ModElement {

	@ObjectHolder("negative_n:netherite_n_hoe")
	public static final Item block = null;

	public NetheriteNHoeItem(NegativeNModElements instance) {
		super(instance, 279);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 4683;
			}

			public float getEfficiency() {
				return 24f;
			}

			public float getAttackDamage() {
				return 4.6f;
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
		}, 0, -3f, new Item.Properties().group(NeagtiveNOuilsItemGroup.tab).isImmuneToFire()) {

			@Override
			public ActionResultType onItemUse(ItemUseContext context) {
				ActionResultType retval = super.onItemUse(context);
				World world = context.getWorld();
				BlockPos pos = context.getPos();
				PlayerEntity entity = context.getPlayer();
				Direction direction = context.getFace();
				int x = pos.getX();
				int y = pos.getY();
				int z = pos.getZ();
				ItemStack itemstack = context.getItem();
				{
					Map<String, Object> $_dependencies = new HashMap<>();

					$_dependencies.put("itemstack", itemstack);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);

					HoeNRightClickOnDirtProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}

		}.setRegistryName("netherite_n_hoe"));
	}

}
