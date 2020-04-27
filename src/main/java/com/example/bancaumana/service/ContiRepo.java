package com.example.bancaumana.service;

import com.example.bancaumana.entity.Conto;

/**
 * 
 * @author Ayoub
 *
 */


public interface ContiRepo {
	
	public Conto findByNumeroConto(String numeroConto);

}
