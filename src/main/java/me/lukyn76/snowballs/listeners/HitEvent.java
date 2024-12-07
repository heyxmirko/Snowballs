package me.lukyn76.snowballs.listeners;

import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class HitEvent implements Listener {

    @EventHandler
    void playerHitEvent(ProjectileHitEvent event) {
        if (!(event.getEntity() instanceof Snowball)) return;
        if (event.getHitEntity() instanceof Player player) player.setFreezeTicks(100);
    }
}