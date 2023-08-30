
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.destinycraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.destinycraft.potion.SyoumouMobEffect;
import net.destinycraft.Destinycraft2Mod;

public class Destinycraft2ModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Destinycraft2Mod.MODID);
	public static final RegistryObject<MobEffect> SYOUMOU = REGISTRY.register("syoumou", () -> new SyoumouMobEffect());
}
