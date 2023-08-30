
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

import net.destinycraft.entity.SkexisEntity;
import net.destinycraft.entity.GorezSandEaterEntity;
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

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SkexisEntity.init();
			GorezSandEaterEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SKEXIS.get(), SkexisEntity.createAttributes().build());
		event.put(GOREZ_SAND_EATER.get(), GorezSandEaterEntity.createAttributes().build());
	}
}
