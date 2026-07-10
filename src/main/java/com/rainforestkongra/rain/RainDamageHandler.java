package com.rainforestkongra.rain;

import com.rainforestkongra.item.KongraArmorItem;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class RainDamageHandler {
    // Number of ticks a player must be exposed to rain before taking damage.
    private static final int EXPOSURE_THRESHOLD = 200; // 10 seconds
    private static final int DAMAGE_INTERVAL = 40;     // damage every 2 seconds once past threshold

    private static final Map<UUID, Integer> exposure = new HashMap<>();

    public static void register() {
        ServerTickEvents.END_WORLD_TICK.register(RainDamageHandler::onWorldTick);
    }

    private static void onWorldTick(ServerWorld world) {
        for (ServerPlayerEntity player : world.getPlayers()) {
            if (player.isCreative() || player.isSpectator()) {
                exposure.remove(player.getUuid());
                continue;
            }

            boolean inRain = isPlayerBeingRainedOn(world, player);

            if (inRain && !KongraArmorItem.hasFullSet(player)) {
                int ticks = exposure.getOrDefault(player.getUuid(), 0) + 1;
                exposure.put(player.getUuid(), ticks);

                if (ticks >= EXPOSURE_THRESHOLD && (ticks - EXPOSURE_THRESHOLD) % DAMAGE_INTERVAL == 0) {
                    float damage = 2.0f + ((ticks - EXPOSURE_THRESHOLD) / 200.0f);
                    DamageSource source = world.getDamageSources().magic();
                    player.damage(source, Math.min(damage, 8.0f));
                }
            } else {
                // Recover exposure gradually when sheltered or wearing full KONGRA set.
                int ticks = exposure.getOrDefault(player.getUuid(), 0);
                if (ticks > 0) {
                    exposure.put(player.getUuid(), Math.max(0, ticks - 2));
                }
            }
        }
    }

    private static boolean isPlayerBeingRainedOn(ServerWorld world, ServerPlayerEntity player) {
        if (!world.isRaining()) {
            return false;
        }
        return world.isSkyVisible(player.getBlockPos())
                && world.getBiome(player.getBlockPos()).value().hasPrecipitation()
                && !world.getBiome(player.getBlockPos()).value().isCold(player.getBlockPos());
    }
}