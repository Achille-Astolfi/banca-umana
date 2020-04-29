package com.example.bancaumana.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bancaumana.model.MovimentoModel;
import com.example.bancaumana.resource.MovimentiResources;
import com.example.bancaumana.service.MovimentiService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value = "/movimenti", produces = MediaType.APPLICATION_JSON_VALUE)
public class MovimentiController {
	
	
	@Autowired
	private MovimentiService movimentiService;
	
	@GetMapping("/{conto}")
	public ResponseEntity<MovimentiResources> getMovimenti(@PathVariable("conto") String conto) {
		MovimentiResources resource =  null;
		List<MovimentoModel> movimenti = new ArrayList<>();
		
		HttpStatus status = null;
		
		try {
			movimenti = movimentiService.getMovimenti(conto);
			resource = new MovimentiResources(movimenti);
			resource.computeLinks(conto); 
			status = HttpStatus.OK;
		} catch (Exception e) {
			status = HttpStatus.BAD_GATEWAY;
		}
		
		return new ResponseEntity<MovimentiResources>(resource, status);
	}
	
	@GetMapping("/{conto}/{id}")
	public ResponseEntity<MovimentiResources> getMovimentiStorico(@PathVariable("conto") String conto, @PathVariable("id") int id) {
		MovimentiResources resource =  null;
		List<MovimentoModel> movimenti = new ArrayList<>();
		
		try {
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}
	
}
