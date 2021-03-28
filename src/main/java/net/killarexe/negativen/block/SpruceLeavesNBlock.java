
package net.killarexe.negativen.block;

import net.minecraft.block.material.Material;

@NegativeNModElements.ModElement.Tag
public class SpruceLeavesNBlock extends NegativeNModElements.ModElement {

	@ObjectHolder("negative_n:spruce_leaves_n")
	public static final Block block = null;

	public SpruceLeavesNBlock(NegativeNModElements instance) {
		super(instance, 83);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(NegativeNDecorationBlocksItemGroup.tab))
				.setRegistryName(block.getRegistryName()));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void clientLoad(FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(block, RenderType.getCutout());
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT).hardnessAndResistance(0.5f, 10f).setLightLevel(s -> 0).notSolid()
							.tickRandomly().setOpaque((bs, br, bp) -> false));

			setRegistryName("spruce_leaves_n");
		}

		@OnlyIn(Dist.CLIENT)
		public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
			return adjacentBlockState.getBlock() == this ? true : super.isSideInvisible(state, adjacentBlockState, side);
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(SpruceSaplingNBlock.block, (int) (1)));
		}

	}

}
