package net.kokoricraft.reviveme.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import net.kokoricraft.reviveme.objects.DownedPlayer;

public class PlayerFirstStealEvent extends Event {
    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private final DownedPlayer downed;
    private final Player robber;

    public PlayerFirstStealEvent(DownedPlayer downed, Player robber) {
        this.downed = downed;
        this.robber = robber;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    public Player getPlayer() {
        return this.downed.getPlayer();
    }

    public DownedPlayer getDownedPlayer() {
        return this.downed;
    }

    public Player getEnemy() {
        return this.robber;
    }

}
