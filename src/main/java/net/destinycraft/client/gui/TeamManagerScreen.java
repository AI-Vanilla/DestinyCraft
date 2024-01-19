package net.destinycraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;

import net.destinycraft.world.inventory.TeamManagerMenu;
import net.destinycraft.network.TeamManagerButtonMessage;
import net.destinycraft.Destinycraft2Mod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class TeamManagerScreen extends AbstractContainerScreen<TeamManagerMenu> {
	private final static HashMap<String, Object> guistate = TeamManagerMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_create_team;
	Button button_team_leave;

	public TeamManagerScreen(TeamManagerMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 204;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("destinycraft2:textures/screens/team_manager.png");

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
		this.font.draw(poseStack, Component.translatable("gui.destinycraft2.team_manager.label_fireteam_manager"), 56, 7, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_create_team = Button.builder(Component.translatable("gui.destinycraft2.team_manager.button_create_team"), e -> {
			if (true) {
				Destinycraft2Mod.PACKET_HANDLER.sendToServer(new TeamManagerButtonMessage(0, x, y, z));
				TeamManagerButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 56, this.topPos + 61, 82, 20).build();
		guistate.put("button:button_create_team", button_create_team);
		this.addRenderableWidget(button_create_team);
		button_team_leave = Button.builder(Component.translatable("gui.destinycraft2.team_manager.button_team_leave"), e -> {
			if (true) {
				Destinycraft2Mod.PACKET_HANDLER.sendToServer(new TeamManagerButtonMessage(1, x, y, z));
				TeamManagerButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 56, this.topPos + 88, 77, 20).build();
		guistate.put("button:button_team_leave", button_team_leave);
		this.addRenderableWidget(button_team_leave);
	}
}
