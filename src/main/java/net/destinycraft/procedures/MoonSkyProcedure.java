package net.destinycraft.procedures;

import org.joml.Matrix4f;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.RenderLevelStageEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.Camera;

import javax.annotation.Nullable;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.Tesselator;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.BufferUploader;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber(value = {Dist.CLIENT})
public class MoonSkyProcedure {
	@SubscribeEvent
	public static void renderSky(RenderLevelStageEvent event) {
		try {
			if (event.getStage() == RenderLevelStageEvent.Stage.AFTER_SKY) {
				Minecraft minecraft = Minecraft.getInstance();
				ClientLevel clientLevel = minecraft.level;
				PoseStack poseStack = event.getPoseStack();
				Camera camera = event.getCamera();
				Entity entity = camera.getEntity();
				Vec3 cameraPos = camera.getPosition();
				Vec3 entityPos = entity.getPosition(minecraft.getPartialTick());
				RenderSystem.depthMask(false);
				RenderSystem.enableBlend();
				RenderSystem.defaultBlendFunc();
				RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
				RenderSystem.setShaderTexture(0, new ResourceLocation("minecraft", "textures/block/grass_block_side.png"));
				poseStack.pushPose();
				execute(null, clientLevel, poseStack);
				poseStack.popPose();
				RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
				RenderSystem.disableBlend();
				RenderSystem.enableCull();
				RenderSystem.enableDepthTest();
				RenderSystem.depthMask(true);
			}
		} catch (Exception e) {
		}
	}

