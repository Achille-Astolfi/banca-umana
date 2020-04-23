package com.example.bancaumana.boot;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.bancaumana")
public class BancaUmanaBoot {

	public static void main(String[] args) {
		SpringApplication.run(BancaUmanaBoot.class);
	}
}
