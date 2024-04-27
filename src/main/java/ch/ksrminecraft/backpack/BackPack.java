package ch.ksrminecraft.backpack;

import ch.ksrminecraft.backpack.commands.OpenBackPackCommand;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;

public final class BackPack extends JavaPlugin {

    private Inventory sharedBackpack;
    private static BackPack plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;

        // Gemeinsames Inventar erstellen
        sharedBackpack = Bukkit.createInventory(null, 27, "Gemeinsamer Rucksack");

        // Command registrieren
        getCommand("backpack").setExecutor(new OpenBackPackCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public Inventory getSharedBackpack() {
        return sharedBackpack;
    }

    public static BackPack getPlugin() {
        return plugin;
    }
}
