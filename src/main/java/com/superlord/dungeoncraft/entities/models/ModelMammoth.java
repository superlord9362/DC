package com.superlord.dungeoncraft.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * ModelMammoth - me
 * Created using Tabula 5.0.0
 */
public class ModelMammoth extends ModelBase {
    public ModelRenderer Body1;
    public ModelRenderer RightArm;
    public ModelRenderer RightArm_1;
    public ModelRenderer LeftArm;
    public ModelRenderer LeftLeg;
    public ModelRenderer Tail;
    public ModelRenderer Body2;
    public ModelRenderer Head1;
    public ModelRenderer Trunk;
    public ModelRenderer Tusks;
    public ModelRenderer Head2;
    protected float childYOffset = 8.0F;
    protected float childZOffset = 4.0F;

    public ModelMammoth() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Body2 = new ModelRenderer(this, 0, 64);
        this.Body2.setRotationPoint(-6.0F, -9.0F, -11.0F);
        this.Body2.addBox(0.0F, 0.0F, 0.0F, 11, 16, 22, 0.0F);
        this.Head1 = new ModelRenderer(this, 54, 0);
        this.Head1.setRotationPoint(-5.0F, -5.0F, -12.0F);
        this.Head1.addBox(0.5F, -6.5F, -7.0F, 9, 14, 7, 0.0F);
        this.RightArm = new ModelRenderer(this, 94, 0);
        this.RightArm.setRotationPoint(-3.0F, 7.0F, -7.0F);
        this.RightArm.addBox(-3.0F, 0.0F, -3.0F, 5, 13, 6, 0.0F);
        this.Tail = new ModelRenderer(this, 86, 0);
        this.Tail.setRotationPoint(0.0F, -4.0F, 12.0F);
        this.Tail.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(Tail, 0.17453292519943295F, 0.0F, 0.0F);
        this.Tusks = new ModelRenderer(this, 74, 32);
        this.Tusks.setRotationPoint(5.5F, 5.5F, -4.0F);
        this.Tusks.addBox(-5.0F, 0.0F, -17.0F, 9, 15, 17, 0.0F);
        this.Head2 = new ModelRenderer(this, 26, 0);
        this.Head2.setRotationPoint(0.5F, 1.0F, 0.5F);
        this.Head2.addBox(0.5F, -6.5F, -7.0F, 8, 12, 6, 0.0F);
        this.LeftLeg = new ModelRenderer(this, 94, 0);
        this.LeftLeg.setRotationPoint(4.0F, 7.0F, 8.0F);
        this.LeftLeg.addBox(-3.0F, 0.0F, -3.0F, 5, 13, 6, 0.0F);
        this.Body1 = new ModelRenderer(this, 0, 20);
        this.Body1.setRotationPoint(0.0F, -25.0F, 0.0F);
        this.Body1.addBox(-6.5F, -10.0F, -12.0F, 13, 20, 24, 0.0F);
        this.RightArm_1 = new ModelRenderer(this, 94, 0);
        this.RightArm_1.setRotationPoint(-3.0F, 7.0F, 8.0F);
        this.RightArm_1.addBox(-3.0F, 0.0F, -3.0F, 5, 13, 6, 0.0F);
        this.Trunk = new ModelRenderer(this, 116, 0);
        this.Trunk.setRotationPoint(5.0F, 0.0F, -7.0F);
        this.Trunk.addBox(-1.5F, 0.0F, -1.5F, 3, 18, 3, 0.0F);
        this.LeftArm = new ModelRenderer(this, 94, 0);
        this.LeftArm.setRotationPoint(4.0F, 7.0F, -7.0F);
        this.LeftArm.addBox(-3.0F, 0.0F, -3.0F, 5, 13, 6, 0.0F);
        this.Body1.addChild(this.Body2);
        this.Body1.addChild(this.Head1);
        this.Body1.addChild(this.RightArm);
        this.Body1.addChild(this.Tail);
        this.Head1.addChild(this.Tusks);
        this.Head1.addChild(this.Head2);
        this.Body1.addChild(this.LeftLeg);
        this.Body1.addChild(this.RightArm_1);
        this.Head1.addChild(this.Trunk);
        this.Body1.addChild(this.LeftArm);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	if (this.isChild)
        {
            float f6 = 2.0F;
            GlStateManager.pushMatrix();
            GlStateManager.translate(0.0F, this.childYOffset * f5, this.childZOffset * f5);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            GlStateManager.scale(0.5F, 0.5F, 0.5F);
            GlStateManager.translate(0.0F, 50.0F * f5, 0.0F);
            this.Body1.render(f5);
            GlStateManager.popMatrix();
        } else {
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Body1.offsetX, this.Body1.offsetY, this.Body1.offsetZ);
        GlStateManager.translate(this.Body1.rotationPointX * f5, this.Body1.rotationPointY * f5, this.Body1.rotationPointZ * f5);
        GlStateManager.scale(2.5D, 2.5D, 2.5D);
        GlStateManager.translate(-this.Body1.offsetX, -this.Body1.offsetY, -this.Body1.offsetZ);
        GlStateManager.translate(-this.Body1.rotationPointX * f5, -this.Body1.rotationPointY * f5, -this.Body1.rotationPointZ * f5);
        this.Body1.render(f5);
        GlStateManager.popMatrix();
        }
    }

    
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
    	float XAngle = headPitch / 57.29578F;
    	float YAngle = netHeadYaw / 57.29578F;
    	this.Head1.rotateAngleX= (0.2617794F + XAngle);
    	this.Head1.rotateAngleY= YAngle;
    	this.LeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RightArm_1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
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
