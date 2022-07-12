package com.dev.anderson.listapecas.application.service;

import javax.validation.Valid;

import com.dev.anderson.listapecas.application.api.NewPecaRequest;
import com.dev.anderson.listapecas.application.api.NewPecaResponse;

public interface PecaApplicationService {

	NewPecaResponse addNewPeca(@Valid NewPecaRequest newPeca);

}
