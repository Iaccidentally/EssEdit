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

	/*
	 * I think we should use this format for messages! This way all will look
	 * ~the same!
	 */

	/*
	 * @param Player player and a Message in a string
	 */
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

	/*
	 * @param Player player and a Message in a string
	 */
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

	public void configMadeMessage(Player player, String type, String message) {
		String MessageFormat = CommandManager.getPlugin().getConfig().getString(type);
		MessageFormat = MessageFormat.replace("[black]", black.toString()).replace("[dark_blue]", dark_blue.toString()).replace("[dark_green]", dark_green.toString()).replace("[dark_aqua]", dark_aqua.toString()).replace("[dark_red]", dark_red.toString()).replace("[dark_purple]", dark_purple.toString()).replace("[gold]", gold.toString()).replace("[gray]", gray.toString()).replace("[dark_grey]", dark_grey.toString()).replace("[blue]", blue.toString()).replace("[green]", green.toString()).replace("[aqua]", aqua.toString()).replace("[red]", red.toString()).replace("[light_purple]", light_purple.toString()).replace("[yellow]", yellow.toString()).replace("[white]", white.toString()).replace("[magic]", magic.toString()).replace("[bold]", bold.toString()).replace("[strike]", strike.toString()).replace("[underline]", underline.toString()).replace("[italic]", italic.toString());
		if (message != "noUse") {
			player.sendMessage(MessageFormat + message);
		} else {
			player.sendMessage(MessageFormat);
		}

	}
}
