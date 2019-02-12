package com.superlord.dungeoncraft.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelShetlandPony - JJo
 * Created using Tabula 5.0.0
 */
public class ModelShetlandPony extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer RightThigh;
    public ModelRenderer LeftThigh;
    public ModelRenderer RightShoulder;
    public ModelRenderer LeftShoulder;
    public ModelRenderer Tail;
    public ModelRenderer NeckHorse;
    public ModelRenderer RightSaddleBag;
    public ModelRenderer LeftSaddleBag;
    public ModelRenderer Saddle1;
    public ModelRenderer BackRightLeg;
    public ModelRenderer BackLeftLeg;
    public ModelRenderer FrontRightLeg;
    public ModelRenderer FrontLeftLeg;
    public ModelRenderer TailHairHorse;
    public ModelRenderer Head;
    public ModelRenderer ManeHorse;
    public ModelRenderer Mouth;
    public ModelRenderer RightEarHorse;
    public ModelRenderer LeftEarHorse;
    public ModelRenderer Reigns1;
    public ModelRenderer Reigns2;
    public ModelRenderer Saddle2;
    public ModelRenderer Saddle3;
    public ModelRenderer Saddle5Left;
    public ModelRenderer Saddle5Right;
    public ModelRenderer Saddle6Left;
    public ModelRenderer Saddle6Right;

    public ModelShetlandPony() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Head = new ModelRenderer(this, 0, 57);
        this.Head.setRotationPoint(0.0F, -9.75F, 1.75F);
        this.Head.addBox(-3.0F, -2.0F, -4.2F, 6, 6, 8, 0.0F);
        this.LeftThigh = new ModelRenderer(this, 64, 0);
        this.LeftThigh.setRotationPoint(3.25F, 4.8F, 21.0F);
        this.LeftThigh.addBox(-1.5F, -1.5F, -2.5F, 4, 8, 5, 0.0F);
        this.LeftShoulder = new ModelRenderer(this, 64, 13);
        this.LeftShoulder.mirror = true;
        this.LeftShoulder.setRotationPoint(4.5F, 6.7F, 2.25F);
        this.LeftShoulder.addBox(-2.1F, -1.5F, -2.0F, 3, 6, 5, 0.0F);
        this.Saddle2 = new ModelRenderer(this, 100, 107);
        this.Saddle2.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Saddle2.addBox(-1.5F, -0.8F, -2.5F, 3, 1, 3, 0.0F);
        this.Reigns1 = new ModelRenderer(this, 68, 126);
        this.Reigns1.setRotationPoint(0.0F, 1.8F, -6.6F);
        this.Reigns1.addBox(-2.5F, 0.0F, 0.0F, 5, 1, 1, 0.0F);
        this.Saddle6Right = new ModelRenderer(this, 89, 105);
        this.Saddle6Right.setRotationPoint(0.05F, 6.75F, -0.5F);
        this.Saddle6Right.addBox(0.0F, 0.0F, -1.5F, 0, 3, 3, 0.0F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, 5.8F, -12.0F);
        this.Body.addBox(-5.0F, 0.0F, 0.0F, 10, 12, 24, 0.0F);
        this.Reigns2 = new ModelRenderer(this, 28, 113);
        this.Reigns2.setRotationPoint(0.0F, -0.1F, 0.0F);
        this.Reigns2.addBox(-3.0F, 0.0F, 0.5F, 6, 1, 14, 0.0F);
        this.setRotateAngle(Reigns2, -0.2617993877991494F, 0.0F, 0.0F);
        this.FrontRightLeg = new ModelRenderer(this, 82, 0);
        this.FrontRightLeg.setRotationPoint(1.0F, 4.5F, 0.5F);
        this.FrontRightLeg.addBox(-1.75F, 0.0F, -2.0F, 3, 7, 4, 0.0F);
        this.Saddle5Left = new ModelRenderer(this, 96, 103);
        this.Saddle5Left.mirror = true;
        this.Saddle5Left.setRotationPoint(4.25F, -0.25F, 0.0F);
        this.Saddle5Left.addBox(0.0F, 0.0F, -1.0F, 1, 7, 1, 0.0F);
        this.setRotateAngle(Saddle5Left, 0.0F, 0.0F, -0.15707963267948966F);
        this.RightThigh = new ModelRenderer(this, 64, 0);
        this.RightThigh.mirror = true;
        this.RightThigh.setRotationPoint(-3.25F, 4.8F, 21.0F);
        this.RightThigh.addBox(-2.5F, -1.5F, -2.5F, 4, 8, 5, 0.0F);
        this.ManeHorse = new ModelRenderer(this, 42, 36);
        this.ManeHorse.setRotationPoint(0.0F, -10.25F, 4.0F);
        this.ManeHorse.addBox(-1.0F, 0.0F, 0.0F, 2, 13, 3, 0.0F);
        this.BackLeftLeg = new ModelRenderer(this, 82, 0);
        this.BackLeftLeg.mirror = true;
        this.BackLeftLeg.setRotationPoint(0.5F, 6.4F, 0.0F);
        this.BackLeftLeg.addBox(-1.25F, 0.0F, -2.0F, 3, 7, 4, 0.0F);
        this.Tail = new ModelRenderer(this, 44, 13);
        this.Tail.setRotationPoint(0.0F, 0.2F, 24.0F);
        this.Tail.addBox(-1.0F, 0.0F, -1.5F, 2, 9, 2, 0.0F);
        this.setRotateAngle(Tail, 0.36425021489121656F, 0.0F, 0.0F);
        this.Mouth = new ModelRenderer(this, 0, 71);
        this.Mouth.setRotationPoint(0.0F, -1.2F, -4.0F);
        this.Mouth.addBox(-2.0F, 0.0F, -4.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(Mouth, 0.136659280431156F, 0.0F, 0.0F);
        this.RightSaddleBag = new ModelRenderer(this, 106, 112);
        this.RightSaddleBag.setRotationPoint(-4.75F, 0.1F, 19.0F);
        this.RightSaddleBag.addBox(-3.0F, 0.0F, -4.0F, 3, 8, 8, 0.0F);
        this.Saddle3 = new ModelRenderer(this, 98, 109);
        this.Saddle3.setRotationPoint(0.0F, 0.0F, 4.8F);
        this.Saddle3.addBox(-2.5F, -1.9F, -2.5F, 5, 1, 2, 0.0F);
        this.FrontLeftLeg = new ModelRenderer(this, 82, 0);
        this.FrontLeftLeg.mirror = true;
        this.FrontLeftLeg.setRotationPoint(-1.0F, 4.5F, 0.5F);
        this.FrontLeftLeg.addBox(-1.25F, 0.0F, -2.0F, 3, 7, 4, 0.0F);
        this.Saddle6Left = new ModelRenderer(this, 89, 105);
        this.Saddle6Left.mirror = true;
        this.Saddle6Left.setRotationPoint(0.95F, 6.75F, -0.5F);
        this.Saddle6Left.addBox(0.0F, 0.0F, -1.5F, 0, 3, 3, 0.0F);
        this.BackRightLeg = new ModelRenderer(this, 82, 0);
        this.BackRightLeg.setRotationPoint(-0.5F, 6.4F, 0.0F);
        this.BackRightLeg.addBox(-1.75F, 0.0F, -2.0F, 3, 7, 4, 0.0F);
        this.TailHairHorse = new ModelRenderer(this, 52, 11);
        this.TailHairHorse.setRotationPoint(0.0F, 3.0F, -0.5F);
        this.TailHairHorse.addBox(-1.5F, 0.0F, -1.5F, 3, 10, 3, 0.0F);
        this.setRotateAngle(TailHairHorse, -0.10471975511965977F, 0.0F, 0.0F);
        this.LeftEarHorse = new ModelRenderer(this, 0, 0);
        this.LeftEarHorse.mirror = true;
        this.LeftEarHorse.setRotationPoint(0.5F, -1.3F, 2.25F);
        this.LeftEarHorse.addBox(0.0F, -1.9F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(LeftEarHorse, -0.2617993877991494F, 0.0F, 0.061086523819801536F);
        this.Saddle5Right = new ModelRenderer(this, 96, 103);
        this.Saddle5Right.setRotationPoint(-5.25F, -0.25F, 0.0F);
        this.Saddle5Right.addBox(0.0F, 0.0F, -1.0F, 1, 7, 1, 0.0F);
        this.setRotateAngle(Saddle5Right, 0.0F, 0.0F, 0.15707963267948966F);
        this.RightEarHorse = new ModelRenderer(this, 0, 0);
        this.RightEarHorse.setRotationPoint(-0.5F, -1.3F, 2.25F);
        this.RightEarHorse.addBox(-2.0F, -1.9F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(RightEarHorse, -0.2617993877991494F, 0.0F, -0.061086523819801536F);
        this.RightShoulder = new ModelRenderer(this, 64, 13);
        this.RightShoulder.setRotationPoint(-4.5F, 6.7F, 2.25F);
        this.RightShoulder.addBox(-0.9F, -1.5F, -2.0F, 3, 6, 5, 0.0F);
        this.NeckHorse = new ModelRenderer(this, 0, 36);
        this.NeckHorse.setRotationPoint(0.0F, 2.5F, 1.0F);
        this.NeckHorse.addBox(-2.05F, -9.8F, -2.0F, 4, 14, 7, 0.0F);
        this.setRotateAngle(NeckHorse, 0.5235987755982988F, 0.0F, 0.0F);
        this.LeftSaddleBag = new ModelRenderer(this, 106, 112);
        this.LeftSaddleBag.mirror = true;
        this.LeftSaddleBag.setRotationPoint(4.75F, 0.1F, 19.0F);
        this.LeftSaddleBag.addBox(0.0F, 0.0F, -4.0F, 3, 8, 8, 0.0F);
        this.Saddle1 = new ModelRenderer(this, 92, 103);
        this.Saddle1.setRotationPoint(0.0F, 0.0F, 13.0F);
        this.Saddle1.addBox(-5.0F, -0.9F, -2.5F, 10, 1, 8, 0.0F);
        this.NeckHorse.addChild(this.Head);
        this.Body.addChild(this.LeftThigh);
        this.Body.addChild(this.LeftShoulder);
        this.Saddle1.addChild(this.Saddle2);
        this.Head.addChild(this.Reigns1);
        this.Saddle5Right.addChild(this.Saddle6Right);
        this.Reigns1.addChild(this.Reigns2);
        this.RightShoulder.addChild(this.FrontRightLeg);
        this.Saddle1.addChild(this.Saddle5Left);
        this.Body.addChild(this.RightThigh);
        this.NeckHorse.addChild(this.ManeHorse);
        this.LeftThigh.addChild(this.BackLeftLeg);
        this.Body.addChild(this.Tail);
        this.Head.addChild(this.Mouth);
        this.Body.addChild(this.RightSaddleBag);
        this.Saddle1.addChild(this.Saddle3);
        this.LeftShoulder.addChild(this.FrontLeftLeg);
        this.Saddle5Left.addChild(this.Saddle6Left);
        this.RightThigh.addChild(this.BackRightLeg);
        this.Tail.addChild(this.TailHairHorse);
        this.Head.addChild(this.LeftEarHorse);
        this.Saddle1.addChild(this.Saddle5Right);
        this.Head.addChild(this.RightEarHorse);
        this.Body.addChild(this.RightShoulder);
        this.Body.addChild(this.NeckHorse);
        this.Body.addChild(this.LeftSaddleBag);
        this.Body.addChild(this.Saddle1);
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
    	this.LeftShoulder.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RightShoulder.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.LeftThigh.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RightThigh.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
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
