package com.dev.anderson.listapecas.application.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.dev.anderson.listapecas.application.api.NewPecaRequest;
import com.dev.anderson.listapecas.application.api.NewPecaResponse;
import com.dev.anderson.listapecas.pecas.domain.Peca;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ServicePeca implements PecaApplicationService {

	private final RepositoryPeca repositoryPeca;

	@Override
	public NewPecaResponse addNewPeca(@Valid NewPecaRequest newPeca) {
		log.info("[start] ServicePeca - addNewPeca");
		var addPeca = new Peca(newPeca);
		repositoryPeca.salva(addPeca);
		log.info("[finish] ServicePeca - addNewPeca");		
		return new NewPecaResponse(addPeca);
	}
}
