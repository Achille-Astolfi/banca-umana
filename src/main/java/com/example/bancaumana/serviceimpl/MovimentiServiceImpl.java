package com.example.bancaumana.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bancaumana.model.MovimentoModel;
import com.example.bancaumana.repo.MovimentiRepo;
import com.example.bancaumana.repo.StoriciRepo;
import com.example.bancaumana.service.MovimentiService;

@Service
public class MovimentiServiceImpl implements MovimentiService {
	
	@Autowired
	private MovimentiRepo movimentiRepository;
	
	@Autowired
	private StoriciRepo storiciRepository;
	
	
	@Override
	public List<MovimentoModel> getMovimenti(String conto){
		
		return null;
	}
	
	@Override
	public List<MovimentoModel> getMovimentiStorico(String conto){
		
		return null;
	}
	
}
