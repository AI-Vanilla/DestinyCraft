
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.destinycraft.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.destinycraft.client.gui.TeamManagerScreen;
import net.destinycraft.client.gui.GhostScreen;
import net.destinycraft.client.gui.CreateTeamGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class Destinycraft2ModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(Destinycraft2ModMenus.GHOST.get(), GhostScreen::new);
			MenuScreens.register(Destinycraft2ModMenus.TEAM_MANAGER.get(), TeamManagerScreen::new);
			MenuScreens.register(Destinycraft2ModMenus.CREATE_TEAM_GUI.get(), CreateTeamGUIScreen::new);
		});
	}
}
