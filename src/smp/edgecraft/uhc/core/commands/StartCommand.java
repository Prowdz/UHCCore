package smp.edgecraft.uhc.core.commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import smp.edgecraft.uhc.core.managers.UHCManager;

@CommandInfo(aliases = { "start" }, description = "Starts the UHC")
public class StartCommand extends GameCommand {

    @Override
    public void onCommand(Player player, String[] args) {
        UHCManager.start();
        UHCManager.title(ChatColor.GOLD + "Let the games begin!", "");
    }

}
