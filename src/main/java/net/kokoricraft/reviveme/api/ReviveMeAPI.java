package net.kokoricraft.reviveme.api;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

import net.kokoricraft.reviveme.ReviveMe;
import net.kokoricraft.reviveme.objects.DownedPlayer;

public class ReviveMeAPI {

    public static ReviveMe plugin = ReviveMe.getPlugin(ReviveMe.class);

    public static boolean isReliver(Player player) {
        return false;
    }

    public static DownedPlayer getDownedPlayer(Player player) {
        return null;
    }

    public static DownedPlayer getDownedPlayerByReliver(Player reviver) {
        return null;
    }

    public static void revivePlayer(Player player) {
    }

    public static void revivePlayer(Player player, Player reviver) {
    }

    public static void downPlayer(Player player) {
    }

    public static void downPlayer(Player player, Player enemy) {
    }

    public static void downPlayer(Player player, DamageCause cause) {
    }

    public static void downPlayer(Player player, DamageCause cause, Player enemy) {
    }

    public static boolean isDownable(EntityDamageEvent event) {
        return false;
    }

    public static boolean hasDowned(Player player) {
        return false;
    }

    public static void setDownedEntityPlayer(Entity entity) {
    }

    public static void setStandEntityPlayer(Entity entity) {
    }
}
