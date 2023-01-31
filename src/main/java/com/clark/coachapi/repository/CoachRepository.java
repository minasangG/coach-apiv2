package com.clark.coachapi.repository;

import com.clark.coachapi.entity.Coach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CoachRepository extends JpaRepository<Coach, Long> {

    Optional<Coach> findByFirstNameAndLastName (
        String firstname,
        String lastname
    );

}
