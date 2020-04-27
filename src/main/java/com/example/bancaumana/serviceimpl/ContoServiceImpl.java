package com.example.bancaumana.serviceimpl;
//WHAT'S UP M8  
import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bancaumana.entity.Conto;
import com.example.bancaumana.entity.Saldo;
import com.example.bancaumana.model.ContoModel;
import com.example.bancaumana.repo.ContiRepo;
import com.example.bancaumana.repo.MovimentiRepo;
import com.example.bancaumana.repo.SaldiRepo;
import com.example.bancaumana.service.ContoService;
//start
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
		Conto conto = contiRepository.findByNumeroConto(nConto);
		Date data = new GregorianCalendar(2020, 3, 23).getTime();
		
		contoCorrente.setCc(conto.getnConto());
		
		Saldo saldo = saldiRepository.findBySaldo(nConto);
		contoCorrente.setSaldo(saldo.getImpSaldo());
		contoCorrente.setDisponibile(contoCorrente.getSaldo().add(conto.getFido()));
		
		contoCorrente.setDivisa(conto.getValuta());
		return contoCorrente;
	}
}
