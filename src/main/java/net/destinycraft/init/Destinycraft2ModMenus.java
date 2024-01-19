
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.destinycraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.destinycraft.world.inventory.TeamManagerMenu;
import net.destinycraft.world.inventory.GhostMenu;
import net.destinycraft.world.inventory.CreateTeamGUIMenu;
import net.destinycraft.Destinycraft2Mod;

public class Destinycraft2ModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, Destinycraft2Mod.MODID);
	public static final RegistryObject<MenuType<GhostMenu>> GHOST = REGISTRY.register("ghost", () -> IForgeMenuType.create(GhostMenu::new));
	public static final RegistryObject<MenuType<TeamManagerMenu>> TEAM_MANAGER = REGISTRY.register("team_manager", () -> IForgeMenuType.create(TeamManagerMenu::new));
	public static final RegistryObject<MenuType<CreateTeamGUIMenu>> CREATE_TEAM_GUI = REGISTRY.register("create_team_gui", () -> IForgeMenuType.create(CreateTeamGUIMenu::new));
}
