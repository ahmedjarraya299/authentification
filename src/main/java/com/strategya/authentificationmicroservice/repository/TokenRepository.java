package com.strategya.authentificationmicroservice.repository;

import com.strategya.authentificationmicroservice.entities.Token;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface TokenRepository extends MongoRepository<Token,String> {
    Optional<Token> findByToken(String token);
}
