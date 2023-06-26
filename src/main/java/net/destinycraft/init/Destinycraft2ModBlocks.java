
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.destinycraft.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.destinycraft.block.WeaponCoreOreBlock;
import net.destinycraft.block.WeaponCoreBlockBlock;
import net.destinycraft.block.CrafterRankManagerBlock;
import net.destinycraft.block.CrafterRankManager4Block;
import net.destinycraft.block.CrafterRankManager3Block;
import net.destinycraft.block.CrafterRankManager2Block;
import net.destinycraft.Destinycraft2Mod;

public class Destinycraft2ModBlocks {
	public static Block WEAPON_CORE_BLOCK;
	public static Block WEAPON_CORE_ORE;
	public static Block CRAFTER_RANK_MANAGER;
	public static Block CRAFTER_RANK_MANAGER_2;
	public static Block CRAFTER_RANK_MANAGER_3;
	public static Block CRAFTER_RANK_MANAGER_4;

	public static void load() {
		WEAPON_CORE_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(Destinycraft2Mod.MODID, "weapon_core_block"), new WeaponCoreBlockBlock());
		WEAPON_CORE_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(Destinycraft2Mod.MODID, "weapon_core_ore"), new WeaponCoreOreBlock());
		CRAFTER_RANK_MANAGER = Registry.register(Registry.BLOCK, new ResourceLocation(Destinycraft2Mod.MODID, "crafter_rank_manager"), new CrafterRankManagerBlock());
		CRAFTER_RANK_MANAGER_2 = Registry.register(Registry.BLOCK, new ResourceLocation(Destinycraft2Mod.MODID, "crafter_rank_manager_2"), new CrafterRankManager2Block());
		CRAFTER_RANK_MANAGER_3 = Registry.register(Registry.BLOCK, new ResourceLocation(Destinycraft2Mod.MODID, "crafter_rank_manager_3"), new CrafterRankManager3Block());
		CRAFTER_RANK_MANAGER_4 = Registry.register(Registry.BLOCK, new ResourceLocation(Destinycraft2Mod.MODID, "crafter_rank_manager_4"), new CrafterRankManager4Block());
	}

	public static void clientLoad() {
		WeaponCoreBlockBlock.clientInit();
		WeaponCoreOreBlock.clientInit();
		CrafterRankManagerBlock.clientInit();
		CrafterRankManager2Block.clientInit();
		CrafterRankManager3Block.clientInit();
		CrafterRankManager4Block.clientInit();
	}
}
