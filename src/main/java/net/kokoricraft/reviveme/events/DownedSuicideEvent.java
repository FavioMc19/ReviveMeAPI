package net.kokoricraft.reviveme.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import net.kokoricraft.reviveme.objects.DownedPlayer;

public class DownedSuicideEvent extends Event implements Cancellable{
    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private final Player player;
    private final DownedPlayer downed;
    private Boolean isCancelled;

    public DownedSuicideEvent(Player player, DownedPlayer downed) {
        this.player = player;
        this.downed = downed;
        this.isCancelled = false;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    @Override
    public boolean isCancelled() {
        return this.isCancelled;
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

    @Override
    public void setCancelled(boolean cancelled) {
        this.isCancelled = cancelled;
    }

}
