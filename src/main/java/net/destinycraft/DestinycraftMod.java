/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.destinycraft;

import software.bernie.geckolib3.GeckoLib;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.fabricmc.api.ModInitializer;

import net.destinycraft.init.DestinycraftModTabs;
import net.destinycraft.init.DestinycraftModItems;
import net.destinycraft.init.DestinycraftModFeatures;
import net.destinycraft.init.DestinycraftModBlocks;

public class DestinycraftMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "destinycraft";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing DestinycraftMod");
		DestinycraftModTabs.load();

		DestinycraftModBlocks.load();
		DestinycraftModItems.load();

		DestinycraftModFeatures.load();

		GeckoLib.initialize();
	}
}
