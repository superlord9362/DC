package com.superlord.dungeoncraft.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * Kobold - superlord9362
 * Created using Tabula 5.0.0
 */
public class Kobold extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Head;
    public ModelRenderer RArm1;
    public ModelRenderer LArm1;
    public ModelRenderer Tail1;
    public ModelRenderer shape23;
    public ModelRenderer shape24;
    public ModelRenderer Snout;
    public ModelRenderer LHorn;
    public ModelRenderer RHorn;
    public ModelRenderer Tail2;
    public ModelRenderer LLeg1;
    public ModelRenderer LLeg2;
    public ModelRenderer LLeg3;
    public ModelRenderer RLeg1;
    public ModelRenderer RLeg2;
    public ModelRenderer RLeg3;

    public Kobold() {
        this.textureWidth = 200;
        this.textureHeight = 200;
        this.Body = new ModelRenderer(this, 19, 32);
        this.Body.setRotationPoint(0.0F, 11.3F, 0.0F);
        this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F);
        this.RLeg2 = new ModelRenderer(this, 0, 60);
        this.RLeg2.setRotationPoint(0.0F, 5.3F, -1.0F);
        this.RLeg2.addBox(-1.5F, 0.0F, -2.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(RLeg2, 1.0297442586766543F, 0.0F, 0.0F);
        this.shape23 = new ModelRenderer(this, 0, 0);
        this.shape23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape23.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape23, -0.296705972839036F, -0.03490658503988659F, 0.0F);
        this.LLeg3 = new ModelRenderer(this, 0, 71);
        this.LLeg3.setRotationPoint(-0.01F, 4.6F, 0.6F);
        this.LLeg3.addBox(-1.5F, 0.0F, -2.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(LLeg3, -0.7853981633974483F, 0.0F, 0.0F);
        this.shape24 = new ModelRenderer(this, 0, 0);
        this.shape24.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape24.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape24, -0.296705972839036F, 0.03490658503988659F, 0.0F);
        this.RLeg3 = new ModelRenderer(this, 0, 71);
        this.RLeg3.setRotationPoint(-0.01F, 4.6F, 0.6F);
        this.RLeg3.addBox(-1.5F, 0.0F, -2.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(RLeg3, -0.7853981633974483F, 0.0F, 0.0F);
        this.RArm1 = new ModelRenderer(this, 0, 32);
        this.RArm1.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.RArm1.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(RArm1, 0.0F, 0.0F, 0.10000736613927509F);
        this.Tail1 = new ModelRenderer(this, 80, 0);
        this.Tail1.setRotationPoint(0.0F, 8.0F, 0.8F);
        this.Tail1.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 9, 0.0F);
        this.setRotateAngle(Tail1, -0.6806784082777886F, 0.0F, 0.0F);
        this.RLeg1 = new ModelRenderer(this, 0, 48);
        this.RLeg1.setRotationPoint(-1.9F, 11.0F, 3.4F);
        this.RLeg1.addBox(-2.0F, 0.0F, -2.0F, 4, 7, 4, 0.0F);
        this.LLeg1 = new ModelRenderer(this, 0, 48);
        this.LLeg1.mirror = true;
        this.LLeg1.setRotationPoint(2.0F, 11.0F, 3.4F);
        this.LLeg1.addBox(-2.0F, 0.0F, -2.0F, 4, 7, 4, 0.0F);
        this.LArm1 = new ModelRenderer(this, 48, 32);
        this.LArm1.setRotationPoint(5.0F, 2.0F, -0.0F);
        this.LArm1.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(LArm1, 0.0F, 0.0F, -0.10000736613927509F);
        this.RHorn = new ModelRenderer(this, 0, 20);
        this.RHorn.setRotationPoint(-3.0F, -6.0F, 2.0F);
        this.RHorn.addBox(-1.0F, -6.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(RHorn, -0.6541494036474746F, 0.0F, -0.4553564018453205F);
        this.LLeg2 = new ModelRenderer(this, 0, 60);
        this.LLeg2.setRotationPoint(0.0F, 5.3F, -1.0F);
        this.LLeg2.addBox(-1.5F, 0.0F, -2.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(LLeg2, 1.0297442586766543F, 0.0F, 0.0F);
        this.LHorn = new ModelRenderer(this, 0, 20);
        this.LHorn.setRotationPoint(3.0F, -6.0F, 2.0F);
        this.LHorn.addBox(-1.0F, -6.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(LHorn, -0.6541494036474746F, 0.0F, 0.4553564018453205F);
        this.Snout = new ModelRenderer(this, 0, 0);
        this.Snout.setRotationPoint(0.0F, -4.0F, -4.0F);
        this.Snout.addBox(-2.0F, -1.0F, -4.5F, 4, 4, 5, 0.0F);
        this.setRotateAngle(Snout, 0.07714355293814937F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 32, 0);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.Tail2 = new ModelRenderer(this, 100, 4);
        this.Tail2.setRotationPoint(0.0F, 0.2F, 8.5F);
        this.Tail2.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 11, 0.0F);
        this.setRotateAngle(Tail2, 0.3810053757103621F, 0.0F, 0.0F);
        this.RLeg1.addChild(this.RLeg2);
        this.Body.addChild(this.shape23);
        this.LLeg2.addChild(this.LLeg3);
        this.Body.addChild(this.shape24);
        this.RLeg2.addChild(this.RLeg3);
        this.Body.addChild(this.RArm1);
        this.Body.addChild(this.Tail1);
        this.shape24.addChild(this.RLeg1);
        this.shape23.addChild(this.LLeg1);
        this.Body.addChild(this.LArm1);
        this.Head.addChild(this.RHorn);
        this.LLeg1.addChild(this.LLeg2);
        this.Head.addChild(this.LHorn);
        this.Head.addChild(this.Snout);
        this.Body.addChild(this.Head);
        this.Tail1.addChild(this.Tail2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Body.offsetX, this.Body.offsetY, this.Body.offsetZ);
        GlStateManager.translate(this.Body.rotationPointX * f5, this.Body.rotationPointY * f5, this.Body.rotationPointZ * f5);
        GlStateManager.scale(0.5D, 0.5D, 0.5D);
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
