package com.superlord.dungeoncraft.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelVillager - Either Mojang or a mod author
 * Created using Tabula 5.0.0
 */
public class ModelVillager extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer RLeg;
    public ModelRenderer LLeg;
    public ModelRenderer RArm;
    public ModelRenderer LArm;
    public ModelRenderer Head;
    public ModelRenderer Nose;

    public ModelVillager() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Body = new ModelRenderer(this, 0, 38);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addBox(-4.0F, 0.0F, -3.0F, 8, 18, 6, 0.5F);
        this.RArm = new ModelRenderer(this, 44, 22);
        this.RArm.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.RArm.addBox(4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.LArm = new ModelRenderer(this, 44, 22);
        this.LArm.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.LArm.addBox(-8.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.LLeg = new ModelRenderer(this, 0, 22);
        this.LLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
        this.LLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.RLeg = new ModelRenderer(this, 0, 22);
        this.RLeg.mirror = true;
        this.RLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
        this.RLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.Nose = new ModelRenderer(this, 24, 0);
        this.Nose.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.Nose.addBox(-1.0F, -1.0F, -6.0F, 2, 4, 2, 0.0F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addBox(-4.0F, -10.0F, -4.0F, 8, 10, 8, 0.0F);
        this.Body.addChild(this.RArm);
        this.Body.addChild(this.LArm);
        this.Body.addChild(this.LLeg);
        this.Body.addChild(this.RLeg);
        this.Head.addChild(this.Nose);
        this.Body.addChild(this.Head);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Body.render(f5);
    }

    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
    	float XAngle = headPitch / 57.29578F;
    	float YAngle = netHeadYaw / 57.29578F;
    	this.Head.rotateAngleX= (0.2617794F + XAngle);
    	this.Head.rotateAngleY= YAngle;
    	this.LLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
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
