
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.destinycraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.destinycraft.item.WeaponCoreItem;
import net.destinycraft.item.MWIronSwordItem;
import net.destinycraft.item.GeneralSwordItem;
import net.destinycraft.item.GeneralShovelItem;
import net.destinycraft.item.GeneralPickaxeItem;
import net.destinycraft.item.GeneralMultiToolItem;
import net.destinycraft.item.GeneralHoeItem;
import net.destinycraft.item.GeneralAxeItem;
import net.destinycraft.item.EnhancedPrismItem;
import net.destinycraft.item.EnhancedCoreItem;
import net.destinycraft.item.AscendantShardItem;
import net.destinycraft.Destinycraft2Mod;

public class Destinycraft2ModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, Destinycraft2Mod.MODID);
	public static final RegistryObject<Item> WEAPON_CORE_BLOCK = block(Destinycraft2ModBlocks.WEAPON_CORE_BLOCK);
	public static final RegistryObject<Item> WEAPON_CORE_ORE = block(Destinycraft2ModBlocks.WEAPON_CORE_ORE);
	public static final RegistryObject<Item> ENHANCED_CORE = REGISTRY.register("enhanced_core", () -> new EnhancedCoreItem());
	public static final RegistryObject<Item> WEAPON_CORE = REGISTRY.register("weapon_core", () -> new WeaponCoreItem());
	public static final RegistryObject<Item> GENERAL_AXE = REGISTRY.register("general_axe", () -> new GeneralAxeItem());
	public static final RegistryObject<Item> GENERAL_PICKAXE = REGISTRY.register("general_pickaxe", () -> new GeneralPickaxeItem());
	public static final RegistryObject<Item> GENERAL_SWORD = REGISTRY.register("general_sword", () -> new GeneralSwordItem());
	public static final RegistryObject<Item> GENERAL_SHOVEL = REGISTRY.register("general_shovel", () -> new GeneralShovelItem());
	public static final RegistryObject<Item> GENERAL_HOE = REGISTRY.register("general_hoe", () -> new GeneralHoeItem());
	public static final RegistryObject<Item> GENERAL_MULTI_TOOL = REGISTRY.register("general_multi_tool", () -> new GeneralMultiToolItem());
	public static final RegistryObject<Item> ENHANCED_PRISM = REGISTRY.register("enhanced_prism", () -> new EnhancedPrismItem());
	public static final RegistryObject<Item> ASCENDANT_SHARD = REGISTRY.register("ascendant_shard", () -> new AscendantShardItem());
	public static final RegistryObject<Item> MW_IRON_SWORD = REGISTRY.register("mw_iron_sword", () -> new MWIronSwordItem());
	public static final RegistryObject<Item> CRAFTER_RANK_MANAGER = block(Destinycraft2ModBlocks.CRAFTER_RANK_MANAGER);
	public static final RegistryObject<Item> CRAFTER_RANK_MANAGER_2 = block(Destinycraft2ModBlocks.CRAFTER_RANK_MANAGER_2);
	public static final RegistryObject<Item> CRAFTER_RANK_MANAGER_3 = block(Destinycraft2ModBlocks.CRAFTER_RANK_MANAGER_3);
	public static final RegistryObject<Item> CRAFTER_RANK_MANAGER_4 = block(Destinycraft2ModBlocks.CRAFTER_RANK_MANAGER_4);
	public static final RegistryObject<Item> SKEXIS_SPAWN_EGG = REGISTRY.register("skexis_spawn_egg", () -> new ForgeSpawnEggItem(Destinycraft2ModEntities.SKEXIS, -16724788, -1, new Item.Properties()));
	public static final RegistryObject<Item> GOREZ_SAND_EATER_SPAWN_EGG = REGISTRY.register("gorez_sand_eater_spawn_egg", () -> new ForgeSpawnEggItem(Destinycraft2ModEntities.GOREZ_SAND_EATER, -65434, -3407872, new Item.Properties()));
	public static final RegistryObject<Item> CRAFTER_RANK_MANAGER_5 = block(Destinycraft2ModBlocks.CRAFTER_RANK_MANAGER_5);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
