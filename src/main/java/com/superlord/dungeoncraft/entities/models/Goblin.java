package com.superlord.dungeoncraft.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * Goblin - superlord9362
 * Created using Tabula 5.0.0
 */
public class Goblin extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Head;
    public ModelRenderer LLeg1;
    public ModelRenderer LArm1;
    public ModelRenderer RArm1;
    public ModelRenderer RLeg1;
    public ModelRenderer LEar1;
    public ModelRenderer LEar1_1;
    public ModelRenderer Nose;
    public ModelRenderer LEar1_2;
    public ModelRenderer LEar1_3;
    public ModelRenderer LLeg2;
    public ModelRenderer LArm2;
    public ModelRenderer RArm2;
    public ModelRenderer RLeg2;

    public Goblin() {
        this.textureWidth = 200;
        this.textureHeight = 200;
        this.LLeg1 = new ModelRenderer(this, 50, 0);
        this.LLeg1.setRotationPoint(-1.9F, 10.0F, 0.1F);
        this.LLeg1.addBox(-2.0F, 0.0F, -2.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(LLeg1, 0.0F, 0.0F, 0.005235987755982988F);
        this.RArm1 = new ModelRenderer(this, 82, 0);
        this.RArm1.setRotationPoint(5.0F, 2.0F, -0.0F);
        this.RArm1.addBox(-1.0F, -2.0F, -2.0F, 4, 5, 4, 0.0F);
        this.setRotateAngle(RArm1, 0.0F, 0.0F, -0.10000736613927509F);
        this.LArm1 = new ModelRenderer(this, 66, 0);
        this.LArm1.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.LArm1.addBox(-3.0F, -2.0F, -2.0F, 4, 5, 4, 0.0F);
        this.setRotateAngle(LArm1, 0.0F, 0.0F, 0.10000736613927509F);
        this.LEar1 = new ModelRenderer(this, 114, 0);
        this.LEar1.setRotationPoint(-2.5F, -4.0F, -1.0F);
        this.LEar1.addBox(0.0F, -1.5F, 0.0F, 1, 3, 4, 0.0F);
        this.setRotateAngle(LEar1, 0.3490658503988659F, -0.6806784082777886F, 0.0F);
        this.RArm2 = new ModelRenderer(this, 182, 0);
        this.RArm2.setRotationPoint(1.0F, 3.0F, 0.0F);
        this.RArm2.addBox(-2.0F, 0.0F, -2.0F, 4, 5, 4, 0.0F);
        this.LEar1_3 = new ModelRenderer(this, 142, 0);
        this.LEar1_3.setRotationPoint(0.0F, 1.6F, 4.0F);
        this.LEar1_3.addBox(0.0F, -3.0F, 0.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(LEar1_3, 0.2792526803190927F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 24, 0);
        this.Head.setRotationPoint(-0.5F, 1.0F, 0.0F);
        this.Head.addBox(-3.0F, -8.0F, -3.0F, 7, 7, 6, 0.0F);
        this.RLeg1 = new ModelRenderer(this, 98, 0);
        this.RLeg1.setRotationPoint(1.9F, 10.0F, 0.1F);
        this.RLeg1.addBox(-2.0F, 0.0F, -2.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(RLeg1, -0.0F, 0.0F, -0.005235987755982988F);
        this.Nose = new ModelRenderer(this, 20, 0);
        this.Nose.setRotationPoint(0.5F, -3.7F, -3.0F);
        this.Nose.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(Nose, -0.5235987755982988F, 0.0F, 0.0F);
        this.LEar1_1 = new ModelRenderer(this, 124, 0);
        this.LEar1_1.setRotationPoint(2.5F, -4.0F, -1.0F);
        this.LEar1_1.addBox(0.0F, -1.5F, 0.0F, 1, 3, 4, 0.0F);
        this.setRotateAngle(LEar1_1, 0.3490658503988659F, 0.6806784082777886F, 0.0F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, 13.0F, 0.0F);
        this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 10, 4, 0.0F);
        this.LLeg2 = new ModelRenderer(this, 150, 0);
        this.LLeg2.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.LLeg2.addBox(-2.0F, 0.0F, -2.0F, 4, 5, 4, 0.0F);
        this.setRotateAngle(LLeg2, 0.0F, 0.0F, 0.005235987755982988F);
        this.RLeg2 = new ModelRenderer(this, 130, 5);
        this.RLeg2.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.RLeg2.addBox(-2.0F, 0.0F, -2.0F, 4, 5, 4, 0.0F);
        this.setRotateAngle(RLeg2, 0.0F, 0.0F, -0.005235987755982988F);
        this.LEar1_2 = new ModelRenderer(this, 134, 0);
        this.LEar1_2.setRotationPoint(0.01F, 1.6F, 4.0F);
        this.LEar1_2.addBox(0.0F, -3.0F, 0.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(LEar1_2, 0.2792526803190927F, 0.0F, 0.0F);
        this.LArm2 = new ModelRenderer(this, 166, 0);
        this.LArm2.setRotationPoint(-1.0F, 3.0F, 0.0F);
        this.LArm2.addBox(-2.0F, 0.0F, -2.0F, 4, 5, 4, 0.0F);
        this.Body.addChild(this.LLeg1);
        this.Body.addChild(this.RArm1);
        this.Body.addChild(this.LArm1);
        this.Head.addChild(this.LEar1);
        this.RArm1.addChild(this.RArm2);
        this.LEar1_1.addChild(this.LEar1_3);
        this.Body.addChild(this.Head);
        this.Body.addChild(this.RLeg1);
        this.Head.addChild(this.Nose);
        this.Head.addChild(this.LEar1_1);
        this.LLeg1.addChild(this.LLeg2);
        this.RLeg1.addChild(this.RLeg2);
        this.LEar1.addChild(this.LEar1_2);
        this.LArm1.addChild(this.LArm2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Body.offsetX, this.Body.offsetY, this.Body.offsetZ);
        GlStateManager.translate(this.Body.rotationPointX * f5, this.Body.rotationPointY * f5, this.Body.rotationPointZ * f5);
        GlStateManager.scale(0.6D, 0.6D, 0.6D);
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
    	this.LLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.LArm1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RArm1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
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
