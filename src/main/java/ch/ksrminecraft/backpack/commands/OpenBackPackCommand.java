package ch.ksrminecraft.backpack.commands;

import ch.ksrminecraft.backpack.BackPack;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class OpenBackPackCommand implements CommandExecutor {


    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        // Überprüfen, ob der Commandsender ein Spieler war
        if (!(commandSender instanceof Player)) {
            return true;
        }

        Player player = (Player) commandSender;

        // mit /bp das Backpack öffnen
        player.openInventory(BackPack.getPlugin().getSharedBackpack());


        return true;
    }
}
