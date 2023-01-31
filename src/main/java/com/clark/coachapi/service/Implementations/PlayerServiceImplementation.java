package com.clark.coachapi.service.Implementations;

import com.clark.coachapi.entity.Player;
import com.clark.coachapi.repository.PlayerRepository;
import com.clark.coachapi.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PlayerServiceImplementation implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public Player create(Player player) {
        return null;
    }

    @Override
    public Player findById(Long playerId) {
        return null;
    }

    @Override
    public List<Player> player() {
        return null;
    }

    @Override
    public Player findPlayerByFirstAndLastName(String firstName, String lastName) {
        return null;
    }

    @Override
    public Player update(Long playerId, Player player) {
        return null;
    }

    @Override
    public void delete(Long playerId) {

    }

    @Override
    public void unavailable(String firstName, String lastName) {

    }

    @Override
    public void available(String firstName, String lastName) {

    }


}
