package me.vyladence.disablejoinmsg;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class DisableJoinMessages extends JavaPlugin {

    // Modular Elements, is classes, structures similar to
    // how you've done it now, but slightly different

    @Override
    public void onEnable() {
        System.out.println("Disable Join Message Loaded!");
        Bukkit.getPluginManager().registerEvents(new Events(), this);
        getCommand("djm").setExecutor(new DJMCommand());

        // TODO Move the command from here to another class - Done!
        // TODO register the command - Done!
        // TODO remove usage of label as we are making it plugin-specific - ... :/
    }

    // brb, I'm just gonna get my phone from the charger

}