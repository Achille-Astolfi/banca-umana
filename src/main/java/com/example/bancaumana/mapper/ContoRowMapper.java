package com.example.bancaumana.mapper;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.bancaumana.entity.Conto;
/**
 * 
 * @author Jacopo
 *
 */
public class ContoRowMapper implements RowMapper<Conto> {

		
	@Override
	public Conto mapRow(ResultSet rs, int rowNum) throws SQLException {
		Conto conto = new Conto();	
		
		conto.setnConto(rs.getString("con_numeroconto"));
		conto.setValuta(rs.getString("con_divisa"));
		conto.setFido(rs.getBigDecimal("con_fido"));
		
		return conto;
	}
	
}
