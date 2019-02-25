package com.superlord.dungeoncraft.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * ModelDeer - CodaBear1552
 * Created using Tabula 5.1.0
 */
public class ModelDeer extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer LLeg1;
    public ModelRenderer LLeg2_1;
    public ModelRenderer RLeg2_1;
    public ModelRenderer RLeg1;
    public ModelRenderer Tail;
    public ModelRenderer Neck;
    public ModelRenderer LLeg2_2;
    public ModelRenderer RLeg2_2;
    public ModelRenderer shape21;
    public ModelRenderer Head;
    public ModelRenderer Snout;
    public ModelRenderer LAntler;
    public ModelRenderer RAntler;
    public ModelRenderer LEar;
    public ModelRenderer REar;
    protected float childYOffset = 8.0F;
    protected float childZOffset = 4.0F;

    public ModelDeer() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.shape21 = new ModelRenderer(this, 0, 0);
        this.shape21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape21.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape21, -0.2617993877991494F, 0.0F, 0.0F);
        this.LEar = new ModelRenderer(this, 0, 59);
        this.LEar.setRotationPoint(1.0F, -1.0F, -2.0F);
        this.LEar.addBox(0.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
        this.setRotateAngle(LEar, 0.0F, 0.0F, 0.5235987755982988F);
        this.LLeg1 = new ModelRenderer(this, 0, 0);
        this.LLeg1.setRotationPoint(3.0F, 3.0F, -5.0F);
        this.LLeg1.addBox(-1.5F, 0.0F, -2.0F, 3, 12, 4, 0.0F);
        this.RLeg2_2 = new ModelRenderer(this, 0, 28);
        this.RLeg2_2.setRotationPoint(0.0F, 5.0F, 1.7F);
        this.RLeg2_2.addBox(-1.5F, 0.0F, -2.5F, 3, 9, 4, 0.0F);
        this.LLeg2_1 = new ModelRenderer(this, 34, 0);
        this.LLeg2_1.setRotationPoint(3.0F, 1.0F, 5.5F);
        this.LLeg2_1.addBox(-2.0F, 0.0F, -2.5F, 4, 7, 5, 0.0F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, 6.0F, -2.0F);
        this.Body.addBox(-4.0F, -5.0F, -8.0F, 8, 10, 18, 0.0F);
        this.REar = new ModelRenderer(this, 0, 59);
        this.REar.setRotationPoint(-1.0F, -1.0F, -2.0F);
        this.REar.addBox(-2.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F);
        this.setRotateAngle(REar, 0.0F, 0.0F, -0.5235987755982988F);
        this.LLeg2_2 = new ModelRenderer(this, 0, 28);
        this.LLeg2_2.setRotationPoint(0.0F, 5.0F, 1.7F);
        this.LLeg2_2.addBox(-1.5F, 0.0F, -2.5F, 3, 9, 4, 0.0F);
        this.Snout = new ModelRenderer(this, 48, 8);
        this.Snout.setRotationPoint(0.0F, 0.4F, -6.0F);
        this.Snout.addBox(-1.5F, -2.0F, -4.0F, 3, 4, 4, 0.0F);
        this.LAntler = new ModelRenderer(this, 40, 40);
        this.LAntler.mirror = true;
        this.LAntler.setRotationPoint(2.0F, -1.0F, -2.0F);
        this.LAntler.addBox(0.0F, -10.0F, -5.0F, 0, 10, 10, 0.0F);
        this.setRotateAngle(LAntler, -0.17453292519943295F, 0.17453292519943295F, 0.0F);
        this.RLeg2_1 = new ModelRenderer(this, 34, 0);
        this.RLeg2_1.setRotationPoint(-3.0F, 1.0F, 5.5F);
        this.RLeg2_1.addBox(-2.0F, 0.0F, -2.5F, 4, 7, 5, 0.0F);
        this.RLeg1 = new ModelRenderer(this, 0, 0);
        this.RLeg1.setRotationPoint(-3.0F, 3.0F, -5.0F);
        this.RLeg1.addBox(-1.5F, 0.0F, -2.0F, 3, 12, 4, 0.0F);
        this.Neck = new ModelRenderer(this, 18, 28);
        this.Neck.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.Neck.addBox(-2.5F, -10.0F, -3.0F, 5, 10, 6, 0.0F);
        this.setRotateAngle(Neck, 0.2617993877991494F, 0.0F, 0.0F);
        this.Tail = new ModelRenderer(this, 47, 0);
        this.Tail.setRotationPoint(0.0F, -2.0F, 8.3F);
        this.Tail.addBox(-1.0F, -1.0F, 0.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(Tail, 0.2617993877991494F, 0.0F, 0.0F);
        this.RAntler = new ModelRenderer(this, 40, 40);
        this.RAntler.setRotationPoint(-2.0F, -1.0F, -2.0F);
        this.RAntler.addBox(0.0F, -10.0F, -5.0F, 0, 10, 10, 0.0F);
        this.setRotateAngle(RAntler, -0.17453292519943295F, -0.17453292519943295F, 0.0F);
        this.Head = new ModelRenderer(this, 7, 46);
        this.Head.setRotationPoint(0.0F, -10.0F, 0.3F);
        this.Head.addBox(-3.0F, -2.5F, -7.0F, 6, 5, 7, 0.0F);
        this.Neck.addChild(this.shape21);
        this.Head.addChild(this.LEar);
        this.Body.addChild(this.LLeg1);
        this.RLeg2_1.addChild(this.RLeg2_2);
        this.Body.addChild(this.LLeg2_1);
        this.Head.addChild(this.REar);
        this.LLeg2_1.addChild(this.LLeg2_2);
        this.Head.addChild(this.Snout);
        this.Head.addChild(this.LAntler);
        this.Body.addChild(this.RLeg2_1);
        this.Body.addChild(this.RLeg1);
        this.Body.addChild(this.Neck);
        this.Body.addChild(this.Tail);
        this.Head.addChild(this.RAntler);
        this.shape21.addChild(this.Head);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	if (this.isChild) {
            float f6 = 2.0F;
            GlStateManager.pushMatrix();
            GlStateManager.translate(0.0F, this.childYOffset * f5, this.childZOffset * f5);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            GlStateManager.scale(0.5F, 0.5F, 0.5F);
            GlStateManager.translate(0.0F, 28.0F * f5, 0.0F);
            this.Body.render(f5);
            GlStateManager.popMatrix();
        } else {
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Body.offsetX, this.Body.offsetY, this.Body.offsetZ);
        GlStateManager.translate(this.Body.rotationPointX * f5, this.Body.rotationPointY * f5, this.Body.rotationPointZ * f5);
        GlStateManager.scale(1.2D, 1.2D, 1.2D);
        GlStateManager.translate(-this.Body.offsetX, -this.Body.offsetY, -this.Body.offsetZ);
        GlStateManager.translate(-this.Body.rotationPointX * f5, -this.Body.rotationPointY * f5, -this.Body.rotationPointZ * f5);
        this.Body.render(f5);
        GlStateManager.popMatrix();
        }
    }
    
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
    	float XAngle = headPitch / 57.29578F;
    	float YAngle = netHeadYaw / 57.29578F;
    	this.Head.rotateAngleX= (0.2617794F + XAngle);
    	this.Head.rotateAngleY= YAngle;
    	this.LLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.RLeg2_1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.LLeg2_1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
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
