package com.superlord.dungeoncraft.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * ModelUridezu - JJo
 * Created using Tabula 5.0.0
 */
public class ModelUridezu extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer RightUpperArm;
    public ModelRenderer LeftUpperArm;
    public ModelRenderer Tail1;
    public ModelRenderer shape39;
    public ModelRenderer shape40;
    public ModelRenderer RightLowerArm;
    public ModelRenderer LeftLowerArm;
    public ModelRenderer Tail2;
    public ModelRenderer Tail3;
    public ModelRenderer RightUpperLeg;
    public ModelRenderer LeftUpperLeg;
    public ModelRenderer RightLowerLeg;
    public ModelRenderer RightFoot;
    public ModelRenderer LeftLowerLeg;
    public ModelRenderer LeftFoot;
    public ModelRenderer Head;
    public ModelRenderer RightEar;
    public ModelRenderer LeftEar;
    public ModelRenderer Snout;
    public ModelRenderer Buckteeth;

    public ModelUridezu() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Tail1 = new ModelRenderer(this, 0, 47);
        this.Tail1.setRotationPoint(0.0F, 12.0F, 0.7F);
        this.Tail1.addBox(-1.0F, -1.0F, -0.1F, 2, 2, 6, 0.0F);
        this.setRotateAngle(Tail1, -1.1383037381507017F, 0.0F, 0.0F);
        this.LeftLowerArm = new ModelRenderer(this, 0, 0);
        this.LeftLowerArm.mirror = true;
        this.LeftLowerArm.setRotationPoint(0.9F, 8.0F, 0.0F);
        this.LeftLowerArm.addBox(-1.5F, -2.9F, -7.9F, 3, 3, 8, 0.0F);
        this.setRotateAngle(LeftLowerArm, -0.22759093446006054F, 0.0F, 0.0F);
        this.Snout = new ModelRenderer(this, 39, 13);
        this.Snout.setRotationPoint(0.0F, -1.4F, -5.5F);
        this.Snout.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 2, 0.0F);
        this.Tail3 = new ModelRenderer(this, 17, 47);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 9.9F);
        this.Tail3.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F);
        this.setRotateAngle(Tail3, 0.31869712141416456F, 0.0F, 0.0F);
        this.Tail2 = new ModelRenderer(this, 16, 34);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.Tail2.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 10, 0.0F);
        this.setRotateAngle(Tail2, -0.40980330836826856F, 0.0F, 0.0F);
        this.RightUpperLeg = new ModelRenderer(this, 0, 16);
        this.RightUpperLeg.setRotationPoint(-2.5F, 8.5F, 6.0F);
        this.RightUpperLeg.addBox(-2.1F, -0.25F, -2.0F, 4, 7, 4, 0.0F);
        this.RightEar = new ModelRenderer(this, 0, 0);
        this.RightEar.setRotationPoint(-2.5F, -3.7F, 0.7F);
        this.RightEar.addBox(-2.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F);
        this.setRotateAngle(RightEar, 0.0F, 0.7853981633974483F, 0.0F);
        this.Body = new ModelRenderer(this, 16, 16);
        this.Body.setRotationPoint(0.0F, 2.4F, -5.0F);
        this.Body.addBox(-3.5F, 0.0F, -2.0F, 7, 13, 4, 0.0F);
        this.setRotateAngle(Body, 0.7740535232594852F, 0.0F, 0.0F);
        this.shape39 = new ModelRenderer(this, 0, 0);
        this.shape39.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape39.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape39, -0.6373942428283291F, 0.0F, 0.0F);
        this.shape40 = new ModelRenderer(this, 0, 0);
        this.shape40.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape40.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape40, -0.40980330836826856F, 0.0F, 0.0F);
        this.Buckteeth = new ModelRenderer(this, 0, 3);
        this.Buckteeth.setRotationPoint(0.0F, 0.8F, -1.3F);
        this.Buckteeth.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F);
        this.LeftUpperArm = new ModelRenderer(this, 23, 0);
        this.LeftUpperArm.mirror = true;
        this.LeftUpperArm.setRotationPoint(3.9F, 1.2F, 0.0F);
        this.LeftUpperArm.addBox(-0.5F, -1.0F, -1.5F, 3, 9, 3, 0.0F);
        this.setRotateAngle(LeftUpperArm, 0.0F, 0.0F, -0.27314402793711257F);
        this.RightUpperArm = new ModelRenderer(this, 23, 0);
        this.RightUpperArm.setRotationPoint(-3.9F, 1.2F, 0.0F);
        this.RightUpperArm.addBox(-2.5F, -1.0F, -1.5F, 3, 9, 3, 0.0F);
        this.setRotateAngle(RightUpperArm, 0.0F, 0.0F, 0.27314402793711257F);
        this.RightLowerLeg = new ModelRenderer(this, 0, 27);
        this.RightLowerLeg.setRotationPoint(0.0F, 4.6F, 1.8F);
        this.RightLowerLeg.addBox(-1.5F, 0.0F, -1.0F, 3, 11, 3, 0.0F);
        this.setRotateAngle(RightLowerLeg, -0.40980330836826856F, 0.0F, 0.0F);
        this.RightFoot = new ModelRenderer(this, 0, 41);
        this.RightFoot.setRotationPoint(0.0F, 10.7F, 0.2F);
        this.RightFoot.addBox(-1.5F, 0.0F, -3.1F, 3, 1, 4, 0.0F);
        this.setRotateAngle(RightFoot, 0.31869712141416456F, 0.0F, 0.0F);
        this.LeftUpperLeg = new ModelRenderer(this, 0, 16);
        this.LeftUpperLeg.mirror = true;
        this.LeftUpperLeg.setRotationPoint(2.5F, 8.5F, 6.0F);
        this.LeftUpperLeg.addBox(-1.9F, -0.25F, -2.0F, 4, 7, 4, 0.0F);
        this.LeftFoot = new ModelRenderer(this, 0, 41);
        this.LeftFoot.mirror = true;
        this.LeftFoot.setRotationPoint(0.0F, 10.7F, 0.2F);
        this.LeftFoot.addBox(-1.5F, 0.0F, -3.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(LeftFoot, 0.31869712141416456F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 36, 0);
        this.Head.setRotationPoint(0.0F, -0.6F, 0.0F);
        this.Head.addBox(-2.5F, -4.2F, -5.5F, 5, 5, 7, 0.0F);
        this.LeftEar = new ModelRenderer(this, 0, 0);
        this.LeftEar.mirror = true;
        this.LeftEar.setRotationPoint(2.5F, -3.7F, 0.7F);
        this.LeftEar.addBox(0.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F);
        this.setRotateAngle(LeftEar, 0.0F, -0.7853981633974483F, 0.0F);
        this.RightLowerArm = new ModelRenderer(this, 0, 0);
        this.RightLowerArm.setRotationPoint(-0.9F, 8.0F, 0.0F);
        this.RightLowerArm.addBox(-1.5F, -2.9F, -7.9F, 3, 3, 8, 0.0F);
        this.setRotateAngle(RightLowerArm, -0.22759093446006054F, 0.0F, 0.0F);
        this.LeftLowerLeg = new ModelRenderer(this, 0, 27);
        this.LeftLowerLeg.mirror = true;
        this.LeftLowerLeg.setRotationPoint(0.0F, 4.6F, 1.8F);
        this.LeftLowerLeg.addBox(-1.5F, 0.0F, -1.0F, 3, 11, 3, 0.0F);
        this.setRotateAngle(LeftLowerLeg, -0.40980330836826856F, 0.0F, 0.0F);
        this.Body.addChild(this.Tail1);
        this.LeftUpperArm.addChild(this.LeftLowerArm);
        this.Head.addChild(this.Snout);
        this.Tail2.addChild(this.Tail3);
        this.Tail1.addChild(this.Tail2);
        this.shape39.addChild(this.RightUpperLeg);
        this.Head.addChild(this.RightEar);
        this.Body.addChild(this.shape39);
        this.Body.addChild(this.shape40);
        this.Snout.addChild(this.Buckteeth);
        this.Body.addChild(this.LeftUpperArm);
        this.Body.addChild(this.RightUpperArm);
        this.RightUpperLeg.addChild(this.RightLowerLeg);
        this.RightLowerLeg.addChild(this.RightFoot);
        this.shape39.addChild(this.LeftUpperLeg);
        this.LeftLowerLeg.addChild(this.LeftFoot);
        this.shape40.addChild(this.Head);
        this.Head.addChild(this.LeftEar);
        this.RightUpperArm.addChild(this.RightLowerArm);
        this.LeftUpperLeg.addChild(this.LeftLowerLeg);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Body.offsetX, this.Body.offsetY, this.Body.offsetZ);
        GlStateManager.translate(this.Body.rotationPointX * f5, this.Body.rotationPointY * f5, this.Body.rotationPointZ * f5);
        GlStateManager.scale(0.9D, 0.9D, 0.9D);
        GlStateManager.translate(-this.Body.offsetX, -this.Body.offsetY, -this.Body.offsetZ);
        GlStateManager.translate(-this.Body.rotationPointX * f5, -this.Body.rotationPointY * f5, -this.Body.rotationPointZ * f5);
        this.Body.render(f5);
        GlStateManager.popMatrix();
    }
    
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
    	float XAngle = headPitch / 57.29578F;
    	float YAngle = netHeadYaw / 57.29578F;
    	this.Head.rotateAngleX= (0.2617794F + XAngle);
    	this.Head.rotateAngleY= YAngle;
    	this.LeftUpperLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RightUpperLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
