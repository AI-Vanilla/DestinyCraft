
package net.destinycraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.VillagerModel;

import net.destinycraft.entity.CryptSecurityEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class CryptSecurityRenderer extends MobRenderer<CryptSecurityEntity, VillagerModel<CryptSecurityEntity>> {
	public CryptSecurityRenderer(EntityRendererProvider.Context context) {
		super(context, new VillagerModel(context.bakeLayer(ModelLayers.VILLAGER)), 0.5f);
	}

	@Override
	protected void scale(CryptSecurityEntity villager, PoseStack poseStack, float f) {
		poseStack.scale(0.9375f, 0.9375f, 0.9375f);
	}

	@Override
	public ResourceLocation getTextureLocation(CryptSecurityEntity entity) {
		return new ResourceLocation("destinycraft2:textures/entities/core.png");
	}
}
