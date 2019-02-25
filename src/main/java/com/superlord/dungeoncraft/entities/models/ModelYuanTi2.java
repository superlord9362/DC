package com.superlord.dungeoncraft.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelYuanTi2 - CodaBear1552
 * Created using Tabula 5.1.0
 */
public class ModelYuanTi2 extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer LLeg;
    public ModelRenderer RLeg;
    public ModelRenderer RArm;
    public ModelRenderer LArm;
    public ModelRenderer Head;

    public ModelYuanTi2() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Head = new ModelRenderer(this, 0, 17);
        this.Head.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.Head.addBox(-3.5F, -6.0F, -6.0F, 7, 6, 9, 0.0F);
        this.setRotateAngle(Head, 0.13962634015954636F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 16, 32);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F);
        this.LArm = new ModelRenderer(this, 48, 48);
        this.LArm.mirror = true;
        this.LArm.setRotationPoint(5.0F, 2.0F, -0.0F);
        this.LArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(LArm, 0.0F, 0.0F, -0.10000736613927509F);
        this.LLeg = new ModelRenderer(this, 0, 48);
        this.LLeg.setRotationPoint(1.9F, 12.0F, 0.1F);
        this.LLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.RLeg = new ModelRenderer(this, 0, 32);
        this.RLeg.setRotationPoint(-1.9F, 12.0F, 0.1F);
        this.RLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.RArm = new ModelRenderer(this, 40, 32);
        this.RArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.RArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(RArm, 0.0F, 0.0F, 0.10000736613927509F);
        this.Body.addChild(this.Head);
        this.Body.addChild(this.LArm);
        this.Body.addChild(this.LLeg);
        this.Body.addChild(this.RLeg);
        this.Body.addChild(this.RArm);
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
