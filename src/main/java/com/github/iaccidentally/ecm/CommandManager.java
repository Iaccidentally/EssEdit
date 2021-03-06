/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.iaccidentally.ecm;

import com.github.iaccidentally.ecm.commands.Util;
import javax.tools.JavaFileManager;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 *
 * @author casdorph.gavin
 */
public class CommandManager {
    private static CommandSender sender;
    private static ECM plugin;
    
    private static Location[] loc = {null, null};

    public static void setLocation(JavaFileManager.Location loc, int i) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    public CommandManager(ECM plugin) {
        CommandManager.plugin = plugin;
        plugin.getLogger();
    }
    
    
            

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        CommandManager.sender = sender;
        
        Player player = null;
        if(Util.isPlayer());
        {
            player = (Player) sender;
        }
        
        // Parse the commands
        if(args[0].equalsIgnoreCase("adduser"))
        {
            
        }
        else if(args[0].equalsIgnoreCase("copy"))
        {
            
        }
        else if(args[0].equalsIgnoreCase("cut"))
        {
            
        }
        else if(args[0].equalsIgnoreCase("deluser"))
        {
            
        }
        else if(args[0].equalsIgnoreCase("move"))
        {
            
        }
        else if(args[0].equalsIgnoreCase("paste"))
        {
            
        }
        else if(args[0].equalsIgnoreCase("pos1"))
        {
            
        }
        else if(args[0].equalsIgnoreCase("pos2"))
        {
            
        }
        else if(args[0].equalsIgnoreCase("replace"))
        {
            
        }
        else if(args[0].equalsIgnoreCase("rotate"))
        {
            
        }
        else if(args[0].equalsIgnoreCase("set"))
        {
            
        }
        else
        {
            Util.sendInvalid(cmd, args);
            return false;
        }
        
        if (Util.debugEnabled() && Util.isPlayer()) Util.log(player.getName() + " sent a command : " + cmd.getName() + " " + args[0]);
        
        return true;
    }
    
    public static ECM getPlugin(){
        return plugin;
    }
    
    public static CommandSender getSender() {
        return sender;
    }
    
    public static Location[] getLocation() {
        return loc;
    }
    
    public static void setLocation(Location newLoc, int id) {
        loc[id] = newLoc;
    }
}