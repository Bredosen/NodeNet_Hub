package node.net.hub;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class NoBlockBreakEvent implements Listener {

    @EventHandler
    public final void noBlockBreak(final BlockBreakEvent event) {
        Player player = event.getPlayer();
        if (player.isOp()) return;
        event.setCancelled(true);
    }
}
