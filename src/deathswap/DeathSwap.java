package deathswap;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class DeathSwap extends JavaPlugin implements Listener,CommandExecutor {
	public static DeathSwap m;

	public static DeathSwap receberMain() {
		return m;
	}
	
	public static int taskTP;
	public static int delay;
	public static Boolean iniciou;
	public static Player jogador1;
	public static Player jogador2;
	
	public void onEnable() {
		delay = 290;
		iniciou = false;
		m = this;
		
		try {
			int pluginId = 13238;
	        Metrics metrics = new Metrics(this, pluginId);
	        metrics.addCustomChart(new Metrics.SimplePie("online_mode", () -> String.valueOf(Bukkit.getServer().getOnlineMode())));
		} catch (Exception e) {
			Bukkit.getConsoleSender().sendMessage("Error while setting-up Metrics: " + e);
			Bukkit.getConsoleSender().sendMessage("Please report this at https://dev.bukkit.org/projects/minecraft-death-swap (if you want to) ;)");
		}
        
		Bukkit.getConsoleSender().sendMessage(" ");
		Bukkit.getConsoleSender().sendMessage("§aDEATHSWAP");
		Bukkit.getConsoleSender().sendMessage(" §aThe §fDeathSwap v1.0 §aplugin was suceffuly initialized.");
		Bukkit.getConsoleSender().sendMessage(" §aTo help, use §f/ds§a!");
		Bukkit.getConsoleSender().sendMessage(" ");

		getCommand("ds").setExecutor(this);
		//Bukkit.getPluginManager().registerEvents(new onJoin(), this);
	}

	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage(" ");
		Bukkit.getConsoleSender().sendMessage("§cDEATHSWAP");
		Bukkit.getConsoleSender().sendMessage(" §cThe §fDeathSwap v1.0 §cplugin was suceffuly finished.");
		Bukkit.getConsoleSender().sendMessage(" ");
	}
	
	public static Boolean first = false;

	public static void iniciar() {
		DeathSwap.taskTP = Bukkit.getScheduler().scheduleSyncRepeatingTask(DeathSwap.receberMain(), new Runnable() {
	          public void run() {
	        	if (first == false) {
	        		first = true;
	      		} else {
	            	Bukkit.getScheduler().scheduleSyncDelayedTask(DeathSwap.receberMain(), new Runnable() {
	    				public void run() {
	    					for (Player todos : Bukkit.getOnlinePlayers()) {
	    						todos.sendMessage(" ");
	    						todos.sendMessage("§a§lDEATH SWAP:");
	    						todos.sendMessage(" §aSwapping in §f10 seconds§a.");
	    						todos.playSound(todos.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);
	    					}
	    					Bukkit.getScheduler().scheduleSyncDelayedTask(DeathSwap.receberMain(), new Runnable() {
	    	    				public void run() {
	    	    					for (Player todos : Bukkit.getOnlinePlayers()) {
	    	    						todos.sendMessage(" §aSwapping in §f9 seconds§a.");
	    	    						todos.playSound(todos.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);
	    	    					}
	    	    					
	    	    					Bukkit.getScheduler().scheduleSyncDelayedTask(DeathSwap.receberMain(), new Runnable() {
	    	    	    				public void run() {
	    	    	    					for (Player todos : Bukkit.getOnlinePlayers()) {
	    	    	    						todos.sendMessage(" §aSwapping in §f8 seconds§a.");
	    	    	    						todos.playSound(todos.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);
	    	    	    					}
	    	    	    					Bukkit.getScheduler().scheduleSyncDelayedTask(DeathSwap.receberMain(), new Runnable() {
	    	    	    	    				public void run() {
	    	    	    	    					for (Player todos : Bukkit.getOnlinePlayers()) {
	    	    	    	    						todos.sendMessage(" §aSwapping in §f7 seconds§a.");
	    	    	    	    						todos.playSound(todos.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);
	    	    	    	    					}
	    	    	    	    					Bukkit.getScheduler().scheduleSyncDelayedTask(DeathSwap.receberMain(), new Runnable() {
	    	    	    	    	    				public void run() {
	    	    	    	    	    					for (Player todos : Bukkit.getOnlinePlayers()) {
	    	    	    	    	    						todos.sendMessage(" §aSwapping in §f6 seconds§a.");
	    	    	    	    	    						todos.playSound(todos.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);
	    	    	    	    	    					}
	    	    	    	    	    					Bukkit.getScheduler().scheduleSyncDelayedTask(DeathSwap.receberMain(), new Runnable() {
	    	    	    	    	    	    				public void run() {
	    	    	    	    	    	    					for (Player todos : Bukkit.getOnlinePlayers()) {
	    	    	    	    	    	    						todos.sendMessage(" §aSwapping in §f5 seconds§a.");
	    	    	    	    	    	    						todos.playSound(todos.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);
	    	    	    	    	    	    					}
	    	    	    	    	    	    					Bukkit.getScheduler().scheduleSyncDelayedTask(DeathSwap.receberMain(), new Runnable() {
	    	    	    	    	    	    	    				public void run() {
	    	    	    	    	    	    	    					for (Player todos : Bukkit.getOnlinePlayers()) {
	    	    	    	    	    	    	    						todos.sendMessage(" §aSwapping in §f4 seconds§a.");
	    	    	    	    	    	    	    						todos.playSound(todos.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);
	    	    	    	    	    	    	    					}
	    	    	    	    	    	    	    					Bukkit.getScheduler().scheduleSyncDelayedTask(DeathSwap.receberMain(), new Runnable() {
	    	    	    	    	    	    	    	    				public void run() {
	    	    	    	    	    	    	    	    					for (Player todos : Bukkit.getOnlinePlayers()) {
	    	    	    	    	    	    	    	    						todos.sendMessage(" §aSwapping in §f3 seconds§a.");
	    	    	    	    	    	    	    	    						todos.playSound(todos.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);
	    	    	    	    	    	    	    	    					}
	    	    	    	    	    	    	    	    					Bukkit.getScheduler().scheduleSyncDelayedTask(DeathSwap.receberMain(), new Runnable() {
	    	    	    	    	    	    	    	    	    				public void run() {
	    	    	    	    	    	    	    	    	    					for (Player todos : Bukkit.getOnlinePlayers()) {
	    	    	    	    	    	    	    	    	    						todos.sendMessage(" §aSwapping in §f2 seconds§a.");
	    	    	    	    	    	    	    	    	    						todos.playSound(todos.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);
	    	    	    	    	    	    	    	    	    					}
	    	    	    	    	    	    	    	    	    					Bukkit.getScheduler().scheduleSyncDelayedTask(DeathSwap.receberMain(), new Runnable() {
	    	    	    	    	    	    	    	    	    	    				public void run() {
	    	    	    	    	    	    	    	    	    	    					for (Player todos : Bukkit.getOnlinePlayers()) {
	    	    	    	    	    	    	    	    	    	    						todos.sendMessage(" §aSwapping in §f1 second§a.");
	    	    	    	    	    	    	    	    	    	    						todos.playSound(todos.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);
	    	    	    	    	    	    	    	    	    	    					}
	    	    	    	    	    	    	    	    	    	    					Bukkit.getScheduler().scheduleSyncDelayedTask(DeathSwap.receberMain(), new Runnable() {
	    	    	    	    	    	    	    	    	    	    	    				public void run() {
	    	    	    	    	    	    	    	    	    	    	    					for (Player todos : Bukkit.getOnlinePlayers()) {
	    	    	    	    	    	    	    	    	    	    	    						todos.sendMessage(" §aSwapping positions...");
	    	    	    	    	    	    	    	    	    	    	    						todos.sendMessage(" ");
	    	    	    	    	    	    	    	    	    	    	    						todos.playSound(todos.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);
	    	    	    	    	    	    	    	    	    	    	    					}
	    	    	    	    	    	    	    	    	    	    	    					
	    	    	    	    	    	    	    	    	    	    	    					try {
	    	    	    	    	    	    	    	    	    	    	    						Location player1loc = DeathSwap.jogador1.getLocation();
		    	    	    	    	    	    	    	    	    	    	    					Location player2loc = DeathSwap.jogador2.getLocation();
		    	    	    	    	    	    	    	    	    	    	    					
		    	    	    	    	    	    	    	    	    	    	    					DeathSwap.jogador1.teleport(player2loc);
		    	    	    	    	    	    	    	    	    	    	    					DeathSwap.jogador2.teleport(player1loc);
																											} catch (Exception e) {
																												for (Player todos : Bukkit.getOnlinePlayers()) {
																													todos.sendMessage(" §cA error ocurred while swapping.");
		    	    	    	    	    	    	    	    	    	    	    						todos.playSound(todos.getLocation(), Sound.BLOCK_NOTE_BLOCK_BASS, 1.0F, 1.0F);
		    	    	    	    	    	    	    	    	    	    	    					}
																											}
	    	    	    	    	    	    	    	    	    	    	    				}
	    	    	    	    	    	    	    	    	    	    	    			}, 20 * 1);
	    	    	    	    	    	    	    	    	    	    				}
	    	    	    	    	    	    	    	    	    	    			}, 20 * 1);
	    	    	    	    	    	    	    	    	    				}
	    	    	    	    	    	    	    	    	    			}, 20 * 1);
	    	    	    	    	    	    	    	    				}
	    	    	    	    	    	    	    	    			}, 20 * 1);
	    	    	    	    	    	    	    				}
	    	    	    	    	    	    	    			}, 20 * 1);
	    	    	    	    	    	    				}
	    	    	    	    	    	    			}, 20 * 1);
	    	    	    	    	    				}
	    	    	    	    	    			}, 20 * 1);
	    	    	    	    				}
	    	    	    	    			}, 20 * 1);
	    	    	    				}
	    	    	    			}, 20 * 1);
	    	    				}
	    	    				
	    	    			}, 20 * 1);
	    				}
	    			}, 20 * 1);
	            }
	          }
	        }, 0L, 20 * DeathSwap.delay);
	}

	public static void parar() {
		Bukkit.getScheduler().cancelTask(DeathSwap.taskTP);
	}
	
	public boolean onCommand(org.bukkit.command.CommandSender sender, Command command, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage(" ");
			sender.sendMessage("§c§lDEATH SWAP:");
			sender.sendMessage(" §cJust a player can run this command.");
			sender.sendMessage(" ");
			return false;
		}

		Player p = (Player) sender;
		if (command.getName().equalsIgnoreCase("ds") || command.getName().equalsIgnoreCase("deathswap")) {

			if (!p.hasPermission("ds.commands")) {
				p.sendMessage(" ");
				p.sendMessage("§c§lDEATH SWAP:");
				p.sendMessage(" §cYou dont have permission to execute this command.");
				p.sendMessage(" ");
				p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_BASS, 1.0F, 1.0F);
				return true;
			}

			if (args.length == 0) {
				p.sendMessage(" ");
				p.sendMessage("§a§lDEATH SWAP:");
				p.sendMessage(" §f/ds start §a» Start the game");
				p.sendMessage(" §f/ds stop §a» Stop the game");
				p.sendMessage(" §f/ds players §a» Define the players");
				p.sendMessage(" §f/ds time §a» Change the swap time");
				p.sendMessage(" ");
				p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);
				return true;

			}
			if (args[0].equalsIgnoreCase("start")) {
				if (DeathSwap.jogador1 == null || DeathSwap.jogador2 == null) {
					p.sendMessage(" ");
					p.sendMessage("§c§lDEATH SWAP:");
					p.sendMessage(" §cFirst, you need to define the players.");
					p.sendMessage(" §cUse §f/ds players§c.");
					p.sendMessage(" ");
					p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_BASS, 1.0F, 1.0F);
					return true;
				}
				if (DeathSwap.iniciou) {
					p.sendMessage(" ");
					p.sendMessage("§c§lDEATH SWAP:");
					p.sendMessage(" §cThe game is already started.");
					p.sendMessage(" ");
					p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_BASS, 1.0F, 1.0F);
					
				} else if (DeathSwap.iniciou == false) {
					DeathSwap.first = false;
					DeathSwap.iniciar();
					DeathSwap.iniciou = true;
					
					for (Player todos : Bukkit.getOnlinePlayers()) {
						todos.sendMessage(" ");
						todos.sendMessage("§a§lDEATH SWAP:");
						todos.sendMessage(" §aThe game has started.");
						todos.sendMessage(" ");
						todos.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);
					}
				}
			} else if (args[0].equalsIgnoreCase("stop")) {
				
				if (DeathSwap.iniciou == false) {
					p.sendMessage(" ");
					p.sendMessage("§c§lDEATH SWAP:");
					p.sendMessage(" §cThe game is not started.");
					p.sendMessage(" ");
					p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_BASS, 1.0F, 1.0F);
					
				} else if (DeathSwap.iniciou) {
					for (Player todos : Bukkit.getOnlinePlayers()) {
						todos.sendMessage(" ");
						todos.sendMessage("§a§lDEATH SWAP:");
						todos.sendMessage(" §aThe game has stopped.");
						todos.sendMessage(" ");
						todos.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);
						DeathSwap.parar();
						DeathSwap.iniciou = false;
					}
				}
				
			} else if (args[0].equalsIgnoreCase("players")) {
				if (!(args.length == 3)) {
					p.sendMessage(" ");
					p.sendMessage("§c§lDEATH SWAP:");
					p.sendMessage(" §cCorrect usage to §f/ds players§c:");
					p.sendMessage(" §f/ds players [player1] [player2]");
					p.sendMessage(" ");
					p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_BASS, 1.0F, 1.0F);
				} else {
					try {
						DeathSwap.jogador1 = p.getServer().getPlayer(args[1]);
					} catch (Exception e) {
						p.sendMessage(" ");
						p.sendMessage("§c§lDEATH SWAP:");
						p.sendMessage(" §cPlayer 1 not found.");
						p.sendMessage(" ");
						p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_BASS, 1.0F, 1.0F);
						return true;
					}
					
					try {
						DeathSwap.jogador2 = p.getServer().getPlayer(args[2]);
					} catch (Exception e) {
						p.sendMessage(" ");
						p.sendMessage("§c§lDEATH SWAP:");
						p.sendMessage(" §cPlayer 2 not found.");
						p.sendMessage(" ");
						p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_BASS, 1.0F, 1.0F);
						return true;
					}
					
					p.sendMessage(" ");
					p.sendMessage("§a§lDEATH SWAP:");
					p.sendMessage(" §aSuccessfully defined players.");
					p.sendMessage(" §aPlayer 1: §f" + DeathSwap.jogador1.getName());
					p.sendMessage(" §aPlayer 2: §f" + DeathSwap.jogador2.getName());
					p.sendMessage(" ");
					p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);
				}
			} else if (args[0].equalsIgnoreCase("time")) { 
				if (!(args.length == 2)) {
					p.sendMessage(" ");
					p.sendMessage("§c§lDEATH SWAP:");
					p.sendMessage(" §cCorrect usage to §f/ds time§c:");
					p.sendMessage(" §f/ds time [timeInMinutes]");
					p.sendMessage(" §cDefault: §f5 minutes§a.");
					p.sendMessage(" ");
					p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_BASS, 1.0F, 1.0F);
				} else {
					if (DeathSwap.iniciou) {
						p.sendMessage(" ");
						p.sendMessage("§c§lDEATH SWAP:");
						p.sendMessage(" §cThe game is started. Please, stop the game to change swap delay.");
						p.sendMessage(" ");
						p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_BASS, 1.0F, 1.0F);
						return true;
					}
					if (args[1] == "0") {
						p.sendMessage(" ");
						p.sendMessage("§c§lDEATH SWAP:");
						p.sendMessage(" §cInvalid time.");
						p.sendMessage(" ");
						p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_BASS, 1.0F, 1.0F);
						return true;
					}
					try {
						DeathSwap.delay = Integer.parseInt(args[1]) * 60 - 10;
						p.sendMessage(" ");
						p.sendMessage("§a§lDEATH SWAP:");
						p.sendMessage(" §aThe swap time has been changed.");
						p.sendMessage(" §aTime: §f" + args[1] + " minutes§a.");
						p.sendMessage(" ");
						p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);
					} catch (Exception e) {
						p.sendMessage(" ");
						p.sendMessage("§c§lDEATH SWAP:");
						p.sendMessage(" §cInvalid time.");
						p.sendMessage(" ");
						p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_BASS, 1.0F, 1.0F);
					}
				}
			} else {
				p.sendMessage(" ");
				p.sendMessage("§c§lDEATH SWAP:");
				p.sendMessage(" §cThe subcommand §f" + args[0] + " §cdoesnt exists.");
				p.sendMessage(" §cSee the list of available commands:");
				p.sendMessage(" ");
				p.sendMessage(" §f/ds start §c» Start the game");
				p.sendMessage(" §f/ds stop §c» Stop the game");
				p.sendMessage(" §f/ds players §c» Define the players");
				p.sendMessage(" §f/ds time §c» Change the swap time");
				p.sendMessage(" ");
				p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_BASS, 1.0F, 1.0F);
				
			}
		}
		return false;
	}

}
