package com.clark.coachapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class TrainingDataNotFoundException extends Exception {

    public TrainingDataNotFoundException (String message) {
        super("Training Data cannot be found");
    }
}
