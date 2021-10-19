package com.handyman.app.models.service;

import org.springframework.stereotype.Service;

import com.handyman.app.models.documents.HorasSemana;
import com.handyman.app.models.documents.Servicio;
import com.handyman.app.models.documents.Tecnico;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface CalculatorService {
	
	// Horas de la semana
	public Flux<HorasSemana> findAllHorasSemana();
	
	public Mono<HorasSemana> findHorasSemanaById(String id);
	
	public Mono<HorasSemana> saveHorasSemana(HorasSemana HorasSemana);
	
	public Mono<Void> deleteHorasSemana(HorasSemana HorasSemana);
	
	// Tecnico
	public Flux<Tecnico> findAllTecnico();
	
	public Mono<Tecnico> findTecnicoById(String id);
	
	public Mono<Tecnico> saveTecnico(Tecnico Tecnico);
	
	public Mono<Void> deleteTecnico(Tecnico Tecnico);
	
	//Servicio
	public Flux<Servicio> findAllServicio();
	
	public Mono<Servicio> findServicioById(String id);
	
	public Mono<Servicio> saveServicio(Servicio Servicio);
	
	public Mono<Void> deleteServicio(Servicio Servicio);

}
