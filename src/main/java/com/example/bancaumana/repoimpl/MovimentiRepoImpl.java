package com.example.bancaumana.repoimpl;

import java.math.BigDecimal;
<<<<<<< HEAD
import java.util.Date;
=======
>>>>>>> branch 'master' of https://github.com/Achille-Astolfi/banca-umana.git
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.example.bancaumana.entity.Movimento;
import com.example.bancaumana.mapper.MovimentoRowMapper;
<<<<<<< HEAD
import com.example.bancaumana.util.Utilities;
=======

>>>>>>> branch 'master' of https://github.com/Achille-Astolfi/banca-umana.git
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
	
	
	public BigDecimal sommaSaldo(String nConto, Date date) {
		JdbcTemplate jdbcTemplate = this.getJdbcTemplate();
		BigDecimal somma;
		String data=Utilities.formatDateToString(date);
		somma = jdbcTemplate.queryForObject("SELECT * SUM(COALESCE(mov_importomovimento, 0)) AS saldo"
				+ "FROM movimenti\r\n" +  
				"WHERE mov_datamovimento = ? AND mov_stato != 0" + 
				"AND mov_numeroconto = ?", BigDecimal.class,data,nConto );
		if(somma!=null)
			return somma;
		else
			return BigDecimal.ZERO;
	}

	/**
	 * 
	 * @author Laura
	 * 
	 */

	// BEGIN IO LAVORO QUI
	// elenco movimenti per /movimenti/nConto
	public List<Movimento> elencoMovimenti(String conto) {
		JdbcTemplate jdbcTemplate = this.getJdbcTemplate();
		MovimentoRowMapper movimentoRowMapper = new MovimentoRowMapper();
		List<Movimento> movimenti = jdbcTemplate.query("SELECT * FROM movimenti WHERE mov_numeroconto = ?",
				movimentoRowMapper, conto);

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
		saldo = jdbcTemplate.queryForObject("SELECT SUM(COALESCE(mov_importomovimento, 0))" + "FROM movimenti\r\n"
				+ "WHERE (mov_stato = 2 or mov_stato = 1 AND mov_importomovimento < 0) " + "AND ? = mov_numeroconto",
				BigDecimal.class, nConto);
		if (saldo == null) {
			saldo = BigDecimal.ZERO;
		}
		return saldo;
	}

}
