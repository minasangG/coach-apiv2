package com.clark.coachapi.service.Implementations;

import com.clark.coachapi.repository.CoachRepository;
import com.clark.coachapi.repository.PlayerRepository;
import com.clark.coachapi.repository.TrainingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TrainingServiceImplementation {

    @Autowired
    private TrainingRepository trainingRepository;

    @Autowired
    private CoachRepository coachRepository;

    @Autowired
    private PlayerRepository playerRepository;


}
