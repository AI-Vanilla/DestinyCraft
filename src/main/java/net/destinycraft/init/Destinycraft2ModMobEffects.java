
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.destinycraft.init;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.destinycraft.potion.SyoumouMobEffect;
import net.destinycraft.Destinycraft2Mod;

public class Destinycraft2ModMobEffects {
	public static MobEffect SYOUMOU;

	public static void load() {
		SYOUMOU = Registry.register(Registry.MOB_EFFECT, new ResourceLocation(Destinycraft2Mod.MODID, "syoumou"), new SyoumouMobEffect());
	}
}
