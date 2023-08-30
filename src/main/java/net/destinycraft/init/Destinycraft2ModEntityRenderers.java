
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.destinycraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.destinycraft.client.renderer.SkexisRenderer;
import net.destinycraft.client.renderer.GorezSandEaterRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class Destinycraft2ModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(Destinycraft2ModEntities.SKEXIS.get(), SkexisRenderer::new);
		event.registerEntityRenderer(Destinycraft2ModEntities.GOREZ_SAND_EATER.get(), GorezSandEaterRenderer::new);
	}
}
