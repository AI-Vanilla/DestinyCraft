
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.destinycraft.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.destinycraft.block.WeaponCoreOreBlock;
import net.destinycraft.block.WeaponCoreBlockBlock;
import net.destinycraft.Destinycraft2Mod;

public class Destinycraft2ModBlocks {
	public static Block WEAPON_CORE_BLOCK;
	public static Block WEAPON_CORE_ORE;

	public static void load() {
		WEAPON_CORE_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(Destinycraft2Mod.MODID, "weapon_core_block"), new WeaponCoreBlockBlock());
		WEAPON_CORE_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(Destinycraft2Mod.MODID, "weapon_core_ore"), new WeaponCoreOreBlock());
	}

	public static void clientLoad() {
		WeaponCoreBlockBlock.clientInit();
		WeaponCoreOreBlock.clientInit();
	}
}
