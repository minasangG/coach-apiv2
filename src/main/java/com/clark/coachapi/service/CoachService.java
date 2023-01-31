package com.clark.coachapi.service;

import com.clark.coachapi.entity.Coach;
import com.clark.coachapi.exceptions.CoachNotFoundException;

import java.util.List;

public interface CoachService {

    Coach create(Coach coach);

    Coach findCoachById(Long coachId) throws CoachNotFoundException;

    List<Coach> coach();

    Coach findByFirstNameAndLastName(String firstname, String lastname) throws
            CoachNotFoundException;

    Coach update(Long coachId, Coach coach) throws CoachNotFoundException;

    void delete(Long coachId) throws CoachNotFoundException;

    void unavailable(String firstName, String lastName) throws CoachNotFoundException;

    void available(String firstName, String lastName) throws CoachNotFoundException;
}
