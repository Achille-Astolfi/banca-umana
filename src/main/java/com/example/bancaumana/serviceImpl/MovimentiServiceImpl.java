package com.example.bancaumana.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bancaumana.model.MovimentoModel;
import com.example.bancaumana.repoimpl.MovimentiRepoImpl;

@Service
public class MovimentiServiceImpl {
	
	@Autowired
	MovimentiRepoImpl movimentiRepository;

	public List<MovimentoModel> getMovimenti(String conto){
		
		return null;
	}
	
}
