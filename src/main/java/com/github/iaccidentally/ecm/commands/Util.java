/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.iaccidentally.ecm.commands;

import com.github.iaccidentally.ecm.CommandManager;
import com.github.iaccidentally.ecm.configuration.Configuration;
import com.github.iaccidentally.ecm.configuration.Language;
import org.bukkit.ChatColor;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.util.BlockVector;

/**
 *
 * @author Whisk
 */
public class Util {
    private static String message;

    public static void log(String string) {
        throw new UnsupportedOperationException("Not yet implemented");
    }


    public static void sendInvalid(Command cmd, String[] args) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public static BlockVector toVector(Block block) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    /**
     * Checks if the command sender has a permission.
     * @param node The permissions node.
     * @return true is the sender has a permission, false if not.
     */
    public static boolean senderHasPermission(String node) {
        CommandSender sender = CommandManager.getSender();
        boolean usePermissions = Configuration.getBoolean("configuration.use-permissions");
        
        // Console always has the permissions
        Player player;
        if (isPlayer()) player = (Player) sender;
        else return true;
        
        // If permissions are not used, check for op
        if(!usePermissions) { 
            if(player.isOp()) return true;
            else return false;
        }
        
        if(player.hasPermission("ecm." + node))
            return true;
        return false;
    }
    
    /**
     * Checks if the command sender has a permission.
     * @param node The permission node
     * @return true is the sender has a permission,  false if not.
     * 
     */
    public static boolean playerHasPermission(Player player, String node) {
        boolean usePermissions = Configuration.getBoolean("configuration.use-permissions");
        
        if(!usePermissions) {
            if(player.isOp()) return true;
            else return false;
            
        }
        if(player.hasPermission("ecm." + node))
            return true;
        return false;
        
    }
    
    public static boolean isPlayer() {
        CommandSender sender = CommandManager.getSender();
        
        if(sender instanceof Player) return true;
        else return false;
    }
    
    public static boolean debugEnabled() {
        if(Configuration.getBoolean("configuration.debug-mod")) return true;
        else return false;
    }
    
    public static void sendMessage(String message)
    {
        CommandSender sender = CommandManager.getSender();
        sender.sendMessage(message);
    }


    public static void sendSuccess(String string)
    {
        CommandSender sender = CommandManager.getSender();
        String title = Language.getString("general.title");
        sender.sendMessage(ChatColor.GREEN + "[" + title + "]" + ChatColor.WHITE + message);
    }
    
    public static void sendDenied(String[] args)
    {
        CommandSender sender = CommandManager.getSender();
        String title = Language.getString("general.title");
        String message = Language.getString("general.access-denied");
        String command = "";
        for(int i = 0; i < args.length; i++)
            command = command + " " + args[i];
        log(sender.getName() + " was denied to use a command (/" + command + ")");
    }

}