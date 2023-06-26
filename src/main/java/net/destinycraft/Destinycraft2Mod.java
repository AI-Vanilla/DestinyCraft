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

import net.destinycraft.init.Destinycraft2ModTabs;
import net.destinycraft.init.Destinycraft2ModProcedures;
import net.destinycraft.init.Destinycraft2ModItems;
import net.destinycraft.init.Destinycraft2ModFeatures;
import net.destinycraft.init.Destinycraft2ModEntities;
import net.destinycraft.init.Destinycraft2ModBlocks;

public class Destinycraft2Mod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "destinycraft2";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Destinycraft2Mod");
		Destinycraft2ModTabs.load();

		Destinycraft2ModEntities.load();
		Destinycraft2ModBlocks.load();
		Destinycraft2ModItems.load();

		Destinycraft2ModFeatures.load();

		Destinycraft2ModProcedures.load();

		GeckoLib.initialize();
	}
}
