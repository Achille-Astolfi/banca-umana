package com.example.bancaumana.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bancaumana.entity.Movimento;
import com.example.bancaumana.model.MovimentoModel;
import com.example.bancaumana.repoimpl.MovimentiRepoImpl;
import com.example.bancaumana.repoimpl.StoriciRepoImpl;

@Service
public class MovimentiServiceImpl {
	
	@Autowired
	MovimentiRepoImpl movimentiRepository;
	
	@Autowired
	StoriciRepoImpl storiciRepository;

	public List<MovimentoModel> getMovimenti(String conto){
		
		return null;
	}
	
	public List<MovimentoModel> ConvertToListModel(List<Movimento> list)
	{
		List<MovimentoModel> lista =new ArrayList<>();
		MovimentoModel mModel=new MovimentoModel();
		for (Movimento m: list)
		{
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
	
}
