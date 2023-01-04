package com.api.EstacionamentoDTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

//dto means data transfer object
public class EstacionamentoDTO {
	
	@NotBlank
	private String numero;
	
	@NotBlank
	@Size(max = 7)
	private String placaCarro;
	
	@NotBlank
	private String marcaCarro;
	
	@NotBlank
	private String modeloCarro;
	
	@NotBlank
	private String corCarro;
	
	@NotBlank
	private String morador;
	
	@NotBlank
	private String apartamento;
	
	@NotBlank
	private String bloco;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getPlacaCarro() {
		return placaCarro;
	}

	public void setPlacaCarro(String placaCarro) {
		this.placaCarro = placaCarro;
	}

	public String getMarcaCarro() {
		return marcaCarro;
	}

	public void setMarcaCarro(String marcaCarro) {
		this.marcaCarro = marcaCarro;
	}

	public String getModeloCarro() {
		return modeloCarro;
	}

	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro = modeloCarro;
	}

	public String getCorCarro() {
		return corCarro;
	}

	public void setCorCarro(String corCarro) {
		this.corCarro = corCarro;
	}

	public String getMorador() {
		return morador;
	}

	public void setMorador(String morador) {
		this.morador = morador;
	}

	public String getApartamento() {
		return apartamento;
	}

	public void setApartamento(String apartamento) {
		this.apartamento = apartamento;
	}

	public String getBloco() {
		return bloco;
	}

	public void setBloco(String bloco) {
		this.bloco = bloco;
	}

	
}
