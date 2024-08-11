package net.kokoricraft.reviveme.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import net.kokoricraft.reviveme.objects.DownedPlayer;

public class PlayerPickupDownedEvent extends Event implements Cancellable{
    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private boolean isCancelled;
    private final Player picker;
    private final DownedPlayer downed;

    public PlayerPickupDownedEvent(Player picker, DownedPlayer downed) {
        this.isCancelled = false;
        this.downed = downed;
        this.picker = picker;
    }

    @Override
    public boolean isCancelled() {
        return this.isCancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.isCancelled = cancelled;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    public Player getPicker() {
        return this.picker;
    }

    public DownedPlayer getDownedPlayer() {
        return this.downed;
    }
}
