package com.example.bancaumana.entity;

import java.math.BigDecimal;

public class Conto {
	
	private String nConto;
	private String valuta;
	private BigDecimal fido;
	
	//GETTER AND SETTER
	
	public String getnConto() {
		return nConto;
	}
	public void setnConto(String nConto) {
		this.nConto = nConto;
	}
	public String getValuta() {
		return valuta;
	}
	public void setValuta(String valuta) {
		this.valuta = valuta;
	}
	public BigDecimal getFido() {
		return fido;
	}
	public void setFido(BigDecimal fido) {
		this.fido = fido;
	}
	
	

}
