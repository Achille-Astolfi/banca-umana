package com.example.bancaumana.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


import com.example.bancaumana.entity.Storico;

public class StoricoRowMapper implements RowMapper<Storico> {


	@Override
	public Storico mapRow(ResultSet rs, int rowNum) throws SQLException {
		Storico storico = new Storico();

		storico.setnConto(rs.getString("sto_numeroconto"));
		storico.setImpMovimento(rs.getBigDecimal("sto_importomovimento"));
		storico.setDataMovimento(rs.getString("sto_datamovimento"));
		storico.setOraMovimento(rs.getInt("sto_oramovimento"));
		storico.setDescrizione(rs.getString("sto_descrizione"));
		storico.setCausale(rs.getString("sto_causale"));
		
		
		
		return storico;
	}
	
}
