package com.vitor.gringotes.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;

public class GringotesException  extends RuntimeException {

    public ProblemDetail toProblemDetail() {
        var pb = ProblemDetail.forStatus(HttpStatus.INTERNAL_SERVER_ERROR);

        pb.setTitle("Gringotes magic internal server error");

        return pb;
    }
}
