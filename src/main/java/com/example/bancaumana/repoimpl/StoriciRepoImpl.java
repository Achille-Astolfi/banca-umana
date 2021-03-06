package com.example.bancaumana.repoimpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.example.bancaumana.entity.Storico;
import com.example.bancaumana.mapper.StoricoRowMapper;
import com.example.bancaumana.repo.StoriciRepo;

/**
 * 
 * @author Ayoub
 * @author rikkizz
 * 
 * @version 2
 *
 */

@Repository
public class StoriciRepoImpl extends JdbcDaoSupport implements StoriciRepo{
		
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
	@Override
	public List<Storico>elencoStorici(String conto, int limit, int offset) {
		
		JdbcTemplate jdbcTemplate = this.getJdbcTemplate();
		StoricoRowMapper storicoRowMapper = new StoricoRowMapper();
		// da modificare e estrarre solo le 5 prime righe
		String query = "SELECT *                  " +
				       "FROM storico              " +
                       "WHERE sto_numeroconto = ? " +
				       "ORDER BY sto_id           " + 
				       "LIMIT  ?                  " + 
				       "OFFSET ?                  " ;
		
		List<Storico> lista = jdbcTemplate.query(query, storicoRowMapper, conto,limit,offset);
		return lista;
	}
	
	// END IO LAVORO QUI


}
