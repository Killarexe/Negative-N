
package net.killarexe.negativen.painting;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.entity.item.PaintingType;

import net.killarexe.negativen.NegativeNModElements;

@NegativeNModElements.ModElement.Tag
public class BombNPainting extends NegativeNModElements.ModElement {
	public BombNPainting(NegativeNModElements instance) {
		super(instance, 873);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(16, 16).setRegistryName("bomb_n"));
	}
}
