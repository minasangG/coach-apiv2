package com.clark.coachapi.service;

import com.clark.coachapi.entity.Player;
import com.clark.coachapi.entity.Training;
import com.clark.coachapi.exceptions.PlayerNotFoundException;

import java.util.List;
import java.util.Optional;

public interface PlayerService {

    Player create(Player player);

    Player findById(Long playerId) throws PlayerNotFoundException;

    List<Player> players();

    Player findPlayerByFirstAndLastName(String firstName, String lastName) throws PlayerNotFoundException;

    Player update(Long playerId, Player player) throws PlayerNotFoundException;

    void delete(Long playerId) throws PlayerNotFoundException;

    //void unavailable(String firstName, String lastName);

    //void available(String firstName, String lastName);

    List<Training> trainingByPlayer(Long playerId) throws PlayerNotFoundException;





}
