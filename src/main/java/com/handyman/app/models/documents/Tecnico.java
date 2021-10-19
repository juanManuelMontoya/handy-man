package com.handyman.app.models.documents;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Tecnico")
public class Tecnico {
	
	@Id
	private String id;
	
	@NotNull
	private String nombre;

	@NotNull
	private String apellido;
	
	@NotNull
	private String password;
	
	public Tecnico() {}

	public Tecnico(@NotNull String nombre, @NotNull String apellido, @NotNull String password) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.password = password;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

}
