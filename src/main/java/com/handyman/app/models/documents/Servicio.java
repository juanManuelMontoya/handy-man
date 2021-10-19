package com.handyman.app.models.documents;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Servicios")
public class Servicio {
	
	@Id
	@NotNull
	private String id;
	
	@NotNull
	private String nombre;

	public Servicio() {}

	public Servicio(@NotNull String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
