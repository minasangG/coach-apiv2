package com.clark.coachapi.service.Implementations;

import com.clark.coachapi.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PlayerServiceImplementation {

    private PlayerRepository playerRepository;
}
