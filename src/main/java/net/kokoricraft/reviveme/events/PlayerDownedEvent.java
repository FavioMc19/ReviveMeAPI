package net.kokoricraft.reviveme.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

import net.kokoricraft.reviveme.objects.DownedPlayer;

public class PlayerDownedEvent extends Event implements Cancellable{
    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private boolean isCancelled;
    private final Player player;
    private final DownedPlayer downed;
    private final Player enemy;
    private final DamageCause cause;

    public PlayerDownedEvent(Player player, Player enemy, DownedPlayer downed, DamageCause cause) {
        this.isCancelled = false;
        this.player = player;
        this.downed = downed;
        this.enemy = enemy;
        this.cause = cause;
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

    public Player getPlayer() {
        return this.player;
    }

    public DownedPlayer getDownedPlayer() {
        return this.downed;
    }

    public Player getEnemy() {
        return this.enemy;
    }

    public DamageCause getCause() {
        return this.cause;
    }

}