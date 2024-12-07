package me.lukyn76.snowballs;

import me.lukyn76.snowballs.listeners.HitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Snowballs extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new HitEvent(), this);
        getLogger().info("Snowballs plugin enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Snowballs plugin disabled!");
    }
}
