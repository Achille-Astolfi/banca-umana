package com.example.bancaumana.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bancaumana.model.MovimentoModel;
import com.example.bancaumana.repoimpl.MovimentiRepoImpl;
import com.example.bancaumana.repoimpl.StoriciRepoImpl;
import com.example.bancaumana.service.MovimentiService;

@Service
public class MovimentiServiceImpl implements MovimentiService{
	
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
