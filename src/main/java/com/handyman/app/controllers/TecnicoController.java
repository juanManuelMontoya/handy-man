package com.handyman.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.handyman.app.models.documents.Tecnico;
import com.handyman.app.models.service.CalculatorService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/tecnico")
public class TecnicoController {
	
	@Autowired
	private CalculatorService service;
	
	@GetMapping
	public Mono<ResponseEntity<Flux<Tecnico>>> listarTecnico() {
		return Mono.just(
				ResponseEntity.ok()
				.contentType(MediaType.APPLICATION_JSON)
				.body(service.findAllTecnico())
				);
	}
	
	
	@GetMapping("/{id}")
	public Mono<ResponseEntity<Tecnico>> verTecnico(@PathVariable String id ){
		
		return service.findTecnicoById(id).map(t -> ResponseEntity.ok()
				.contentType(MediaType.APPLICATION_JSON)
				.body(t))
				.defaultIfEmpty(ResponseEntity.notFound().build());
	}

}
