package node.net.hub;

import node.net.core.managers.EventManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class NodeNetHub extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        EventManager.registerEvent(new NoBlockBreakEvent());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
