package com.dev.anderson.listapecas.pecas.domain;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.dev.anderson.listapecas.application.api.NewPecaRequest;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collation = "peca")
public class Peca {

	@Id
	private UUID idPeca;
	private String nome;
	private String descricao;
	private StatusPeca status;
	//private QuantidadeEmEstoque quantidadeEmEstoque;

	public Peca(@Valid NewPecaRequest newPeca) {
		this.status = newPeca.getStatus();
		this.nome = newPeca.getNome();
		this.descricao = newPeca.getDescricao();
		this.idPeca = UUID.randomUUID();
	}

}
