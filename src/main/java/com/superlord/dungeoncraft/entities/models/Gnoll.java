package com.superlord.dungeoncraft.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Gnoll - superlord9362
 * Created using Tabula 5.0.0
 */
public class Gnoll extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Head;
    public ModelRenderer RArm;
    public ModelRenderer LArm;
    public ModelRenderer shape11;
    public ModelRenderer shape12;
    public ModelRenderer Snout;
    public ModelRenderer REar;
    public ModelRenderer LEar;
    public ModelRenderer RLeg;
    public ModelRenderer LLeg;

    public Gnoll() {
        this.textureWidth = 200;
        this.textureHeight = 200;
        this.Body = new ModelRenderer(this, 16, 32);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F);
        this.shape11 = new ModelRenderer(this, 0, 0);
        this.shape11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape11.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape11, 0.0F, 1.5707963267948966F, 0.0F);
        this.shape12 = new ModelRenderer(this, 0, 0);
        this.shape12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape12.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape12, 0.0F, -1.5707963267948966F, 0.0F);
        this.Snout = new ModelRenderer(this, 0, 0);
        this.Snout.setRotationPoint(0.0F, -4.0F, -4.0F);
        this.Snout.addBox(-2.5F, -2.0F, -5.0F, 5, 5, 6, 0.0F);
        this.setRotateAngle(Snout, 0.045553093477052F, 0.0F, 0.0F);
        this.LEar = new ModelRenderer(this, 0, 0);
        this.LEar.setRotationPoint(-3.0F, -7.0F, 0.0F);
        this.LEar.addBox(-1.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(LEar, 0.0F, 0.0F, -0.18203784098300857F);
        this.RLeg = new ModelRenderer(this, 0, 32);
        this.RLeg.mirror = true;
        this.RLeg.setRotationPoint(-1.9F, 12.0F, 0.1F);
        this.RLeg.addBox(0.0F, 0.0F, -4.0F, 4, 12, 4, 0.0F);
        this.LArm = new ModelRenderer(this, 48, 32);
        this.LArm.setRotationPoint(5.0F, 2.0F, -0.0F);
        this.LArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(LArm, 0.0F, 0.0F, -0.10000736613927509F);
        this.RArm = new ModelRenderer(this, 40, 32);
        this.RArm.mirror = true;
        this.RArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.RArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(RArm, 0.0F, 0.0F, 0.10000736613927509F);
        this.REar = new ModelRenderer(this, 0, 0);
        this.REar.setRotationPoint(3.0F, -7.0F, 0.0F);
        this.REar.addBox(-1.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(REar, 0.0F, 0.0F, 0.18203784098300857F);
        this.Head = new ModelRenderer(this, 32, 0);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.LLeg = new ModelRenderer(this, 0, 32);
        this.LLeg.setRotationPoint(1.9F, 12.0F, 0.1F);
        this.LLeg.addBox(-4.0F, 0.0F, -4.0F, 4, 12, 4, 0.0F);
        this.Body.addChild(this.shape11);
        this.Body.addChild(this.shape12);
        this.Head.addChild(this.Snout);
        this.Head.addChild(this.LEar);
        this.shape11.addChild(this.RLeg);
        this.Body.addChild(this.LArm);
        this.Body.addChild(this.RArm);
        this.Head.addChild(this.REar);
        this.Body.addChild(this.Head);
        this.shape12.addChild(this.LLeg);
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
