package com.dev.anderson.listapecas.application.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.dev.anderson.listapecas.application.api.NewPecaRequest;
import com.dev.anderson.listapecas.application.api.NewPecaResponse;
import com.dev.anderson.listapecas.pecas.domain.Peca;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ServicePeca implements PecaApplicationService {

	@Override
	public NewPecaResponse addNewPeca(@Valid NewPecaRequest newPeca) {
		log.info("[start] ServicePeca - addNewPeca");
		Peca addPeca = new Peca(newPeca);
		log.info("[finish] ServicePeca - addNewPeca");		
		return new NewPecaResponse(addPeca);
	}
}
