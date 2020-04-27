package com.example.bancaumana.serviceimpl;

import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bancaumana.entity.Conto;
import com.example.bancaumana.model.ContoModel;
import com.example.bancaumana.repo.ContiRepo;
import com.example.bancaumana.repo.MovimentiRepo;
import com.example.bancaumana.repo.SaldiRepo;
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
	
	@Autowired
	private MovimentiRepo movimentiRepository;
	
	@Autowired
	private SaldiRepo saldiRepository;
	
	@Autowired
	private ContiRepo contiRepository;
	

	
	public ContoModel findConto(String nConto) {
		ContoModel contoCorrente=new ContoModel();
		Conto conto = contiRepository.findByNumeroConto(nConto);
		contoCorrente.setCc(conto.getnConto());
		// TODO : oggi + disponibile + fido
		contoCorrente.setDisponibile(movimentiRepository.saldoDisponibile(nConto));
		contoCorrente.setDivisa(conto.getValuta());
		// TODO : oggi + saldo
		contoCorrente.setSaldo(movimentiRepository.sommaSaldo(nConto, new GregorianCalendar(2020, 3, 23).getTime()));
		
		
		return contoCorrente;
	}
}
