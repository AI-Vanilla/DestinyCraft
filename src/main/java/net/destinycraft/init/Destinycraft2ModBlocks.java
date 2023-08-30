
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.destinycraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.destinycraft.block.WeaponCoreOreBlock;
import net.destinycraft.block.WeaponCoreBlockBlock;
import net.destinycraft.block.CrafterRankManagerBlock;
import net.destinycraft.block.CrafterRankManager5Block;
import net.destinycraft.block.CrafterRankManager4Block;
import net.destinycraft.block.CrafterRankManager3Block;
import net.destinycraft.block.CrafterRankManager2Block;
import net.destinycraft.Destinycraft2Mod;

public class Destinycraft2ModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, Destinycraft2Mod.MODID);
	public static final RegistryObject<Block> WEAPON_CORE_BLOCK = REGISTRY.register("weapon_core_block", () -> new WeaponCoreBlockBlock());
	public static final RegistryObject<Block> WEAPON_CORE_ORE = REGISTRY.register("weapon_core_ore", () -> new WeaponCoreOreBlock());
	public static final RegistryObject<Block> CRAFTER_RANK_MANAGER = REGISTRY.register("crafter_rank_manager", () -> new CrafterRankManagerBlock());
	public static final RegistryObject<Block> CRAFTER_RANK_MANAGER_2 = REGISTRY.register("crafter_rank_manager_2", () -> new CrafterRankManager2Block());
	public static final RegistryObject<Block> CRAFTER_RANK_MANAGER_3 = REGISTRY.register("crafter_rank_manager_3", () -> new CrafterRankManager3Block());
	public static final RegistryObject<Block> CRAFTER_RANK_MANAGER_4 = REGISTRY.register("crafter_rank_manager_4", () -> new CrafterRankManager4Block());
	public static final RegistryObject<Block> CRAFTER_RANK_MANAGER_5 = REGISTRY.register("crafter_rank_manager_5", () -> new CrafterRankManager5Block());
}
