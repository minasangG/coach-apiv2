package com.clark.coachapi.repository;

import com.clark.coachapi.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {


//    Optional<Player> findById(
//
//    );

    Optional <Player> findPlayerByFirstAndLastName(
            String firstName,
            String lastName
    );
}
