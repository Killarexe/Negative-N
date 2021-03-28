
package net.killarexe.negativen.itemgroup;

@NegativeNModElements.ModElement.Tag
public class NegativeNMobsItemGroup extends NegativeNModElements.ModElement {

	public NegativeNMobsItemGroup(NegativeNModElements instance) {
		super(instance, 593);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabnegative_n_mobs") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RottenfleshNItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;

}
