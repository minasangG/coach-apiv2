package com.clark.coachapi.service;

import com.clark.coachapi.entity.Player;

import java.util.List;

public interface PlayerService {

    Player create(Player player);

    Player findById(Long playerId);

    List<Player> player();

    Player findPlayerByFirstAndLastName(String firstName, String lastName);

    Player update(Long playerId, Player player);

    void delete(Long playerId);

    void unavailable(String firstName, String lastName);

    void available(String firstName, String lastName);





}
