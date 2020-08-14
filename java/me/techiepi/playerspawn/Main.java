package me.techiepi.playerspawn;

import me.techiepi.playerspawn.listeners.OnPlayerJoin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        boolean teleport = getConfig().getBoolean("TeleportOnSpawn");

        if(teleport){
            double x = getConfig().getDouble("Location.X");
            double y = getConfig().getDouble("Location.Y");
            double z = getConfig().getDouble("Location.Z");

            OnPlayerJoin playerJoinListener = new OnPlayerJoin(x, y, z);

            getServer().getPluginManager().registerEvents(playerJoinListener, this);
        }

        saveDefaultConfig();
    }
}
