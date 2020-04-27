package com.example.bancaumana.repoimpl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.example.bancaumana.entity.Movimento;
import com.example.bancaumana.mapper.MovimentoRowMapper;
import com.example.bancaumana.util.Utilities;
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
				"WHERE mov_datamovimento = ? AND mov_stato != 0\r\n" + 
				"AND mov_numeroconto = ? \r\n", BigDecimal.class,nConto,data );
		return somma;
	}

}
