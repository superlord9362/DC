package com.superlord.dungeoncraft.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * ModelDemogorgon - superlord9362
 * Created using Tabula 5.0.0
 */
public class ModelDemogorgon extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer LHead;
    public ModelRenderer RArm;
    public ModelRenderer LArm;
    public ModelRenderer shape23;
    public ModelRenderer shape23_1;
    public ModelRenderer RHead;
    public ModelRenderer Tail1;
    public ModelRenderer LMaw;
    public ModelRenderer RArm2;
    public ModelRenderer LArm2;
    public ModelRenderer RLeg1;
    public ModelRenderer RLeg2;
    public ModelRenderer RLeg3;
    public ModelRenderer LLeg1;
    public ModelRenderer LLeg2;
    public ModelRenderer LLeg3;
    public ModelRenderer RMaw;
    public ModelRenderer Tail2;

    public ModelDemogorgon() {
        this.textureWidth = 200;
        this.textureHeight = 200;
        this.LArm2 = new ModelRenderer(this, 48, 67);
        this.LArm2.setRotationPoint(2.0F, 0.0F, -0.0F);
        this.LArm2.addBox(-1.0F, -2.0F, -2.0F, 2, 25, 4, 0.0F);
        this.setRotateAngle(LArm2, 0.0F, 0.0F, -0.10000736613927509F);
        this.RArm2 = new ModelRenderer(this, 40, 32);
        this.RArm2.setRotationPoint(-2.0F, -0.2F, 0.0F);
        this.RArm2.addBox(-1.0F, -2.0F, -2.0F, 2, 25, 4, 0.0F);
        this.setRotateAngle(RArm2, 0.0F, 0.0F, 0.10000736613927509F);
        this.shape23 = new ModelRenderer(this, 0, 0);
        this.shape23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape23.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape23, -0.296705972839036F, 0.0F, 0.0F);
        this.RHead = new ModelRenderer(this, 32, 0);
        this.RHead.setRotationPoint(4.0F, -3.0F, -1.0F);
        this.RHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.RLeg3 = new ModelRenderer(this, 0, 71);
        this.RLeg3.setRotationPoint(-0.01F, 7.6F, 0.6F);
        this.RLeg3.addBox(-1.5F, 0.0F, -2.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(RLeg3, -0.7504915783575618F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 6, 24);
        this.Body.setRotationPoint(0.0F, -42.5F, 0.0F);
        this.Body.addBox(-6.0F, -4.0F, -2.0F, 11, 16, 4, 0.25F);
        this.LHead = new ModelRenderer(this, 32, 0);
        this.LHead.setRotationPoint(-5.0F, -3.0F, -1.0F);
        this.LHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.LLeg3 = new ModelRenderer(this, 0, 71);
        this.LLeg3.setRotationPoint(0.02F, 7.6F, 0.6F);
        this.LLeg3.addBox(-1.5F, 0.0F, -2.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(LLeg3, -0.7504915783575618F, 0.0F, 0.0F);
        this.Tail2 = new ModelRenderer(this, 65, 46);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.Tail2.addBox(-2.0F, -3.0F, 0.0F, 3, 4, 16, 0.0F);
        this.setRotateAngle(Tail2, 0.5009094953223726F, 0.0F, 0.0F);
        this.LMaw = new ModelRenderer(this, 70, 0);
        this.LMaw.setRotationPoint(0.0F, -3.0F, -4.0F);
        this.LMaw.addBox(-2.5F, -2.0F, -3.0F, 5, 5, 4, 0.0F);
        this.setRotateAngle(LMaw, 0.22759093446006054F, 0.0F, 0.0F);
        this.RArm = new ModelRenderer(this, 40, 32);
        this.RArm.setRotationPoint(-7.0F, -2.0F, 0.0F);
        this.RArm.addBox(-1.0F, -2.0F, -2.0F, 2, 25, 4, 0.0F);
        this.setRotateAngle(RArm, 0.0F, 0.0F, 0.10000736613927509F);
        this.RLeg2 = new ModelRenderer(this, 0, 91);
        this.RLeg2.setRotationPoint(0.0F, 9.3F, -1.0F);
        this.RLeg2.addBox(-1.5F, 0.0F, -2.0F, 4, 9, 4, 0.0F);
        this.setRotateAngle(RLeg2, 1.0297442586766543F, 0.0F, 0.0F);
        this.RMaw = new ModelRenderer(this, 70, 0);
        this.RMaw.setRotationPoint(0.0F, -3.0F, -4.0F);
        this.RMaw.addBox(-2.5F, -2.0F, -3.0F, 5, 5, 4, 0.0F);
        this.setRotateAngle(RMaw, 0.22759093446006054F, 0.0F, 0.0F);
        this.LArm = new ModelRenderer(this, 48, 67);
        this.LArm.setRotationPoint(6.0F, -2.0F, -0.0F);
        this.LArm.addBox(-1.0F, -2.0F, -2.0F, 2, 25, 4, 0.0F);
        this.setRotateAngle(LArm, 0.0F, 0.0F, -0.10000736613927509F);
        this.Tail1 = new ModelRenderer(this, 0, 0);
        this.Tail1.setRotationPoint(0.0F, 11.0F, 2.0F);
        this.Tail1.addBox(-3.0F, -4.0F, -5.0F, 5, 5, 16, 0.0F);
        this.setRotateAngle(Tail1, -0.8651597102135892F, 0.0F, 0.0F);
        this.RLeg1 = new ModelRenderer(this, 0, 48);
        this.RLeg1.mirror = true;
        this.RLeg1.setRotationPoint(2.0F, 11.0F, 3.4F);
        this.RLeg1.addBox(-2.0F, 0.0F, -2.0F, 5, 11, 4, 0.0F);
        this.shape23_1 = new ModelRenderer(this, 0, 0);
        this.shape23_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape23_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape23_1, -0.296705972839036F, 0.0F, 0.0F);
        this.LLeg2 = new ModelRenderer(this, 0, 91);
        this.LLeg2.setRotationPoint(0.0F, 9.3F, -1.0F);
        this.LLeg2.addBox(-1.5F, 0.0F, -2.0F, 4, 9, 4, 0.0F);
        this.setRotateAngle(LLeg2, 1.0297442586766543F, 0.0F, 0.0F);
        this.LLeg1 = new ModelRenderer(this, 0, 48);
        this.LLeg1.mirror = true;
        this.LLeg1.setRotationPoint(-4.0F, 11.0F, 3.4F);
        this.LLeg1.addBox(-2.0F, 0.0F, -2.0F, 5, 11, 4, 0.0F);
        this.LArm.addChild(this.LArm2);
        this.RArm.addChild(this.RArm2);
        this.Body.addChild(this.shape23);
        this.Body.addChild(this.RHead);
        this.RLeg2.addChild(this.RLeg3);
        this.Body.addChild(this.LHead);
        this.LLeg2.addChild(this.LLeg3);
        this.Tail1.addChild(this.Tail2);
        this.LHead.addChild(this.LMaw);
        this.Body.addChild(this.RArm);
        this.RLeg1.addChild(this.RLeg2);
        this.RHead.addChild(this.RMaw);
        this.Body.addChild(this.LArm);
        this.Body.addChild(this.Tail1);
        this.shape23.addChild(this.RLeg1);
        this.Body.addChild(this.shape23_1);
        this.LLeg1.addChild(this.LLeg2);
        this.shape23_1.addChild(this.LLeg1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Body.offsetX, this.Body.offsetY, this.Body.offsetZ);
        GlStateManager.translate(this.Body.rotationPointX * f5, this.Body.rotationPointY * f5, this.Body.rotationPointZ * f5);
        GlStateManager.scale(2.0D, 2.0D, 2.0D);
        GlStateManager.translate(-this.Body.offsetX, -this.Body.offsetY, -this.Body.offsetZ);
        GlStateManager.translate(-this.Body.rotationPointX * f5, -this.Body.rotationPointY * f5, -this.Body.rotationPointZ * f5);
        this.Body.render(f5);
        GlStateManager.popMatrix();
    }
    
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
    	float XAngle = headPitch / 57.29578F;
    	float YAngle = netHeadYaw / 57.29578F;
    	this.LHead.rotateAngleX= (0.2617794F + XAngle);
    	this.LHead.rotateAngleY= YAngle;
    	this.RHead.rotateAngleX= (0.2617794F + XAngle);
    	this.RHead.rotateAngleY= YAngle;
    	this.LLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.LArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
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
