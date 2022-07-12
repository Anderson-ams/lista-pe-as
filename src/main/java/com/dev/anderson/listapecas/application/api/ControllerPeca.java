package com.dev.anderson.listapecas.application.api;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import com.dev.anderson.listapecas.application.service.PecaApplicationService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ControllerPeca implements PecaApi{

	private final PecaApplicationService pecaApplicationService;

	@Override
	public NewPecaResponse postNewPeca(@Valid NewPecaRequest newPeca) {
		log.info("[start] ControllerPeca - postNewPeca");		
		NewPecaResponse newPecaAdded = pecaApplicationService.addNewPeca(newPeca);
		log.info("[finish] ControllerPeca - postNewPeca");
		return newPecaAdded;
	}

}
