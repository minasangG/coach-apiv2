package com.clark.coachapi.service.Implementations;

import com.clark.coachapi.repository.RoutineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RoutineServiceImplementation {

    private RoutineRepository routineRepository;
}
