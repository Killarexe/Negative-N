
package net.killarexe.negativen.entity;

import net.minecraft.block.material.Material;

@NegativeNModElements.ModElement.Tag
public class ChickenNEntity extends NegativeNModElements.ModElement {

	public static EntityType entity = null;

	public ChickenNEntity(NegativeNModElements instance) {
		super(instance, 59);

		FMLJavaModLoadingContext.get().getModEventBus().register(new ModelRegisterHandler());

		MinecraftForge.EVENT_BUS.register(this);
	}

	@Override
	public void initElements() {
		entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.AMBIENT).setShouldReceiveVelocityUpdates(true)
				.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).immuneToFire().size(0.4f, 0.7f))
						.build("chicken_n").setRegistryName("chicken_n");

		elements.entities.add(() -> entity);

		elements.items.add(() -> new SpawnEggItem(entity, -1, -1, new Item.Properties().group(NegativeNMobsItemGroup.tab))
				.setRegistryName("chicken_n_spawn_egg"));

	}

	@SubscribeEvent
	public void addFeatureToBiomes(BiomeLoadingEvent event) {
		boolean biomeCriteria = false;
		if (new ResourceLocation("negative_n:negative").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("negative_n:oak_nforest").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("negative_n:birch_n_forest").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("negative_n:plains_n").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("negative_n:dark_oak_n_forest").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("negative_n:jungle_n").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("negative_n:spruce_forest_n").equals(event.getName()))
			biomeCriteria = true;
		if (!biomeCriteria)
			return;

		event.getSpawns().getSpawner(EntityClassification.AMBIENT).add(new MobSpawnInfo.Spawners(entity, 20, 4, 4));
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		DeferredWorkQueue.runLater(this::setupAttributes);

		EntitySpawnPlacementRegistry.register(entity, EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS,
				Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MobEntity::canSpawnOn);

	}

	private static class ModelRegisterHandler {

		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> new MobRenderer(renderManager, new ChickenModel(), 0.5f) {

				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("negative_n:textures/chicken_n.png");
				}
			});

		}
	}

	private void setupAttributes() {
		AttributeModifierMap.MutableAttribute ammma = MobEntity.func_233666_p_();
		ammma = ammma.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.3);
		ammma = ammma.createMutableAttribute(Attributes.MAX_HEALTH, 5);
		ammma = ammma.createMutableAttribute(Attributes.ARMOR, 0);
		ammma = ammma.createMutableAttribute(Attributes.ATTACK_DAMAGE, 3);

		GlobalEntityTypeAttributes.put(entity, ammma.create());
	}

	public static class CustomEntity extends AnimalEntity {

		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			experienceValue = 0;
			setNoAI(false);

		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();

			this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.2, false));
			this.goalSelector.addGoal(3, new RandomWalkingGoal(this, 1));
			this.targetSelector.addGoal(4, new HurtByTargetGoal(this));
			this.goalSelector.addGoal(5, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(6, new SwimGoal(this));

		}

		@Override
		public CreatureAttribute getCreatureAttribute() {
			return CreatureAttribute.UNDEFINED;
		}

		protected void dropSpecialItems(DamageSource source, int looting, boolean recentlyHitIn) {
			super.dropSpecialItems(source, looting, recentlyHitIn);
			this.entityDropItem(new ItemStack(ChickenNFoodItem.block, (int) (1)));
		}

		@Override
		public net.minecraft.util.SoundEvent getAmbientSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.chicken.ambient"));
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.chicken.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.chicken.death"));
		}

		@Override
		public ActionResultType func_230254_b_(PlayerEntity sourceentity, Hand hand) {
			ItemStack itemstack = sourceentity.getHeldItem(hand);
			ActionResultType retval = ActionResultType.func_233537_a_(this.world.isRemote());

			super.func_230254_b_(sourceentity, hand);

			sourceentity.startRiding(this);

			double x = this.getPosX();
			double y = this.getPosY();
			double z = this.getPosZ();
			Entity entity = this;
			return retval;
		}

		@Override
		public AgeableEntity func_241840_a(ServerWorld serverWorld, AgeableEntity ageable) {
			CustomEntity retval = (CustomEntity) entity.create(serverWorld);
			retval.onInitialSpawn(serverWorld, serverWorld.getDifficultyForLocation(new BlockPos(retval.getPosition())), SpawnReason.BREEDING,
					(ILivingEntityData) null, (CompoundNBT) null);
			return retval;
		}

		@Override
		public boolean isBreedingItem(ItemStack stack) {
			if (stack == null)
				return false;

			if (new ItemStack(WheatNSeedItem.block, (int) (1)).getItem() == stack.getItem())
				return true;
			if (new ItemStack(BeetrootSeedItem.block, (int) (1)).getItem() == stack.getItem())
				return true;

			return false;
		}

	}

}
