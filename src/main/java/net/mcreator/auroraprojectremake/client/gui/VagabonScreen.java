package net.mcreator.auroraprojectremake.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.auroraprojectremake.world.inventory.VagabonMenu;
import net.mcreator.auroraprojectremake.procedures.SpeachvagabonProcedure;
import net.mcreator.auroraprojectremake.network.VagabonButtonMessage;
import net.mcreator.auroraprojectremake.AuroraProjectRemakeMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class VagabonScreen extends AbstractContainerScreen<VagabonMenu> {
	private final static HashMap<String, Object> guistate = VagabonMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_x;

	public VagabonScreen(VagabonMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("aurora_project_remake:textures/screens/tal.png"), this.leftPos + -199, this.topPos + -89, 0, 0, 350, 122, 350, 122);

		guiGraphics.blit(new ResourceLocation("aurora_project_remake:textures/screens/vagabonphoto.png"), this.leftPos + 62, this.topPos + -75, 0, 0, 196, 317, 196, 317);

		guiGraphics.blit(new ResourceLocation("aurora_project_remake:textures/screens/vagabond.png"), this.leftPos + -100, this.topPos + -86, 0, 0, 405, 75, 405, 75);

		if (SpeachvagabonProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("aurora_project_remake:textures/screens/dans-les-vastes-terres-cubique-14-03-2024.png"), this.leftPos + -194, this.topPos + -77, 0, 0, 512, 126, 512, 126);
		}
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
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_x = new ImageButton(this.leftPos + 102, this.topPos + -84, 16, 16, 0, 0, 16, new ResourceLocation("aurora_project_remake:textures/screens/atlas/imagebutton_x.png"), 16, 32, e -> {
			if (true) {
				AuroraProjectRemakeMod.PACKET_HANDLER.sendToServer(new VagabonButtonMessage(0, x, y, z));
				VagabonButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_x", imagebutton_x);
		this.addRenderableWidget(imagebutton_x);
	}
}
