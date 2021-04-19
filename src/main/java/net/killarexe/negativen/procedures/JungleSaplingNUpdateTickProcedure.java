package net.killarexe.negativen.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Mirror;

import net.killarexe.negativen.NegativeNModElements;
import net.killarexe.negativen.NegativeNMod;

import java.util.Map;

@NegativeNModElements.ModElement.Tag
public class JungleSaplingNUpdateTickProcedure extends NegativeNModElements.ModElement {
	public JungleSaplingNUpdateTickProcedure(NegativeNModElements instance) {
		super(instance, 595);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NegativeNMod.LOGGER.warn("Failed to load dependency x for procedure JungleSaplingNUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NegativeNMod.LOGGER.warn("Failed to load dependency y for procedure JungleSaplingNUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NegativeNMod.LOGGER.warn("Failed to load dependency z for procedure JungleSaplingNUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NegativeNMod.LOGGER.warn("Failed to load dependency world for procedure JungleSaplingNUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((Math.random() >= 0.875)) {
			if ((Math.random() >= 0.875)) {
				if (world instanceof ServerWorld) {
					Template template = ((ServerWorld) world).getStructureTemplateManager()
							.getTemplateDefaulted(new ResourceLocation("negative_n", "bigjungletreen"));
					if (template != null) {
						template.func_237144_a_((ServerWorld) world, new BlockPos((int) (x - 8), (int) y, (int) (z - 8)),
								new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
								((World) world).rand);
					}
				}
			} else {
				if (world instanceof ServerWorld) {
					Template template = ((ServerWorld) world).getStructureTemplateManager()
							.getTemplateDefaulted(new ResourceLocation("negative_n", "jungletreen"));
					if (template != null) {
						template.func_237144_a_((ServerWorld) world, new BlockPos((int) (x - 10), (int) y, (int) (z - 10)),
								new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
								((World) world).rand);
					}
				}
			}
		}
	}
}
