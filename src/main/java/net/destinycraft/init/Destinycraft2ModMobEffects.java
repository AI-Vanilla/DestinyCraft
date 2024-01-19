
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.destinycraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.destinycraft.potion.SyoumouMobEffect;
import net.destinycraft.potion.SnowShelterPMobEffect;
import net.destinycraft.potion.LightMoteEffect5MobEffect;
import net.destinycraft.potion.LightMoteEffect4MobEffect;
import net.destinycraft.potion.LightMoteEffect3MobEffect;
import net.destinycraft.potion.LightMoteEffect2MobEffect;
import net.destinycraft.potion.LightMoteEffect1MobEffect;
import net.destinycraft.potion.FrostbiteMobEffect;
import net.destinycraft.potion.Frostbite9MobEffect;
import net.destinycraft.potion.Frostbite8MobEffect;
import net.destinycraft.potion.Frostbite7MobEffect;
import net.destinycraft.potion.Frostbite6MobEffect;
import net.destinycraft.potion.Frostbite5MobEffect;
import net.destinycraft.potion.Frostbite4MobEffect;
import net.destinycraft.potion.Frostbite3MobEffect;
import net.destinycraft.potion.Frostbite2MobEffect;
import net.destinycraft.potion.Frostbite10MobEffect;
import net.destinycraft.potion.DarkMoteEffect5MobEffect;
import net.destinycraft.potion.DarkMoteEffect4MobEffect;
import net.destinycraft.potion.DarkMoteEffect3MobEffect;
import net.destinycraft.potion.DarkMoteEffect2MobEffect;
import net.destinycraft.potion.DarkMoteEffect1MobEffect;
import net.destinycraft.Destinycraft2Mod;

public class Destinycraft2ModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Destinycraft2Mod.MODID);
	public static final RegistryObject<MobEffect> SYOUMOU = REGISTRY.register("syoumou", () -> new SyoumouMobEffect());
	public static final RegistryObject<MobEffect> FROSTBITE = REGISTRY.register("frostbite", () -> new FrostbiteMobEffect());
	public static final RegistryObject<MobEffect> SNOW_SHELTER_P = REGISTRY.register("snow_shelter_p", () -> new SnowShelterPMobEffect());
	public static final RegistryObject<MobEffect> FROSTBITE_2 = REGISTRY.register("frostbite_2", () -> new Frostbite2MobEffect());
	public static final RegistryObject<MobEffect> FROSTBITE_3 = REGISTRY.register("frostbite_3", () -> new Frostbite3MobEffect());
	public static final RegistryObject<MobEffect> FROSTBITE_4 = REGISTRY.register("frostbite_4", () -> new Frostbite4MobEffect());
	public static final RegistryObject<MobEffect> FROSTBITE_5 = REGISTRY.register("frostbite_5", () -> new Frostbite5MobEffect());
	public static final RegistryObject<MobEffect> FROSTBITE_6 = REGISTRY.register("frostbite_6", () -> new Frostbite6MobEffect());
	public static final RegistryObject<MobEffect> FROSTBITE_7 = REGISTRY.register("frostbite_7", () -> new Frostbite7MobEffect());
	public static final RegistryObject<MobEffect> FROSTBITE_8 = REGISTRY.register("frostbite_8", () -> new Frostbite8MobEffect());
	public static final RegistryObject<MobEffect> FROSTBITE_9 = REGISTRY.register("frostbite_9", () -> new Frostbite9MobEffect());
	public static final RegistryObject<MobEffect> FROSTBITE_10 = REGISTRY.register("frostbite_10", () -> new Frostbite10MobEffect());
	public static final RegistryObject<MobEffect> LIGHT_MOTE_EFFECT_1 = REGISTRY.register("light_mote_effect_1", () -> new LightMoteEffect1MobEffect());
	public static final RegistryObject<MobEffect> LIGHT_MOTE_EFFECT_2 = REGISTRY.register("light_mote_effect_2", () -> new LightMoteEffect2MobEffect());
	public static final RegistryObject<MobEffect> LIGHT_MOTE_EFFECT_3 = REGISTRY.register("light_mote_effect_3", () -> new LightMoteEffect3MobEffect());
	public static final RegistryObject<MobEffect> LIGHT_MOTE_EFFECT_4 = REGISTRY.register("light_mote_effect_4", () -> new LightMoteEffect4MobEffect());
	public static final RegistryObject<MobEffect> LIGHT_MOTE_EFFECT_5 = REGISTRY.register("light_mote_effect_5", () -> new LightMoteEffect5MobEffect());
	public static final RegistryObject<MobEffect> DARK_MOTE_EFFECT_1 = REGISTRY.register("dark_mote_effect_1", () -> new DarkMoteEffect1MobEffect());
	public static final RegistryObject<MobEffect> DARK_MOTE_EFFECT_2 = REGISTRY.register("dark_mote_effect_2", () -> new DarkMoteEffect2MobEffect());
	public static final RegistryObject<MobEffect> DARK_MOTE_EFFECT_3 = REGISTRY.register("dark_mote_effect_3", () -> new DarkMoteEffect3MobEffect());
	public static final RegistryObject<MobEffect> DARK_MOTE_EFFECT_4 = REGISTRY.register("dark_mote_effect_4", () -> new DarkMoteEffect4MobEffect());
	public static final RegistryObject<MobEffect> DARK_MOTE_EFFECT_5 = REGISTRY.register("dark_mote_effect_5", () -> new DarkMoteEffect5MobEffect());
}
