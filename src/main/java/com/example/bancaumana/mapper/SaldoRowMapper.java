package com.example.bancaumana.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.example.bancaumana.entity.Conto;
import com.example.bancaumana.entity.Saldo;
/**
 * 
 * @author Stefano
 *
 */
public class SaldoRowMapper implements RowMapper<Saldo>{
	
	@Override
	public Saldo mapRow(ResultSet rs, int rowNum) throws SQLException {
		Saldo saldo = new Saldo();
		// BEGIN set dei valori

		// END set dei valori
		return saldo;
	}
}
