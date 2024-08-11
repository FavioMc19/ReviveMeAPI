


package net.kokoricraft.reviveme.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import net.kokoricraft.reviveme.objects.DownedPlayer;

public class DownedDeathEvent extends Event{
    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private final Player player;
    private final DownedPlayer downed;

    public DownedDeathEvent(Player player, DownedPlayer downed) {
        this.player = player;
        this.downed = downed;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    public Player getPlayer() {
        return this.player;
    }

    public DownedPlayer getDownedPlayer() {
        return this.downed;
    }

}
