package com.clark.coachapi.service.Implementations;

import com.clark.coachapi.repository.CoachRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CoachServiceImplementation {

    private CoachRepository coachRepository;

}
