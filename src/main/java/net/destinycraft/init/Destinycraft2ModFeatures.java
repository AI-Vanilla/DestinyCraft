
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.destinycraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.destinycraft.world.features.ores.WeaponCoreOreFeature;
import net.destinycraft.Destinycraft2Mod;

@Mod.EventBusSubscriber
public class Destinycraft2ModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, Destinycraft2Mod.MODID);
	public static final RegistryObject<Feature<?>> WEAPON_CORE_ORE = REGISTRY.register("weapon_core_ore", WeaponCoreOreFeature::new);
}
