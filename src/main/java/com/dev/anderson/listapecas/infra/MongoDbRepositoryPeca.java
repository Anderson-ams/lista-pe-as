package com.dev.anderson.listapecas.infra;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dev.anderson.listapecas.pecas.domain.Peca;

public interface MongoDbRepositoryPeca extends MongoRepository<Peca, UUID>{

}
