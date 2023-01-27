package com.clark.coachapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CoachNotAvailableException extends Exception{

    public CoachNotAvailableException(Long coachId) {
        super("Coach" + coachId + "is not Available as of the moment");
    }

    public CoachNotAvailableException(String message) {
        super(message);
    }
}
