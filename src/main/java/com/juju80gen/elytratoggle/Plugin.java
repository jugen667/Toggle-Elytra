package com.juju80gen.elytratoggle;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import com.juju80gen.elytratoggle.commands.CommandHelp;

/*
 * elytratoggle java plugin v1.0
 */
public class Plugin extends JavaPlugin
{
    private static final Logger LOGGER=Logger.getLogger("elytratoggle");

    @Override
    public void onEnable()
    {
        LOGGER.info("[ElytraToggle] elytratoggle enabled");
        getCommand("helptoggle").setExecutor(new CommandHelp());
        Bukkit.getPluginManager().registerEvents(new ElytraEvent(), this);
    } 
    @Override
    public void onDisable()
    { 
        LOGGER.info("[ElytraToggle] elytratoggle disabled");
    }
}
