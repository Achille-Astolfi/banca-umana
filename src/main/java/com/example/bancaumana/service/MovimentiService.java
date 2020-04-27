package com.example.bancaumana.service;

import java.util.List;

import com.example.bancaumana.model.MovimentoModel;

public interface MovimentiService {

	public List<MovimentoModel> getMovimenti(String conto);
	public List<MovimentoModel> getMovimentiStorico(String conto, int inizio, int fine);

}
