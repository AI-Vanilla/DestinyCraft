
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.destinycraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.destinycraft.block.WeaponCoreOreBlock;
import net.destinycraft.block.WeaponCoreBlockBlock;
import net.destinycraft.block.TangledSteelBlock;
import net.destinycraft.block.QuantumSpacePortalBlock;
import net.destinycraft.block.LightingBeaconBlock;
import net.destinycraft.block.EnabledBeaconBlock;
import net.destinycraft.block.DarknessBeaconBlock;
import net.destinycraft.block.CrafterRankManagerBlock;
import net.destinycraft.block.CrafterRankManager5Block;
import net.destinycraft.block.CrafterRankManager4Block;
import net.destinycraft.block.CrafterRankManager3Block;
import net.destinycraft.block.CrafterRankManager2Block;
import net.destinycraft.block.ConglomerateBlock;
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
	public static final RegistryObject<Block> CONGLOMERATE = REGISTRY.register("conglomerate", () -> new ConglomerateBlock());
	public static final RegistryObject<Block> TANGLED_STEEL = REGISTRY.register("tangled_steel", () -> new TangledSteelBlock());
	public static final RegistryObject<Block> QUANTUM_SPACE_PORTAL = REGISTRY.register("quantum_space_portal", () -> new QuantumSpacePortalBlock());
	public static final RegistryObject<Block> LIGHTING_BEACON = REGISTRY.register("lighting_beacon", () -> new LightingBeaconBlock());
	public static final RegistryObject<Block> DARKNESS_BEACON = REGISTRY.register("darkness_beacon", () -> new DarknessBeaconBlock());
	public static final RegistryObject<Block> ENABLED_BEACON = REGISTRY.register("enabled_beacon", () -> new EnabledBeaconBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			TangledSteelBlock.blockColorLoad(event);
		}
	}
}
