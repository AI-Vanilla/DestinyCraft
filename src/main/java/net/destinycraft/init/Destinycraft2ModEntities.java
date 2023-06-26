
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.destinycraft.init;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

import net.destinycraft.entity.SkexisEntity;
import net.destinycraft.Destinycraft2Mod;

public class Destinycraft2ModEntities {
	public static EntityType<SkexisEntity> SKEXIS;

	public static void load() {
		SKEXIS = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(Destinycraft2Mod.MODID, "skexis"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, SkexisEntity::new).dimensions(new EntityDimensions(0.8f, 1.9f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		SkexisEntity.init();
		FabricDefaultAttributeRegistry.register(SKEXIS, SkexisEntity.createAttributes());
	}

	private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
		return FabricEntityTypeBuilder.create(MobCategory.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(1).trackedUpdateRate(64).build();
	}
}
