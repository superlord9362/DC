package com.superlord.dungeoncraft.init;

import com.superlord.dungeoncraft.util.DCConfig;
import com.superlord.dungeoncraft.world.dimension.ninehells.DimensionNineHells;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class DimensionInit {
	
	public static final DimensionType NINEHELLS = DimensionType.register("Nine Hells", "_ninehells", DCConfig.abyssID, DimensionNineHells.class, false);
	
	public static void registerDimensions() {
		DimensionManager.registerDimension(DCConfig.abyssID, NINEHELLS);
	}

}
