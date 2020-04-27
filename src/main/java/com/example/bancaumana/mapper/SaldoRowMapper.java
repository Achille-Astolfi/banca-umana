package com.example.bancaumana.mapper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.jdbc.core.RowMapper;
import com.example.bancaumana.entity.Conto;
import com.example.bancaumana.entity.Saldo;

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
		saldo.setDataSaldo(rs.getDate("sal_datasaldo"));
		saldo.setImpSaldo(rs.getBigDecimal("columnIndex"));
		
		// END set dei valori
		return saldo;
	}

}