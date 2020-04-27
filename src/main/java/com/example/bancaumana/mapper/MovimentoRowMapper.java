package com.example.bancaumana.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.bancaumana.entity.Movimento;
import com.example.bancaumana.util.Utilities;
/**
 * 
 * @author Laura
 *
 */

public class MovimentoRowMapper implements RowMapper<Movimento>{
	
	
	@Override
	public Movimento mapRow(ResultSet rs, int rowNum) throws SQLException {
		Movimento movimento = new Movimento();
		
		movimento.setnConto(rs.getString("mov_numeroconto"));
		movimento.setImpMovimento(rs.getBigDecimal("mov_importomovimento"));
		movimento.setDataMovimento(Utilities.parseDatabaseDate(rs.getString("mov_datamovimento")));
		movimento.setOraMovimento(rs.getInt("mov_oramovimento"));
		movimento.setDescrizione(rs.getString("mov_desmovimento"));
		movimento.setStato(rs.getInt("mov_stato"));
		movimento.setCausale(rs.getString("mov_causale"));
		
		
		return movimento;
	}
	
	

}
