package com.superlord.dungeoncraft.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.living.ZombieEvent;
import net.minecraftforge.fml.common.eventhandler.Event.HasResult;

public class VampireResult extends EntityEvent {

	public VampireResult(Entity entity) {
		super(entity);
	}
	
	public EntityVampire getSummoner()
    {
        return (EntityVampire) getEntity();
    }

	 @HasResult
	    public static class SummonAidEvent extends VampireResult {
	        private EntityVampire customSummonedAid;
	        
	        private final World world;
	        private final int x;
	        private final int y;
	        private final int z;
	        private final EntityLivingBase attacker;
	        private final double summonChance;
	        
	        public SummonAidEvent(EntityVampire entity, World world, int x, int y, int z, EntityLivingBase attacker, double summonChance)
	        {
	            super(entity);
	            this.world = world;
	            this.x = x;
	            this.y = y;
	            this.z = z;
	            this.attacker = attacker;
	            this.summonChance = summonChance;
	        }

	        /**
	         * Populate this field to have a custom zombie instead of a normal zombie summoned
	         */
	        public EntityVampire getCustomSummonedAid() { return customSummonedAid; }
	        public void setCustomSummonedAid(EntityVampire customSummonedAid) { this.customSummonedAid = customSummonedAid; }
	        public World getWorld() { return world; }
	        public int getX() { return x; }
	        public int getY() { return y; }
	        public int getZ() { return z; }
	        public EntityLivingBase getAttacker() { return attacker; }
	        public double getSummonChance() { return summonChance; }
	    }
	
}
