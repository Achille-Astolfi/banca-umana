package com.example.bancaumana.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bancaumana.resource.ContoResource;

/**
 * 
 * @author Jan
 *
 */
@RestController
@RequestMapping(value = "/conti", produces = MediaType.APPLICATION_JSON_VALUE)
public class ContiController {

	@GetMapping("/{conto}")
	public ResponseEntity<ContoResource> getConto(@PathVariable("conto") String conto) {
		ContoResource resource = null;

		try {

		} catch (Exception e) {
			// TODO
		}

		return null;

	}

}
