package net.destinycraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;

import net.destinycraft.world.inventory.CreateTeamGUIMenu;
import net.destinycraft.network.CreateTeamGUIButtonMessage;
import net.destinycraft.Destinycraft2Mod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CreateTeamGUIScreen extends AbstractContainerScreen<CreateTeamGUIMenu> {
	private final static HashMap<String, Object> guistate = CreateTeamGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox label_member_03;
	EditBox label_member_06;
	EditBox label_member_08;
	Button button_join_team_1;
	Button button_join_team_2;
	Button button_join_team_3;

	public CreateTeamGUIScreen(CreateTeamGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 179;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("destinycraft2:textures/screens/create_team_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		label_member_03.render(ms, mouseX, mouseY, partialTicks);
		label_member_06.render(ms, mouseX, mouseY, partialTicks);
		label_member_08.render(ms, mouseX, mouseY, partialTicks);
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
		if (label_member_03.isFocused())
			return label_member_03.keyPressed(key, b, c);
		if (label_member_06.isFocused())
			return label_member_06.keyPressed(key, b, c);
		if (label_member_08.isFocused())
			return label_member_08.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		label_member_03.tick();
		label_member_06.tick();
		label_member_08.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.destinycraft2.create_team_gui.label_create_team"), 8, 7, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		label_member_03 = new EditBox(this.font, this.leftPos + 45, this.topPos + 26, 118, 18, Component.translatable("gui.destinycraft2.create_team_gui.label_member_03")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.destinycraft2.create_team_gui.label_member_03").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.destinycraft2.create_team_gui.label_member_03").getString());
				else
					setSuggestion(null);
			}
		};
		label_member_03.setSuggestion(Component.translatable("gui.destinycraft2.create_team_gui.label_member_03").getString());
		label_member_03.setMaxLength(32767);
		guistate.put("text:label_member_03", label_member_03);
		this.addWidget(this.label_member_03);
		label_member_06 = new EditBox(this.font, this.leftPos + 45, this.topPos + 71, 118, 18, Component.translatable("gui.destinycraft2.create_team_gui.label_member_06")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.destinycraft2.create_team_gui.label_member_06").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.destinycraft2.create_team_gui.label_member_06").getString());
				else
					setSuggestion(null);
			}
		};
		label_member_06.setSuggestion(Component.translatable("gui.destinycraft2.create_team_gui.label_member_06").getString());
		label_member_06.setMaxLength(32767);
		guistate.put("text:label_member_06", label_member_06);
		this.addWidget(this.label_member_06);
		label_member_08 = new EditBox(this.font, this.leftPos + 45, this.topPos + 116, 118, 18, Component.translatable("gui.destinycraft2.create_team_gui.label_member_08")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.destinycraft2.create_team_gui.label_member_08").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.destinycraft2.create_team_gui.label_member_08").getString());
				else
					setSuggestion(null);
			}
		};
		label_member_08.setSuggestion(Component.translatable("gui.destinycraft2.create_team_gui.label_member_08").getString());
		label_member_08.setMaxLength(32767);
		guistate.put("text:label_member_08", label_member_08);
		this.addWidget(this.label_member_08);
		button_join_team_1 = Button.builder(Component.translatable("gui.destinycraft2.create_team_gui.button_join_team_1"), e -> {
			if (true) {
				Destinycraft2Mod.PACKET_HANDLER.sendToServer(new CreateTeamGUIButtonMessage(0, x, y, z));
				CreateTeamGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 44, this.topPos + 43, 82, 20).build();
		guistate.put("button:button_join_team_1", button_join_team_1);
		this.addRenderableWidget(button_join_team_1);
		button_join_team_2 = Button.builder(Component.translatable("gui.destinycraft2.create_team_gui.button_join_team_2"), e -> {
			if (true) {
				Destinycraft2Mod.PACKET_HANDLER.sendToServer(new CreateTeamGUIButtonMessage(1, x, y, z));
				CreateTeamGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 44, this.topPos + 88, 82, 20).build();
		guistate.put("button:button_join_team_2", button_join_team_2);
		this.addRenderableWidget(button_join_team_2);
		button_join_team_3 = Button.builder(Component.translatable("gui.destinycraft2.create_team_gui.button_join_team_3"), e -> {
			if (true) {
				Destinycraft2Mod.PACKET_HANDLER.sendToServer(new CreateTeamGUIButtonMessage(2, x, y, z));
				CreateTeamGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 44, this.topPos + 133, 82, 20).build();
		guistate.put("button:button_join_team_3", button_join_team_3);
		this.addRenderableWidget(button_join_team_3);
	}
}
