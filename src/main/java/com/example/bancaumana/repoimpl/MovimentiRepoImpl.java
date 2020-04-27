package com.example.bancaumana.repoimpl;

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
	
	// END IO LAVORO QUI

	
	// BEGIN IO INVECE LAVORO QUI
	// totale importo per saldo
	
	// END IO INVECE LAVORO QUI
	
	
	// BEGIN IO INFINE LAVORO QUI
	// totale importo per disponibile
	
	// END IO INFINE LAVORO QUI


}
