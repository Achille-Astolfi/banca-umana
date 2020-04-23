package com.example.bancaumana.mapper;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
		for (rowNum = 0; true; rowNum++) {		
		conto.setnConto(rs.getString("con_numeroconto"));
		conto.setValuta(rs.getString("con_divisa"));
		conto.setFido(rs.getBigDecimal("con_fido"));
		}

	}

}
