package com.example.bancaumana.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


import com.example.bancaumana.entity.Storico;

public class StoricoRowMapper implements RowMapper<Storico> {


	@Override
	public Storico mapRow(ResultSet rs, int rowNum) throws SQLException {
		Storico storico = new Storico();
		// BEGIN set dei valori
		
		// END set dei valori
		return storico;
	}
	
}
