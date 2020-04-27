package com.example.bancaumana.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bancaumana.model.ContoModel;
import com.example.bancaumana.repo.ContiRepo;
import com.example.bancaumana.repo.MovimentiRepo;
import com.example.bancaumana.repo.SaldiRepo;
import com.example.bancaumana.service.ContoService;

/**
 * 
 * @author Jacopo
 *
 */
@Service("contoService")
public class ContoServiceImpl implements ContoService {
	
	@Autowired
	private MovimentiRepo movimentiRepository;
	
	@Autowired
	private SaldiRepo saldiRepository;
	
	@Autowired
	private ContiRepo contiRepository;
	

	
	@Override
	public ContoModel findConto(String nConto) {
		ContoModel contoCorrente=new ContoModel();
		
		return null;
	}
}
