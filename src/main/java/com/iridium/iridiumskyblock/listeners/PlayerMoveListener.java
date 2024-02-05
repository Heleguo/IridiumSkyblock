package com.iridium.iridiumskyblock.listeners;

import com.iridium.iridiumcore.utils.StringUtils;
import com.iridium.iridiumskyblock.IridiumSkyblock;
import com.iridium.iridiumskyblock.database.LostItems;
import com.iridium.iridiumskyblock.database.User;
import com.iridium.iridiumteams.utils.LocationUtils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class PlayerMoveListener implements Listener {

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        User user = IridiumSkyblock.getInstance().getUserManager().getUser(event.getPlayer());

        IridiumSkyblock.getInstance().getTeamManager().sendIslandBorder(event.getPlayer());

        user.getCurrentIsland().ifPresent(island -> {
            // 移除的代码部分
            ArrayList<ItemStack> lostItems = new ArrayList<>();
            for (ItemStack item : event.getPlayer().getInventory().getContents()) {
                // ... （后续代码）
            }
