// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelglowroothybridfinal<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "glowroothybridfinal"), "main");
	private final ModelPart head;
	private final ModelPart leftleg;
	private final ModelPart rightarm;
	private final ModelPart leftarm;
	private final ModelPart rightleg;
	private final ModelPart chest;

	public Modelglowroothybridfinal(ModelPart root) {
		this.head = root.getChild("head");
		this.leftleg = root.getChild("leftleg");
		this.rightarm = root.getChild("rightarm");
		this.leftarm = root.getChild("leftarm");
		this.rightleg = root.getChild("rightleg");
		this.chest = root.getChild("chest");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(96, 68)
						.addBox(-4.0F, 12.4286F, -7.4286F, 8.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(96, 36)
						.addBox(-4.5F, -4.5714F, -7.4286F, 9.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(46, 32)
						.addBox(-4.0F, 10.4286F, -7.4286F, 8.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(46, 30)
						.addBox(-4.0F, 4.4286F, -7.4286F, 8.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(52, 0)
						.addBox(-4.0F, 4.4286F, 0.5714F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 76)
						.addBox(4.0F, 4.4286F, -7.4286F, 0.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 76)
						.addBox(-4.0F, 4.4286F, -7.4286F, 0.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -32.587F, 1.7948F));

		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(232, 222)
				.addBox(-3.0F, 11.6712F, -3.7586F, 6.0F, 28.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, -14.6712F, 10.7586F));

		PartDefinition cube_r1 = leftleg.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(224, 230).addBox(-7.0F, -18.0F, -1.0F, 8.0F, 18.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 16.6712F, -3.7586F, -0.1745F, 0.0F, 0.0F));

		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create(),
				PartPose.offset(-9.5F, -27.792F, 5.0702F));

		PartDefinition cube_r2 = rightarm.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(53, 96).addBox(-6.0F, -19.0F, -1.0F, 7.0F, 19.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 17.792F, -2.0702F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r3 = rightarm.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 102).addBox(-4.5F, -22.0F, -1.0F, 6.0F, 22.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 36.792F, -2.0702F, -0.0436F, 0.0F, 0.0F));

		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create(),
				PartPose.offset(9.5F, -27.792F, 5.0702F));

		PartDefinition cube_r4 = leftarm.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(53, 96).addBox(-6.0F, -19.0F, -1.0F, 7.0F, 19.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, 17.792F, -2.0702F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r5 = leftarm.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 102).addBox(-4.5F, -22.0F, -1.0F, 6.0F, 22.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 36.792F, -2.0702F, -0.0436F, 0.0F, 0.0F));

		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg", CubeListBuilder.create()
				.texOffs(232, 222).addBox(-3.0F, 11.6712F, -3.7586F, 6.0F, 28.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.0F, -14.6712F, 10.7586F));

		PartDefinition cube_r6 = rightleg.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(224, 230).addBox(-7.0F, -18.0F, -1.0F, 8.0F, 18.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 16.6712F, -3.7586F, -0.1745F, 0.0F, 0.0F));

		PartDefinition chest = partdefinition.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(16, 155)
				.addBox(-8.0F, -9.0594F, -5.233F, 16.0F, 5.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(80, 235)
				.mirror().addBox(-8.0F, 1.9406F, -5.233F, 16.0F, 5.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 206).addBox(-6.0F, -4.0594F, -3.233F, 12.0F, 6.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(24, 236).addBox(-7.0F, -4.0594F, -4.233F, 14.0F, 6.0F, 14.0F, new CubeDeformation(0.0F))
				.texOffs(205, 240).addBox(-3.0F, -12.2177F, -5.8668F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -21.9406F, 8.233F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(90, 56).mirror()
						.addBox(-14.0F, -6.5F, -1.0F, 15.0F, 6.0F, 6.0F, new CubeDeformation(-1.0F)).mirror(false),
				PartPose.offsetAndRotation(-14.0F, 6.9406F, 0.767F, 0.1309F, -0.4363F, -0.0436F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 48).mirror()
						.addBox(-16.0F, -7.0F, -1.0F, 17.0F, 7.0F, 7.0F, new CubeDeformation(-1.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 8.9406F, 0.767F, 0.0873F, -0.0873F, 0.1309F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(90, 56).addBox(-14.0F, -7.0F, -1.0F, 15.0F, 6.0F, 6.0F,
						new CubeDeformation(-1.0F)),
				PartPose.offsetAndRotation(26.0F, 7.9406F, -4.233F, 0.1309F, 0.4363F, 0.0436F));

		PartDefinition cube_r10 = chest.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 48).addBox(-16.0F, -7.0F, -1.0F, 17.0F, 7.0F, 7.0F,
						new CubeDeformation(-1.0F)),
				PartPose.offsetAndRotation(17.0F, 6.9406F, -0.233F, 0.0873F, 0.0873F, -0.1309F));

		PartDefinition cube_r11 = chest.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(90, 56).addBox(-14.0F, -7.0F, -1.0F, 15.0F, 6.0F, 6.0F,
						new CubeDeformation(-1.0F)),
				PartPose.offsetAndRotation(26.0F, -2.0594F, -4.233F, 0.1309F, 0.4363F, 0.0436F));

		PartDefinition cube_r12 = chest.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(90, 56).mirror()
						.addBox(-14.0F, -6.5F, -1.0F, 15.0F, 6.0F, 6.0F, new CubeDeformation(-1.0F)).mirror(false),
				PartPose.offsetAndRotation(-14.0F, -3.0594F, 0.767F, 0.1309F, -0.4363F, -0.0436F));

		PartDefinition cube_r13 = chest.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(0, 48).addBox(-16.0F, -7.0F, -1.0F, 17.0F, 7.0F, 7.0F,
						new CubeDeformation(-1.0F)),
				PartPose.offsetAndRotation(17.0F, -3.0594F, -0.233F, 0.0873F, 0.0873F, -0.1309F));

		PartDefinition cube_r14 = chest.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(0, 48).mirror()
						.addBox(-16.0F, -7.0F, -1.0F, 17.0F, 7.0F, 7.0F, new CubeDeformation(-1.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, -1.0594F, 0.767F, 0.0873F, -0.0873F, 0.1309F));

		PartDefinition cube_r15 = chest.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(204, 239).mirror()
						.addBox(-14.0F, -5.0F, 0.0F, 14.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(7.0F, 9.9406F, -3.233F, -0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		chest.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.rightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rightarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leftarm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}