package com.superlord.dungeoncraft.items;

import com.superlord.dungeoncraft.Main;
import com.superlord.dungeoncraft.entities.EntityFriendlySkeleton;
import com.superlord.dungeoncraft.init.ModItems;
import com.superlord.dungeoncraft.util.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ItemUndeadScroll extends ItemBase implements IHasModel {

    public ItemUndeadScroll(String name) {
        super(name);

        setCreativeTab(Main.dungeoncraft);

        ModItems.ITEMS.add(this);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack itemstack = playerIn.getHeldItem(handIn);

        if (!playerIn.capabilities.isCreativeMode) {
            itemstack.shrink(1);
        }
        ItemStack item = playerIn.getHeldItem(handIn);
		Vec3d aim = playerIn.getLookVec();
		EntityFriendlySkeleton fireball = new EntityFriendlySkeleton(worldIn);
		
		fireball.setPosition(playerIn.posX + aim.x * 1.5D, playerIn.posY +aim.y * 1.5D, playerIn.posZ + aim.z * 1.5D);

		worldIn.spawnEntity(fireball);
        playerIn.getCooldownTracker().setCooldown(this, 40);
       

        playerIn.addStat(StatList.getObjectUseStats(this));
        return new ActionResult<>(EnumActionResult.SUCCESS, itemstack);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
