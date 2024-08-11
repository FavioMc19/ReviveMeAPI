package net.kokoricraft.reviveme.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import net.kokoricraft.reviveme.objects.DownedPlayer;
import net.kokoricraft.reviveme.objects.ReviveZone;

public class PlayerRelivingZoneEvent extends Event implements Cancellable{
    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private Boolean isCancelled;
    private final Player player;
    private final DownedPlayer downed;
    private final ReviveZone zone;

    public PlayerRelivingZoneEvent(Player player, ReviveZone zone, DownedPlayer downed) {
        this.isCancelled = false;
        this.player = player;
        this.zone = zone;
        this.downed = downed;
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

    public ReviveZone getReviveZone() {
        return this.zone;
    }

    public int getCurrentDoneCount() {
        return this.downed.getDoneRelivingCount();
    }

    public int getMaxRelivingCount() {
        return this.downed.getMaxRelivingCount();
    }

}
