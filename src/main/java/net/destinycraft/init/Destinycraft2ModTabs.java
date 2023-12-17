
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

		if (tabData.getTab() == CreativeModeTabs.COMBAT) {
			tabData.accept(Destinycraft2ModItems.TANGLED_SWORD.get());
		}

		if (tabData.getTab() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(Destinycraft2ModItems.SKEXIS_SPAWN_EGG.get());
			tabData.accept(Destinycraft2ModItems.GOREZ_SAND_EATER_SPAWN_EGG.get());
			tabData.accept(Destinycraft2ModItems.GOREZ_SAND_EATER_MASTER_SPAWN_EGG.get());
			tabData.accept(Destinycraft2ModItems.CRYPT_SECURITY_SPAWN_EGG.get());
			tabData.accept(Destinycraft2ModItems.CRYPT_SECURITY_MASTER_SPAWN_EGG.get());
			tabData.accept(Destinycraft2ModItems.KNIGHT_ECHO_SPAWN_EGG.get());
			tabData.accept(Destinycraft2ModItems.TAKEN_SILVER_FISH_SPAWN_EGG.get());
		}

		if (tabData.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(Destinycraft2ModItems.TANGLED_PICKAXE.get());
			tabData.accept(Destinycraft2ModItems.TANGLED_AXE.get());
			tabData.accept(Destinycraft2ModItems.TANGLED_SHOVEL.get());
			tabData.accept(Destinycraft2ModItems.TANGLED_HOE.get());
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
					tabData.accept(Destinycraft2ModItems.VANADIUM_50.get());
					tabData.accept(Destinycraft2ModBlocks.TANGLED_STEEL.get().asItem());
					tabData.accept(Destinycraft2ModBlocks.LIGHTING_BEACON.get().asItem());
					tabData.accept(Destinycraft2ModBlocks.DARKNESS_BEACON.get().asItem());
					tabData.accept(Destinycraft2ModBlocks.ENABLED_BEACON.get().asItem());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("destinycraft2", "destiny_craft_tools"),
				builder -> builder.title(Component.translatable("item_group.destinycraft2.destiny_craft_tools")).icon(() -> new ItemStack(Items.IRON_PICKAXE)).displayItems((parameters, tabData) -> {
					tabData.accept(Destinycraft2ModItems.GENERAL_AXE.get());
					tabData.accept(Destinycraft2ModItems.GENERAL_PICKAXE.get());
					tabData.accept(Destinycraft2ModItems.GENERAL_SHOVEL.get());
					tabData.accept(Destinycraft2ModItems.GENERAL_HOE.get());
					tabData.accept(Destinycraft2ModItems.GENERAL_MULTI_TOOL.get());
					tabData.accept(Destinycraft2ModItems.QUANTUM_SPACE.get());
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
		event.registerCreativeModeTab(new ResourceLocation("destinycraft2", "destiny_craft_armors"),
				builder -> builder.title(Component.translatable("item_group.destinycraft2.destiny_craft_armors")).icon(() -> new ItemStack(Items.IRON_CHESTPLATE)).displayItems((parameters, tabData) -> {
					tabData.accept(Destinycraft2ModItems.TANGLED_ARMORS_ARMOR_HELMET.get());
					tabData.accept(Destinycraft2ModItems.TANGLED_ARMORS_ARMOR_CHESTPLATE.get());
					tabData.accept(Destinycraft2ModItems.TANGLED_ARMORS_ARMOR_LEGGINGS.get());
					tabData.accept(Destinycraft2ModItems.TANGLED_ARMORS_ARMOR_BOOTS.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("destinycraft2", "destiny_craft_misc"),
				builder -> builder.title(Component.translatable("item_group.destinycraft2.destiny_craft_misc")).icon(() -> new ItemStack(Items.GOAT_HORN)).displayItems((parameters, tabData) -> {
					tabData.accept(Destinycraft2ModBlocks.CONGLOMERATE.get().asItem());
					tabData.accept(Destinycraft2ModItems.LIGHT_MOTE.get());
					tabData.accept(Destinycraft2ModItems.DARK_MOTE.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("destinycraft2", "periodic"),
				builder -> builder.title(Component.translatable("item_group.destinycraft2.periodic")).icon(() -> new ItemStack(Items.POTION)).displayItems((parameters, tabData) -> {
					tabData.accept(Destinycraft2ModItems.HYDROGEN.get());
					tabData.accept(Destinycraft2ModItems.HEAVY_HYDROGEN.get());
					tabData.accept(Destinycraft2ModItems.TRITIUM.get());
					tabData.accept(Destinycraft2ModItems.HELIUM_3.get());
					tabData.accept(Destinycraft2ModItems.HELIUM_4.get());
					tabData.accept(Destinycraft2ModItems.LITHIUM_3.get());
					tabData.accept(Destinycraft2ModItems.LITHIUM_4.get());
					tabData.accept(Destinycraft2ModItems.LITHIUM_6.get());
					tabData.accept(Destinycraft2ModItems.LITHIUM_7.get());
					tabData.accept(Destinycraft2ModItems.BERYLLIUM.get());
					tabData.accept(Destinycraft2ModItems.BORON_10.get());
					tabData.accept(Destinycraft2ModItems.BORON_11.get());
					tabData.accept(Destinycraft2ModItems.CARBON_11.get());
					tabData.accept(Destinycraft2ModItems.CARBON_12.get());
					tabData.accept(Destinycraft2ModItems.CARBON_13.get());
					tabData.accept(Destinycraft2ModItems.CARBON_14.get());
					tabData.accept(Destinycraft2ModItems.NITROGEN_13.get());
					tabData.accept(Destinycraft2ModItems.NITROGEN_14.get());
					tabData.accept(Destinycraft2ModItems.NITROGEN_15.get());
					tabData.accept(Destinycraft2ModItems.OXYGEN_16.get());
					tabData.accept(Destinycraft2ModItems.OXYGEN_17.get());
					tabData.accept(Destinycraft2ModItems.OXYGEN_18.get());
					tabData.accept(Destinycraft2ModItems.FLUORINE_18.get());
					tabData.accept(Destinycraft2ModItems.NEON_20.get());
					tabData.accept(Destinycraft2ModItems.NEON_21.get());
					tabData.accept(Destinycraft2ModItems.NEON_22.get());
					tabData.accept(Destinycraft2ModItems.NATRIUM.get());
					tabData.accept(Destinycraft2ModItems.MAGNESIUM_24.get());
					tabData.accept(Destinycraft2ModItems.MAGNESIUM_25.get());
					tabData.accept(Destinycraft2ModItems.MAGNESIUM_26.get());
					tabData.accept(Destinycraft2ModItems.ALUMINIUM.get());
					tabData.accept(Destinycraft2ModItems.SILICON_28.get());
					tabData.accept(Destinycraft2ModItems.SILICON_29.get());
					tabData.accept(Destinycraft2ModItems.SILICON_30.get());
					tabData.accept(Destinycraft2ModItems.PHOSPHORUS.get());
					tabData.accept(Destinycraft2ModItems.SULFUR_32.get());
					tabData.accept(Destinycraft2ModItems.SULFUR_33.get());
					tabData.accept(Destinycraft2ModItems.SULFUR_34.get());
					tabData.accept(Destinycraft2ModItems.SULFUR_36.get());
					tabData.accept(Destinycraft2ModItems.CHLORINE_35.get());
					tabData.accept(Destinycraft2ModItems.CHLORINE_36.get());
					tabData.accept(Destinycraft2ModItems.CHLORINE_37.get());
					tabData.accept(Destinycraft2ModItems.ARGON_36.get());
					tabData.accept(Destinycraft2ModItems.ARGON_38.get());
					tabData.accept(Destinycraft2ModItems.ARGON_40.get());
					tabData.accept(Destinycraft2ModItems.KALIUM_39.get());
					tabData.accept(Destinycraft2ModItems.KALIUM_40.get());
					tabData.accept(Destinycraft2ModItems.KALIUM_41.get());
					tabData.accept(Destinycraft2ModItems.CALCIUM_40.get());
					tabData.accept(Destinycraft2ModItems.CALCIUM_42.get());
					tabData.accept(Destinycraft2ModItems.CALCIUM_43.get());
					tabData.accept(Destinycraft2ModItems.CALCIUM_44.get());
					tabData.accept(Destinycraft2ModItems.CALCIUM_46.get());
					tabData.accept(Destinycraft2ModItems.CALCIUM_48.get());
					tabData.accept(Destinycraft2ModItems.SCANDIUM.get());
					tabData.accept(Destinycraft2ModItems.TITANIUM_44.get());
					tabData.accept(Destinycraft2ModItems.TITANIUM_45.get());
					tabData.accept(Destinycraft2ModItems.TITANIUM_46.get());
					tabData.accept(Destinycraft2ModItems.TITANIUM_47.get());
					tabData.accept(Destinycraft2ModItems.TITANIUM_48.get());
					tabData.accept(Destinycraft2ModItems.TITANIUM_49.get());
					tabData.accept(Destinycraft2ModItems.TITANIUM_50.get());
					tabData.accept(Destinycraft2ModItems.TITANIUM_51.get());
					tabData.accept(Destinycraft2ModItems.TITANIUM_52.get());
					tabData.accept(Destinycraft2ModItems.VANADIUM_48.get());
					tabData.accept(Destinycraft2ModItems.VANADIUM_49.get());
					tabData.accept(Destinycraft2ModItems.VANADIUM_51.get());
				})

		);
	}
}
