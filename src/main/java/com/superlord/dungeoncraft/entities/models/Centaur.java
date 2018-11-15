package com.superlord.dungeoncraft.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelHorse - Either Mojang or a mod author
 * Created using Tabula 5.0.0
 */
public class Centaur extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer TailHair1;
    public ModelRenderer Tail;
    public ModelRenderer TailHair2;
    public ModelRenderer LShoulder;
    public ModelRenderer RShoulder;
    public ModelRenderer RHip;
    public ModelRenderer LHip;
    public ModelRenderer Body_1;
    public ModelRenderer FLLeg;
    public ModelRenderer FLHoof;
    public ModelRenderer FRLeg;
    public ModelRenderer RFHoof;
    public ModelRenderer BRLeg;
    public ModelRenderer BRHoof;
    public ModelRenderer BLLeg;
    public ModelRenderer BLHoof;
    public ModelRenderer RArm;
    public ModelRenderer LArm;
    public ModelRenderer Head;

    public Centaur() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.LShoulder = new ModelRenderer(this, 64, 0);
        this.LShoulder.setRotationPoint(-4.0F, -2.0F, -17.0F);
        this.LShoulder.addBox(-1.1F, -1.0F, -2.1F, 3, 8, 4, 0.0F);
        this.BLHoof = new ModelRenderer(this, 68, 28);
        this.BLHoof.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BLHoof.addBox(-1.5F, 5.1F, -2.0F, 4, 3, 4, 0.0F);
        this.RFHoof = new ModelRenderer(this, 52, 15);
        this.RFHoof.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RFHoof.addBox(-2.4F, 5.1F, -2.1F, 4, 3, 4, 0.0F);
        this.Body_1 = new ModelRenderer(this, 68, 12);
        this.Body_1.setRotationPoint(0.0F, -20.0F, -17.0F);
        this.Body_1.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.FRLeg = new ModelRenderer(this, 44, 11);
        this.FRLeg.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.FRLeg.addBox(-1.9F, 0.0F, -1.6F, 3, 5, 3, 0.0F);
        this.Head = new ModelRenderer(this, 0, 34);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.TailHair1 = new ModelRenderer(this, 0, 0);
        this.TailHair1.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.TailHair1.addBox(-1.5F, -2.0F, 3.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(TailHair1, -1.1344640137963142F, 0.0F, 0.0F);
        this.FLLeg = new ModelRenderer(this, 110, 0);
        this.FLLeg.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.FLLeg.addBox(-1.1F, 0.0F, -1.6F, 3, 5, 3, 0.0F);
        this.LHip = new ModelRenderer(this, 105, 9);
        this.LHip.setRotationPoint(-4.0F, -2.0F, 2.0F);
        this.LHip.addBox(-1.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.BLLeg = new ModelRenderer(this, 108, 23);
        this.BLLeg.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.BLLeg.addBox(-1.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.Tail = new ModelRenderer(this, 13, 0);
        this.Tail.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.Tail.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(Tail, -1.1344640137963142F, 0.0F, 0.0F);
        this.BRHoof = new ModelRenderer(this, 92, 22);
        this.BRHoof.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BRHoof.addBox(-2.5F, 5.1F, -2.0F, 4, 3, 4, 0.0F);
        this.RArm = new ModelRenderer(this, 84, 29);
        this.RArm.setRotationPoint(5.0F, 2.0F, -0.0F);
        this.RArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(RArm, 0.0F, 0.0F, -0.10000736613927509F);
        this.RShoulder = new ModelRenderer(this, 78, 0);
        this.RShoulder.setRotationPoint(4.0F, -2.0F, -17.0F);
        this.RShoulder.addBox(-1.9F, -1.0F, -2.1F, 3, 8, 4, 0.0F);
        this.RHip = new ModelRenderer(this, 92, 0);
        this.RHip.setRotationPoint(4.0F, -2.0F, 2.0F);
        this.RHip.addBox(-2.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.TailHair2 = new ModelRenderer(this, 44, 0);
        this.TailHair2.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.TailHair2.addBox(-1.5F, -4.5F, 9.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(TailHair2, -1.4021975210522444F, 0.0F, 0.0F);
        this.BRLeg = new ModelRenderer(this, 92, 14);
        this.BRLeg.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.BRLeg.addBox(-2.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, 11.0F, 9.0F);
        this.Body.addBox(-5.0F, -8.0F, -19.0F, 10, 10, 24, 0.0F);
        this.LArm = new ModelRenderer(this, 100, 31);
        this.LArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.LArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(LArm, 0.0F, 0.0F, 0.10000736613927509F);
        this.FLHoof = new ModelRenderer(this, 0, 11);
        this.FLHoof.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.FLHoof.addBox(-1.6F, 5.1F, -2.1F, 4, 3, 4, 0.0F);
        this.Body.addChild(this.LShoulder);
        this.BLLeg.addChild(this.BLHoof);
        this.FRLeg.addChild(this.RFHoof);
        this.Body.addChild(this.Body_1);
        this.RShoulder.addChild(this.FRLeg);
        this.Body_1.addChild(this.Head);
        this.LShoulder.addChild(this.FLLeg);
        this.Body.addChild(this.LHip);
        this.LHip.addChild(this.BLLeg);
        this.BRLeg.addChild(this.BRHoof);
        this.Body_1.addChild(this.RArm);
        this.Body.addChild(this.RShoulder);
        this.Body.addChild(this.RHip);
        this.RHip.addChild(this.BRLeg);
        this.Body_1.addChild(this.LArm);
        this.FLLeg.addChild(this.FLHoof);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.TailHair1.render(f5);
        this.Tail.render(f5);
        this.TailHair2.render(f5);
        this.Body.render(f5);
    }
    
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
    	float XAngle = headPitch / 57.29578F;
    	float YAngle = netHeadYaw / 57.29578F;
    	this.Head.rotateAngleX= (0.2617794F + XAngle);
    	this.Head.rotateAngleY= YAngle;
    	this.LShoulder.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RShoulder.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.LHip.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RHip.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
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
