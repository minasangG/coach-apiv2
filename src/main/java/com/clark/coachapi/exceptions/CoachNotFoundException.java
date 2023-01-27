package com.clark.coachapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CoachNotFoundException extends Exception{

    public CoachNotFoundException() {
        super("Coach cannot be found");
    }

}
