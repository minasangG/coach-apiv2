package com.clark.coachapi.exceptions;

public class PlayerNotFoundException extends Exception{


    public PlayerNotFoundException(Long playerId) {
        super("Player with ID:" + playerId + "Cannot be Found.");
    }

    public PlayerNotFoundException(String message) {
        super(message);
    }
}
