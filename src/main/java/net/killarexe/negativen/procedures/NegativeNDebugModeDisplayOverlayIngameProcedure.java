package net.killarexe.negativen.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;

import net.killarexe.negativen.NegativenModVariables;
import net.killarexe.negativen.NegativenModElements;

import java.util.Map;

@NegativenModElements.ModElement.Tag
public class NegativeNDebugModeDisplayOverlayIngameProcedure extends NegativenModElements.ModElement {
	public NegativeNDebugModeDisplayOverlayIngameProcedure(NegativenModElements instance) {
		super(instance, 567);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure NegativeNDebugModeDisplayOverlayIngame!");
			return false;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure NegativeNDebugModeDisplayOverlayIngame!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		return (((NegativenModVariables.MapVariables.get(world).Debug) == (true))
				&& (((entity.getCapability(NegativenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NegativenModVariables.PlayerVariables())).DevVerson) == (false)));
	}
}
