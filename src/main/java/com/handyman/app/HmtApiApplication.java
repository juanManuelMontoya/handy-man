package com.handyman.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class HmtApiApplication implements CommandLineRunner{
	
	
	private static final Logger log = LoggerFactory.getLogger(HmtApiApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(HmtApiApplication.class, args);
		//ConfigurableApplicationContext context = SpringApplication.run(HmtApiApplication.class, args);
		//AppConfiguration appConfiguration = context.getBean(AppConfiguration.class);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Iniciando Handy man api ");
		/*mongoTemplate.dropCollection("Semanas").subscribe();
		mongoTemplate.dropCollection("Servicios").subscribe();
		mongoTemplate.dropCollection("Tecnico").subscribe();
		
		
		Servicio mantenimientoG = new Servicio("Mantenimiento General");
		Servicio mantenimientoP = new Servicio("Mantenimiento Personalizada");
		
		Flux.just(mantenimientoG, mantenimientoP)
		.flatMap(servicio::saveServicio)
		.subscribe( c -> log.info("Servicio creado: " + c.getNombre() + ", Id: " + c.getId()));*/
		
	}

}
