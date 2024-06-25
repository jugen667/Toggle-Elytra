

package com.juju80gen.elytratoggle.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHelp implements CommandExecutor{
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args){
        if (sender instanceof Player){
            Player player = (Player)sender;
            // Command help for the plugin
            if(args.length != 0){
                if(args[0].equalsIgnoreCase("info")){
                    player.sendMessage("§6§l[ElytraToggle]" + "§b§r Version 1.0 §oby juju80gen§r");
                    return true;
                }
                else if(args[0].equalsIgnoreCase("help")){
                    player.sendMessage("§6§l[ElytraToggle]" + "§f§r Sneak to disable Elytra while flying or gliding");
                    return true;
                }
            }
            player.sendMessage("§6§l[ElytraToggle]" + "§b§r /helptoggle <option>");
            player.sendMessage("§7/helptoggle info" + "§f§r Info about the plugin");
            player.sendMessage("§7/helptoggle help" + "§f§r How to use");
        }
        return false;
    }
}
