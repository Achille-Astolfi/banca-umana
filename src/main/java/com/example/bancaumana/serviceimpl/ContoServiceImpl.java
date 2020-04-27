package com.example.bancaumana.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bancaumana.model.ContoModel;
import com.example.bancaumana.repoimpl.ContiRepoImpl;
import com.example.bancaumana.repoimpl.MovimentiRepoImpl;
import com.example.bancaumana.repoimpl.SaldiRepoImpl;

/**
 * 
 * @author Jacopo
 *
 */
@Service("contoService")
public class ContoServiceImpl {
	
	
	MovimentiRepoImpl movimentiRepository;
	
	
	SaldiRepoImpl saldiRepository;
	
	
	ContiRepoImpl contiRepository;
	
	 @Autowired
	 public ContoServiceImpl(MovimentiRepoImpl movimentiRepository,SaldiRepoImpl saldiRepository,ContiRepoImpl contiRepository ) {
	   this.movimentiRepository = movimentiRepository;
	   this.saldiRepository = saldiRepository;
	   this.contiRepository = contiRepository;
	   
	 }
	
	public ContoModel findConto(String nConto) {
		ContoModel contoCorrente=new ContoModel();
		
		return null;
	}
}
