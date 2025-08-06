package com.vitor.gringotes.service;


import com.vitor.gringotes.client.AuthorizationClient;
import com.vitor.gringotes.controller.dto.TransferDto;
import com.vitor.gringotes.entity.Transfer;
import com.vitor.gringotes.exception.GringotesException;
import org.springframework.stereotype.Service;

@Service
public class AuthorizationService {

    private final AuthorizationClient authorizationClient;

    public AuthorizationService(AuthorizationClient authorizationClient) {
        this.authorizationClient = authorizationClient;
    }

    public boolean isAuthorized(TransferDto transferDto)
    {

        var resp = authorizationClient.isAuthorized();

        if (resp.getStatusCode().isError()) {
            throw new GringotesException();
        }

        return resp.getBody().authorized();
    }
}
