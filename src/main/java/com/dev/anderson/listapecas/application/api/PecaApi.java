package com.dev.anderson.listapecas.application.api;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/peca")
public interface PecaApi {
	
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	NewPecaResponse postNewPeca(@RequestBody @Valid NewPecaRequest newPeca);
}
