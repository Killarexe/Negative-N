
package net.killarexe.negativen.block;

import net.minecraft.block.material.Material;

@NegativeNModElements.ModElement.Tag
public class ChiseledNetherBrickNBlock extends NegativeNModElements.ModElement {

	@ObjectHolder("negative_n:chiseled_nether_brick_n")
	public static final Block block = null;

	public ChiseledNetherBrickNBlock(NegativeNModElements instance) {
		super(instance, 878);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(NegativeNBlocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.3f, 10f).setLightLevel(s -> 0)
							.harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool());

			setRegistryName("chiseled_nether_brick_n");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
