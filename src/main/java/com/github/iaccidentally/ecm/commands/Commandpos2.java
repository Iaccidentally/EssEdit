package com.github.iaccidentally.ecm.commands;

import com.github.iaccidentally.ecm.CommandManager;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;

public class Commandpos2 {
    public static void run(Command cmd, String[] args)
    {
        if(!Util.isPlayer() || !Util.senderHasPermission("ecm.select"))
        {
            Util.sendDenied(args);
            return;
        }
        
        Location loc = null;
        Player player = (Player) CommandManager.getSender();
        
        if(args[1].equalsIgnoreCase("pos2"))
        {
            loc = (Location) player.getLocation();
            Util.sendSuccess ("Second point selected (" + loc.getBlockX() + ", " + loc.getBlockY() + ", " + loc.getBlockZ() + ")");
            CommandManager.setLocation(loc, 1);
        }
        else
        {
            Util.sendInvalid(cmd, args);
        }
    }
}
