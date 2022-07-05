package com.nogran.brewer.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Cerveja {
	
	@NotBlank(message = "O atributo SKU nao pode ser vazio.")
	private String sku;
	
	@NotBlank(message = "O atributo Nome nao pode ser vazio.")
	private String nome;
	
	@NotBlank(message = "O atributo Descricao nao pode ser vazio.")
	@Size(min = 5, max = 255, message = "Número mínimo de caracteres é 5 e número máximo de caracteres é 255.")
	private String descricao;
	
	@NotNull(message = "O atributo Quantidade nao pode ser nulo.")
	private int quantidade;
		
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
