package com.example.bancaumana.serviceimpl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bancaumana.entity.Conto;
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
		Conto conto = contiRepository.findByNumeroConto(nConto);
		contoCorrente.setCc(conto.getnConto());
		Date data = new GregorianCalendar(2020, 3, 23).getTime();
		
		// TODO :  sommaSaldo
		contoCorrente.setSaldo(movimentiRepository.sommaSaldo(nConto, data));
		
		// TODO : saldo + fido
		contoCorrente.setDisponibile(contoCorrente.getSaldo().add(conto.getFido()));
		
		contoCorrente.setDivisa(conto.getValuta());
		
		
		
		return contoCorrente;
	}
}
