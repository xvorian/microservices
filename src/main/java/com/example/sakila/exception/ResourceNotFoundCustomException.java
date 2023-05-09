package com.example.sakila.exception;

public class ResourceNotFoundCustomException extends RuntimeException {
    public ResourceNotFoundCustomException(String message) {
        super(message);
    }

    public ResourceNotFoundCustomException(Throwable cause) {
        super(cause);
    }

}
