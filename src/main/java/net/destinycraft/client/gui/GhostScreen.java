package net.destinycraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;

import net.destinycraft.world.inventory.GhostMenu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class GhostScreen extends AbstractContainerScreen<GhostMenu> {
	private final static HashMap<String, Object> guistate = GhostMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_earth;
	Button button_moon;
	Button button_nether;
	Button button_the_end;

	public GhostScreen(GhostMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 422;
		this.imageHeight = 232;
	}

	private static final ResourceLocation texture = new ResourceLocation("destinycraft2:textures/screens/ghost.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.destinycraft2.ghost.label_location"), 183, 12, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_earth = Button.builder(Component.translatable("gui.destinycraft2.ghost.button_earth"), e -> {
		}).bounds(this.leftPos + 183, this.topPos + 92, 51, 20).build();
		guistate.put("button:button_earth", button_earth);
		this.addRenderableWidget(button_earth);
		button_moon = Button.builder(Component.translatable("gui.destinycraft2.ghost.button_moon"), e -> {
		}).bounds(this.leftPos + 237, this.topPos + 116, 46, 20).build();
		guistate.put("button:button_moon", button_moon);
		this.addRenderableWidget(button_moon);
		button_nether = Button.builder(Component.translatable("gui.destinycraft2.ghost.button_nether"), e -> {
		}).bounds(this.leftPos + 93, this.topPos + 164, 56, 20).build();
		guistate.put("button:button_nether", button_nether);
		this.addRenderableWidget(button_nether);
		button_the_end = Button.builder(Component.translatable("gui.destinycraft2.ghost.button_the_end"), e -> {
		}).bounds(this.leftPos + 273, this.topPos + 164, 61, 20).build();
		guistate.put("button:button_the_end", button_the_end);
		this.addRenderableWidget(button_the_end);
	}
}