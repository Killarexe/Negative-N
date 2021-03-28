
package net.killarexe.negativen.block;

import net.minecraft.block.material.Material;

@NegativeNModElements.ModElement.Tag
public class ClassicMossyCobblestoneBlock extends NegativeNModElements.ModElement {

	@ObjectHolder("negative_n:classic_mossy_cobblestone")
	public static final Block block = null;

	public ClassicMossyCobblestoneBlock(NegativeNModElements instance) {
		super(instance, 353);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ClassicBlocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.25f, 10f).setLightLevel(s -> 0)
							.harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool());

			setRegistryName("classic_mossy_cobblestone");
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
