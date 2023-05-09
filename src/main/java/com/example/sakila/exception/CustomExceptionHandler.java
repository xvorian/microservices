package com.example.sakila.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(value = {ResourceNotFoundCustomException.class})
    public ResponseEntity<Object> handleActorNotFoundException(ResourceNotFoundCustomException resourceNotFoundCustomException) {
        DetailedCustomException detailedCustomException = new DetailedCustomException(resourceNotFoundCustomException.getMessage()
                , resourceNotFoundCustomException.getCause()
                , HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(detailedCustomException, HttpStatus.NOT_FOUND);
    }
}
