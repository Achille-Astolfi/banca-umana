package com.example.bancaumana.service;

import java.util.List;

import com.example.bancaumana.model.MovimentoModel;

public interface MovimentiService {

	List<MovimentoModel> getMovimenti(String conto);

	List<MovimentoModel> getMovimentiStorico(String conto);

}