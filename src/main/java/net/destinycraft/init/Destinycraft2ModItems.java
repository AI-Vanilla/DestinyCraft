
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.destinycraft.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.destinycraft.item.WeaponCoreItem;
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
	public static Item WEAPON_CORE_BLOCK;
	public static Item WEAPON_CORE_ORE;
	public static Item ENHANCED_CORE;
	public static Item WEAPON_CORE;
	public static Item GENERAL_AXE;
	public static Item GENERAL_PICKAXE;
	public static Item GENERAL_SWORD;
	public static Item GENERAL_SHOVEL;
	public static Item GENERAL_HOE;
	public static Item GENERAL_MULTI_TOOL;
	public static Item ENHANCED_PRISM;
	public static Item ASCENDANT_SHARD;

	public static void load() {
		WEAPON_CORE_BLOCK = Registry.register(Registry.ITEM, new ResourceLocation(Destinycraft2Mod.MODID, "weapon_core_block"),
				new BlockItem(Destinycraft2ModBlocks.WEAPON_CORE_BLOCK, new Item.Properties().tab(Destinycraft2ModTabs.TAB_DESTINY_CRAFT_MATERIALS)));
		WEAPON_CORE_ORE = Registry.register(Registry.ITEM, new ResourceLocation(Destinycraft2Mod.MODID, "weapon_core_ore"),
				new BlockItem(Destinycraft2ModBlocks.WEAPON_CORE_ORE, new Item.Properties().tab(Destinycraft2ModTabs.TAB_DESTINY_CRAFT_MATERIALS)));
		ENHANCED_CORE = Registry.register(Registry.ITEM, new ResourceLocation(Destinycraft2Mod.MODID, "enhanced_core"), new EnhancedCoreItem());
		WEAPON_CORE = Registry.register(Registry.ITEM, new ResourceLocation(Destinycraft2Mod.MODID, "weapon_core"), new WeaponCoreItem());
		GENERAL_AXE = Registry.register(Registry.ITEM, new ResourceLocation(Destinycraft2Mod.MODID, "general_axe"), new GeneralAxeItem());
		GENERAL_PICKAXE = Registry.register(Registry.ITEM, new ResourceLocation(Destinycraft2Mod.MODID, "general_pickaxe"), new GeneralPickaxeItem());
		GENERAL_SWORD = Registry.register(Registry.ITEM, new ResourceLocation(Destinycraft2Mod.MODID, "general_sword"), new GeneralSwordItem());
		GENERAL_SHOVEL = Registry.register(Registry.ITEM, new ResourceLocation(Destinycraft2Mod.MODID, "general_shovel"), new GeneralShovelItem());
		GENERAL_HOE = Registry.register(Registry.ITEM, new ResourceLocation(Destinycraft2Mod.MODID, "general_hoe"), new GeneralHoeItem());
		GENERAL_MULTI_TOOL = Registry.register(Registry.ITEM, new ResourceLocation(Destinycraft2Mod.MODID, "general_multi_tool"), new GeneralMultiToolItem());
		ENHANCED_PRISM = Registry.register(Registry.ITEM, new ResourceLocation(Destinycraft2Mod.MODID, "enhanced_prism"), new EnhancedPrismItem());
		ASCENDANT_SHARD = Registry.register(Registry.ITEM, new ResourceLocation(Destinycraft2Mod.MODID, "ascendant_shard"), new AscendantShardItem());
	}
}