	public static void execute(LevelAccessor world, PoseStack pose) {
		execute(null, world, pose);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, PoseStack pose) {
		if (pose == null)
			return;
		if ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("destinycraft2:moon")))) {
			RenderSystem.clear(16640, Minecraft.ON_OSX);
			RenderSystem.enableBlend();
			RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
			{
				int _color = (int) (255 << 24 | 255 << 16 | 255 << 8 | 255);
				float _red = (_color >> 16 & 255) / 255.0F;
				float _green = (_color >> 8 & 255) / 255.0F;
				float _blue = (_color & 255) / 255.0F;
				float _alpha = (_color >>> 24) / 255.0F;
				RenderSystem.setShaderColor(_red, _green, _blue, _alpha);
			}
			if (world instanceof ClientLevel _clientLevel) {
				Minecraft _minecraft = Minecraft.getInstance();
				BufferBuilder _bufferBuilder = Tesselator.getInstance().getBuilder();
				float _partialTick = _minecraft.getPartialTick();
				float _rainLevel = _clientLevel.getRainLevel(_partialTick);
				RenderSystem.enableBlend();
				RenderSystem.defaultBlendFunc();
				{
					RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
					RenderSystem.setShader(GameRenderer::getPositionTexColorShader);
					RenderSystem.setShaderTexture(0, new ResourceLocation("minecraft", "textures/environment/sun.png"));
					_bufferBuilder.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
					pose.popPose();
					pose.pushPose();
					pose.mulPose(Axis.YP.rotationDegrees(-90.0F));
					pose.mulPose(Axis.XP.rotationDegrees(_clientLevel.getTimeOfDay(_partialTick) * 360.0F));
					Matrix4f _matrix4f = pose.last().pose();
					float _size = 30.0F;
					int _alpha = (int) (255.0F * (1.0F - _rainLevel));
					_bufferBuilder.vertex(_matrix4f, -_size, 100.0F, -_size).uv(0.0F, 0.0F).color(255, 255, 255, _alpha).endVertex();
					_bufferBuilder.vertex(_matrix4f, _size, 100.0F, -_size).uv(1.0F, 0.0F).color(255, 255, 255, _alpha).endVertex();
					_bufferBuilder.vertex(_matrix4f, _size, 100.0F, _size).uv(1.0F, 1.0F).color(255, 255, 255, _alpha).endVertex();
					_bufferBuilder.vertex(_matrix4f, -_size, 100.0F, _size).uv(0.0F, 1.0F).color(255, 255, 255, _alpha).endVertex();
					BufferUploader.drawWithShader(_bufferBuilder.end());
				}
				{
					RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
					RenderSystem.setShader(GameRenderer::getPositionColorShader);
					_bufferBuilder.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_COLOR);
					pose.popPose();
					pose.pushPose();
					pose.mulPose(Axis.YP.rotationDegrees(-90.0F));
					pose.mulPose(Axis.XP.rotationDegrees(_clientLevel.getTimeOfDay(_partialTick) * 360.0F));
					Matrix4f _matrix4f = pose.last().pose();
					RandomSource _randomSource = RandomSource.create(10842L);
					float _starColor = _clientLevel.getStarBrightness(_partialTick) * (1.0F - _rainLevel);
					for (int _i = 0; _i < 1500; ++_i) {
						float _ox0 = _randomSource.nextFloat() * 2.0F - 1.0F;
						float _oy0 = _randomSource.nextFloat() * 2.0F - 1.0F;
						float _oz0 = _randomSource.nextFloat() * 2.0F - 1.0F;
						float _rdm0 = 0.15F + _randomSource.nextFloat() * 0.1F;
						float _sqr0 = _ox0 * _ox0 + _oy0 * _oy0 + _oz0 * _oz0;
						if (0.01F < _sqr0 && _sqr0 < 1.0F) {
							float _rot0 = 1.0F / Mth.sqrt(_sqr0);
							_ox0 *= _rot0;
							_oy0 *= _rot0;
							_oz0 *= _rot0;
							float _ox1 = _ox0 * 100.0F;
							float _oy1 = _oy0 * 100.0F;
							float _oz1 = _oz0 * 100.0F;
							float _atn0 = (float) Math.atan2(_ox0, _oz0);
							float _sin0 = Mth.sin(_atn0);
							float _cos0 = Mth.cos(_atn0);
							float _atn1 = (float) Math.atan2(Mth.sqrt(_ox0 * _ox0 + _oz0 * _oz0), _oy0);
							float _sin1 = Mth.sin(_atn1);
							float _cos1 = Mth.cos(_atn1);
							float _rdm1 = (float) _randomSource.nextDouble() * Mth.PI * 2.0F;
							float _sin2 = Mth.sin(_rdm1);
							float _cos2 = Mth.cos(_rdm1);
							for (int _j = 0; _j < 4; ++_j) {
								float _f0 = ((_j & 2) - 1) * _rdm0;
								float _f1 = ((_j + 1 & 2) - 1) * _rdm0;
								float _f2 = _f0 * _cos2 - _f1 * _sin2;
								float _f3 = _f1 * _cos2 + _f0 * _sin2;
								float _f4 = _f2 * _sin1;
								float _f5 = _f2 * -_cos1;
								float _f6 = _f5 * _sin0 - _f3 * _cos0;
								float _f7 = _f3 * _sin0 + _f5 * _cos0;
								_bufferBuilder.vertex(_matrix4f, _ox1 + _f6, _oy1 + _f4, _oz1 + _f7).color(_starColor, _starColor, _starColor, _starColor).endVertex();
							}
						}
					}
					BufferUploader.drawWithShader(_bufferBuilder.end());
				}
				pose.popPose();
				pose.pushPose();
				RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
				RenderSystem.setShaderTexture(0, new ResourceLocation("minecraft", "textures/block/grass_block_side.png"));
				RenderSystem.defaultBlendFunc();
			}
			if (world instanceof ClientLevel _clientLevel) {
				RenderSystem.setShader(GameRenderer::getPositionColorShader);
				BufferBuilder _bufferBuilder = Tesselator.getInstance().getBuilder();
				_bufferBuilder.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_COLOR);
				float _partialTick = Minecraft.getInstance().getPartialTick();
				pose.popPose();
				pose.pushPose();
				pose.mulPose(Axis.YP.rotationDegrees(-90.0F));
				pose.mulPose(Axis.XP.rotationDegrees(_clientLevel.getTimeOfDay(_partialTick) * 360.0F));
				Matrix4f _matrix4f = pose.last().pose();
				RandomSource _randomSource = RandomSource.create((long) 15482);
				int _amount = 2500;
				int _alpha = 255;
				for (int _i = 0; _i < _amount; ++_i) {
					float _ox0 = _randomSource.nextFloat() * 2.0F - 1.0F;
					float _oy0 = _randomSource.nextFloat() * 2.0F - 1.0F;
					float _oz0 = _randomSource.nextFloat() * 2.0F - 1.0F;
					float _rdm0 = 0.15F + _randomSource.nextFloat() * 0.1F;
					float _sqr0 = _ox0 * _ox0 + _oy0 * _oy0 + _oz0 * _oz0;
					if (0.01F < _sqr0 && _sqr0 < 1.0F) {
						float _rot0 = 1.0F / Mth.sqrt(_sqr0);
						_ox0 *= _rot0;
						_oy0 *= _rot0;
						_oz0 *= _rot0;
						float _ox1 = _ox0 * 100.0F;
						float _oy1 = _oy0 * 100.0F;
						float _oz1 = _oz0 * 100.0F;
						float _atn0 = (float) Math.atan2(_ox0, _oz0);
						float _sin0 = Mth.sin(_atn0);
						float _cos0 = Mth.cos(_atn0);
						float _atn1 = (float) Math.atan2(Mth.sqrt(_ox0 * _ox0 + _oz0 * _oz0), _oy0);
						float _sin1 = Mth.sin(_atn1);
						float _cos1 = Mth.cos(_atn1);
						float _rdm1 = (float) _randomSource.nextDouble() * Mth.PI * 2.0F;
						float _sin2 = Mth.sin(_rdm1);
						float _cos2 = Mth.cos(_rdm1);
						for (int _j = 0; _j < 4; ++_j) {
							float _f0 = ((_j & 2) - 1) * _rdm0;
							float _f1 = ((_j + 1 & 2) - 1) * _rdm0;
							float _f2 = _f0 * _cos2 - _f1 * _sin2;
							float _f3 = _f1 * _cos2 + _f0 * _sin2;
							float _f4 = _f2 * _sin1;
							float _f5 = _f2 * -_cos1;
							float _f6 = _f5 * _sin0 - _f3 * _cos0;
							float _f7 = _f3 * _sin0 + _f5 * _cos0;
							_bufferBuilder.vertex(_matrix4f, _ox1 + _f6, _oy1 + _f4, _oz1 + _f7).color(255, 255, 255, _alpha).endVertex();
						}
					}
				}
				BufferUploader.drawWithShader(_bufferBuilder.end());
				pose.popPose();
				pose.pushPose();
			}
			RenderSystem.setShaderTexture(0, new ResourceLocation(("destinycraft2" + ":textures/" + "moon_sky" + ".png")));
			(pose).popPose();
			(pose).pushPose();
			(pose).mulPose(Axis.YN.rotationDegrees(0));
			(pose).mulPose(Axis.XP.rotationDegrees(0));
			(pose).mulPose(Axis.ZN.rotationDegrees(0));
			if (world instanceof ClientLevel _clientLevel) {
				RenderSystem.setShader(GameRenderer::getPositionTexColorShader);
				BufferBuilder _bufferBuilder = Tesselator.getInstance().getBuilder();
				_bufferBuilder.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
				Matrix4f _matrix4f = pose.last().pose();
				float _size = 200;
				int _alpha = 255;
				_bufferBuilder.vertex(_matrix4f, _size, _size, 100.0F).uv(0.0F, 0.0F).color(255, 255, 255, _alpha).endVertex();
				_bufferBuilder.vertex(_matrix4f, _size, -_size, 100.0F).uv(0.0F, 1.0F).color(255, 255, 255, _alpha).endVertex();
				_bufferBuilder.vertex(_matrix4f, -_size, -_size, 100.0F).uv(1.0F, 1.0F).color(255, 255, 255, _alpha).endVertex();
				_bufferBuilder.vertex(_matrix4f, -_size, _size, 100.0F).uv(1.0F, 0.0F).color(255, 255, 255, _alpha).endVertex();
				BufferUploader.drawWithShader(_bufferBuilder.end());
			}
		}
	}
}
