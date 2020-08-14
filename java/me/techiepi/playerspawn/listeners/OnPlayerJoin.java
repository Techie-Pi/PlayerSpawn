package me.techiepi.playerspawn.listeners;

import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnPlayerJoin implements Listener {
    double[] rawPos = new double[3];

    public OnPlayerJoin(double x, double y, double z){
        rawPos[0] = x;
        rawPos[1] = y;
        rawPos[2] = z;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        if(rawPos != null){
            Location location = new Location(e.getPlayer().getWorld(), rawPos[0], rawPos[1], rawPos[2]);
            e.getPlayer().teleport(location);
        }
    }
}
