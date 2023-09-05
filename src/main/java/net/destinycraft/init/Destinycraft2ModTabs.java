
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.destinycraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Destinycraft2ModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(Destinycraft2ModItems.SKEXIS_SPAWN_EGG.get());
			tabData.accept(Destinycraft2ModItems.GOREZ_SAND_EATER_SPAWN_EGG.get());
		}
	}

	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("destinycraft2", "destiny_craft_materials"),
				builder -> builder.title(Component.translatable("item_group.destinycraft2.destiny_craft_materials")).icon(() -> new ItemStack(Blocks.LARGE_AMETHYST_BUD)).displayItems((parameters, tabData) -> {
					tabData.accept(Destinycraft2ModBlocks.WEAPON_CORE_BLOCK.get().asItem());
					tabData.accept(Destinycraft2ModBlocks.WEAPON_CORE_ORE.get().asItem());
					tabData.accept(Destinycraft2ModItems.ENHANCED_CORE.get());
					tabData.accept(Destinycraft2ModItems.WEAPON_CORE.get());
					tabData.accept(Destinycraft2ModItems.ENHANCED_PRISM.get());
					tabData.accept(Destinycraft2ModItems.ASCENDANT_SHARD.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("destinycraft2", "destiny_craft_tools"),
				builder -> builder.title(Component.translatable("item_group.destinycraft2.destiny_craft_tools")).icon(() -> new ItemStack(Items.IRON_PICKAXE)).displayItems((parameters, tabData) -> {
					tabData.accept(Destinycraft2ModItems.GENERAL_AXE.get());
					tabData.accept(Destinycraft2ModItems.GENERAL_PICKAXE.get());
					tabData.accept(Destinycraft2ModItems.GENERAL_SHOVEL.get());
					tabData.accept(Destinycraft2ModItems.GENERAL_HOE.get());
					tabData.accept(Destinycraft2ModItems.GENERAL_MULTI_TOOL.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("destinycraft2", "destiny_craft_weapons"),
				builder -> builder.title(Component.translatable("item_group.destinycraft2.destiny_craft_weapons")).icon(() -> new ItemStack(Items.IRON_SWORD)).displayItems((parameters, tabData) -> {
					tabData.accept(Destinycraft2ModItems.GENERAL_SWORD.get());
					tabData.accept(Destinycraft2ModItems.MW_IRON_SWORD.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("destinycraft2", "destiny_craft_machines"),
				builder -> builder.title(Component.translatable("item_group.destinycraft2.destiny_craft_machines")).icon(() -> new ItemStack(Blocks.CRAFTING_TABLE)).displayItems((parameters, tabData) -> {
					tabData.accept(Destinycraft2ModBlocks.CRAFTER_RANK_MANAGER.get().asItem());
					tabData.accept(Destinycraft2ModBlocks.CRAFTER_RANK_MANAGER_2.get().asItem());
					tabData.accept(Destinycraft2ModBlocks.CRAFTER_RANK_MANAGER_3.get().asItem());
					tabData.accept(Destinycraft2ModBlocks.CRAFTER_RANK_MANAGER_4.get().asItem());
					tabData.accept(Destinycraft2ModBlocks.CRAFTER_RANK_MANAGER_5.get().asItem());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("destinycraft2", "destiny_craft_misc"),
				builder -> builder.title(Component.translatable("item_group.destinycraft2.destiny_craft_misc")).icon(() -> new ItemStack(Items.GOAT_HORN)).displayItems((parameters, tabData) -> {
					tabData.accept(Destinycraft2ModBlocks.CONGLOMERATE.get().asItem());
				})

		);
	}
}
