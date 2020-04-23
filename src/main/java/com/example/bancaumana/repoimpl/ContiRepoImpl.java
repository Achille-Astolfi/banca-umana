package com.example.bancaumana.repoimpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.example.bancaumana.entity.Conto;
import com.example.bancaumana.mapper.ContoRowMapper;

@Repository
public class ContiRepoImpl extends JdbcDaoSupport {
	@Autowired
	public ContiRepoImpl(DataSource dataSource) {
		this.setDataSource(dataSource);
	}
	
	public void dummy() {
		JdbcTemplate jdbcTemplate = this.getJdbcTemplate();
		ContoRowMapper contoRowMapper = new ContoRowMapper();
		List<Conto> list = jdbcTemplate.query("SELECT bla bla bla", contoRowMapper, "param1", "param2");
	}

}