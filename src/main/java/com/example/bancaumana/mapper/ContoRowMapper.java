package com.example.bancaumana.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.bancaumana.entity.Conto;

public class ContoRowMapper implements RowMapper<Conto> {

	@Override
	public Conto mapRow(ResultSet rs, int rowNum) throws SQLException {
		Conto conto = new Conto();
		// BEGIN set dei valori
		
		// END set dei valori
		return conto;
	}

}
