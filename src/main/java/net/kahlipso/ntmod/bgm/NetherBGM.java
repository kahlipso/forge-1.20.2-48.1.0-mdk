package net.kahlipso.ntmod.bgm;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.event.entity.EntityTravelToDimensionEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;

public class NetherBGM {

    @SubscribeEvent
    public static void onEntityTravelToDimension(EntityTravelToDimensionEvent event) {
        execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ());
    }  // ^ This method means that the sound will start when the player travels to the Nether

    public static void execute(LevelAccessor world, double x, double y, double z) {
        execute(null, world, x, y, z);
    } // ^ This method is accessing the position of the player for the sound to play at that position

    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
        if (world instanceof Level level) {
            if (level.isClientSide()) {
                level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.nether_wastes.loop")), SoundSource.NEUTRAL, 1, 1, false);
            } // ^ This method is where you select which sound is going to play when the player teleports to the Nether.
        }
    }
}
