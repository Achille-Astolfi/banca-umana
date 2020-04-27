package com.example.bancaumana.repoimpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.example.bancaumana.entity.Saldo;
import com.example.bancaumana.mapper.SaldoRowMapper;
import com.example.bancaumana.repo.SaldiRepo;

/**
 *
 * @author stefano
 *
 */

@Repository
public class SaldiRepoImpl extends JdbcDaoSupport implements SaldiRepo {

	@Autowired
	public SaldiRepoImpl(DataSource dataSource) {
		this.setDataSource(dataSource);
	}

	public void dummy() {
		JdbcTemplate jdbcTemplate = this.getJdbcTemplate();
		SaldoRowMapper saldoRowMapper = new SaldoRowMapper();
		List<Saldo> list = jdbcTemplate.query("SELECT bla bla bla", saldoRowMapper, "param1", "param2");
	}

	// BEGIN IO LAVORO QUI
	public Saldo findBySaldo(String nSaldo) {

		JdbcTemplate jdbcTemplate = this.getJdbcTemplate();

		SaldoRowMapper saldoRowMapper = new SaldoRowMapper();

		String dataSaldo = "20200423";
		List<Saldo> saldo = jdbcTemplate.query(
				"SELECT * FROM bancaumana.saldi where (sal_numeroconto, sal_datasaldo) = (? , ?)", saldoRowMapper,
				nSaldo, dataSaldo);

		if (saldo.size() > 0) {
			return saldo.get(0);
		} else {
			return null;
		}

	}
	// END IO LAVORO QUI

}
