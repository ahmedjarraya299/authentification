package com.strategya.authentificationmicroservice.controllers;

import com.strategya.authentificationmicroservice.entities.AuthenticationRequest;
import com.strategya.authentificationmicroservice.entities.AuthenticationResponse;
import com.strategya.authentificationmicroservice.entities.RegistrationRequest;
import com.strategya.authentificationmicroservice.services.AuthenticationService;
import jakarta.mail.MessagingException;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RequestBody;
import jakarta.validation.Valid;
@Controller
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService service;

    @MutationMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<?> register(@Argument  RegistrationRequest request) throws MessagingException {
        service.register(request);
        return ResponseEntity.accepted().build();
    }
    @MutationMapping
    public ResponseEntity<AuthenticationResponse> authenticate(@Argument AuthenticationRequest request
    ) {
        return ResponseEntity.ok(service.authenticate(request));
    }
    @MutationMapping
    public void confirm(@Argument String token) throws MessagingException
    {
        service.activateAccount(token);
    }



}
