package com.superlord.dungeoncraft.util;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.Type;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = Reference.MOD_ID, name = "dungeoncraft_config", type = Type.INSTANCE)
@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class DCConfig {
	
	@Comment("The dimension ID for the Abyss")
	public static int abyssID = 2;

	@Comment("The dimension ID for the Feywild")
    public static int feywildID = 276;
	
	@Comment("Advanced Smelting")
	public static boolean advancedSmelting = true;

	@SubscribeEvent
    public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent e) {
	    if (e.getModID().equals(Reference.MOD_ID)) {
            ConfigManager.sync(Reference.MOD_ID, Type.INSTANCE);
        }
    }
}
