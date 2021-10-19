package com.handyman.app.models.documents;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Semanas")
public class HorasSemana {
	
	@Id
	@NotNull
	private String id;
	
	@NotNull
	private Tecnico tecnico;
	
	@NotNull
	private String numeroSemana;
	
	@NotNull
	private String lunes;
	
	@NotNull
	private String martes;
	
	@NotNull
	private String miercoles;
	
	@NotNull
	private String jueves;
	
	@NotNull
	private String viernes;
	
	@NotNull
	private String sabado;
	
	@NotNull
	private String domingo;

	public HorasSemana() {}

	public HorasSemana(@NotNull String id, @NotNull Tecnico tecnico, @NotNull String numeroSemana,
			@NotNull String lunes, @NotNull String martes, @NotNull String miercoles, @NotNull String jueves,
			@NotNull String viernes, @NotNull String sabado, @NotNull String domingo) {
		this.id = id;
		this.tecnico = tecnico;
		this.numeroSemana = numeroSemana;
		this.lunes = lunes;
		this.martes = martes;
		this.miercoles = miercoles;
		this.jueves = jueves;
		this.viernes = viernes;
		this.sabado = sabado;
		this.domingo = domingo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public String getNumeroSemana() {
		return numeroSemana;
	}

	public void setNumeroSemana(String numeroSemana) {
		this.numeroSemana = numeroSemana;
	}

	public String getLunes() {
		return lunes;
	}

	public void setLunes(String lunes) {
		this.lunes = lunes;
	}

	public String getMartes() {
		return martes;
	}

	public void setMartes(String martes) {
		this.martes = martes;
	}

	public String getMiercoles() {
		return miercoles;
	}

	public void setMiercoles(String miercoles) {
		this.miercoles = miercoles;
	}

	public String getJueves() {
		return jueves;
	}

	public void setJueves(String jueves) {
		this.jueves = jueves;
	}

	public String getViernes() {
		return viernes;
	}

	public void setViernes(String viernes) {
		this.viernes = viernes;
	}

	public String getSabado() {
		return sabado;
	}

	public void setSabado(String sabado) {
		this.sabado = sabado;
	}

	public String getDomingo() {
		return domingo;
	}

	public void setDomingo(String domingo) {
		this.domingo = domingo;
	}
	
	
}
