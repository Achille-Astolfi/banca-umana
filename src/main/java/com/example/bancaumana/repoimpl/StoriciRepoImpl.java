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
 * @author rikkizz
 * 
 * @version 2
 *
 */

@Repository
public class StoriciRepoImpl extends JdbcDaoSupport {
		
	@Autowired
	public StoriciRepoImpl(DataSource dataSource) {
		this.setDataSource(dataSource);
	}

	// BEGIN IO LAVORO QUI
	/**
	 * 
	 * @param conto
	 * @return
	 * @since 2
	 */
	public List<Storico> elencoStorico(String conto) {
		
		JdbcTemplate jdbcTemplate = this.getJdbcTemplate();
		StoricoRowMapper storicoRowMapper = new StoricoRowMapper();
		
		String query = "SELECT *                 " +
				       "FROM storico             " +
                       "WHERE sto_numeroconto = ?" ;
		
		List<Storico> lista = jdbcTemplate.query(query, storicoRowMapper, conto);
		return lista;
	}
	
	// END IO LAVORO QUI


}
