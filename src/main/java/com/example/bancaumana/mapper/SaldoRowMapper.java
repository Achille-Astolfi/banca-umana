package com.example.bancaumana.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import com.example.bancaumana.entity.Saldo;
import com.example.bancaumana.util.Utilities;

/**
 * 
 * @author Stefano
 * @author Jan
 *
 */
public class SaldoRowMapper implements RowMapper<Saldo> {

	@Override
	public Saldo mapRow(ResultSet rs, int rowNum) throws SQLException {
		Saldo saldo = new Saldo();
		// BEGIN set dei valori   

		saldo.setnConto(rs.getString("sal_numeroconto"));
		Date data = Utilities.parseDatabaseDate(rs.getString("sal_datasaldo"));
		saldo.setDataSaldo(data);
		saldo.setImpSaldo(rs.getBigDecimal("columnIndex"));
		
		// END set dei valori
		return saldo;
	}

}