
package net.killarexe.negativen.block;

import net.minecraft.block.material.Material;

@NegativeNModElements.ModElement.Tag
public class SandNBlock extends NegativeNModElements.ModElement {

	@ObjectHolder("negative_n:sand_n")
	public static final Block block = null;

	public SandNBlock(NegativeNModElements instance) {
		super(instance, 210);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(NegativeNBlocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends FallingBlock {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.SAND).sound(SoundType.SAND).hardnessAndResistance(1.25f, 10f).setLightLevel(s -> 0)
							.harvestLevel(0).harvestTool(ToolType.SHOVEL).setRequiresTool());

			setRegistryName("sand_n");
		}

		@Override
		public MaterialColor getMaterialColor() {
			return MaterialColor.BLUE;
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
