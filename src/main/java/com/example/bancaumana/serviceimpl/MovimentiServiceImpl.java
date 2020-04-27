package com.example.bancaumana.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bancaumana.entity.Movimento;
import com.example.bancaumana.entity.Storico;
import com.example.bancaumana.model.MovimentoModel;
import com.example.bancaumana.repo.MovimentiRepo;
import com.example.bancaumana.repo.StoriciRepo;
import com.example.bancaumana.repoimpl.MovimentiRepoImpl;
import com.example.bancaumana.repoimpl.StoriciRepoImpl;
import com.example.bancaumana.service.MovimentiService;

@Service
public class MovimentiServiceImpl implements MovimentiService{
	
	@Autowired
	private MovimentiRepo movimentiRepository;
	
	@Autowired
	private StoriciRepo storiciRepository;
	
	
	public List<MovimentoModel> getMovimenti(String conto){
		
		return null;
	}
	
	public List<MovimentoModel> convertToListModel(List<Movimento> list)
	{
		List<MovimentoModel> lista =new ArrayList<>();
		MovimentoModel mModel;
		for (Movimento m: list)
		{
			mModel=new MovimentoModel();
			mModel.setData(m.getDataMovimento());
			mModel.setDescrizione(m.getDescrizione());
			mModel.setImporto(m.getImpMovimento());
			lista.add(mModel);
		}
		return lista;	
	}
	
	public List<MovimentoModel> getMovimentiStorico(String conto){
		
		return null;
	}
	
	public List<MovimentoModel> fromStoricoToModel(List<Storico> s) {
		
		List<MovimentoModel> list = new ArrayList<>();
		
		
		for(Storico sto: s) {
			MovimentoModel mm = new MovimentoModel(); 
			mm.setData(sto.getDataMovimento());
			mm.setImporto(sto.getImpMovimento());
			mm.setDescrizione(sto.getDescrizione());
			
			list.add(mm);
			
		}
			
	return list;
	}
}


	

