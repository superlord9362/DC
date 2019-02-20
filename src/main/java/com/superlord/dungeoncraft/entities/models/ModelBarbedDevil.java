package com.superlord.dungeoncraft.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelBarbedDevil - Either Mojang or a mod author
 * Created using Tabula 5.0.0
 */
public class ModelBarbedDevil extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer LLeg;
    public ModelRenderer RLeg;
    public ModelRenderer Head;
    public ModelRenderer RArm;
    public ModelRenderer LArm;
    public ModelRenderer Tail1;
    public ModelRenderer LLegSpikes;
    public ModelRenderer RLegSpikes;
    public ModelRenderer LEar;
    public ModelRenderer REar;
    public ModelRenderer HeadSpikes;
    public ModelRenderer RArmSpikes;
    public ModelRenderer LArmSpikes;
    public ModelRenderer Tail2;
    public ModelRenderer Tail1Spikes;
    public ModelRenderer Tail3;
    public ModelRenderer Tail2Spikes;
    public ModelRenderer Tail3Spikes;

    public ModelBarbedDevil() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Head = new ModelRenderer(this, 0, 16);
        this.Head.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Head.addBox(-3.5F, -8.0F, -3.5F, 7, 9, 7, 0.0F);
        this.setRotateAngle(Head, -0.19198621771937624F, 0.0F, 0.0F);
        this.Tail3Spikes = new ModelRenderer(this, 51, 51);
        this.Tail3Spikes.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.Tail3Spikes.addBox(-0.5F, -2.0F, 0.0F, 1, 4, 5, 0.0F);
        this.LLegSpikes = new ModelRenderer(this, 36, 32);
        this.LLegSpikes.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.LLegSpikes.addBox(-2.0F, 0.0F, -1.0F, 4, 11, 2, 0.0F);
        this.RLegSpikes = new ModelRenderer(this, 36, 32);
        this.RLegSpikes.mirror = true;
        this.RLegSpikes.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.RLegSpikes.addBox(-2.0F, 0.0F, -1.0F, 4, 11, 2, 0.0F);
        this.Tail2 = new ModelRenderer(this, 36, 45);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 7.5F);
        this.Tail2.addBox(-1.5F, -2.0F, 0.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(Tail2, 0.17453292519943295F, 0.0F, 0.0F);
        this.Tail2Spikes = new ModelRenderer(this, 46, 1);
        this.Tail2Spikes.setRotationPoint(0.0F, -2.5F, 0.0F);
        this.Tail2Spikes.addBox(-1.0F, -2.0F, 0.0F, 2, 4, 6, 0.0F);
        this.REar = new ModelRenderer(this, 0, 32);
        this.REar.mirror = true;
        this.REar.setRotationPoint(-3.1F, -3.0F, 0.0F);
        this.REar.addBox(-0.5F, -5.0F, -1.0F, 1, 5, 3, 0.0F);
        this.setRotateAngle(REar, -0.2617993877991494F, 0.0F, -0.2617993877991494F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F);
        this.LLeg = new ModelRenderer(this, 24, 0);
        this.LLeg.mirror = true;
        this.LLeg.setRotationPoint(1.9F, 12.0F, 0.1F);
        this.LLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.Tail1 = new ModelRenderer(this, 0, 32);
        this.Tail1.setRotationPoint(0.0F, 8.5F, 1.0F);
        this.Tail1.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 8, 0.0F);
        this.setRotateAngle(Tail1, -0.6108652381980153F, 0.0F, 0.0F);
        this.RLeg = new ModelRenderer(this, 24, 0);
        this.RLeg.mirror = true;
        this.RLeg.setRotationPoint(-1.9F, 12.0F, 0.1F);
        this.RLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.RArmSpikes = new ModelRenderer(this, 48, 32);
        this.RArmSpikes.mirror = true;
        this.RArmSpikes.setRotationPoint(-3.0F, -1.5F, 0.0F);
        this.RArmSpikes.addBox(-2.0F, 0.0F, -1.0F, 4, 11, 2, 0.0F);
        this.LArm = new ModelRenderer(this, 44, 16);
        this.LArm.setRotationPoint(5.0F, 2.0F, -0.0F);
        this.LArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(LArm, 0.0F, 0.0F, -0.10000736613927509F);
        this.Tail3 = new ModelRenderer(this, 28, 20);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 6.2F);
        this.Tail3.addBox(-1.0F, -2.0F, 0.0F, 2, 4, 6, 0.0F);
        this.setRotateAngle(Tail3, 0.17453292519943295F, 0.0F, 0.0F);
        this.LArmSpikes = new ModelRenderer(this, 48, 32);
        this.LArmSpikes.setRotationPoint(3.0F, -1.5F, 0.0F);
        this.LArmSpikes.addBox(-2.0F, 0.0F, -1.0F, 4, 11, 2, 0.0F);
        this.RArm = new ModelRenderer(this, 44, 16);
        this.RArm.mirror = true;
        this.RArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.RArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(RArm, 0.0F, 0.0F, 0.10000736613927509F);
        this.LEar = new ModelRenderer(this, 0, 32);
        this.LEar.setRotationPoint(3.1F, -3.0F, 0.0F);
        this.LEar.addBox(-0.5F, -5.0F, -1.0F, 1, 5, 3, 0.0F);
        this.setRotateAngle(LEar, -0.2617993877991494F, 0.0F, 0.2617993877991494F);
        this.HeadSpikes = new ModelRenderer(this, 0, 44);
        this.HeadSpikes.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.HeadSpikes.addBox(-3.0F, -5.0F, -3.0F, 6, 5, 6, 0.0F);
        this.Tail1Spikes = new ModelRenderer(this, 23, 53);
        this.Tail1Spikes.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.Tail1Spikes.addBox(-1.5F, -2.0F, 0.0F, 3, 4, 7, 0.0F);
        this.Body.addChild(this.Head);
        this.Tail3.addChild(this.Tail3Spikes);
        this.LLeg.addChild(this.LLegSpikes);
        this.RLeg.addChild(this.RLegSpikes);
        this.Tail1.addChild(this.Tail2);
        this.Tail2.addChild(this.Tail2Spikes);
        this.Head.addChild(this.REar);
        this.Body.addChild(this.LLeg);
        this.Body.addChild(this.Tail1);
        this.Body.addChild(this.RLeg);
        this.RArm.addChild(this.RArmSpikes);
        this.Body.addChild(this.LArm);
        this.Tail2.addChild(this.Tail3);
        this.LArm.addChild(this.LArmSpikes);
        this.Body.addChild(this.RArm);
        this.Head.addChild(this.LEar);
        this.Head.addChild(this.HeadSpikes);
        this.Tail1.addChild(this.Tail1Spikes);
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
