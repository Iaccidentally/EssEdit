package com.github.iaccidentally.ecm;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

/* 
 * 
 * @author Joshua D. Katz
 * 
 */

public class Chat {
	public static ChatColor black = ChatColor.BLACK;
	public static ChatColor dark_blue = ChatColor.DARK_BLUE;
	public static ChatColor dark_green = ChatColor.DARK_GREEN;
	public static ChatColor dark_aqua = ChatColor.DARK_AQUA;
	public static ChatColor dark_red = ChatColor.DARK_RED;
	public static ChatColor dark_purple = ChatColor.DARK_PURPLE;
	public static ChatColor gold = ChatColor.GOLD;
	public static ChatColor gray = ChatColor.GRAY;
	public static ChatColor dark_grey = ChatColor.DARK_GRAY;
	public static ChatColor blue = ChatColor.BLUE;
	public static ChatColor green = ChatColor.GREEN;
	public static ChatColor aqua = ChatColor.AQUA;
	public static ChatColor red = ChatColor.RED;
	public static ChatColor light_purple = ChatColor.LIGHT_PURPLE;
	public static ChatColor yellow = ChatColor.YELLOW;
	public static ChatColor white = ChatColor.WHITE;
	public static ChatColor magic = ChatColor.MAGIC;
	public static ChatColor bold = ChatColor.BOLD;
	public static ChatColor strike = ChatColor.STRIKETHROUGH;
	public static ChatColor underline = ChatColor.UNDERLINE;
	public static ChatColor italic = ChatColor.ITALIC;
	public static ChatColor reset = ChatColor.RESET;

	// I think we should use this format for messages! This way all will look ~
	// the same!

	public void errorMessage(Player player, String message) {
		if (message == null) {
			String error = aqua + "[ECM " + underline + "Error" + aqua + "]"
					+ red + "You have made an error! See the logfile!";
			player.sendRawMessage(error);
		} else {
			String error = aqua + "[ECM " + underline + "Error" + aqua + "]"
					+ red + message;
			player.sendRawMessage(error);
		}
	}

	public void finishMessage(Player player, String message) {
		if (message == null) {
			String finished = aqua + "[ " + bold + " ECM " + aqua + "] "
					+ "You have finished that command!";
			player.sendRawMessage(finished);
		} else {
			String finished = aqua + "[ " + bold + " ECM " + aqua + "] "
					+ message;
			player.sendRawMessage(finished);
		}
	}

	public void messageFormat(Player player, String type) {
		String MessageType = CommandManager.getPlugin().getConfig()
				.getString(type);
		if (MessageType.contains("&0") || MessageType.contains("&1")
				|| MessageType.contains("&2") || MessageType.contains("&3")
				|| MessageType.contains("&4") || MessageType.contains("&5")
				|| MessageType.contains("&6") || MessageType.contains("&7")
				|| MessageType.contains("&8") || MessageType.contains("&a")
				|| MessageType.contains("&b") || MessageType.contains("&c")
				|| MessageType.contains("&d") || MessageType.contains("&e")
				|| MessageType.contains("&f") || MessageType.contains("&r")
				|| MessageType.contains("&k") || MessageType.contains("&o")
				|| MessageType.contains("&n") || MessageType.contains("&m")
				|| MessageType.contains("&l")) {
			
			//do more of this!
			
			MessageType.replace("&0", black.toString()).replace("&1", blue.toString()).replace("&2", dark_green.toString()).replace("&3", aqua.toString()).replace("&4", red.toString()).replace("&5", light_purple.toString()).replace("&6", "").replace("&7", gray.toString()).replace("&8", dark_grey.toString()).replace("&9", dark_aqua.toString()).replace("&a", green.toString()).replace("&b", blue.toString());
			
			
			
		}
	}
}
