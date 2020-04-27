package com.example.bancaumana.model;

import java.math.BigDecimal;

import org.springframework.hateoas.core.Relation;

@Relation(collectionRelation = "movimenti")
public class MovimentoModel {

	private BigDecimal mov_numeroconto;
	private int mov_stato;
	private float mov_importomovimento;
	private BigDecimal mov_datamovimento;
	private int mov_oramovimento;
	private String mov_causale;
	private String mov_desmovimento;

	public BigDecimal getMov_numeroconto() {
		return mov_numeroconto;
	}

	public void setMov_numeroconto(BigDecimal mov_numeroconto) {
		this.mov_numeroconto = mov_numeroconto;
	}

	public int getMov_stato() {
		return mov_stato;
	}

	public void setMov_stato(int mov_stato) {
		this.mov_stato = mov_stato;
	}

	public float getMov_importomovimento() {
		return mov_importomovimento;
	}

	public void setMov_importomovimento(float mov_importomovimento) {
		this.mov_importomovimento = mov_importomovimento;
	}

	public BigDecimal getMov_datamovimento() {
		return mov_datamovimento;
	}

	public void setMov_datamovimento(BigDecimal mov_datamovimento) {
		this.mov_datamovimento = mov_datamovimento;
	}

	public int getMov_oramovimento() {
		return mov_oramovimento;
	}

	public void setMov_oramovimento(int mov_oramovimento) {
		this.mov_oramovimento = mov_oramovimento;
	}

	public String getMov_causale() {
		return mov_causale;
	}

	public void setMov_causale(String mov_causale) {
		this.mov_causale = mov_causale;
	}

	public String getMov_desmovimento() {
		return mov_desmovimento;
	}

	public void setMov_desmovimento(String mov_desmovimento) {
		this.mov_desmovimento = mov_desmovimento;
	}

}
