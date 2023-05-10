package com.example.sakila.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {
    public static ResponseEntity<Object> responseBuilder(String message, HttpStatus httpStatus, Object responseObject) {
        Map<String, Object> response = new HashMap<>();
        response.put("message", message);
        response.put("status", httpStatus);
        response.put("data", responseObject);
        return new ResponseEntity<>(response, httpStatus);
    }

    public static ResponseEntity<Object> responseBuilder(String message, HttpStatus httpStatus, Object[] responseObjects) {
        Map<String, Object> response = new HashMap<>();
        response.put("message", message);
        response.put("status", httpStatus);
        Map<String, Object> data = new HashMap<>();
        data.put("data", new HashMap<String, Object>() {
            {
                put("data", responseObjects);
            }
        });
        response.put("data", data);
        return new ResponseEntity<>(response, httpStatus);
    }

}
