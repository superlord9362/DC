package com.superlord.dungeoncraft.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Bullywug - CodaBear1552
 * Created using Tabula 5.0.0
 */
public class Bullywug extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Head;
    public ModelRenderer Hips;
    public ModelRenderer shape36;
    public ModelRenderer shape37;
    public ModelRenderer LEye;
    public ModelRenderer REye;
    public ModelRenderer shape38;
    public ModelRenderer shape39;
    public ModelRenderer LLeg1;
    public ModelRenderer LLeg2;
    public ModelRenderer LLeg3;
    public ModelRenderer RLeg1;
    public ModelRenderer RLeg2;
    public ModelRenderer RLeg3;
    public ModelRenderer RArm1;
    public ModelRenderer LArm1;

    public Bullywug() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.LEye = new ModelRenderer(this, 22, 0);
        this.LEye.setRotationPoint(4.0F, -4.0F, 0.0F);
        this.LEye.addBox(-1.5F, -3.0F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(LEye, 0.0F, 0.0F, -0.5235987755982988F);
        this.shape39 = new ModelRenderer(this, 0, 0);
        this.shape39.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape39.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape39, -0.3490658503988659F, 0.17453292519943295F, 0.15707963267948966F);
        this.LLeg2 = new ModelRenderer(this, 20, 15);
        this.LLeg2.setRotationPoint(-0.01F, 6.3F, -1.1F);
        this.LLeg2.addBox(-2.0F, 0.0F, -1.5F, 4, 6, 4, 0.0F);
        this.setRotateAngle(LLeg2, 1.064650843716541F, 0.0F, 0.15707963267948966F);
        this.shape37 = new ModelRenderer(this, 0, 0);
        this.shape37.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape37.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape37, 0.0F, 0.0F, -0.24434609527920614F);
        this.RLeg2 = new ModelRenderer(this, 20, 15);
        this.RLeg2.setRotationPoint(0.01F, 6.3F, -1.1F);
        this.RLeg2.addBox(-2.0F, 0.0F, -1.5F, 4, 6, 4, 0.0F);
        this.setRotateAngle(RLeg2, 1.064650843716541F, 0.0F, -0.15707963267948966F);
        this.LArm1 = new ModelRenderer(this, 55, 33);
        this.LArm1.setRotationPoint(4.5F, 3.0F, 0.0F);
        this.LArm1.addBox(-1.5F, -2.0F, -1.5F, 3, 12, 3, 0.0F);
        this.Hips = new ModelRenderer(this, 67, 0);
        this.Hips.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.Hips.addBox(-5.0F, 0.0F, -3.5F, 10, 9, 7, 0.0F);
        this.setRotateAngle(Hips, -0.06981317007977318F, 0.0F, 0.0F);
        this.shape38 = new ModelRenderer(this, 0, 0);
        this.shape38.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape38.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape38, -0.3490658503988659F, -0.17453292519943295F, -0.15707963267948966F);
        this.RLeg3 = new ModelRenderer(this, 29, 24);
        this.RLeg3.setRotationPoint(-0.01F, 4.55F, -0.1F);
        this.RLeg3.addBox(-2.0F, 0.0F, -5.0F, 4, 2, 7, 0.0F);
        this.setRotateAngle(RLeg3, -0.7155849933176751F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Body.addBox(-4.0F, 0.0F, -3.0F, 8, 6, 6, 0.25F);
        this.setRotateAngle(Body, 0.06981317007977318F, 0.0F, 0.0F);
        this.LLeg3 = new ModelRenderer(this, 29, 24);
        this.LLeg3.setRotationPoint(0.01F, 4.65F, 0.1F);
        this.LLeg3.addBox(-2.0F, 0.0F, -5.0F, 4, 2, 7, 0.0F);
        this.setRotateAngle(LLeg3, -0.7155849933176751F, 0.0F, 0.0F);
        this.REye = new ModelRenderer(this, 22, 0);
        this.REye.mirror = true;
        this.REye.setRotationPoint(-4.0F, -4.0F, 0.0F);
        this.REye.addBox(-1.5F, -3.0F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(REye, 0.0F, 0.0F, 0.5235987755982988F);
        this.RArm1 = new ModelRenderer(this, 55, 33);
        this.RArm1.setRotationPoint(-4.5F, 3.0F, 0.0F);
        this.RArm1.addBox(-1.5F, -2.0F, -1.5F, 3, 12, 3, 0.0F);
        this.shape36 = new ModelRenderer(this, 0, 0);
        this.shape36.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape36.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape36, 0.0F, 0.0F, 0.24434609527920614F);
        this.LLeg1 = new ModelRenderer(this, 0, 12);
        this.LLeg1.setRotationPoint(1.8F, 5.5F, 1.5F);
        this.LLeg1.addBox(-2.5F, 0.0F, -2.0F, 5, 8, 5, 0.0F);
        this.Head = new ModelRenderer(this, 28, 0);
        this.Head.setRotationPoint(0.0F, 2.0F, -2.0F);
        this.Head.addBox(-4.5F, -6.0F, -4.5F, 9, 6, 9, 0.0F);
        this.RLeg1 = new ModelRenderer(this, 0, 12);
        this.RLeg1.setRotationPoint(-1.8F, 5.5F, 1.5F);
        this.RLeg1.addBox(-2.5F, 0.0F, -2.0F, 5, 8, 5, 0.0F);
        this.Head.addChild(this.LEye);
        this.Hips.addChild(this.shape39);
        this.LLeg1.addChild(this.LLeg2);
        this.Body.addChild(this.shape37);
        this.RLeg1.addChild(this.RLeg2);
        this.shape37.addChild(this.LArm1);
        this.Body.addChild(this.Hips);
        this.Hips.addChild(this.shape38);
        this.RLeg2.addChild(this.RLeg3);
        this.LLeg2.addChild(this.LLeg3);
        this.Head.addChild(this.REye);
        this.shape36.addChild(this.RArm1);
        this.Body.addChild(this.shape36);
        this.shape38.addChild(this.LLeg1);
        this.Body.addChild(this.Head);
        this.shape39.addChild(this.RLeg1);
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
    	this.LLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
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
