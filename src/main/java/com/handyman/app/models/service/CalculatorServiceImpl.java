package com.handyman.app.models.service;

import com.handyman.app.models.dao.HorasSemanaDao;
import com.handyman.app.models.dao.ServicioDao;
import com.handyman.app.models.dao.TecnicoDao;
import com.handyman.app.models.documents.HorasSemana;
import com.handyman.app.models.documents.Servicio;
import com.handyman.app.models.documents.Tecnico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CalculatorServiceImpl  implements CalculatorService {
	
	private final HorasSemanaDao horasSemanaDao;
	private final ServicioDao servicioDao;
	private final TecnicoDao tecnicoDao;
	
	@Autowired
	public CalculatorServiceImpl(HorasSemanaDao horasSemanaDao, ServicioDao servicioDao, TecnicoDao tecnicoDao) {
		this.horasSemanaDao = horasSemanaDao;
		this.servicioDao = servicioDao;
		this.tecnicoDao = tecnicoDao;
	}

	@Override
	public Flux<HorasSemana> findAllHorasSemana() {
		
		return horasSemanaDao.findAll();
	}

	@Override
	public Mono<HorasSemana> findHorasSemanaById(String id) {
		
		return horasSemanaDao.findById(id);
	}

	@Override
	public Mono<HorasSemana> saveHorasSemana(HorasSemana horasSemana) {
		
		return horasSemanaDao.save(horasSemana);
	}

	@Override
	public Mono<Void> deleteHorasSemana(HorasSemana horasSemana) {
		
		return horasSemanaDao.delete(horasSemana);
	}

	@Override
	public Flux<Tecnico> findAllTecnico() {
		
		return tecnicoDao.findAll();
	}

	@Override
	public Mono<Tecnico> findTecnicoById(String id) {
		
		return tecnicoDao.findById(id);
	}

	@Override
	public Mono<Tecnico> saveTecnico(Tecnico tecnico) {
		// 
		return tecnicoDao.save(tecnico);
	}

	@Override
	public Mono<Void> deleteTecnico(Tecnico tecnico) {
		
		return tecnicoDao.delete(tecnico);
	}

	@Override
	public Flux<Servicio> findAllServicio() {
		
		return servicioDao.findAll();
	}

	@Override
	public Mono<Servicio> findServicioById(String id) {
		
		return servicioDao.findById(id);
	}

	@Override
	public Mono<Servicio> saveServicio(Servicio servicio) {
		
		return servicioDao.save(servicio);
	}

	@Override
	public Mono<Void> deleteServicio(Servicio servicio) {
		
		return servicioDao.delete(servicio);
	}

}
