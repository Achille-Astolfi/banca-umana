package com.example.bancaumana.repo;

import com.example.bancaumana.entity.Conto;

/**
 * 
 * @author Ayoub
 *
 */


public interface ContiRepo {
	
	public Conto findByNumeroConto(String numeroConto);

}
