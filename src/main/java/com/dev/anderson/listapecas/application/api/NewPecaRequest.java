package com.dev.anderson.listapecas.application.api;

import com.dev.anderson.listapecas.pecas.domain.StatusPeca;

import lombok.Value;
@Value
public class NewPecaRequest {

	private String nome;
	private String descricao;
	private StatusPeca status;

}
