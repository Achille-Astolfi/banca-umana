package com.example.bancaumana.repoimpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.example.bancaumana.entity.Conto;
import com.example.bancaumana.entity.Saldo;
import com.example.bancaumana.mapper.ContoRowMapper;
import com.example.bancaumana.mapper.SaldoRowMapper;

/**
 * 
 * @author stefano
 *
 */

@Repository
public class SaldiRepoImpl extends JdbcDaoSupport{
	
	@Autowired
	public SaldiRepoImpl(DataSource dataSource) {
		this.setDataSource(dataSource);
	}
	
	public void dummy() {
		JdbcTemplate jdbcTemplate = this.getJdbcTemplate();
		SaldoRowMapper saldoRowMapper = new SaldoRowMapper();
		List<Saldo> list = jdbcTemplate.query("SELECT bla bla bla", saldoRowMapper, "param1", "param2");
	}
	
}
