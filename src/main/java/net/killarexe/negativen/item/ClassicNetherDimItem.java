
package net.killarexe.negativen.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ActionResultType;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;

import net.killarexe.negativen.world.dimension.ClassicNetherDimDimension;
import net.killarexe.negativen.procedures.ClassicNethersCanTravelProcedure;
import net.killarexe.negativen.itemgroup.NeagtiveNOuilsItemGroup;

import com.google.common.collect.ImmutableMap;

public class ClassicNetherDimItem extends Item {
	@ObjectHolder("negative_n:classic_nether_dim")
	public static final Item block = null;
	public ClassicNetherDimItem() {
		super(new Item.Properties().group(NeagtiveNOuilsItemGroup.tab).maxDamage(64));
	}

	@Override
	public ActionResultType onItemUse(ItemUseContext context) {
		PlayerEntity entity = context.getPlayer();
		BlockPos pos = context.getPos().offset(context.getFace());
		ItemStack itemstack = context.getItem();
		World world = context.getWorld();
		if (!entity.canPlayerEdit(pos, context.getFace(), itemstack)) {
			return ActionResultType.FAIL;
		} else {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			if (world.isAirBlock(pos) && ClassicNethersCanTravelProcedure.executeProcedure(ImmutableMap.of()))
				ClassicNetherDimDimension.portal.portalSpawn(world, pos);
			itemstack.damageItem(1, entity, c -> c.sendBreakAnimation(context.getHand()));
			return ActionResultType.SUCCESS;
		}
	}
}
