package com.example.bancaumana.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bancaumana.model.ContoModel;
import com.example.bancaumana.resource.ContoResource;
import com.example.bancaumana.service.ContoService;

/**
 * 
 * @author Jan
 *
 */
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value = "/conti", produces = MediaType.APPLICATION_JSON_VALUE)
public class ContiController {
	@Autowired ContoService contoService;

	@GetMapping("/{conto}")
	public ResponseEntity<ContoResource> getConto(@PathVariable("conto") String conto) {
		ContoResource resource = null;
		HttpStatus status = null;
		try {
			ContoModel model = contoService.findConto(conto);
			if (model != null) {
				status = HttpStatus.OK;
				resource = new ContoResource(model);
			} else {
				status = HttpStatus.NOT_FOUND;
			}
		} catch (Exception e) {
			status = HttpStatus.BAD_GATEWAY;
		}

		return new ResponseEntity<>(resource, status);

	}

}
