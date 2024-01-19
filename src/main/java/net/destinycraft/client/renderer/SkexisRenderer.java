
package net.destinycraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.destinycraft.entity.SkexisEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class SkexisRenderer extends HumanoidMobRenderer<SkexisEntity, HumanoidModel<SkexisEntity>> {
	public SkexisRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.7f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	protected void scale(SkexisEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.15f, 1.15f, 1.15f);
	}

	@Override
	public ResourceLocation getTextureLocation(SkexisEntity entity) {
		return new ResourceLocation("destinycraft2:textures/entities/husk.png");
	}
}
