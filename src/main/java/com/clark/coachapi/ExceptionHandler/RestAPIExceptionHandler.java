package com.clark.coachapi.ExceptionHandler;

import com.clark.coachapi.entity.Player;
import com.clark.coachapi.exceptions.*;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class RestAPIExceptionHandler {

    @ExceptionHandler(CoachNotAvailableException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public String coachNotAvailable(@NotNull CoachNotAvailableException e) {
        return e.getMessage();
    }

    @ExceptionHandler(CoachNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public String coachNotFound(@NotNull CoachNotAvailableException e) {
        return e.getMessage();
    }

    @ExceptionHandler(PlayerNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public String playerNotFound(@NotNull PlayerNotFoundException e) {
        return e.getMessage();
    }


    @ExceptionHandler(TrainingCannotBeUpdatedException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public String trainingCannotBeUpdated(@NotNull TrainingCannotBeUpdatedException e) {
        return e.getMessage();
    }

    @ExceptionHandler(TrainingDataNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public String trainingDataNotFound(@NotNull TrainingDataNotFoundException e) {
        return e.getMessage();
    }
}

