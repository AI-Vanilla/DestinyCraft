
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
import net.destinycraft.item.Vanadium51Item;
import net.destinycraft.item.Vanadium50Item;
import net.destinycraft.item.Vanadium49Item;
import net.destinycraft.item.Vanadium48Item;
import net.destinycraft.item.TritiumItem;
import net.destinycraft.item.Titanium52Item;
import net.destinycraft.item.Titanium51Item;
import net.destinycraft.item.Titanium50Item;
import net.destinycraft.item.Titanium49Item;
import net.destinycraft.item.Titanium48Item;
import net.destinycraft.item.Titanium47Item;
import net.destinycraft.item.Titanium46Item;
import net.destinycraft.item.Titanium45Item;
import net.destinycraft.item.Titanium44Item;
import net.destinycraft.item.Sulfur36Item;
import net.destinycraft.item.Sulfur34Item;
import net.destinycraft.item.Sulfur33Item;
import net.destinycraft.item.Sulfur32Item;
import net.destinycraft.item.Silicon30Item;
import net.destinycraft.item.Silicon29Item;
import net.destinycraft.item.Silicon28Item;
import net.destinycraft.item.ScandiumItem;
import net.destinycraft.item.PhosphorusItem;
import net.destinycraft.item.Oxygen18Item;
import net.destinycraft.item.Oxygen17Item;
import net.destinycraft.item.Oxygen16Item;
import net.destinycraft.item.Nitrogen15Item;
import net.destinycraft.item.Nitrogen14Item;
import net.destinycraft.item.Nitrogen13Item;
import net.destinycraft.item.Neon22Item;
import net.destinycraft.item.Neon21Item;
import net.destinycraft.item.Neon20Item;
import net.destinycraft.item.NatriumItem;
import net.destinycraft.item.Magnesium26Item;
import net.destinycraft.item.Magnesium25Item;
import net.destinycraft.item.Magnesium24Item;
import net.destinycraft.item.MWIronSwordItem;
import net.destinycraft.item.Lithium7Item;
import net.destinycraft.item.Lithium6Item;
import net.destinycraft.item.Lithium4Item;
import net.destinycraft.item.Lithium3Item;
import net.destinycraft.item.Kalium41Item;
import net.destinycraft.item.Kalium40Item;
import net.destinycraft.item.Kalium39Item;
import net.destinycraft.item.HydrogenItem;
import net.destinycraft.item.Helium4Item;
import net.destinycraft.item.Helium3Item;
import net.destinycraft.item.HeavyHydrogenItem;
import net.destinycraft.item.GeneralSwordItem;
import net.destinycraft.item.GeneralShovelItem;
import net.destinycraft.item.GeneralPickaxeItem;
import net.destinycraft.item.GeneralMultiToolItem;
import net.destinycraft.item.GeneralHoeItem;
import net.destinycraft.item.GeneralAxeItem;
import net.destinycraft.item.Fluorine18Item;
import net.destinycraft.item.EnhancedPrismItem;
import net.destinycraft.item.EnhancedCoreItem;
import net.destinycraft.item.Chlorine37Item;
import net.destinycraft.item.Chlorine36Item;
import net.destinycraft.item.Chlorine35Item;
import net.destinycraft.item.Carbon14Item;
import net.destinycraft.item.Carbon13Item;
import net.destinycraft.item.Carbon12Item;
import net.destinycraft.item.Carbon11Item;
import net.destinycraft.item.Calcium48Item;
import net.destinycraft.item.Calcium46Item;
import net.destinycraft.item.Calcium44Item;
import net.destinycraft.item.Calcium43Item;
import net.destinycraft.item.Calcium42Item;
import net.destinycraft.item.Calcium40Item;
import net.destinycraft.item.Boron11Item;
import net.destinycraft.item.Boron10Item;
import net.destinycraft.item.BerylliumItem;
import net.destinycraft.item.AscendantShardItem;
import net.destinycraft.item.Argon40Item;
import net.destinycraft.item.Argon38Item;
import net.destinycraft.item.Argon36Item;
import net.destinycraft.item.AluminiumItem;
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
	public static final RegistryObject<Item> CONGLOMERATE = block(Destinycraft2ModBlocks.CONGLOMERATE);
	public static final RegistryObject<Item> GOREZ_SAND_EATER_MASTER_SPAWN_EGG = REGISTRY.register("gorez_sand_eater_master_spawn_egg",
			() -> new ForgeSpawnEggItem(Destinycraft2ModEntities.GOREZ_SAND_EATER_MASTER, -65434, -3407872, new Item.Properties()));
	public static final RegistryObject<Item> CRYPT_SECURITY_SPAWN_EGG = REGISTRY.register("crypt_security_spawn_egg", () -> new ForgeSpawnEggItem(Destinycraft2ModEntities.CRYPT_SECURITY, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> CRYPT_SECURITY_MASTER_SPAWN_EGG = REGISTRY.register("crypt_security_master_spawn_egg", () -> new ForgeSpawnEggItem(Destinycraft2ModEntities.CRYPT_SECURITY_MASTER, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> HYDROGEN = REGISTRY.register("hydrogen", () -> new HydrogenItem());
	public static final RegistryObject<Item> HEAVY_HYDROGEN = REGISTRY.register("heavy_hydrogen", () -> new HeavyHydrogenItem());
	public static final RegistryObject<Item> TRITIUM = REGISTRY.register("tritium", () -> new TritiumItem());
	public static final RegistryObject<Item> HELIUM_3 = REGISTRY.register("helium_3", () -> new Helium3Item());
	public static final RegistryObject<Item> HELIUM_4 = REGISTRY.register("helium_4", () -> new Helium4Item());
	public static final RegistryObject<Item> LITHIUM_3 = REGISTRY.register("lithium_3", () -> new Lithium3Item());
	public static final RegistryObject<Item> LITHIUM_4 = REGISTRY.register("lithium_4", () -> new Lithium4Item());
	public static final RegistryObject<Item> LITHIUM_6 = REGISTRY.register("lithium_6", () -> new Lithium6Item());
	public static final RegistryObject<Item> LITHIUM_7 = REGISTRY.register("lithium_7", () -> new Lithium7Item());
	public static final RegistryObject<Item> BERYLLIUM = REGISTRY.register("beryllium", () -> new BerylliumItem());
	public static final RegistryObject<Item> BORON_10 = REGISTRY.register("boron_10", () -> new Boron10Item());
	public static final RegistryObject<Item> BORON_11 = REGISTRY.register("boron_11", () -> new Boron11Item());
	public static final RegistryObject<Item> CARBON_11 = REGISTRY.register("carbon_11", () -> new Carbon11Item());
	public static final RegistryObject<Item> CARBON_12 = REGISTRY.register("carbon_12", () -> new Carbon12Item());
	public static final RegistryObject<Item> CARBON_13 = REGISTRY.register("carbon_13", () -> new Carbon13Item());
	public static final RegistryObject<Item> CARBON_14 = REGISTRY.register("carbon_14", () -> new Carbon14Item());
	public static final RegistryObject<Item> NITROGEN_13 = REGISTRY.register("nitrogen_13", () -> new Nitrogen13Item());
	public static final RegistryObject<Item> NITROGEN_14 = REGISTRY.register("nitrogen_14", () -> new Nitrogen14Item());
	public static final RegistryObject<Item> NITROGEN_15 = REGISTRY.register("nitrogen_15", () -> new Nitrogen15Item());
	public static final RegistryObject<Item> OXYGEN_16 = REGISTRY.register("oxygen_16", () -> new Oxygen16Item());
	public static final RegistryObject<Item> OXYGEN_17 = REGISTRY.register("oxygen_17", () -> new Oxygen17Item());
	public static final RegistryObject<Item> OXYGEN_18 = REGISTRY.register("oxygen_18", () -> new Oxygen18Item());
	public static final RegistryObject<Item> FLUORINE_18 = REGISTRY.register("fluorine_18", () -> new Fluorine18Item());
	public static final RegistryObject<Item> NEON_20 = REGISTRY.register("neon_20", () -> new Neon20Item());
	public static final RegistryObject<Item> NEON_21 = REGISTRY.register("neon_21", () -> new Neon21Item());
	public static final RegistryObject<Item> NEON_22 = REGISTRY.register("neon_22", () -> new Neon22Item());
	public static final RegistryObject<Item> NATRIUM = REGISTRY.register("natrium", () -> new NatriumItem());
	public static final RegistryObject<Item> MAGNESIUM_24 = REGISTRY.register("magnesium_24", () -> new Magnesium24Item());
	public static final RegistryObject<Item> MAGNESIUM_25 = REGISTRY.register("magnesium_25", () -> new Magnesium25Item());
	public static final RegistryObject<Item> MAGNESIUM_26 = REGISTRY.register("magnesium_26", () -> new Magnesium26Item());
	public static final RegistryObject<Item> ALUMINIUM = REGISTRY.register("aluminium", () -> new AluminiumItem());
	public static final RegistryObject<Item> SILICON_28 = REGISTRY.register("silicon_28", () -> new Silicon28Item());
	public static final RegistryObject<Item> SILICON_29 = REGISTRY.register("silicon_29", () -> new Silicon29Item());
	public static final RegistryObject<Item> SILICON_30 = REGISTRY.register("silicon_30", () -> new Silicon30Item());
	public static final RegistryObject<Item> PHOSPHORUS = REGISTRY.register("phosphorus", () -> new PhosphorusItem());
	public static final RegistryObject<Item> SULFUR_32 = REGISTRY.register("sulfur_32", () -> new Sulfur32Item());
	public static final RegistryObject<Item> SULFUR_33 = REGISTRY.register("sulfur_33", () -> new Sulfur33Item());
	public static final RegistryObject<Item> SULFUR_34 = REGISTRY.register("sulfur_34", () -> new Sulfur34Item());
	public static final RegistryObject<Item> SULFUR_36 = REGISTRY.register("sulfur_36", () -> new Sulfur36Item());
	public static final RegistryObject<Item> CHLORINE_35 = REGISTRY.register("chlorine_35", () -> new Chlorine35Item());
	public static final RegistryObject<Item> CHLORINE_36 = REGISTRY.register("chlorine_36", () -> new Chlorine36Item());
	public static final RegistryObject<Item> CHLORINE_37 = REGISTRY.register("chlorine_37", () -> new Chlorine37Item());
	public static final RegistryObject<Item> ARGON_36 = REGISTRY.register("argon_36", () -> new Argon36Item());
	public static final RegistryObject<Item> ARGON_38 = REGISTRY.register("argon_38", () -> new Argon38Item());
	public static final RegistryObject<Item> ARGON_40 = REGISTRY.register("argon_40", () -> new Argon40Item());
	public static final RegistryObject<Item> KALIUM_39 = REGISTRY.register("kalium_39", () -> new Kalium39Item());
	public static final RegistryObject<Item> KALIUM_40 = REGISTRY.register("kalium_40", () -> new Kalium40Item());
	public static final RegistryObject<Item> KALIUM_41 = REGISTRY.register("kalium_41", () -> new Kalium41Item());
	public static final RegistryObject<Item> CALCIUM_40 = REGISTRY.register("calcium_40", () -> new Calcium40Item());
	public static final RegistryObject<Item> CALCIUM_42 = REGISTRY.register("calcium_42", () -> new Calcium42Item());
	public static final RegistryObject<Item> CALCIUM_43 = REGISTRY.register("calcium_43", () -> new Calcium43Item());
	public static final RegistryObject<Item> CALCIUM_44 = REGISTRY.register("calcium_44", () -> new Calcium44Item());
	public static final RegistryObject<Item> CALCIUM_46 = REGISTRY.register("calcium_46", () -> new Calcium46Item());
	public static final RegistryObject<Item> CALCIUM_48 = REGISTRY.register("calcium_48", () -> new Calcium48Item());
	public static final RegistryObject<Item> SCANDIUM = REGISTRY.register("scandium", () -> new ScandiumItem());
	public static final RegistryObject<Item> TITANIUM_44 = REGISTRY.register("titanium_44", () -> new Titanium44Item());
	public static final RegistryObject<Item> TITANIUM_45 = REGISTRY.register("titanium_45", () -> new Titanium45Item());
	public static final RegistryObject<Item> TITANIUM_46 = REGISTRY.register("titanium_46", () -> new Titanium46Item());
	public static final RegistryObject<Item> TITANIUM_47 = REGISTRY.register("titanium_47", () -> new Titanium47Item());
	public static final RegistryObject<Item> TITANIUM_48 = REGISTRY.register("titanium_48", () -> new Titanium48Item());
	public static final RegistryObject<Item> TITANIUM_49 = REGISTRY.register("titanium_49", () -> new Titanium49Item());
	public static final RegistryObject<Item> TITANIUM_50 = REGISTRY.register("titanium_50", () -> new Titanium50Item());
	public static final RegistryObject<Item> TITANIUM_51 = REGISTRY.register("titanium_51", () -> new Titanium51Item());
	public static final RegistryObject<Item> TITANIUM_52 = REGISTRY.register("titanium_52", () -> new Titanium52Item());
	public static final RegistryObject<Item> VANADIUM_48 = REGISTRY.register("vanadium_48", () -> new Vanadium48Item());
	public static final RegistryObject<Item> VANADIUM_49 = REGISTRY.register("vanadium_49", () -> new Vanadium49Item());
	public static final RegistryObject<Item> VANADIUM_50 = REGISTRY.register("vanadium_50", () -> new Vanadium50Item());
	public static final RegistryObject<Item> VANADIUM_51 = REGISTRY.register("vanadium_51", () -> new Vanadium51Item());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
