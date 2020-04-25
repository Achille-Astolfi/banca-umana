package com.example.bancaumana.test.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.example.bancaumana.boot.BancaUmanaBoot;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BancaUmanaBoot.class)
@AutoConfigureMockMvc
public class MovimentiControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void getMovimentiTest() throws Exception {
		mockMvc.perform(get("/movimenti/310020200004")//
				.accept(MediaType.APPLICATION_JSON))//
				.andExpect(status().isOk())//
				.andExpect(jsonPath("$._links.next").exists());
	}

	@Test
	public void getMovimentiNextTest() throws Exception {
		mockMvc.perform(get("/movimenti/310020200003/1")//
				.accept(MediaType.APPLICATION_JSON))//
				.andExpect(status().isOk())//
				.andExpect(jsonPath("$._links.conto").exists());
	}
}
