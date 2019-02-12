package com.superlord.dungeoncraft.util.handlers;

import com.superlord.dungeoncraft.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SoundsHandler {

	
	public static final SoundEvent MAMMOTH_IDLE;
	public static final SoundEvent MAMMOTH_HURT;
	public static final SoundEvent MAMMOTH_DEATH;
	public static final SoundEvent ORC_IDLE;
	public static final SoundEvent ORC_HURT;
	public static final SoundEvent ORC_DEATH;
	public static final SoundEvent GOBLIN_IDLE;
	public static final SoundEvent GOBLIN_HURT;
	public static final SoundEvent GOBLIN_DEATH;;
	public static final SoundEvent KOBOLD_IDLE;
	public static final SoundEvent KOBOLD_HURT;
	public static final SoundEvent KOBOLD_DEATH;
	public static final SoundEvent SAHUAGIN_IDLE;
	public static final SoundEvent SAHUAGIN_HURT;
	public static final SoundEvent SAHUAGIN_DEATH;
	public static final SoundEvent AXE_BEAK_IDLE;
	public static final SoundEvent AXE_BEAK_HURT;
	public static final SoundEvent OGRE_HURT;
	public static final SoundEvent LAMIA_HURT;
	public static final SoundEvent OGRE_IDLE;
	public static final SoundEvent LAMIA_IDLE;
	public static final SoundEvent BULLYWUG_ALL;
	public static final SoundEvent GNOLL_IDLE;
	public static final SoundEvent GNOLL_HURT;

    @SubscribeEvent
    public static void registerSounds(final RegistryEvent.Register<SoundEvent> evt) {
        evt.getRegistry().register(SoundsHandler.MAMMOTH_IDLE);
        evt.getRegistry().register(SoundsHandler.MAMMOTH_HURT);
        evt.getRegistry().register(SoundsHandler.MAMMOTH_DEATH);
        evt.getRegistry().register(SoundsHandler.ORC_IDLE);
        evt.getRegistry().register(SoundsHandler.ORC_HURT);
        evt.getRegistry().register(SoundsHandler.ORC_DEATH);
        evt.getRegistry().register(SoundsHandler.GOBLIN_IDLE);
        evt.getRegistry().register(SoundsHandler.GOBLIN_HURT);
        evt.getRegistry().register(SoundsHandler.GOBLIN_DEATH);
        evt.getRegistry().register(SoundsHandler.KOBOLD_IDLE);
        evt.getRegistry().register(SoundsHandler.KOBOLD_HURT);
        evt.getRegistry().register(SoundsHandler.KOBOLD_DEATH);
        evt.getRegistry().register(SoundsHandler.SAHUAGIN_IDLE);
        evt.getRegistry().register(SoundsHandler.SAHUAGIN_HURT);
        evt.getRegistry().register(SoundsHandler.SAHUAGIN_DEATH);
        evt.getRegistry().register(SoundsHandler.AXE_BEAK_IDLE);
        evt.getRegistry().register(SoundsHandler.AXE_BEAK_HURT);
        evt.getRegistry().register(SoundsHandler.LAMIA_IDLE);
        evt.getRegistry().register(SoundsHandler.LAMIA_HURT);
        evt.getRegistry().register(SoundsHandler.OGRE_IDLE);
        evt.getRegistry().register(SoundsHandler.OGRE_HURT);
        evt.getRegistry().register(SoundsHandler.BULLYWUG_ALL);
        evt.getRegistry().register(SoundsHandler.GNOLL_IDLE);
        evt.getRegistry().register(SoundsHandler.GNOLL_HURT);
    }

    private static SoundEvent createEvent(final String soundName) {
        final ResourceLocation soundID = new ResourceLocation(Reference.MOD_ID, soundName);
        return new SoundEvent(soundID).setRegistryName(soundID);
    }

    static {
    	MAMMOTH_IDLE = createEvent("mammoth_idle");
    	MAMMOTH_HURT = createEvent("mammoth_hurt");
    	MAMMOTH_DEATH = createEvent("mammoth_death");
    	ORC_IDLE = createEvent("orc_idle");
    	ORC_HURT = createEvent("orc_hurt");
    	ORC_DEATH = createEvent("orc_death");
    	GOBLIN_IDLE = createEvent("goblin_idle");
    	GOBLIN_HURT = createEvent("goblin_hurt");
    	GOBLIN_DEATH = createEvent("goblin_death");
    	KOBOLD_IDLE = createEvent("kobold_idle");
    	KOBOLD_HURT = createEvent("kobold_hurt");
    	KOBOLD_DEATH = createEvent("kobold_death");
    	SAHUAGIN_IDLE = createEvent("sahuagin_idle");
    	SAHUAGIN_HURT = createEvent("sahuagin_hurt");
    	SAHUAGIN_DEATH = createEvent("sahuagin_death");
    	AXE_BEAK_IDLE = createEvent("axe_beak_idle");
    	AXE_BEAK_HURT = createEvent("axe_beak_hurt");
    	OGRE_IDLE = createEvent("ogre_idle");
    	OGRE_HURT = createEvent("ogre_hurt");
    	LAMIA_IDLE = createEvent("lamia_idle");
    	LAMIA_HURT = createEvent("lamia_hurt");
    	BULLYWUG_ALL = createEvent("bullywug_all");
    	GNOLL_IDLE = createEvent("gnoll_idle");
    	GNOLL_HURT = createEvent("gnoll_hurt");
    }
    
}
