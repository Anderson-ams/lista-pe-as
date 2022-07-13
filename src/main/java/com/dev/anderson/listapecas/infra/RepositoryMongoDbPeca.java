package com.dev.anderson.listapecas.infra;

import org.springframework.stereotype.Repository;

import com.dev.anderson.listapecas.application.service.RepositoryPeca;
import com.dev.anderson.listapecas.pecas.domain.Peca;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class RepositoryMongoDbPeca implements RepositoryPeca {

	private final MongoDbRepositoryPeca mongoDbRepositoryPeca;

	@Override
	public Peca salva(Peca addPeca) {
		return mongoDbRepositoryPeca.save(addPeca);
	}

}
