
package net.killarexe.negativen.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.killarexe.negativen.block.WaterNBlock;
import net.killarexe.negativen.NegativeNModElements;

@NegativeNModElements.ModElement.Tag
public class WaterNFuelFuel extends NegativeNModElements.ModElement {
	public WaterNFuelFuel(NegativeNModElements instance) {
		super(instance, 1098);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(WaterNBlock.block, (int) (1)).getItem())
			event.setBurnTime(3200);
	}
}
