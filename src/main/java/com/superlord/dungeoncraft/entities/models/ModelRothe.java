package com.superlord.dungeoncraft.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * ModelRothe - JJo
 * Created using Tabula 5.0.0
 */
public class ModelRothe extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer LowerBody;
    public ModelRenderer RightShoulder;
    public ModelRenderer LeftShoulder;
    public ModelRenderer Head;
    public ModelRenderer RightThigh;
    public ModelRenderer LeftThigh;
    public ModelRenderer Tail;
    public ModelRenderer BackRightLeg;
    public ModelRenderer BackLeftLeg;
    public ModelRenderer TailHair;
    public ModelRenderer RightFrontLeg;
    public ModelRenderer LeftFrontLeg;
    public ModelRenderer NasalCone;
    public ModelRenderer RightSmallHorn;
    public ModelRenderer LeftSmallHorn;
    public ModelRenderer RightLargeHorn1;
    public ModelRenderer LeftLargeHorn1;
    public ModelRenderer RightEar;
    public ModelRenderer LeftEar;
    public ModelRenderer RightLargeHorn2;
    public ModelRenderer RightLargeHorn3;
    public ModelRenderer LeftLargeHorn2;
    public ModelRenderer LeftLargeHorn3;

    public ModelRothe() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.RightLargeHorn1 = new ModelRenderer(this, 12, 76);
        this.RightLargeHorn1.setRotationPoint(-3.0F, -0.9F, -1.6F);
        this.RightLargeHorn1.addBox(-5.8F, -2.7F, -1.5F, 6, 3, 3, 0.0F);
        this.setRotateAngle(RightLargeHorn1, 0.0F, 0.0F, 0.2617993877991494F);
        this.RightSmallHorn = new ModelRenderer(this, 0, 32);
        this.RightSmallHorn.setRotationPoint(-3.5F, -3.7F, -3.5F);
        this.RightSmallHorn.addBox(-5.0F, 0.0F, 0.0F, 5, 2, 0, 0.0F);
        this.LeftLargeHorn2 = new ModelRenderer(this, 12, 83);
        this.LeftLargeHorn2.mirror = true;
        this.LeftLargeHorn2.setRotationPoint(5.5F, -1.5F, 0.0F);
        this.LeftLargeHorn2.addBox(-1.7F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.NasalCone = new ModelRenderer(this, 0, 76);
        this.NasalCone.setRotationPoint(0.0F, -2.2F, -5.5F);
        this.NasalCone.addBox(-1.0F, -3.4F, 0.0F, 2, 5, 3, 0.0F);
        this.setRotateAngle(NasalCone, -0.31869712141416456F, 0.0F, 0.0F);
        this.RightLargeHorn2 = new ModelRenderer(this, 12, 83);
        this.RightLargeHorn2.setRotationPoint(-5.5F, -1.5F, 0.0F);
        this.RightLargeHorn2.addBox(-0.3F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.RightShoulder = new ModelRenderer(this, 59, 0);
        this.RightShoulder.setRotationPoint(-7.0F, 7.7F, 10.0F);
        this.RightShoulder.addBox(-2.5F, -1.5F, -3.0F, 3, 13, 6, 0.0F);
        this.setRotateAngle(RightShoulder, 0.045553093477052F, 0.0F, 0.0F);
        this.LeftFrontLeg = new ModelRenderer(this, 63, 40);
        this.LeftFrontLeg.mirror = true;
        this.LeftFrontLeg.setRotationPoint(0.9F, 11.2F, -0.7F);
        this.LeftFrontLeg.addBox(-1.5F, 0.0F, -1.5F, 3, 6, 3, 0.0F);
        this.RightEar = new ModelRenderer(this, 0, 37);
        this.RightEar.setRotationPoint(-3.5F, -1.2F, -3.1F);
        this.RightEar.addBox(0.0F, 0.0F, 0.0F, 0, 3, 2, 0.0F);
        this.setRotateAngle(RightEar, 0.0F, 0.0F, 0.22759093446006054F);
        this.Head = new ModelRenderer(this, 0, 62);
        this.Head.setRotationPoint(0.0F, 6.5F, -0.3F);
        this.Head.addBox(-3.5F, -4.0F, -4.0F, 7, 8, 5, 0.0F);
        this.setRotateAngle(Head, 0.136659280431156F, 0.0F, 0.0F);
        this.LeftLargeHorn3 = new ModelRenderer(this, 22, 84);
        this.LeftLargeHorn3.mirror = true;
        this.LeftLargeHorn3.setRotationPoint(-0.6F, 4.2F, 0.0F);
        this.LeftLargeHorn3.addBox(-0.2F, -0.9F, -0.5F, 4, 1, 1, 0.0F);
        this.setRotateAngle(LeftLargeHorn3, 0.0F, 0.0F, -0.18203784098300857F);
        this.RightLargeHorn3 = new ModelRenderer(this, 22, 84);
        this.RightLargeHorn3.setRotationPoint(0.6F, 4.2F, 0.0F);
        this.RightLargeHorn3.addBox(-3.8F, -0.9F, -0.5F, 4, 1, 1, 0.0F);
        this.setRotateAngle(RightLargeHorn3, 0.0F, 0.0F, 0.18203784098300857F);
        this.LeftShoulder = new ModelRenderer(this, 59, 0);
        this.LeftShoulder.mirror = true;
        this.LeftShoulder.setRotationPoint(7.0F, 7.7F, 10.0F);
        this.LeftShoulder.addBox(-0.5F, -1.5F, -3.0F, 3, 13, 6, 0.0F);
        this.setRotateAngle(LeftShoulder, 0.045553093477052F, 0.0F, 0.0F);
        this.RightFrontLeg = new ModelRenderer(this, 63, 40);
        this.RightFrontLeg.setRotationPoint(-0.9F, 11.2F, -0.7F);
        this.RightFrontLeg.addBox(-1.5F, 0.0F, -1.5F, 3, 6, 3, 0.0F);
        this.Body = new ModelRenderer(this, 0, 30);
        this.Body.setRotationPoint(0.0F, -3.7F, -19.75F);
        this.Body.addBox(-7.5F, 0.0F, 0.0F, 15, 15, 16, 0.0F);
        this.setRotateAngle(Body, -0.045553093477052F, 0.0F, 0.0F);
        this.LeftThigh = new ModelRenderer(this, 40, 0);
        this.LeftThigh.mirror = true;
        this.LeftThigh.setRotationPoint(5.0F, 3.1F, 13.5F);
        this.LeftThigh.addBox(-0.5F, -1.25F, -3.0F, 3, 10, 6, 0.0F);
        this.setRotateAngle(LeftThigh, 0.045553093477052F, 0.0F, 0.0F);
        this.TailHair = new ModelRenderer(this, 85, 0);
        this.TailHair.setRotationPoint(0.0F, 11.0F, -0.5F);
        this.TailHair.addBox(-1.5F, 0.0F, -1.5F, 3, 7, 3, 0.0F);
        this.setRotateAngle(TailHair, -0.18203784098300857F, 0.0F, 0.0F);
        this.BackRightLeg = new ModelRenderer(this, 60, 21);
        this.BackRightLeg.setRotationPoint(-0.9F, 6.0F, 2.9F);
        this.BackRightLeg.addBox(-1.5F, 0.0F, -1.5F, 3, 13, 3, 0.0F);
        this.setRotateAngle(BackRightLeg, -0.18203784098300857F, 0.0F, 0.0F);
        this.LeftEar = new ModelRenderer(this, 0, 37);
        this.LeftEar.setRotationPoint(3.5F, -1.2F, -3.1F);
        this.LeftEar.addBox(0.0F, 0.0F, 0.0F, 0, 3, 2, 0.0F);
        this.setRotateAngle(LeftEar, 0.0F, 0.0F, -0.22759093446006054F);
        this.RightThigh = new ModelRenderer(this, 40, 0);
        this.RightThigh.setRotationPoint(-5.0F, 3.1F, 13.5F);
        this.RightThigh.addBox(-2.5F, -1.25F, -3.0F, 3, 10, 6, 0.0F);
        this.setRotateAngle(RightThigh, 0.045553093477052F, 0.0F, 0.0F);
        this.Tail = new ModelRenderer(this, 79, 0);
        this.Tail.setRotationPoint(0.0F, 0.0F, 17.9F);
        this.Tail.addBox(-0.5F, 0.0F, -0.9F, 1, 12, 1, 0.0F);
        this.setRotateAngle(Tail, 0.27314402793711257F, 0.0F, 0.0F);
        this.LowerBody = new ModelRenderer(this, 0, 0);
        this.LowerBody.setRotationPoint(0.0F, 2.5F, 15.0F);
        this.LowerBody.addBox(-5.0F, 0.0F, 0.0F, 10, 12, 18, 0.0F);
        this.setRotateAngle(LowerBody, 0.045553093477052F, 0.0F, 0.0F);
        this.LeftLargeHorn1 = new ModelRenderer(this, 12, 76);
        this.LeftLargeHorn1.mirror = true;
        this.LeftLargeHorn1.setRotationPoint(3.0F, -0.9F, -1.6F);
        this.LeftLargeHorn1.addBox(-0.2F, -2.7F, -1.5F, 6, 3, 3, 0.0F);
        this.setRotateAngle(LeftLargeHorn1, 0.0F, 0.0F, -0.2617993877991494F);
        this.BackLeftLeg = new ModelRenderer(this, 60, 21);
        this.BackLeftLeg.mirror = true;
        this.BackLeftLeg.setRotationPoint(0.9F, 6.0F, 2.9F);
        this.BackLeftLeg.addBox(-1.5F, 0.0F, -1.5F, 3, 13, 3, 0.0F);
        this.setRotateAngle(BackLeftLeg, -0.18203784098300857F, 0.0F, 0.0F);
        this.LeftSmallHorn = new ModelRenderer(this, 0, 32);
        this.LeftSmallHorn.mirror = true;
        this.LeftSmallHorn.setRotationPoint(3.5F, -3.7F, -3.5F);
        this.LeftSmallHorn.addBox(0.0F, 0.0F, 0.0F, 5, 2, 0, 0.0F);
        this.Head.addChild(this.RightLargeHorn1);
        this.Head.addChild(this.RightSmallHorn);
        this.LeftLargeHorn1.addChild(this.LeftLargeHorn2);
        this.Head.addChild(this.NasalCone);
        this.RightLargeHorn1.addChild(this.RightLargeHorn2);
        this.Body.addChild(this.RightShoulder);
        this.LeftShoulder.addChild(this.LeftFrontLeg);
        this.Head.addChild(this.RightEar);
        this.Body.addChild(this.Head);
        this.LeftLargeHorn2.addChild(this.LeftLargeHorn3);
        this.RightLargeHorn2.addChild(this.RightLargeHorn3);
        this.Body.addChild(this.LeftShoulder);
        this.RightShoulder.addChild(this.RightFrontLeg);
        this.LowerBody.addChild(this.LeftThigh);
        this.Tail.addChild(this.TailHair);
        this.RightThigh.addChild(this.BackRightLeg);
        this.Head.addChild(this.LeftEar);
        this.LowerBody.addChild(this.RightThigh);
        this.LowerBody.addChild(this.Tail);
        this.Body.addChild(this.LowerBody);
        this.Head.addChild(this.LeftLargeHorn1);
        this.LeftThigh.addChild(this.BackLeftLeg);
        this.Head.addChild(this.LeftSmallHorn);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Body.offsetX, this.Body.offsetY, this.Body.offsetZ);
        GlStateManager.translate(this.Body.rotationPointX * f5, this.Body.rotationPointY * f5, this.Body.rotationPointZ * f5);
        GlStateManager.scale(1.1D, 1.1D, 1.1D);
        GlStateManager.translate(-this.Body.offsetX, -this.Body.offsetY, -this.Body.offsetZ);
        GlStateManager.translate(-this.Body.rotationPointX * f5, -this.Body.rotationPointY * f5, -this.Body.rotationPointZ * f5);
        this.Body.render(f5);
        GlStateManager.popMatrix();
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
