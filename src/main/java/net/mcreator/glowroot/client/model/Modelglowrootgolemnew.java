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

// Made with Blockbench 4.10.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelglowrootgolemnew<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("glowroot", "modelglowrootgolemnew"), "main");
	public final ModelPart body;
	public final ModelPart leftfrontleg;
	public final ModelPart leftbackleg;
	public final ModelPart rightfrontleg;
	public final ModelPart rightbackleg;
	public final ModelPart head;
	public final ModelPart tail;

	public Modelglowrootgolemnew(ModelPart root) {
		this.body = root.getChild("body");
		this.leftfrontleg = root.getChild("leftfrontleg");
		this.leftbackleg = root.getChild("leftbackleg");
		this.rightfrontleg = root.getChild("rightfrontleg");
		this.rightbackleg = root.getChild("rightbackleg");
		this.head = root.getChild("head");
		this.tail = root.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(227, 171).addBox(-10.2352F, -3.6442F, -17.2357F, 20.0F, 15.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offset(0.2352F, 5.6442F, 2.2357F));
		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(43, 217).addBox(0.5F, -16.0F, -1.0F, 0.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.7648F, -3.6442F, -15.2357F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(43, 217).addBox(1.0F, -16.0F, -1.0F, 0.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7648F, -3.6442F, -14.2357F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(43, 264).addBox(1.0F, -16.0F, -1.0F, 0.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.295F, -3.6442F, -15.9939F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(42, 264).addBox(1.0F, -16.0F, -1.0F, 0.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.295F, -3.6442F, -16.9939F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(44, 192).addBox(1.0F, -16.0F, -1.0F, 0.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.295F, -3.6442F, 4.0061F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(44, 192).addBox(1.0F, -16.0F, -1.0F, 0.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.705F, -3.6442F, 3.0061F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(343, 51).addBox(0.3F, -16.1F, -1.0F, 0.0F, 16.0F, 28.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.2352F, 12.3558F, -16.2357F, 0.0F, 0.0F, 0.0436F));
		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(343, 51).addBox(-0.3F, -16.05F, -1.0F, 0.0F, 16.0F, 28.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.7648F, 12.3558F, -16.2357F, 0.0F, 0.0F, -0.0436F));
		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(351, 59).addBox(0.9405F, -7.6389F, -13.65F, 0.0F, 16.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8757F, 3.9447F, 10.1643F, 1.5708F, -1.5272F, -1.5708F));
		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(351, 59).addBox(0.2405F, -7.6389F, -13.65F, 0.0F, 16.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8757F, 3.9447F, -17.8357F, -1.5708F, -1.5272F, 1.5708F));
		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(361, 72).addBox(-0.5095F, -0.6389F, -13.65F, 0.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.8757F, 1.9447F, -16.8357F, -1.5708F, -1.4835F, 1.5708F));
		PartDefinition leftfrontleg = partdefinition.addOrReplaceChild("leftfrontleg", CubeListBuilder.create().texOffs(149, 25).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(6.5F, 17.0F, -11.5F));
		PartDefinition leftbackleg = partdefinition.addOrReplaceChild("leftbackleg", CubeListBuilder.create().texOffs(156, 28).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(6.5F, 17.0F, 9.5F));
		PartDefinition rightfrontleg = partdefinition.addOrReplaceChild("rightfrontleg", CubeListBuilder.create().texOffs(161, 55).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.5F, 17.0F, -11.5F));
		PartDefinition rightbackleg = partdefinition.addOrReplaceChild("rightbackleg", CubeListBuilder.create().texOffs(145, 30).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.5F, 17.0F, 9.5F));
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(74, 25).addBox(5.8076F, -6.0355F, -8.6779F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(79, 36)
				.addBox(-5.1924F, 0.9645F, -8.6779F, 10.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(80, 0).addBox(-6.1924F, -7.0355F, -10.6779F, 12.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.1924F, 4.0355F, -14.3221F));
		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(359, 68).addBox(0.2655F, -7.6389F, -13.65F, 0.0F, 16.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.8329F, 0.5535F, 1.7221F, 1.5708F, -1.4835F, -1.5708F));
		PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(359, 69).addBox(0.59F, -16.15F, -1.0F, 0.0F, 16.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.1924F, 8.9645F, -9.6779F, 0.0F, 0.0F, 0.0873F));
		PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(359, 69).addBox(0.4F, -16.05F, -1.0F, 0.0F, 16.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.8076F, 8.9645F, -9.6779F, 0.0F, 0.0F, -0.0873F));
		PartDefinition cube_r15 = head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(231, 68).addBox(-0.5095F, -0.6389F, -13.65F, 0.0F, 9.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.8329F, -6.4465F, -10.2779F, -1.5708F, -1.4835F, 1.5708F));
		PartDefinition cube_r16 = head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(73, 26).addBox(-5.4F, -4.55F, -0.5F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.1924F, -4.0355F, -4.6779F, 3.1416F, 0.0F, -2.6616F));
		PartDefinition cube_r17 = head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(74, 25).addBox(-4.0F, -4.0F, -1.0F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.1924F, -2.0355F, -4.6779F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition cube_r18 = head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(73, 26).addBox(-5.4F, -4.55F, -0.5F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.8076F, -4.0355F, -7.6779F, 0.0F, 0.0F, -0.48F));
		PartDefinition cube_r19 = head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(43, 241).addBox(1.0F, -16.0F, -1.0F, 0.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.2522F, -6.0355F, -8.4361F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r20 = head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(42, 241).addBox(1.0F, -16.0F, -1.0F, 0.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7478F, -6.0355F, -9.4361F, 0.0F, -0.7854F, 0.0F));
		PartDefinition tail = partdefinition.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(253, 282).addBox(-3.0636F, -0.26F, -0.2319F, 6.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(27, 240).addBox(0.2426F, -15.26F, -12.4278F, 0.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0636F, 10.26F, 13.2319F));
		PartDefinition cube_r21 = tail.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(239, 75).addBox(0.3F, -16.1F, -1.0F, 0.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0636F, 15.74F, 0.7681F, 0.0F, 0.0F, 0.0436F));
		PartDefinition cube_r22 = tail.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(237, 73).addBox(0.9405F, -7.6389F, -13.65F, 0.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.7041F, 7.3289F, 3.1681F, 1.5708F, -1.5272F, -1.5708F));
		PartDefinition cube_r23 = tail.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(239, 75).addBox(-0.3F, -16.05F, -1.0F, 0.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9364F, 15.74F, 0.7681F, 0.0F, 0.0F, -0.0436F));
		return LayerDefinition.create(meshdefinition, 528, 528);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftfrontleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftbackleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightfrontleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightbackleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.leftfrontleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rightbackleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftbackleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rightfrontleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
