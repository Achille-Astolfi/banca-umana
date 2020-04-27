package com.example.bancaumana.model;
   
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.hateoas.core.Relation;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * 
 * @author Jan
 *
 */
@Relation(collectionRelation = "movimenti")
public class MovimentoModel {

	@JsonProperty("importo")
	private BigDecimal importo;
	@JsonProperty("data")
	@JsonFormat(pattern = "yyyy-MM-dd", shape = Shape.STRING)
	private Date data;
	@JsonProperty("descrizione")
	private String descrizione;

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
