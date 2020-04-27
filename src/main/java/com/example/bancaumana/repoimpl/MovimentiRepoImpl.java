package com.example.bancaumana.repoimpl;

import java.math.BigDecimal;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.example.bancaumana.entity.Movimento;
import com.example.bancaumana.mapper.MovimentoRowMapper;
/**
 * 
 * @author Riccardo
 *
 */
@Repository
public class MovimentiRepoImpl extends JdbcDaoSupport {
	@Autowired
	public MovimentiRepoImpl(DataSource dataSource) {
		this.setDataSource(dataSource);
	}
	
	public void dummy() {
		JdbcTemplate jdbcTemplate = this.getJdbcTemplate();
		MovimentoRowMapper movimentoRowMapper = new MovimentoRowMapper();
		List<Movimento> list = jdbcTemplate.query("", movimentoRowMapper, "", "");
	}

	// BEGIN IO LAVORO QUI
	// elenco movimenti per /movimenti/nConto
	public List<Movimento> elencoMovimenti(String conto) {
		JdbcTemplate jdbcTemplate = this.getJdbcTemplate();
		MovimentoRowMapper movimentoRowMapper = new MovimentoRowMapper();
		List<Movimento> movimenti = jdbcTemplate.query("SELECT mov_importomovimento AS importo, mov_datamovimento AS data," + 
		"mov_desmovimento AS descrizione FROM movimenti  WHERE mov_numeroconto = ?", movimentoRowMapper, conto);
		
		return movimenti;
	}
	
	// END IO LAVORO QUI

	
	// BEGIN IO INVECE LAVORO QUI
	// totale importo per saldo
	
	// END IO INVECE LAVORO QUI
	
	
	/**
	 * @author Jacopo
	 * 
	 */
	public BigDecimal saldoDisponibile(String nConto) {
	BigDecimal saldo = null;
	JdbcTemplate jdbcTemplate = this.getJdbcTemplate();	
	saldo =jdbcTemplate.queryForObject("SELECT * SUM(COALESCE(mov_importomovimento, 0))" + 
			"FROM movimenti\r\n" + 
			"WHERE (mov_stato = 2 or mov_stato = 1 AND mov_importomovimento < 0) "
			+ "AND ? = sal_numeroconto", BigDecimal.class, nConto);
	
	return saldo;
	}

}
