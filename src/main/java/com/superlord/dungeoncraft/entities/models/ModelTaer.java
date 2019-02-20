package com.superlord.dungeoncraft.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * ModelTaer - JJo
 * Created using Tabula 5.0.0
 */
public class ModelTaer extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Head;
    public ModelRenderer RightLeg;
    public ModelRenderer LeftLeg;
    public ModelRenderer RightArm;
    public ModelRenderer LeftArm;
    public ModelRenderer RightTooth;
    public ModelRenderer LeftTooth;
    public ModelRenderer Club1;
    public ModelRenderer Club2;
    public ModelRenderer Club3;
    public ModelRenderer Club4;

    public ModelTaer() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.Club3 = new ModelRenderer(this, 24, 53);
        this.Club3.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.Club3.addBox(-2.5F, -2.5F, -5.9F, 5, 5, 6, 0.0F);
        this.LeftLeg = new ModelRenderer(this, 0, 26);
        this.LeftLeg.mirror = true;
        this.LeftLeg.setRotationPoint(4.9F, 18.9F, 3.5F);
        this.LeftLeg.addBox(-3.0F, -0.5F, -3.0F, 6, 9, 6, 0.0F);
        this.LeftArm = new ModelRenderer(this, 0, 0);
        this.LeftArm.mirror = true;
        this.LeftArm.setRotationPoint(8.25F, 0.5F, 3.5F);
        this.LeftArm.addBox(-0.1F, 0.0F, -3.0F, 6, 20, 6, 0.0F);
        this.setRotateAngle(LeftArm, 0.0F, 0.0F, -0.045553093477052F);
        this.RightTooth = new ModelRenderer(this, 0, 0);
        this.RightTooth.setRotationPoint(-1.5F, 4.0F, -4.9F);
        this.RightTooth.addBox(-0.5F, -1.0F, 0.0F, 1, 1, 0, 0.0F);
        this.setRotateAngle(RightTooth, 0.40980330836826856F, 0.0F, 0.0F);
        this.Club2 = new ModelRenderer(this, 0, 52);
        this.Club2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Club2.addBox(-2.0F, -2.0F, -8.0F, 4, 4, 8, 0.0F);
        this.RightLeg = new ModelRenderer(this, 0, 26);
        this.RightLeg.setRotationPoint(-4.9F, 18.9F, 3.5F);
        this.RightLeg.addBox(-3.0F, -0.5F, -3.0F, 6, 9, 6, 0.0F);
        this.RightArm = new ModelRenderer(this, 0, 0);
        this.RightArm.setRotationPoint(-8.25F, 0.5F, 3.5F);
        this.RightArm.addBox(-5.9F, 0.0F, -3.0F, 6, 20, 6, 0.0F);
        this.setRotateAngle(RightArm, 0.0F, 0.0F, 0.045553093477052F);
        this.Club1 = new ModelRenderer(this, 0, 52);
        this.Club1.setRotationPoint(-3.0F, 16.9F, 2.8F);
        this.Club1.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 8, 0.0F);
        this.Club4 = new ModelRenderer(this, 46, 48);
        this.Club4.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Club4.addBox(-3.0F, -3.0F, -10.0F, 6, 6, 10, 0.0F);
        this.Head = new ModelRenderer(this, 24, 26);
        this.Head.setRotationPoint(0.0F, 1.45F, 0.35F);
        this.Head.addBox(-3.0F, -3.0F, -5.0F, 6, 8, 6, 0.0F);
        this.Body = new ModelRenderer(this, 24, 0);
        this.Body.setRotationPoint(0.0F, -17.0F, -3.5F);
        this.Body.addBox(-8.5F, 0.0F, 0.0F, 17, 19, 7, 0.0F);
        this.LeftTooth = new ModelRenderer(this, 0, 0);
        this.LeftTooth.setRotationPoint(1.5F, 4.0F, -4.9F);
        this.LeftTooth.addBox(-0.5F, -1.0F, 0.0F, 1, 1, 0, 0.0F);
        this.setRotateAngle(LeftTooth, 0.40980330836826856F, 0.0F, 0.0F);
        this.Club2.addChild(this.Club3);
        this.Body.addChild(this.LeftLeg);
        this.Body.addChild(this.LeftArm);
        this.Head.addChild(this.RightTooth);
        this.Club1.addChild(this.Club2);
        this.Body.addChild(this.RightLeg);
        this.Body.addChild(this.RightArm);
        this.RightArm.addChild(this.Club1);
        this.Club3.addChild(this.Club4);
        this.Body.addChild(this.Head);
        this.Head.addChild(this.LeftTooth);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Body.offsetX, this.Body.offsetY, this.Body.offsetZ);
        GlStateManager.translate(this.Body.rotationPointX * f5, this.Body.rotationPointY * f5, this.Body.rotationPointZ * f5);
        GlStateManager.scale(1.4D, 1.5D, 1.4D);
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
    	this.LeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.LeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
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
