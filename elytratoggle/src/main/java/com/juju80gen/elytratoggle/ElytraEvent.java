package com.juju80gen.elytratoggle;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class ElytraEvent implements Listener {
    @EventHandler
    // Checking the player state : gliding and sneaking => remove the gliding state 
    public void onMove(PlayerMoveEvent event) {
        if (event.getPlayer().isGliding() && event.getPlayer().isSneaking()) {
            event.getPlayer().setGliding(false);
        }
    }
}
