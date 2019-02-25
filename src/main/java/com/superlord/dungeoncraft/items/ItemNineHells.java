package com.superlord.dungeoncraft.items;

import com.superlord.dungeoncraft.util.DCConfig;
import com.superlord.dungeoncraft.util.Teleport;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemNineHells extends ItemBase {

	public ItemNineHells(String name) {
		super(name);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack itemstack = playerIn.getHeldItem(handIn);

        if (!playerIn.capabilities.isCreativeMode) {
            itemstack.shrink(1);
        }
        
        if(!worldIn.isRemote) {
        	Teleport.teleportToDimension(playerIn, DCConfig.abyssID, playerIn.getPosition().getX(), playerIn.getPosition().getY() + 5, playerIn.getPosition().getZ());
        }
        
        return new ActionResult<>(EnumActionResult.SUCCESS, itemstack);
	}

}
