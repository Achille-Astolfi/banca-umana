package com.example.bancaumana.repo;

import java.util.List;

import com.example.bancaumana.entity.Storico;

/***
 * @author SpiderXD
 */

public interface StoriciRepo {
	
	List<Storico> elencoStorici(String conto);

}
