package com.superlord.dungeoncraft.entities;

import com.superlord.dungeoncraft.init.ModItems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

public class EntityGuardV extends EntityMob
{
	
    private int angerLevel;

    public EntityGuardV(World worldIn) {
        super(worldIn);
        this.setSize(0.6F, 1.5F);
    }

     protected void initEntityAI()
        {
            this.tasks.addTask(0, new EntityAISwimming(this));
            this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
            this.tasks.addTask(7, new EntityAIWanderAvoidWater(this, 1.0D));
            this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
            this.tasks.addTask(8, new EntityAILookIdle(this));
            this.tasks.addTask(1, new EntityAIAttackMelee(this, 1.0F, true));
            this.applyEntityAI();
        }

        protected void applyEntityAI()
        {
            this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityGoblin.class, true));
            this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityOrc.class, true));
            this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySahuagin.class, true));
            this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityZombie.class, true));
            this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySkeleton.class, true));
            this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityCreeper.class, true));
            this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySpider.class, true));
            this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityOgre.class, true));
            this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityKobold.class, true));
            this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityLamia.class, true));
            this.targetTasks.addTask(1, new EntityGuardV.AIHurtByAggressor(this));
            this.targetTasks.addTask(2, new EntityGuardV.AITargetAggressor(this));

        }
        
        static class AIHurtByAggressor extends EntityAIHurtByTarget
        {
            public AIHurtByAggressor(EntityGuardV p_i45828_1_)
            {
                super(p_i45828_1_, true);
            }

            protected void setEntityAttackTarget(EntityCreature creatureIn, EntityLivingBase entityLivingBaseIn)
            {
                super.setEntityAttackTarget(creatureIn, entityLivingBaseIn);

                if (creatureIn instanceof EntityGuardV)
                {
                    ((EntityGuardV)creatureIn).becomeAngryAt(entityLivingBaseIn);
                }
            }
        }

    static class AITargetAggressor extends EntityAINearestAttackableTarget<EntityPlayer>
        {
            public AITargetAggressor(EntityGuardV p_i45829_1_)
            {
                super(p_i45829_1_, EntityPlayer.class, true);
            }

            /**
             * Returns whether the EntityAIBase should begin execution.
             */
            public boolean shouldExecute()
            {
                return ((EntityGuardV)this.taskOwner).isAngry() && super.shouldExecute();
            }
        }
    
    protected SoundEvent getAmbientSound()
    {
        return SoundEvents.ENTITY_VILLAGER_AMBIENT;
    }

    protected SoundEvent getHurtSound(DamageSource p_184601_1_)
    {
        return SoundEvents.ENTITY_VILLAGER_HURT;
    }

    protected SoundEvent getDeathSound()
    {
        return SoundEvents.ENTITY_VILLAGER_DEATH;
    }
    
    private void becomeAngryAt(Entity p_70835_1_)
    {
        this.angerLevel = 400 + this.rand.nextInt(400);

        if (p_70835_1_ instanceof EntityLivingBase)
        {
            this.setRevengeTarget((EntityLivingBase)p_70835_1_);
        }
    }

    public boolean isAngry()
    {
        return this.angerLevel > 0;
    }
        
        protected void applyEntityAttributes()
        {
            super.applyEntityAttributes();
            this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(35.0D);
            this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.23000000417232513D);
            this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3.0D);
            this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
            this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
        }
        
        protected void setEquipmentBasedOnDifficulty(DifficultyInstance difficulty)
        {
            this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(ModItems.IRON_SPEAR));
        }
        
        
        
 
}