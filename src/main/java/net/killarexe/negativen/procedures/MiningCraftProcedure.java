package net.killarexe.negativen.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;

import net.killarexe.negativen.item.UpdateritemItem;
import net.killarexe.negativen.item.Iron_NPickaxeItem;
import net.killarexe.negativen.item.CobblestonePickaxeItem;
import net.killarexe.negativen.block.CobblestoneNBlock;
import net.killarexe.negativen.NegativeNModElements;
import net.killarexe.negativen.NegativeNMod;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;

@NegativeNModElements.ModElement.Tag
public class MiningCraftProcedure extends NegativeNModElements.ModElement {
	public MiningCraftProcedure(NegativeNModElements instance) {
		super(instance, 978);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NegativeNMod.LOGGER.warn("Failed to load dependency x for procedure MiningCraft!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NegativeNMod.LOGGER.warn("Failed to load dependency y for procedure MiningCraft!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NegativeNMod.LOGGER.warn("Failed to load dependency z for procedure MiningCraft!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NegativeNMod.LOGGER.warn("Failed to load dependency world for procedure MiningCraft!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((new Object() {
			public int getAmount(IWorld world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (9))) != 64) && ((((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
				}
				return _retval.get();
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(CobblestoneNBlock.block, (int) (1)).getItem())
				&& (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						TileEntity _ent = world.getTileEntity(pos);
						if (_ent != null) {
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
						}
						return _retval.get();
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(UpdateritemItem.block, (int) (1))
						.getItem()) && (((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null) {
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										_retval.set(capability.getStackInSlot(sltid).copy());
									});
								}
								return _retval.get();
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2)))
								.getItem() == new ItemStack(CobblestoneNBlock.block, (int) (1)).getItem()) && (((new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										TileEntity _ent = world.getTileEntity(pos);
										if (_ent != null) {
											_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
												_retval.set(capability.getStackInSlot(sltid).copy());
											});
										}
										return _retval.get();
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3)))
										.getItem() == new ItemStack(UpdateritemItem.block, (int) (1)).getItem()) && (((new Object() {
											public ItemStack getItemStack(BlockPos pos, int sltid) {
												AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
												TileEntity _ent = world.getTileEntity(pos);
												if (_ent != null) {
													_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
														_retval.set(capability.getStackInSlot(sltid).copy());
													});
												}
												return _retval.get();
											}
										}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (4)))
												.getItem() == new ItemStack(CobblestonePickaxeItem.block, (int) (1)).getItem()) && (((new Object() {
													public ItemStack getItemStack(BlockPos pos, int sltid) {
														AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
														TileEntity _ent = world.getTileEntity(pos);
														if (_ent != null) {
															_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																	.ifPresent(capability -> {
																		_retval.set(capability.getStackInSlot(sltid).copy());
																	});
														}
														return _retval.get();
													}
												}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (5)))
														.getItem() == new ItemStack(UpdateritemItem.block, (int) (1)).getItem()) && (((new Object() {
															public ItemStack getItemStack(BlockPos pos, int sltid) {
																AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																TileEntity _ent = world.getTileEntity(pos);
																if (_ent != null) {
																	_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																			.ifPresent(capability -> {
																				_retval.set(capability.getStackInSlot(sltid).copy());
																			});
																}
																return _retval.get();
															}
														}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (6)))
																.getItem() == new ItemStack(CobblestoneNBlock.block, (int) (1)).getItem())
																&& (((new Object() {
																	public ItemStack getItemStack(BlockPos pos, int sltid) {
																		AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																		TileEntity _ent = world.getTileEntity(pos);
																		if (_ent != null) {
																			_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																					.ifPresent(capability -> {
																						_retval.set(capability.getStackInSlot(sltid).copy());
																					});
																		}
																		return _retval.get();
																	}
																}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (7)))
																		.getItem() == new ItemStack(UpdateritemItem.block, (int) (1)).getItem())
																		&& ((new Object() {
																			public ItemStack getItemStack(BlockPos pos, int sltid) {
																				AtomicReference<ItemStack> _retval = new AtomicReference<>(
																						ItemStack.EMPTY);
																				TileEntity _ent = world.getTileEntity(pos);
																				if (_ent != null) {
																					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																							null).ifPresent(capability -> {
																								_retval.set(capability.getStackInSlot(sltid).copy());
																							});
																				}
																				return _retval.get();
																			}
																		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (8)))
																				.getItem() == new ItemStack(CobblestoneNBlock.block, (int) (1))
																						.getItem())))))))))
				&& ((((new Object() {
					public int getAmount(IWorld world, BlockPos pos, int sltid) {
						AtomicInteger _retval = new AtomicInteger(0);
						TileEntity _ent = world.getTileEntity(pos);
						if (_ent != null) {
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).getCount());
							});
						}
						return _retval.get();
					}
				}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (9))) <= 63) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						TileEntity _ent = world.getTileEntity(pos);
						if (_ent != null) {
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
						}
						return _retval.get();
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9))).getItem() == new ItemStack(Iron_NPickaxeItem.block, (int) (1))
						.getItem())) || ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null) {
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										_retval.set(capability.getStackInSlot(sltid).copy());
									});
								}
								return _retval.get();
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (9))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
								.getItem()))))) {
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = (int) (0);
					final int _amount = (int) 1;
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_sltid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
						}
					});
				}
			}
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = (int) (1);
					final int _amount = (int) 1;
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_sltid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
						}
					});
				}
			}
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = (int) (2);
					final int _amount = (int) 1;
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_sltid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
						}
					});
				}
			}
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = (int) (3);
					final int _amount = (int) 1;
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_sltid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
						}
					});
				}
			}
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = (int) (4);
					final int _amount = (int) 1;
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_sltid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
						}
					});
				}
			}
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = (int) (5);
					final int _amount = (int) 1;
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_sltid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
						}
					});
				}
			}
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = (int) (6);
					final int _amount = (int) 1;
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_sltid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
						}
					});
				}
			}
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = (int) (7);
					final int _amount = (int) 1;
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_sltid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
						}
					});
				}
			}
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = (int) (8);
					final int _amount = (int) 1;
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_sltid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
						}
					});
				}
			}
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = (int) (9);
					final ItemStack _setstack = new ItemStack(Iron_NPickaxeItem.block, (int) (1));
					_setstack.setCount((int) ((new Object() {
						public int getAmount(IWorld world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (9))) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		}
	}
}
