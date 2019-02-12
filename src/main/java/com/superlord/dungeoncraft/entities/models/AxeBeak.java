package com.superlord.dungeoncraft.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * AxeBeak - CodaBear1552
 * Created using Tabula 5.0.0
 */
public class AxeBeak extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Tail;
    public ModelRenderer LWing;
    public ModelRenderer RWing;
    public ModelRenderer Neck;
    public ModelRenderer shape26;
    public ModelRenderer TailFeather1;
    public ModelRenderer TailFeather2;
    public ModelRenderer TailFeather3;
    public ModelRenderer shape27;
    public ModelRenderer Head;
    public ModelRenderer BeakTop;
    public ModelRenderer LLeg1;
    public ModelRenderer RLeg1;
    public ModelRenderer LLeg2;
    public ModelRenderer LToe;
    public ModelRenderer RLeg2;
    public ModelRenderer RToe;

    public AxeBeak() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.RToe = new ModelRenderer(this, 16, 34);
        this.RToe.setRotationPoint(0.0F, 8.8F, 1.3F);
        this.RToe.addBox(-1.5F, -0.5F, -2.0F, 3, 1, 5, 0.0F);
        this.setRotateAngle(RToe, -0.08726646259971647F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, 1.3F, 0.0F);
        this.Body.addBox(-4.0F, -4.0F, -7.0F, 8, 8, 14, 0.0F);
        this.setRotateAngle(Body, 0.03490658503988659F, 3.141592653589793F, 0.0F);
        this.LToe = new ModelRenderer(this, 0, 34);
        this.LToe.setRotationPoint(0.0F, 8.8F, 1.3F);
        this.LToe.addBox(-1.5F, -0.5F, -2.0F, 3, 1, 5, 0.0F);
        this.setRotateAngle(LToe, -0.08726646259971647F, 0.0F, 0.0F);
        this.shape26 = new ModelRenderer(this, 0, 0);
        this.shape26.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape26.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape26, -0.41887902047863906F, 0.0F, 0.0F);
        this.TailFeather1 = new ModelRenderer(this, 9, 22);
        this.TailFeather1.setRotationPoint(1.4F, 0.0F, -3.8F);
        this.TailFeather1.addBox(-1.0F, -0.5F, -5.0F, 2, 1, 5, 0.0F);
        this.setRotateAngle(TailFeather1, 0.0F, -0.296705972839036F, 0.0F);
        this.LLeg1 = new ModelRenderer(this, 30, 0);
        this.LLeg1.setRotationPoint(-2.3F, 2.0F, 0.0F);
        this.LLeg1.addBox(-2.0F, 0.0F, -2.0F, 4, 8, 4, 0.0F);
        this.Tail = new ModelRenderer(this, 39, 17);
        this.Tail.setRotationPoint(0.0F, -2.3F, -6.0F);
        this.Tail.addBox(-2.5F, -1.0F, -5.0F, 5, 2, 5, 0.0F);
        this.setRotateAngle(Tail, 0.06981317007977318F, 0.0F, 0.0F);
        this.Neck = new ModelRenderer(this, 32, 24);
        this.Neck.setRotationPoint(0.0F, 3.0F, 4.5F);
        this.Neck.addBox(-2.0F, -12.0F, -2.5F, 4, 12, 5, 0.0F);
        this.setRotateAngle(Neck, -0.17453292519943295F, 0.0F, 0.0F);
        this.TailFeather3 = new ModelRenderer(this, 0, 40);
        this.TailFeather3.setRotationPoint(-1.4F, 0.0F, -3.8F);
        this.TailFeather3.addBox(-1.0F, -0.5F, -5.0F, 2, 1, 5, 0.0F);
        this.setRotateAngle(TailFeather3, 0.0F, 0.296705972839036F, 0.0F);
        this.RLeg2 = new ModelRenderer(this, 50, 24);
        this.RLeg2.setRotationPoint(0.0F, 7.0F, -0.5F);
        this.RLeg2.addBox(-1.5F, 0.0F, -1.5F, 3, 9, 3, 0.0F);
        this.setRotateAngle(RLeg2, 0.47123889803846897F, 0.0F, 0.0F);
        this.shape27 = new ModelRenderer(this, 0, 0);
        this.shape27.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape27.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape27, 0.13962634015954636F, 0.0F, 0.0F);
        this.TailFeather2 = new ModelRenderer(this, 45, 36);
        this.TailFeather2.setRotationPoint(0.0F, -0.1F, -4.0F);
        this.TailFeather2.addBox(-1.0F, -0.5F, -5.0F, 2, 1, 5, 0.0F);
        this.LLeg2 = new ModelRenderer(this, 0, 0);
        this.LLeg2.setRotationPoint(0.0F, 7.0F, -0.5F);
        this.LLeg2.addBox(-1.5F, 0.0F, -1.5F, 3, 9, 3, 0.0F);
        this.setRotateAngle(LLeg2, 0.47123889803846897F, 0.0F, 0.0F);
        this.BeakTop = new ModelRenderer(this, 30, 41);
        this.BeakTop.setRotationPoint(0.0F, -2.0F, 4.0F);
        this.BeakTop.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 4, 0.0F);
        this.RWing = new ModelRenderer(this, 16, 22);
        this.RWing.setRotationPoint(4.0F, -0.4F, 5.0F);
        this.RWing.addBox(-0.5F, -2.5F, -7.0F, 1, 5, 7, 0.0F);
        this.setRotateAngle(RWing, 0.15707963267948966F, 0.0F, 0.0F);
        this.LWing = new ModelRenderer(this, 0, 22);
        this.LWing.setRotationPoint(-4.0F, -0.4F, 5.0F);
        this.LWing.addBox(-0.5F, -2.5F, -7.0F, 1, 5, 7, 0.0F);
        this.setRotateAngle(LWing, 0.15707963267948966F, 0.0F, 0.0F);
        this.RLeg1 = new ModelRenderer(this, 46, 0);
        this.RLeg1.setRotationPoint(2.3F, 2.0F, 0.0F);
        this.RLeg1.addBox(-2.0F, 0.0F, -2.0F, 4, 8, 4, 0.0F);
        this.Head = new ModelRenderer(this, 8, 40);
        this.Head.setRotationPoint(0.0F, -10.5F, 1.2F);
        this.Head.addBox(-2.5F, -4.0F, -2.0F, 5, 4, 6, 0.0F);
        this.RLeg2.addChild(this.RToe);
        this.LLeg2.addChild(this.LToe);
        this.Body.addChild(this.shape26);
        this.Tail.addChild(this.TailFeather1);
        this.shape26.addChild(this.LLeg1);
        this.Body.addChild(this.Tail);
        this.Body.addChild(this.Neck);
        this.Tail.addChild(this.TailFeather3);
        this.RLeg1.addChild(this.RLeg2);
        this.Neck.addChild(this.shape27);
        this.Tail.addChild(this.TailFeather2);
        this.LLeg1.addChild(this.LLeg2);
        this.Head.addChild(this.BeakTop);
        this.Body.addChild(this.RWing);
        this.Body.addChild(this.LWing);
        this.shape26.addChild(this.RLeg1);
        this.shape27.addChild(this.Head);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Body.offsetX, this.Body.offsetY, this.Body.offsetZ);
        GlStateManager.translate(this.Body.rotationPointX * f5, this.Body.rotationPointY * f5, this.Body.rotationPointZ * f5);
        GlStateManager.scale(1.1D, 1.3D, 1.2D);
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
