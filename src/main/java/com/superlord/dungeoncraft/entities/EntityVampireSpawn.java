package com.superlord.dungeoncraft.entities;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityVampireSpawn extends EntityVampire {

	public EntityVampireSpawn(World worldIn) {
		super(worldIn);
	}
	
	 protected void applyEntityAttributes()
	    {
	        super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(35.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.23000000417232513D);
	        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(82.0D);
	    }

}
