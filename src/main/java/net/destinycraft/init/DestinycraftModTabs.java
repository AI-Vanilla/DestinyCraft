
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.destinycraft.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class DestinycraftModTabs {
	public static CreativeModeTab TAB_DESTINY_CRAFT_TOOLS;
	public static CreativeModeTab TAB_DESTINY_CRAFT_MATERIALS;
	public static CreativeModeTab TAB_DESTINY_CRAFT_WEAPONS;
	public static CreativeModeTab TAB_DESTINY_CRAFT_FOODS;
	public static CreativeModeTab TAB_DESTINY_CRAFT_MACHINES;
	public static CreativeModeTab TAB_DESTINY_CRAFT_ARMORS;
	public static CreativeModeTab TAB_DESTINY_CRAFT_SERVER_SIDE;
	public static CreativeModeTab TAB_DESTINY_CRAFT_MISC;

	public static void load() {
		TAB_DESTINY_CRAFT_TOOLS = FabricItemGroupBuilder.create(new ResourceLocation("destinycraft", "destiny_craft_tools")).icon(() -> new ItemStack(Items.IRON_PICKAXE)).build();
		TAB_DESTINY_CRAFT_MATERIALS = FabricItemGroupBuilder.create(new ResourceLocation("destinycraft", "destiny_craft_materials")).icon(() -> new ItemStack(Blocks.LARGE_AMETHYST_BUD)).build();
		TAB_DESTINY_CRAFT_WEAPONS = FabricItemGroupBuilder.create(new ResourceLocation("destinycraft", "destiny_craft_weapons")).icon(() -> new ItemStack(Items.IRON_SWORD)).build();
		TAB_DESTINY_CRAFT_FOODS = FabricItemGroupBuilder.create(new ResourceLocation("destinycraft", "destiny_craft_foods")).icon(() -> new ItemStack(Items.APPLE)).build();
		TAB_DESTINY_CRAFT_MACHINES = FabricItemGroupBuilder.create(new ResourceLocation("destinycraft", "destiny_craft_machines")).icon(() -> new ItemStack(Blocks.CRAFTING_TABLE)).build();
		TAB_DESTINY_CRAFT_ARMORS = FabricItemGroupBuilder.create(new ResourceLocation("destinycraft", "destiny_craft_armors")).icon(() -> new ItemStack(Items.IRON_CHESTPLATE)).build();
		TAB_DESTINY_CRAFT_SERVER_SIDE = FabricItemGroupBuilder.create(new ResourceLocation("destinycraft", "destiny_craft_server_side")).icon(() -> new ItemStack(Blocks.BARRIER)).build();
		TAB_DESTINY_CRAFT_MISC = FabricItemGroupBuilder.create(new ResourceLocation("destinycraft", "destiny_craft_misc")).icon(() -> new ItemStack(Items.GOAT_HORN)).build();
	}
}
