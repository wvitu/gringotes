package com.vitor.gringotes.dto;

import com.vitor.gringotes.exception.GringotesException;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(GringotesException.class)
    public ProblemDetail handleGringotesExeption(GringotesException e) {
        return e.toProblemDetail();
    }
}
