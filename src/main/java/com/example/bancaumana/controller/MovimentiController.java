package com.example.bancaumana.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bancaumana.resource.MovimentiResources;

@RestController
@RequestMapping(value = "/movimenti", produces = MediaType.APPLICATION_JSON_VALUE)
public class MovimentiController {

	@GetMapping("/{conto}")
	public MovimentiResources getMovimenti(@PathVariable("conto") String conto) {
		MovimentiResources resource =  new MovimentiResources();
		
		try {
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}
	
	@GetMapping("/{conto}/{id}")
	public MovimentiResources getMovimentiStorico(@PathVariable("conto") String conto, @PathVariable("id") int id) {
		MovimentiResources resource =  new MovimentiResources();
		
		try {
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}
	
}
