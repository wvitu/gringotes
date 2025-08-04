package com.vitor.gringotes.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;

public class DataExistingException extends GringotesException {

    private String detail;

    public DataExistingException(String detail) {
        this.detail = detail;
    }

    @Override
    public ProblemDetail toProblemDetail() {
        var pb = ProblemDetail.forStatus(HttpStatus.UNPROCESSABLE_ENTITY);

        pb.setTitle("Magic Wallet data already exists");
        pb.setDetail(detail);

        return pb;
    }
}
