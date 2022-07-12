package com.dev.anderson.listapecas.application.api;

import java.util.UUID;

import com.dev.anderson.listapecas.pecas.domain.Peca;
import com.dev.anderson.listapecas.pecas.domain.StatusPeca;

import lombok.Value;

@Value
public class NewPecaResponse {
	private final UUID idPeca;
	private final String nome;
	private final String descricao;
	private final StatusPeca status;
//	private final QuantidadeEmEstoque quantidadeEmEstoque;
	
	public NewPecaResponse(Peca addPeca) {	
		
		this.idPeca = addPeca.getIdPeca();
		this.status = addPeca.getStatus();
		this.nome = addPeca.getNome();
		this.descricao = addPeca.getDescricao();
		//this.quantidadeEmEstoque = addPeca.getQuantidadeEmEstoque();
	}

	
	
}
