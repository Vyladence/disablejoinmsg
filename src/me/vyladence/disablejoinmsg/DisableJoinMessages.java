package me.vyladence.disablejoinmsg;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class DisableJoinMessages extends JavaPlugin {

    @Override
    public void onEnable() {
        // Load Message
        System.out.println("Disable Join Message Loaded!");
        // Event Grabber for actual join-message-disabling
        Bukkit.getPluginManager().registerEvents(new Events(), this);
        // Command Executor
        getCommand("djm").setExecutor(new DJMCommand());
    }
}
