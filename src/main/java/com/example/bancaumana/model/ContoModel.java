package com.example.bancaumana.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * 
 * @author Giovanni
 *
 */
public class ContoModel {
	
	@JsonProperty("cc")
	private String cc;
	
	@JsonProperty("divisa")
	private String divisa;
	
	@JsonProperty("saldo")
	private BigDecimal saldo;
	
	@JsonProperty("disponibile")
	private BigDecimal disponibile;

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getDivisa() {
		return divisa;
	}

	public void setDivisa(String divisa) {
		this.divisa = divisa;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public BigDecimal getDisponibile() {
		return disponibile;
	}

	public void setDisponibile(BigDecimal disponibile) {
		this.disponibile = disponibile;
	}

}
