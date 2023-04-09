
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.destinycraft.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.destinycraft.item.WeaponCoreItem;
import net.destinycraft.item.EnhancedCoreItem;
import net.destinycraft.DestinycraftMod;

public class DestinycraftModItems {
	public static Item WEAPON_CORE_BLOCK;
	public static Item WEAPON_CORE_ORE;
	public static Item ENHANCED_CORE;
	public static Item WEAPON_CORE;

	public static void load() {
		WEAPON_CORE_BLOCK = Registry.register(Registry.ITEM, new ResourceLocation(DestinycraftMod.MODID, "weapon_core_block"),
				new BlockItem(DestinycraftModBlocks.WEAPON_CORE_BLOCK, new Item.Properties().tab(DestinycraftModTabs.TAB_DESTINY_CRAFT_MATERIALS)));
		WEAPON_CORE_ORE = Registry.register(Registry.ITEM, new ResourceLocation(DestinycraftMod.MODID, "weapon_core_ore"),
				new BlockItem(DestinycraftModBlocks.WEAPON_CORE_ORE, new Item.Properties().tab(DestinycraftModTabs.TAB_DESTINY_CRAFT_MATERIALS)));
		ENHANCED_CORE = Registry.register(Registry.ITEM, new ResourceLocation(DestinycraftMod.MODID, "enhanced_core"), new EnhancedCoreItem());
		WEAPON_CORE = Registry.register(Registry.ITEM, new ResourceLocation(DestinycraftMod.MODID, "weapon_core"), new WeaponCoreItem());
	}
}
