package com.example.bancaumana.resource;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.core.Relation;

import com.example.bancaumana.controller.IndexController;

@Relation(value = "index")
public class IndexResource extends ResourceSupport {
	public IndexResource() {
		add(linkTo(IndexController.class).withSelfRel());
	}
}
