package com.clark.coachapi.service.Implementations;

import com.clark.coachapi.repository.TrainingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TrainingServiceImplementation {

    private TrainingRepository trainingRepository;
}
