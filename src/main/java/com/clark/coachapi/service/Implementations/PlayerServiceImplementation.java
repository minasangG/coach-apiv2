package com.clark.coachapi.service.Implementations;

import com.clark.coachapi.entity.Coach;
import com.clark.coachapi.entity.Player;
import com.clark.coachapi.entity.Training;
import com.clark.coachapi.exceptions.PlayerNotFoundException;
import com.clark.coachapi.repository.PlayerRepository;
import com.clark.coachapi.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Service
public class PlayerServiceImplementation implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public Player create(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public Player findById(Long playerId) throws PlayerNotFoundException {
        return playerRepository.findById(playerId)
                .orElseThrow(()-> new PlayerNotFoundException(playerId));

    }

    @Override
    public List<Player> players() {
        return playerRepository.findAll();
    }

    @Override
    public Player findPlayerByFirstAndLastName(String firstName, String lastName)
            throws PlayerNotFoundException {
        return playerRepository.findPlayerByFirstAndLastName(firstName, lastName)
                .orElseThrow(() -> new PlayerNotFoundException(
                        "Player with ID no.:" + firstName + "," + lastName + "Cannot be found"
                ));
    }

    @Override
    public Player update(Long playerId, Player player) throws PlayerNotFoundException {
        Player playerDB = playerRepository.findById(playerId)
                .orElseThrow(() -> new PlayerNotFoundException(playerId));

        if (Objects.nonNull(player.getFirstName()) &&
            !"".equalsIgnoreCase(player.getFirstName())) {
            playerDB.setFirstName(player.getFirstName());
        }

        if (Objects.nonNull(player.getLastName()) &&
                !"".equalsIgnoreCase(player.getLastName())) {
            playerDB.setLastName(player.getLastName());
        }

        if (Objects.nonNull(player.getContactNumber()) &&
                !"".equalsIgnoreCase(player.getContactNumber())) {
            playerDB.setContactNumber(player.getContactNumber());
        }

        if (Objects.nonNull(player.getSex()) &&
                !"".equalsIgnoreCase(player.getSex())) {
            playerDB.setSex(player.getSex());
        }
        return playerRepository.save(playerDB);
    }

    @Override
    public void delete(Long playerId) throws PlayerNotFoundException {
        Player player = playerRepository.findById(playerId)
                .orElseThrow(() -> new PlayerNotFoundException(playerId));
    }//

    @Override
    public List<Training> trainingByPlayer(Long playerId) throws PlayerNotFoundException {
        return null;
    }
//    @Override
//    public void unavailable(String firstName, String lastName) {
//
//    }
//
//    @Override
//    public void available(String firstName, String lastName) {
//
//    }



}
