package com.clark.coachapi.service.Implementations;

import com.clark.coachapi.entity.Coach;
import com.clark.coachapi.entity.Enums.TrainingAvailability;
import com.clark.coachapi.entity.Training;
import com.clark.coachapi.exceptions.CoachNotFoundException;
import com.clark.coachapi.repository.CoachRepository;
import com.clark.coachapi.service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CoachServiceImplementation implements CoachService {

    @Autowired
    private CoachRepository coachRepository;

    @Override
    public Coach create(Coach coach) {
        coach.setAvailability(TrainingAvailability.AVAILABLE);
        return coachRepository.save(coach);
    }

    @Override
    public Coach findCoachById(Long coachId) throws CoachNotFoundException {
        return coachRepository.findById(coachId)
                .orElseThrow(() -> new CoachNotFoundException(coachId));
    }

    @Override
    public List<Coach> coach() {
        return coachRepository.findAll();
    }

    @Override
    public Coach findByFirstNameAndLastName(String firstName, String lastName) throws CoachNotFoundException {
        return coachRepository.findByFirstNameAndLastName(firstName, lastName)
                .orElseThrow(()-> new CoachNotFoundException("Coach" + firstName + " " + lastName
                                                            + "is not available"));
    }

    @Override
    public Coach update(Long coachId, Coach coach) throws CoachNotFoundException {
        Coach coachDB = coachRepository.findById(coachId)
                .orElseThrow(() -> new CoachNotFoundException(coachId));

        if (Objects.nonNull(coach.getFirstName()) &&
                !"".equalsIgnoreCase(coach.getFirstName())) {
            coachDB.setFirstName(coach.getFirstName());
        }
        if (Objects.nonNull(coach.getLastName()) &&
                !"".equalsIgnoreCase(coach.getLastName())) {
            coachDB.setLastName(coach.getLastName());
        }

        return coachRepository.save(coachDB);
    }

    @Override
    public void delete(Long coachId) throws CoachNotFoundException {
        Coach coach = coachRepository.findById(coachId)
                .orElseThrow(() -> new CoachNotFoundException(coachId));
    }

    @Override
    public void unavailable(String firstName, String lastName) throws CoachNotFoundException {
        Coach coach = coachRepository.findByFirstNameAndLastName(firstName, lastName)
                .orElseThrow(() -> new CoachNotFoundException("" +
                        "Doctor" + firstName + "," + lastName));
        coach.setAvailability(TrainingAvailability.UNAVAILABLE);

    }

    @Override
    public void available(String firstName, String lastName) throws CoachNotFoundException {
            Coach coach = coachRepository.findByFirstNameAndLastName(firstName, lastName)
                    .orElseThrow(() -> new CoachNotFoundException("" +
                            "Doctor" + firstName + "," + lastName));
            coach.setAvailability(TrainingAvailability.AVAILABLE);
    }

}
