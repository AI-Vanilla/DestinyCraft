
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.destinycraft.init;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import net.destinycraft.client.renderer.SkexisRenderer;
import net.destinycraft.client.renderer.GorezSandEaterRenderer;

@Environment(EnvType.CLIENT)
public class Destinycraft2ModEntityRenderers {
	public static void load() {
		EntityRendererRegistry.register(Destinycraft2ModEntities.SKEXIS, SkexisRenderer::new);
		EntityRendererRegistry.register(Destinycraft2ModEntities.GOREZ_SAND_EATER, GorezSandEaterRenderer::new);
	}
}
