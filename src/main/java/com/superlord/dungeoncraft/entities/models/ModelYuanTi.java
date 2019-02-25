package com.superlord.dungeoncraft.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelYuanTi - CodaBear1552
 * Created using Tabula 5.1.0
 */
public class ModelYuanTi extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Tail1;
    public ModelRenderer Head;
    public ModelRenderer RArm;
    public ModelRenderer LArm;
    public ModelRenderer Tail2;
    public ModelRenderer Tail3;

    public ModelYuanTi() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Head = new ModelRenderer(this, 0, 17);
        this.Head.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.Head.addBox(-3.5F, -6.0F, -6.0F, 7, 6, 9, 0.0F);
        this.setRotateAngle(Head, 0.13962634015954636F, 0.0F, 0.0F);
        this.LArm = new ModelRenderer(this, 44, 31);
        this.LArm.mirror = true;
        this.LArm.setRotationPoint(5.1F, 2.0F, 0.5F);
        this.LArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(LArm, 0.0F, 0.0F, -0.10000736613927509F);
        this.Tail1 = new ModelRenderer(this, 26, 0);
        this.Tail1.setRotationPoint(0.0F, 10.6F, 0.4F);
        this.Tail1.addBox(-4.0F, 0.0F, -3.0F, 8, 13, 6, 0.0F);
        this.setRotateAngle(Tail1, 0.5235987755982988F, 0.0F, 0.0F);
        this.Tail2 = new ModelRenderer(this, 0, 32);
        this.Tail2.setRotationPoint(0.0F, 10.4F, -1.5F);
        this.Tail2.addBox(-3.5F, 0.0F, -3.0F, 7, 13, 6, 0.0F);
        this.setRotateAngle(Tail2, 1.0471975511965976F, 0.0F, 0.0F);
        this.Tail3 = new ModelRenderer(this, 26, 42);
        this.Tail3.setRotationPoint(0.0F, 12.0F, -0.48F);
        this.Tail3.addBox(-3.0F, 0.0F, -2.5F, 6, 13, 5, 0.0F);
        this.RArm = new ModelRenderer(this, 44, 31);
        this.RArm.setRotationPoint(-5.0F, 2.0F, 0.5F);
        this.RArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(RArm, 0.0F, 0.0F, 0.10000736613927509F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 5, 0.25F);
        this.Body.addChild(this.Head);
        this.Body.addChild(this.LArm);
        this.Body.addChild(this.Tail1);
        this.Tail1.addChild(this.Tail2);
        this.Tail2.addChild(this.Tail3);
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
