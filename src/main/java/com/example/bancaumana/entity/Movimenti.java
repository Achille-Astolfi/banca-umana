package com.example.bancaumana.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Movimenti {
	
	private int nConto;
	private BigDecimal impMovimento;
	private Date dataMovimento;
	private int oraMovimento;
	private String descrizione;
	private String causale;
	private int stato;
	
	// GETTER AND SETTER
	
	public int getnConto() {
		return nConto;
	}
	public void setnConto(int nConto) {
		this.nConto = nConto;
	}
	public BigDecimal getImpMovimento() {
		return impMovimento;
	}
	public void setImpMovimento(BigDecimal impMovimento) {
		this.impMovimento = impMovimento;
	}
	public Date getDataMovimento() {
		return dataMovimento;
	}
	public void setDataMovimento(Date dataMovimento) {
		this.dataMovimento = dataMovimento;
	}
	public int getOraMovimento() {
		return oraMovimento;
	}
	public void setOraMovimento(int oraMovimento) {
		this.oraMovimento = oraMovimento;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getCausale() {
		return causale;
	}
	public void setCausale(String causale) {
		this.causale = causale;
	}
	public int getStato() {
		return stato;
	}
	public void setStato(int stato) {
		this.stato = stato;
	}
	
	

}
