package com.example.bancaumana.boot;
 
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
@ComponentScan("com.example.bancaumana")
public class BancaUmanaBoot {
	@Autowired
	public void setObjectMapper(ObjectMapper objectMapper) {
		objectMapper.setTimeZone(TimeZone.getDefault());
	}

	public static void main(String[] args) {
		SpringApplication.run(BancaUmanaBoot.class);
	}
}
