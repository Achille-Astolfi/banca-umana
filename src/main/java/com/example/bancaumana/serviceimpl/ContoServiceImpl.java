package com.example.bancaumana.serviceimpl;

import org.springframework.stereotype.Service;

import com.example.bancaumana.model.ContoModel;
import com.example.bancaumana.repoimpl.ContiRepoImpl;
import com.example.bancaumana.repoimpl.MovimentiRepoImpl;
import com.example.bancaumana.repoimpl.SaldiRepoImpl;

@Service
public class ContoServiceImpl {
	
	public ContoModel findConto(String nConto) {
		ContoModel contoCorrente=new ContoModel();
		
		MovimentiRepoImpl movimento = new MovimentiRepoImpl(dataSource);
		SaldiRepoImpl saldo = new SaldiRepoImpl(dataSource);
		ContiRepoImpl conto= new ContiRepoImpl(dataSource);
		
		contoCorrente.setCc(conto);
		contoCorrente.setDisponibile(conto);
		contoCorrente.setSaldo(saldo);
		//movimetni
		//saldi
		//conti
		return contoCorrente;
	}
}
