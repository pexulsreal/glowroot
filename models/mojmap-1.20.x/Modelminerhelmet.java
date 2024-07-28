// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelminerhelmet<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "minerhelmet"), "main");
	private final ModelPart mininghat;

	public Modelminerhelmet(ModelPart root) {
		this.mininghat = root.getChild("mininghat");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition mininghat = partdefinition.addOrReplaceChild("mininghat",
				CubeListBuilder.create().texOffs(18, 28)
						.addBox(-5.5F, -6.0F, -5.5F, 11.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 28)
						.addBox(-5.5F, -6.0F, 3.5F, 11.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(13, 23)
						.addBox(3.5F, -6.0F, -3.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(13, 23)
						.addBox(-5.5F, -6.0F, -3.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(68, 32)
						.addBox(1.5F, -10.0F, -6.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(68, 32)
						.addBox(-2.5F, -10.0F, -6.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(68, 32)
						.addBox(-3.5F, -7.0F, -6.5F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(67, 31)
						.addBox(-2.5F, -11.0F, -6.5F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(19, 21)
						.addBox(-2.5F, -11.0F, -6.5F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(65, 35)
						.addBox(-4.5F, -10.0F, -4.5F, 9.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(38, 7)
						.addBox(-1.5F, -10.0F, -5.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		mininghat.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.mininghat.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.mininghat.xRot = headPitch / (180F / (float) Math.PI);
	}
}