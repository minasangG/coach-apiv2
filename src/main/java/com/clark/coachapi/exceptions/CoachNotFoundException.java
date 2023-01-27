package com.clark.coachapi.exceptions;

public class CoachNotFoundException extends Exception{

    public CoachNotFoundException() {
        super("Coach cannot be found");
    }

}
