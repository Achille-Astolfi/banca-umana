package com.example.bancaumana.repoimpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.example.bancaumana.entity.Conto;
import com.example.bancaumana.mapper.ContoRowMapper;
import com.example.bancaumana.service.ContiRepo;
/**
 * 
 * @author Petrut
 *
 */
@Repository
public class ContiRepoImpl extends JdbcDaoSupport implements ContiRepo{
	@Autowired
	public ContiRepoImpl(DataSource dataSource) {
		this.setDataSource(dataSource);
	}
	
	// BEGIN IO LAVORO QUI
	public Conto findByNumeroConto(String numeroConto) {
		JdbcTemplate jdbcTemplate = this.getJdbcTemplate();
		ContoRowMapper contoRowMapper = new ContoRowMapper();
		List<Conto> conto = jdbcTemplate.query("SELECT * FROM bancaumana.conti where con_numeroconto = ? Limit 2" ,contoRowMapper,numeroConto);
		if(conto.size()>0) {
			return conto.get(0) ;
		}else {
			return null;
		}
	}
	// END IO LAVORO QUI

}
