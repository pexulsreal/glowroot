package net.mcreator.glowroot.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelglowrootgolem<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("glowroot", "modelglowrootgolem"), "main");
	public final ModelPart body;
	public final ModelPart flowers;
	public final ModelPart right_front_leg;
	public final ModelPart left_hind_leg;
	public final ModelPart left_mid_leg;
	public final ModelPart left_front_leg;
	public final ModelPart right_hind_leg;
	public final ModelPart right_mid_leg;

	public Modelglowrootgolem(ModelPart root) {
		this.body = root.getChild("body");
		this.flowers = root.getChild("flowers");
		this.right_front_leg = root.getChild("right_front_leg");
		this.left_hind_leg = root.getChild("left_hind_leg");
		this.left_mid_leg = root.getChild("left_mid_leg");
		this.left_front_leg = root.getChild("left_front_leg");
		this.right_hind_leg = root.getChild("right_hind_leg");
		this.right_mid_leg = root.getChild("right_mid_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition shell = body
				.addOrReplaceChild("shell",
						CubeListBuilder.create().texOffs(45, 86).addBox(-15.5F, -10.0F, -20.0F, 30.0F, 4.0F, 42.0F, new CubeDeformation(0.0F)).texOffs(0, 136).addBox(-13.0F, -25.0F, -20.0F, 25.0F, 16.0F, 40.0F, new CubeDeformation(0.1F))
								.texOffs(12, 144).addBox(4.0F, -10.0F, -22.0F, 10.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 144).addBox(-15.0F, -10.0F, -22.0F, 11.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition headshell = shell
				.addOrReplaceChild(
						"headshell", CubeListBuilder.create().texOffs(101, 145).addBox(4.0F, -14.0F, -22.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(90, 146).addBox(-8.0F, -14.0F, -22.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
								.texOffs(79, 187).addBox(-7.0F, -17.0F, -22.0F, 14.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(104, 139).addBox(-4.0F, -9.0F, -22.0F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition flowers = partdefinition.addOrReplaceChild("flowers", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition bigflower = flowers.addOrReplaceChild("bigflower", CubeListBuilder.create(), PartPose.offsetAndRotation(25.0F, 0.0F, 0.0F, 0.0F, -0.5672F, 0.0F));
		PartDefinition cube_r1 = bigflower.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(32, 96).addBox(-4.0F, -57.0F, 19.0F, 16.0F, 32.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r2 = bigflower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(32, 96).addBox(-27.5F, -57.0F, 5.0F, 16.0F, 32.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition mushroom = flowers.addOrReplaceChild("mushroom", CubeListBuilder.create(), PartPose.offsetAndRotation(7.0F, 0.0F, -3.0F, 0.0F, -0.4363F, 0.0F));
		PartDefinition cube_r3 = mushroom.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 96).addBox(-13.5F, -41.0F, 19.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r4 = mushroom.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 96).addBox(11.0F, -41.0F, 5.5F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition fern = flowers.addOrReplaceChild("fern", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.0F, -32.0F, 0.0F, -0.3054F, 0.0F));
		PartDefinition cube_r5 = fern.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 112).addBox(-13.5F, -41.0F, 19.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r6 = fern.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 112).addBox(11.0F, -41.0F, 5.5F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition fern2 = flowers.addOrReplaceChild("fern2", CubeListBuilder.create(), PartPose.offsetAndRotation(9.0F, 1.0F, 2.0F, 0.0F, -1.3963F, 0.0F));
		PartDefinition cube_r7 = fern2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 112).addBox(-13.5F, -41.0F, 19.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r8 = fern2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 112).addBox(11.0F, -41.0F, 5.5F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition smallflower = flowers.addOrReplaceChild("smallflower", CubeListBuilder.create(), PartPose.offsetAndRotation(-12.0F, 0.0F, -37.0F, 0.0F, -0.3054F, 0.0F));
		PartDefinition cube_r9 = smallflower.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(15, 80).addBox(-13.5F, -41.0F, 19.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r10 = smallflower.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(15, 80).addBox(11.0F, -41.0F, 5.5F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create().texOffs(162, 174).addBox(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.5F, 15.0F, -15.0F));
		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().texOffs(130, 174).mirror().addBox(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(7.5F, 15.0F, 15.0F));
		PartDefinition left_mid_leg = partdefinition.addOrReplaceChild("left_mid_leg", CubeListBuilder.create().texOffs(130, 174).addBox(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(7.5F, 15.0F, 0.0F));
		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create().texOffs(130, 174).addBox(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(7.5F, 15.0F, -15.0F));
		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create().texOffs(162, 174).addBox(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.5F, 15.0F, 15.0F));
		PartDefinition right_mid_leg = partdefinition.addOrReplaceChild("right_mid_leg", CubeListBuilder.create().texOffs(162, 174).addBox(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.5F, 15.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 192, 192);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		flowers.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_front_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_hind_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_mid_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_front_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_hind_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_mid_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.right_front_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.right_hind_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.right_mid_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.left_hind_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.left_mid_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.left_front_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
