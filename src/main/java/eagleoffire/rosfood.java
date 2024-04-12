package eagleoffire;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;

public final class rosfood extends JavaPlugin {
  @Override
  public void onEnable() {
    // Plugin startup logic
        System.out.println("It's muffin time !!!");
        BukkitScheduler scheduler = getServer().getScheduler();
        scheduler.scheduleSyncRepeatingTask(this, new Runnable() {
            @Override
            public void run() {
                for (Player p : Bukkit.getOnlinePlayers()){
                    if(p.getFoodLevel() > 0) {
                        p.setFoodLevel(p.getFoodLevel() - 1);
                    }
                }
            }
        }, 0L, 43200L);
  }

  @Override
  public void onDisable() {
      // Plugin shutdown logic
      System.out.println("I'm so full!");
  }
}