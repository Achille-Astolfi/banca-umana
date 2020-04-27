package com.example.bancaumana.repo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.example.bancaumana.entity.Movimento;
/**
 * 
 * @author Laura
 *
 */
public interface MovimentiRepo {

	List<Movimento> elencoMovimenti(String conto);

	
	BigDecimal sommaSaldo(String nConto, Date date);
	
	
	BigDecimal saldoDisponibile(String nConto);
	

}