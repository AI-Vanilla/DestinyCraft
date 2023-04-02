
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.destinycraft.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class DestinycraftModTabs {
	public static CreativeModeTab TAB_DESTINY_CRAFT_MATERIALS;

	public static void load() {
		TAB_DESTINY_CRAFT_MATERIALS = FabricItemGroupBuilder.create(new ResourceLocation("destinycraft", "destiny_craft_materials")).icon(() -> new ItemStack(Blocks.LARGE_AMETHYST_BUD)).build();
	}
}
