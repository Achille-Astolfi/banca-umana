package com.example.bancaumana.resource;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resources;

import com.example.bancaumana.controller.ContiController;
import com.example.bancaumana.controller.MovimentiController;
import com.example.bancaumana.model.MovimentoModel;

public class MovimentiResources extends Resources<MovimentoModel> {
	public MovimentiResources() {
		super();
	}

	

	public MovimentiResources(List<MovimentoModel> movimenti) {
		super(movimenti);
	}

	public void computeLinks(String cc) {
		add(linkTo(MovimentiController.class).slash(cc).withSelfRel());
		add(linkTo(MovimentiController.class).slash(cc).slash(0L).withRel(Link.REL_NEXT));
		add(linkTo(ContiController.class).slash(cc).withRel("conto"));
	}

	public void computeLinks(String cc, long id, boolean hasNext) {
		add(linkTo(MovimentiController.class).slash(cc).slash(id).withSelfRel());
		if (hasNext) {
			add(linkTo(MovimentiController.class).slash(cc).slash(id + 1L).withRel(Link.REL_NEXT));
		}
		add(linkTo(ContiController.class).slash(cc).withRel("conto"));
	}
}
