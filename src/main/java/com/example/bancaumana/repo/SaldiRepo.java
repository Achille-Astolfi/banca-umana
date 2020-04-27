package com.example.bancaumana.repo;

import java.util.List;

import com.example.bancaumana.entity.Saldo;

/*
 * @author Jan
 * 
 * */

public interface SaldiRepo {

	public Saldo findBySaldo(String nSaldo);
	
}