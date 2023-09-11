
package net.destinycraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.destinycraft.entity.GorezSandEaterMASTEREntity;

public class GorezSandEaterMASTERRenderer extends HumanoidMobRenderer<GorezSandEaterMASTEREntity, HumanoidModel<GorezSandEaterMASTEREntity>> {
	public GorezSandEaterMASTERRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.8f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(GorezSandEaterMASTEREntity entity) {
		return new ResourceLocation("destinycraft2:textures/entities/husk.png");
	}
}
