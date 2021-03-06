package net.killarexe.negativen.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.GameType;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.Minecraft;

import net.killarexe.negativen.item.MilkBucketNItem;
import net.killarexe.negativen.item.BucketNItem;
import net.killarexe.negativen.entity.CowNEntity;
import net.killarexe.negativen.NegativeNModElements;
import net.killarexe.negativen.NegativeNMod;

import java.util.Map;

@NegativeNModElements.ModElement.Tag
public class BucketNLivingEntityIsHitWithItemProcedure extends NegativeNModElements.ModElement {
	public BucketNLivingEntityIsHitWithItemProcedure(NegativeNModElements instance) {
		super(instance, 758);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NegativeNMod.LOGGER.warn("Failed to load dependency entity for procedure BucketNLivingEntityIsHitWithItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof CowNEntity.CustomEntity)) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(MilkBucketNItem.block, (int) (1));
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
			if ((new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayerEntity) {
						return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.SURVIVAL;
					} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
						NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
								.getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
						return _npi != null && _npi.getGameType() == GameType.SURVIVAL;
					}
					return false;
				}
			}.checkGamemode(entity))) {
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(BucketNItem.block, (int) (1));
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
			}
		}
	}
}
