package com.example.bancaumana.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bancaumana.model.ContoModel;
import com.example.bancaumana.repoimpl.ContiRepoImpl;
import com.example.bancaumana.repoimpl.MovimentiRepoImpl;
import com.example.bancaumana.repoimpl.SaldiRepoImpl;

@Service
public class ContoServiceImpl {
	@Autowired
	MovimentiRepoImpl movimentiRepository;
	@Autowired
	SaldiRepoImpl saldiRepository;
	@Autowired
	ContiRepoImpl contiRepository;
	
	public ContoModel findConto(String nConto) {
		ContoModel contoCorrente=new ContoModel();
		
		return null;
	}
}
