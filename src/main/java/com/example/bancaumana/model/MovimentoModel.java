package com.example.bancaumana.model;

import java.math.BigDecimal;
import java.sql.Date;

import org.springframework.hateoas.core.Relation;

import com.fasterxml.jackson.annotation.JsonProperty;

@Relation(collectionRelation = "movimenti")
public class MovimentoModel {

	
	@JsonProperty("movimenti")
	String movimenti;
	@JsonProperty("importo")
	BigDecimal importo;
	@JsonProperty("data")
	Date data;
	@JsonProperty("descrizione")
	String descrizione;
	
	
	public String getMovimenti() {
		return movimenti;
	}
	public void setMovimenti(String movimenti) {
		this.movimenti = movimenti;
	}
	public BigDecimal getImporto() {
		return importo;
	}
	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

}
