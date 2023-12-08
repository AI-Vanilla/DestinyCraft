
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.destinycraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.destinycraft.entity.TakenSilverFishEntity;
import net.destinycraft.entity.SkexisEntity;
import net.destinycraft.entity.KnightEchoEntity;
import net.destinycraft.entity.GorezSandEaterMASTEREntity;
import net.destinycraft.entity.GorezSandEaterEntity;
import net.destinycraft.entity.CryptSecurityMasterEntity;
import net.destinycraft.entity.CryptSecurityEntity;
import net.destinycraft.Destinycraft2Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Destinycraft2ModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Destinycraft2Mod.MODID);
	public static final RegistryObject<EntityType<SkexisEntity>> SKEXIS = register("skexis",
			EntityType.Builder.<SkexisEntity>of(SkexisEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SkexisEntity::new)

					.sized(0.8f, 1.9f));
	public static final RegistryObject<EntityType<GorezSandEaterEntity>> GOREZ_SAND_EATER = register("gorez_sand_eater",
			EntityType.Builder.<GorezSandEaterEntity>of(GorezSandEaterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GorezSandEaterEntity::new)

					.sized(1.2f, 2.4f));
	public static final RegistryObject<EntityType<GorezSandEaterMASTEREntity>> GOREZ_SAND_EATER_MASTER = register("gorez_sand_eater_master",
			EntityType.Builder.<GorezSandEaterMASTEREntity>of(GorezSandEaterMASTEREntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(GorezSandEaterMASTEREntity::new)

					.sized(1.5f, 3.5f));
	public static final RegistryObject<EntityType<CryptSecurityEntity>> CRYPT_SECURITY = register("crypt_security",
			EntityType.Builder.<CryptSecurityEntity>of(CryptSecurityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CryptSecurityEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<CryptSecurityMasterEntity>> CRYPT_SECURITY_MASTER = register("crypt_security_master",
			EntityType.Builder.<CryptSecurityMasterEntity>of(CryptSecurityMasterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CryptSecurityMasterEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<KnightEchoEntity>> KNIGHT_ECHO = register("knight_echo",
			EntityType.Builder.<KnightEchoEntity>of(KnightEchoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KnightEchoEntity::new)

					.sized(1.1f, 2.5f));
	public static final RegistryObject<EntityType<TakenSilverFishEntity>> TAKEN_SILVER_FISH = register("taken_silver_fish",
			EntityType.Builder.<TakenSilverFishEntity>of(TakenSilverFishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TakenSilverFishEntity::new)

					.sized(0.4f, 0.3f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SkexisEntity.init();
			GorezSandEaterEntity.init();
			GorezSandEaterMASTEREntity.init();
			CryptSecurityEntity.init();
			CryptSecurityMasterEntity.init();
			KnightEchoEntity.init();
			TakenSilverFishEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SKEXIS.get(), SkexisEntity.createAttributes().build());
		event.put(GOREZ_SAND_EATER.get(), GorezSandEaterEntity.createAttributes().build());
		event.put(GOREZ_SAND_EATER_MASTER.get(), GorezSandEaterMASTEREntity.createAttributes().build());
		event.put(CRYPT_SECURITY.get(), CryptSecurityEntity.createAttributes().build());
		event.put(CRYPT_SECURITY_MASTER.get(), CryptSecurityMasterEntity.createAttributes().build());
		event.put(KNIGHT_ECHO.get(), KnightEchoEntity.createAttributes().build());
		event.put(TAKEN_SILVER_FISH.get(), TakenSilverFishEntity.createAttributes().build());
	}
}
