package com.clark.coachapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PlayerNotFoundException extends Exception{


    public PlayerNotFoundException(Long playerId) {
        super("Player with ID:" + playerId + "Cannot be Found.");
    }

    public PlayerNotFoundException(String message) {
        super(message);
    }

}
