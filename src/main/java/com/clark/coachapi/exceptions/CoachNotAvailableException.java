package com.clark.coachapi.exceptions;

public class CoachNotAvailableException extends Exception{

    public CoachNotAvailableException(Long coachId) {
        super("Coach" + coachId + "is not Available as of the moment");
    }

    public CoachNotAvailableException(String message) {
        super(message);
    }
}
