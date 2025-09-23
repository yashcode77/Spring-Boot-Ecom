package com.ecommerce.sb.ecom.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

// This annotation marks the class as a global exception handler for REST controllers.
// It allows centralized handling of exceptions across all controller classes.
@RestControllerAdvice
public class MyGlobalExceptionHandler {

    // @ExceptionHandler(Exception.class) use this to handle any generic exception that comes
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> myMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        // This method handles validation errors thrown when @Valid fails on method arguments.
        // It extracts field-specific error messages and returns them as a key-value map.
        // Response Entity is used here to send the correct http status code
        Map<String, String> response = new HashMap<>();
        e.getBindingResult().getAllErrors().forEach((err) -> {
            String fieldName = ((FieldError) err).getField();
            String errorMsg = ((FieldError) err).getDefaultMessage();
            response.put(fieldName, errorMsg);
        });
        return new ResponseEntity<Map<String,String>>(response,
                HttpStatus.BAD_REQUEST
        );
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> myResourceNotFoundException(ResourceNotFoundException e){
        String message =  e.getMessage();
        return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
    }
}
