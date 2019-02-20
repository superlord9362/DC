package com.superlord.dungeoncraft.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelVampire - JJo
 * Created using Tabula 5.0.0
 */
public class ModelVampire extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Head;
    public ModelRenderer RightArm;
    public ModelRenderer LeftArm;
    public ModelRenderer RightLeg;
    public ModelRenderer LeftLeg;
    public ModelRenderer BreastsFemale;
    public ModelRenderer Cloak;
    public ModelRenderer RightTooth;
    public ModelRenderer LeftTooth;
    public ModelRenderer RightArmFemale;
    public ModelRenderer LeftArmFemale;

    public ModelVampire() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.RightArmFemale = new ModelRenderer(this, 41, 0);
        this.RightArmFemale.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightArmFemale.addBox(-2.0F, -2.0F, -2.0F, 3, 12, 4, 0.0F);
        this.LeftTooth = new ModelRenderer(this, 0, 0);
        this.LeftTooth.setRotationPoint(0.75F, -2.5F, -3.8F);
        this.LeftTooth.addBox(0.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F);
        this.setRotateAngle(LeftTooth, -0.136659280431156F, 0.136659280431156F, 0.7853981633974483F);
        this.BreastsFemale = new ModelRenderer(this, 24, 0);
        this.BreastsFemale.setRotationPoint(0.0F, 2.0F, -1.9F);
        this.BreastsFemale.addBox(-3.0F, 0.0F, 0.0F, 6, 3, 2, 0.0F);
        this.setRotateAngle(BreastsFemale, -0.40980330836826856F, 0.0F, 0.0F);
        this.LeftArm = new ModelRenderer(this, 40, 16);
        this.LeftArm.mirror = true;
        this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.LeftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.LeftLeg = new ModelRenderer(this, 0, 16);
        this.LeftLeg.mirror = true;
        this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
        this.LeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.Cloak = new ModelRenderer(this, 0, 32);
        this.Cloak.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Cloak.addBox(-5.5F, 0.0F, 0.0F, 11, 19, 1, 0.0F);
        this.setRotateAngle(Cloak, 0.045553093477052F, 0.0F, 0.0F);
        this.LeftArmFemale = new ModelRenderer(this, 41, 0);
        this.LeftArmFemale.mirror = true;
        this.LeftArmFemale.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftArmFemale.addBox(-1.0F, -2.0F, -2.0F, 3, 12, 4, 0.0F);
        this.Body = new ModelRenderer(this, 16, 16);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.RightArm = new ModelRenderer(this, 40, 16);
        this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.RightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.RightTooth = new ModelRenderer(this, 0, 0);
        this.RightTooth.setRotationPoint(-0.75F, -2.5F, -3.8F);
        this.RightTooth.addBox(0.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F);
        this.setRotateAngle(RightTooth, -0.136659280431156F, 0.136659280431156F, 0.7853981633974483F);
        this.RightLeg = new ModelRenderer(this, 0, 16);
        this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
        this.RightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.RightArm.addChild(this.RightArmFemale);
        this.Head.addChild(this.LeftTooth);
        this.Body.addChild(this.BreastsFemale);
        this.Body.addChild(this.LeftArm);
        this.Body.addChild(this.LeftLeg);
        this.Body.addChild(this.Cloak);
        this.LeftArm.addChild(this.LeftArmFemale);
        this.Body.addChild(this.Head);
        this.Body.addChild(this.RightArm);
        this.Head.addChild(this.RightTooth);
        this.Body.addChild(this.RightLeg);
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
