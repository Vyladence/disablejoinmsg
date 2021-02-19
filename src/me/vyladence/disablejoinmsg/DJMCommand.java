package me.vyladence.disablejoinmsg;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DJMCommand implements CommandExecutor {

    //Plugin Information Command
    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.GOLD + "DisableJoinMessage Version 1.0 by Vyladence and Callum");
            return true;
        } else {
            sender.sendMessage("DisableJoinMessage Version 1.0 by Vyladence and Callum");
            return true;
        }
    }

}