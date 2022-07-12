package com.dev.anderson.listapecas.pedido.domain;

import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Document(collation = "pedido")
public class Pedido {
	@Id
	private UUID idPedido;
	private String nome; 
	private BigDecimal valorPedido;
	private Integer quantidadePedido;
	private String idPeca;
	
}
