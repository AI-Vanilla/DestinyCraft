
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.destinycraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.destinycraft.client.renderer.TakenSilverFishRenderer;
import net.destinycraft.client.renderer.SkexisRenderer;
import net.destinycraft.client.renderer.KnightEchoRenderer;
import net.destinycraft.client.renderer.GorezSandEaterRenderer;
import net.destinycraft.client.renderer.GorezSandEaterMASTERRenderer;
import net.destinycraft.client.renderer.CryptSecurityRenderer;
import net.destinycraft.client.renderer.CryptSecurityMasterRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class Destinycraft2ModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(Destinycraft2ModEntities.SKEXIS.get(), SkexisRenderer::new);
		event.registerEntityRenderer(Destinycraft2ModEntities.GOREZ_SAND_EATER.get(), GorezSandEaterRenderer::new);
		event.registerEntityRenderer(Destinycraft2ModEntities.GOREZ_SAND_EATER_MASTER.get(), GorezSandEaterMASTERRenderer::new);
		event.registerEntityRenderer(Destinycraft2ModEntities.CRYPT_SECURITY.get(), CryptSecurityRenderer::new);
		event.registerEntityRenderer(Destinycraft2ModEntities.CRYPT_SECURITY_MASTER.get(), CryptSecurityMasterRenderer::new);
		event.registerEntityRenderer(Destinycraft2ModEntities.KNIGHT_ECHO.get(), KnightEchoRenderer::new);
		event.registerEntityRenderer(Destinycraft2ModEntities.TAKEN_SILVER_FISH.get(), TakenSilverFishRenderer::new);
	}
}
