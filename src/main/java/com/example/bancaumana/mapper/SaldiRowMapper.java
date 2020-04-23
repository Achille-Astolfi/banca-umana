package com.example.bancaumana.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.example.bancaumana.entity.Conto;
import com.example.bancaumana.entity.Saldi;

public class SaldiRowMapper implements RowMapper<Saldi>{
	
	@Override
	public Saldi mapRow(ResultSet rs, int rowNum) throws SQLException {
		Saldi saldi = new Saldi();
		// BEGIN set dei valori

		// END set dei valori
		return saldi;
	}
}
