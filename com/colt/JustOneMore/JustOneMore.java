package com.colt.JustOneMore;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class JustOneMore extends JavaPlugin implements Listener {
	
	public void onEnable() {
	    Bukkit.getPluginManager().registerEvents(this, this);
	}

	@EventHandler
	public void ping(ServerListPingEvent e) {
		e.setMaxPlayers(e.getNumPlayers() + 1);
	}
}
