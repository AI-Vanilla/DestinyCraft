
package net.destinycraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SilverfishModel;

import net.destinycraft.entity.TakenSilverFishEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class TakenSilverFishRenderer extends MobRenderer<TakenSilverFishEntity, SilverfishModel<TakenSilverFishEntity>> {
	public TakenSilverFishRenderer(EntityRendererProvider.Context context) {
		super(context, new SilverfishModel(context.bakeLayer(ModelLayers.SILVERFISH)), 0.5f);
	}

	@Override
	protected void scale(TakenSilverFishEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.5f, 1.5f, 1.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TakenSilverFishEntity entity) {
		return new ResourceLocation("destinycraft2:textures/entities/taken_silverfish.png");
	}
}
