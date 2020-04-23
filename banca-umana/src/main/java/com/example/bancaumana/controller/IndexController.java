package com.example.bancaumana.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bancaumana.resource.IndexResource;

@RestController
@RequestMapping("/")
public class IndexController {
	
	@GetMapping
	public ResponseEntity<IndexResource> getValue() {
		return ResponseEntity.ok(new IndexResource());
	}
}
