// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmob<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "mob"),
			"main");
	private final ModelPart leg1;
	private final ModelPart leg0;
	private final ModelPart arms;
	private final ModelPart head;
	private final ModelPart tools;
	private final ModelPart bb_main;

	public Modelmob(ModelPart root) {
		this.leg1 = root.getChild("leg1");
		this.leg0 = root.getChild("leg0");
		this.arms = root.getChild("arms");
		this.head = root.getChild("head");
		this.tools = root.getChild("tools");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1",
				CubeListBuilder.create().texOffs(0, 22).mirror()
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition leg0 = partdefinition.addOrReplaceChild("leg0", CubeListBuilder.create().texOffs(0, 22).addBox(
				-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition arms = partdefinition.addOrReplaceChild("arms",
				CubeListBuilder.create().texOffs(40, 38)
						.addBox(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 22)
						.addBox(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 22)
						.mirror().addBox(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.0F, -1.0F, -0.75F, 0.0F, 0.0F));

		PartDefinition held_item = arms.addOrReplaceChild("held_item", CubeListBuilder.create(),
				PartPose.offset(0.0F, 22.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition helmet = head.addOrReplaceChild("helmet", CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F,
				-10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tools = partdefinition.addOrReplaceChild("tools",
				CubeListBuilder.create().texOffs(55, 59)
						.addBox(1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(55, 59)
						.addBox(3.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(55, 59)
						.addBox(-3.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(55, 59)
						.addBox(-5.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 40)
						.addBox(-5.0F, 1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 40)
						.addBox(-4.0F, 2.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(-1.0F, -2.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(55, 53)
						.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 0)
						.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 1)
						.addBox(-1.0F, 1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 1)
						.addBox(-1.0F, 2.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 1)
						.addBox(-1.0F, 3.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 1)
						.addBox(-1.0F, 4.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 1)
						.addBox(-1.0F, 5.4F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 1)
						.addBox(-1.0F, 6.6F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 1)
						.addBox(-1.0F, 6.6F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(16, 20)
						.addBox(-4.0F, -24.0F, -3.0F, 8.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 38)
						.addBox(-4.0F, -24.0F, -3.0F, 8.0F, 18.0F, 6.0F, new CubeDeformation(0.5F)).texOffs(31, 49)
						.addBox(-4.0F, -22.0F, 4.0F, 8.0F, 11.0F, 2.0F, new CubeDeformation(0.5F)).texOffs(27, 62)
						.addBox(-4.0F, -10.0F, 4.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		leg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg0.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arms.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tools.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.leg0.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.head.yRot = headPitch / (180F / (float) Math.PI);
		this.leg1.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}