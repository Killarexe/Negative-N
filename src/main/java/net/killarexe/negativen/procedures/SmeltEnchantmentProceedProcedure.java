package net.killarexe.negativen.procedures;

@NegativeNModElements.ModElement.Tag
public class SmeltEnchantmentProceedProcedure extends NegativeNModElements.ModElement {

	public SmeltEnchantmentProceedProcedure(NegativeNModElements instance) {
		super(instance, 782);

		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NegativeNMod.LOGGER.warn("Failed to load dependency entity for procedure SmeltEnchantmentProceed!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NegativeNMod.LOGGER.warn("Failed to load dependency x for procedure SmeltEnchantmentProceed!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NegativeNMod.LOGGER.warn("Failed to load dependency y for procedure SmeltEnchantmentProceed!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NegativeNMod.LOGGER.warn("Failed to load dependency z for procedure SmeltEnchantmentProceed!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NegativeNMod.LOGGER.warn("Failed to load dependency world for procedure SmeltEnchantmentProceed!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");

		boolean removeBlock = false;
		if (((EnchantmentHelper.getEnchantmentLevel(SmeltingEnchantment.enchantment,
				((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))) > 0)) {
			if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem()
					.canHarvestBlock((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))))) == (true))) {
				if ((!(((world instanceof World && ((World) world).getRecipeManager()
						.getRecipe(IRecipeType.SMELTING,
								new Inventory((new ItemStack((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))),
								((World) world))
						.isPresent())
								? ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory(
														(new ItemStack((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))),
												(World) world)
										.get().getRecipeOutput().copy()
								: ItemStack.EMPTY).getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem()))) {
					if (((EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE,
							((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))) > 1)) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof World && ((World) world).getRecipeManager().getRecipe(IRecipeType.SMELTING,
											new Inventory((new ItemStack((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))),
											((World) world)).isPresent())
													? ((World) world).getRecipeManager()
															.getRecipe(IRecipeType.SMELTING, new Inventory((new ItemStack(
																	(world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))),
																	(World) world)
															.get().getRecipeOutput().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof World && ((World) world).getRecipeManager().getRecipe(IRecipeType.SMELTING,
											new Inventory((new ItemStack((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))),
											((World) world)).isPresent())
													? ((World) world).getRecipeManager()
															.getRecipe(IRecipeType.SMELTING, new Inventory((new ItemStack(
																	(world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))),
																	(World) world)
															.get().getRecipeOutput().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (((EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE,
							((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))) > 2)) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof World && ((World) world).getRecipeManager().getRecipe(IRecipeType.SMELTING,
											new Inventory((new ItemStack((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))),
											((World) world)).isPresent())
													? ((World) world).getRecipeManager()
															.getRecipe(IRecipeType.SMELTING, new Inventory((new ItemStack(
																	(world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))),
																	(World) world)
															.get().getRecipeOutput().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof World && ((World) world).getRecipeManager().getRecipe(IRecipeType.SMELTING,
											new Inventory((new ItemStack((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))),
											((World) world)).isPresent())
													? ((World) world).getRecipeManager()
															.getRecipe(IRecipeType.SMELTING, new Inventory((new ItemStack(
																	(world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))),
																	(World) world)
															.get().getRecipeOutput().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof World && ((World) world).getRecipeManager().getRecipe(IRecipeType.SMELTING,
											new Inventory((new ItemStack((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))),
											((World) world)).isPresent())
													? ((World) world).getRecipeManager()
															.getRecipe(IRecipeType.SMELTING, new Inventory((new ItemStack(
																	(world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))),
																	(World) world)
															.get().getRecipeOutput().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (((EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE,
							((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))) > 3)) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof World && ((World) world).getRecipeManager().getRecipe(IRecipeType.SMELTING,
											new Inventory((new ItemStack((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))),
											((World) world)).isPresent())
													? ((World) world).getRecipeManager()
															.getRecipe(IRecipeType.SMELTING, new Inventory((new ItemStack(
																	(world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))),
																	(World) world)
															.get().getRecipeOutput().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof World && ((World) world).getRecipeManager().getRecipe(IRecipeType.SMELTING,
											new Inventory((new ItemStack((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))),
											((World) world)).isPresent())
													? ((World) world).getRecipeManager()
															.getRecipe(IRecipeType.SMELTING, new Inventory((new ItemStack(
																	(world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))),
																	(World) world)
															.get().getRecipeOutput().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof World && ((World) world).getRecipeManager().getRecipe(IRecipeType.SMELTING,
											new Inventory((new ItemStack((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))),
											((World) world)).isPresent())
													? ((World) world).getRecipeManager()
															.getRecipe(IRecipeType.SMELTING, new Inventory((new ItemStack(
																	(world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))),
																	(World) world)
															.get().getRecipeOutput().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof World && ((World) world).getRecipeManager().getRecipe(IRecipeType.SMELTING,
											new Inventory((new ItemStack((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))),
											((World) world)).isPresent())
													? ((World) world).getRecipeManager()
															.getRecipe(IRecipeType.SMELTING, new Inventory((new ItemStack(
																	(world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))),
																	(World) world)
															.get().getRecipeOutput().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof World && ((World) world).getRecipeManager().getRecipe(IRecipeType.SMELTING,
											new Inventory((new ItemStack((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))),
											((World) world)).isPresent())
													? ((World) world).getRecipeManager()
															.getRecipe(IRecipeType.SMELTING, new Inventory((new ItemStack(
																	(world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))),
																	(World) world)
															.get().getRecipeOutput().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
					removeBlock = (boolean) (true);
				} else {
					removeBlock = (boolean) (false);
				}
				if (((removeBlock) == (true))) {
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (World) world,
								new BlockPos((int) x, (int) y, (int) z));

						world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
					}
				}
			}
		}

	}

	@SubscribeEvent
	public void onBlockBreak(BlockEvent.BreakEvent event) {
		Entity entity = event.getPlayer();
		IWorld world = event.getWorld();
		Map<String, Object> dependencies = new HashMap<>();
		dependencies.put("xpAmount", event.getExpToDrop());
		dependencies.put("x", event.getPos().getX());
		dependencies.put("y", event.getPos().getY());
		dependencies.put("z", event.getPos().getZ());
		dependencies.put("px", entity.getPosX());
		dependencies.put("py", entity.getPosY());
		dependencies.put("pz", entity.getPosZ());
		dependencies.put("world", world);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}

}
