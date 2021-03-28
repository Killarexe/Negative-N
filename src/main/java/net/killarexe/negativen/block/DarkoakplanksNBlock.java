
package net.killarexe.negativen.block;

import net.minecraft.block.material.Material;

@NegativeNModElements.ModElement.Tag
public class DarkoakplanksNBlock extends NegativeNModElements.ModElement {

	@ObjectHolder("negative_n:dark_oak_planks_n")
	public static final Block block = null;

	public DarkoakplanksNBlock(NegativeNModElements instance) {
		super(instance, 174);

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

					Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2f, 10f).setLightLevel(s -> 0).harvestLevel(0)
							.harvestTool(ToolType.AXE).setRequiresTool());

			setRegistryName("dark_oak_planks_n");
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
