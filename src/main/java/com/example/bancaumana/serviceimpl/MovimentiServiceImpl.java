package com.example.bancaumana.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bancaumana.model.MovimentoModel;
import com.example.bancaumana.repoimpl.MovimentiRepoImpl;
import com.example.bancaumana.repoimpl.StoriciRepoImpl;

@Service
public class MovimentiServiceImpl {
	
	@Autowired
	MovimentiRepoImpl movimentiRepository;
	
	@Autowired
	StoriciRepoImpl storiciRepository;

	public List<MovimentoModel> getMovimenti(String conto){
		
		return null;
	}
	
	public List<MovimentoModel> getMovimentiStorico(String conto){
		
		return null;
	}
	
}