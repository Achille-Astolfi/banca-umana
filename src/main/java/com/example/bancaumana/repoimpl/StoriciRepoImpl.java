package com.example.bancaumana.repoimpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.example.bancaumana.entity.Storico;
import com.example.bancaumana.mapper.StoricoRowMapper;

/**
 * 
 * @author Ayoub
 * @author rikkizz(per l'implementazione del dummy->elencoStorico())
 *
 */

@Repository
public class StoriciRepoImpl extends JdbcDaoSupport {
		
	@Autowired
	public StoriciRepoImpl(DataSource dataSource) {
		this.setDataSource(dataSource);
	}
		
	public void dummy() {
		
			JdbcTemplate jdbcTemplate = this.getJdbcTemplate();
			StoricoRowMapper storicoRowMapper = new StoricoRowMapper();
			List<Storico> lista = jdbcTemplate.query("SELECT bla bla bla", storicoRowMapper, "param1", "param2");
		}
	
	// BEGIN IO LAVORO QUI
	public List<Storico> elencoStorico(String conto) {
		
		JdbcTemplate jdbcTemplate = this.getJdbcTemplate();
		StoricoRowMapper storicoRowMapper = new StoricoRowMapper();
		
		String query = "SELECT sto_numeroconto,      " +
				               "sto_importomovimento," +
				               "sto_datamovimento,   " +
				               "sto_oramovimento     " +
				               "sto_desmovimento     " +
				               "sto_causale          " +
				               "FROM storico         " +
				               "WHERE sto_numeroconto = ?";
		
		List<Storico> lista = jdbcTemplate.query(query, storicoRowMapper, conto);
		return lista;
	}
	
	// END IO LAVORO QUI


}
