package com.superlord.dungeoncraft.items;

import com.superlord.dungeoncraft.Main;
import com.superlord.dungeoncraft.init.ModItems;
import com.superlord.dungeoncraft.util.IHasModel;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class Staff extends ItemSword implements IHasModel {

	public Staff(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.dungeoncraft);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		ItemStack item = playerIn.getHeldItem(handIn);
		Vec3d aim = playerIn.getLookVec();
		EntitySmallFireball fireball = new EntitySmallFireball(worldIn, playerIn, 1, 1, 2);
		
		fireball.setPosition(playerIn.posX + aim.x * 1.5D, playerIn.posY +aim.y * 1.5D, playerIn.posZ + aim.z * 1.5D);
		fireball.accelerationX = aim.x * 0.1;
		fireball.accelerationY = aim.y * 0.1;
		fireball.accelerationZ = aim.z * 0.1;
		worldIn.spawnEntity(fireball);
        playerIn.getCooldownTracker().setCooldown(this, 40);
		
		item.damageItem(1, playerIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");		
	}

}
