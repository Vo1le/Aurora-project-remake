package net.mcreator.auroraprojectremake.client.gui;

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

		guiGraphics.blit(new ResourceLocation("aurora_project_remake:textures/screens/tal.png"), this.leftPos + -199, this.topPos + -88, 0, 0, 350, 122, 350, 122);

		guiGraphics.blit(new ResourceLocation("aurora_project_remake:textures/screens/vagabonphoto.png"), this.leftPos + 59, this.topPos + -77, 0, 0, 196, 317, 196, 317);

		guiGraphics.blit(new ResourceLocation("aurora_project_remake:textures/screens/vagabond.png"), this.leftPos + -198, this.topPos + -85, 0, 0, 405, 75, 405, 75);

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
		guiGraphics.drawString(this.font,

				SpeachvagabonProcedure.execute(entity), -193, -64, -16777216, false);
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
