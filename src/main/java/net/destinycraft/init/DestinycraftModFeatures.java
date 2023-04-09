
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.destinycraft.init;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import net.destinycraft.world.features.ores.WeaponCoreOreFeature;
import net.destinycraft.DestinycraftMod;

import java.util.function.Predicate;

public class DestinycraftModFeatures {
	public static void load() {
		register("weapon_core_ore", WeaponCoreOreFeature.feature(), WeaponCoreOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
	}

	private static void register(String registryName, Feature feature, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration genStep) {
		Registry.register(Registry.FEATURE, new ResourceLocation(DestinycraftMod.MODID, registryName), feature);
		BiomeModifications.addFeature(biomes, genStep, ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, new ResourceLocation(DestinycraftMod.MODID, registryName)));
	}
}
