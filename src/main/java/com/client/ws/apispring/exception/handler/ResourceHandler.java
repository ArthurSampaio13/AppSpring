package com.client.ws.apispring.exception.handler;

import com.client.ws.apispring.exception.BadRequestException;
import com.client.ws.apispring.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ResourceHandler {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<String> notFoundException(NotFoundException n) {
        String erroMessage = n.getMessage();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erroMessage);
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<String> badRequestException(BadRequestException b) {
        String erroMessage = b.getMessage();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erroMessage);
    }
}
