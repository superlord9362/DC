package com.superlord.dungeoncraft.init;

import com.superlord.dungeoncraft.world.dimension.ninehells.DimensionNineHells;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class DimensionInit {
	
	public static final DimensionType NINEHELLS = DimensionType.register("Nine Hells", "_ninehells", 2, DimensionNineHells.class, false);
	
	public static void registerDimensions() {
		DimensionManager.registerDimension(2, NINEHELLS);
	}

}
