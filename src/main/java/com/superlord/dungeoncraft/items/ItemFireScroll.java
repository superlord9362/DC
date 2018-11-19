package com.superlord.dungeoncraft.items;

import com.superlord.dungeoncraft.Main;
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
import net.minecraft.world.World;

public class ItemFireScroll extends ItemBase implements IHasModel {

    public ItemFireScroll(String name) {
        super(name);

        setCreativeTab(Main.dungeoncraft);

        ModItems.ITEMS.add(this);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        double d1 = playerIn.posX - playerIn.posX;
        double d2 = playerIn.getEntityBoundingBox().minY + (double)(playerIn.height / 2.0F) - (playerIn.posY + (double)(playerIn.height / 2.0F));
        double d3 = playerIn.posZ - playerIn.posZ;

        if (!playerIn.capabilities.isCreativeMode) {
            itemstack.shrink(1);
        }

        worldIn.playSound(null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_BLAZE_SHOOT, SoundCategory.NEUTRAL, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
        //20 ticks = 1 second. 2 second cooldown
        playerIn.getCooldownTracker().setCooldown(this, 40);

        if (!worldIn.isRemote) {
            EntitySmallFireball fireball = new EntitySmallFireball(worldIn, playerIn, d1, d2, d3);
            fireball.posY = playerIn.posY + (playerIn.height / 2.0F) + 0.5D;
            worldIn.spawnEntity(fireball);
        }

        playerIn.addStat(StatList.getObjectUseStats(this));
        return new ActionResult<>(EnumActionResult.SUCCESS, itemstack);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
