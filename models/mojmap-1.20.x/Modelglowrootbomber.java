// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelglowrootbomber<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "glowrootbomber"), "main");
	private final ModelPart beamtop;
	private final ModelPart body;
	private final ModelPart spinners;

	public Modelglowrootbomber(ModelPart root) {
		this.beamtop = root.getChild("beamtop");
		this.body = root.getChild("body");
		this.spinners = root.getChild("spinners");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition beamtop = partdefinition.addOrReplaceChild("beamtop", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition beam = beamtop.addOrReplaceChild("beam", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = beam.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(86, 88).addBox(-30.0F, -8.0F, 8.0F, 16.0F, 16.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(22.0F, -8.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head2 = body.addOrReplaceChild("head2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -105.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition Crown2 = head2.addOrReplaceChild("Crown2",
				CubeListBuilder.create().texOffs(8, 53)
						.addBox(-4.0F, -3.0F, -4.0F, 8.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 61)
						.addBox(-4.0F, -3.0F, 4.0F, 8.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 50)
						.addBox(4.0F, -3.0F, -4.0F, 0.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(8, 48)
						.addBox(-4.0F, -3.0F, -4.0F, 0.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -101.0F, 0.0F));

		PartDefinition top = body.addOrReplaceChild("top", CubeListBuilder.create().texOffs(0, 29).addBox(-8.0F, -17.0F,
				-8.0F, 16.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0F, 0.0F));

		PartDefinition bottom = body.addOrReplaceChild("bottom", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F,
				-11.0F, -8.0F, 16.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0F, 0.0F));

		PartDefinition eyes = body.addOrReplaceChild("eyes", CubeListBuilder.create().texOffs(7, 110).addBox(-6.0F,
				-14.0F, -6.0F, 12.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0F, 0.0F));

		PartDefinition spinners = partdefinition.addOrReplaceChild("spinners", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition spinnersouth = spinners.addOrReplaceChild("spinnersouth", CubeListBuilder.create(),
				PartPose.offset(0.0546F, -14.2649F, -12.9956F));

		PartDefinition cube_r2 = spinnersouth.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(48, 114).addBox(1.8804F, 0.5F, -9.0F, 4.0F, 10.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 3.4364F, 12.9956F, -1.5708F, 0.0436F, -1.5708F));

		PartDefinition cube_r3 = spinnersouth.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(64, 124)
						.addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 22)
						.addBox(-3.0F, -3.0F, 1.5F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1018F, 2.3311F, -3.098F, 0.0F, 0.0F));

		PartDefinition spinnernorth = spinners.addOrReplaceChild("spinnernorth", CubeListBuilder.create(),
				PartPose.offset(0.0546F, -14.2649F, 12.9956F));

		PartDefinition cube_r4 = spinnernorth.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(48, 114).addBox(1.8804F, 0.5F, 5.0F, 4.0F, 10.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 3.4364F, -12.9956F, 1.5708F, -0.0436F, -1.5708F));

		PartDefinition cube_r5 = spinnernorth.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(64, 124)
						.addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(65, 22)
						.addBox(-3.0F, -3.0F, 1.5F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1018F, -2.3311F, -0.0436F, 0.0F, 0.0F));

		PartDefinition spinnereast = spinners.addOrReplaceChild("spinnereast", CubeListBuilder.create(),
				PartPose.offset(12.1244F, -14.6109F, 0.0F));

		PartDefinition cube_r6 = spinnereast.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(71, 31)
						.addBox(1.0F, 4.5F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(64, 124)
						.addBox(3.0F, 2.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 114)
						.addBox(1.8804F, -7.5F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0698F, 3.7825F, 0.0F, 0.0F, 0.0F, -1.5272F));

		PartDefinition spinnerwest = spinners.addOrReplaceChild("spinnerwest", CubeListBuilder.create(),
				PartPose.offset(-12.6508F, -14.4658F, 0.0F));

		PartDefinition cube_r7 = spinnerwest.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(71, 31)
						.addBox(-3.0F, 1.5F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(64, 124)
						.addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 114)
						.addBox(-2.0F, -10.5F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3311F, -0.1018F, 0.0F, 0.0F, 0.0F, 1.5272F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		beamtop.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		spinners.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.spinners.yRot = ageInTicks / 20.f;
	}
}