import ls.Events;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
  public void onEnable() {
    PluginManager pluginManager = Bukkit.getPluginManager();
    pluginManager.registerEvents((Listener)new Events((Plugin)this), (Plugin)this);
  }
  
  public void onDisable() {}
}
