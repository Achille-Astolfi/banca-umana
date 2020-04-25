package com.example.bancaumana.resource;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

import org.springframework.hateoas.Resource;

import com.example.bancaumana.controller.ContiController;
import com.example.bancaumana.controller.MovimentiController;
import com.example.bancaumana.model.ContoModel;

public class ContoResource extends Resource<ContoModel> {
	public ContoResource() {
		super(new ContoModel());
	}

	public ContoResource(ContoModel conto) {
		super(conto);
	}
	
	public void computeLinks(String cc) {
		add(linkTo(ContiController.class).slash(cc).withSelfRel());
		add(linkTo(MovimentiController.class).slash(cc).withRel("movimenti"));
	}
}
