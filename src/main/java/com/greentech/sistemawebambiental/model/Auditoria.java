package com.greentech.sistemawebambiental.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;

import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "auditorias")
public class Auditoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "El código es obligatorio")
	private String codigo;

	private String revision;

	@NotBlank(message = "El silo de acopio es obligatorio")
	private String siloAcopio;

	@NotBlank(message = "Debe seleccionar un departamento")
	private String departamento;

	@NotBlank(message = "Debe seleccionar un distrito")
	private String distrito;

	private String localidad;

	private String lugar;

	@Column(name = "coordenadax")
	private String coordenadaX;

	@Column(name = "coordenaday")
	private String coordenadaY;

	@Column(columnDefinition = "TEXT")
	private String observaciones;

	private LocalDate fecha;

	private String usuarioEmail;

	@OneToMany(mappedBy = "auditoria", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<AuditoriaItem> items = new ArrayList<>();
	
	public Auditoria() {
		
	}

	public Long getId() {
		return id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getRevision() {
		return revision;
	}

	public void setRevision(String revision) {
		this.revision = revision;
	}

	public String getSiloAcopio() {
		return siloAcopio;
	}

	public void setSiloAcopio(String siloAcopio) {
		this.siloAcopio = siloAcopio;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(String coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public String getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(String coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getUsuarioEmail() {
		return usuarioEmail;
	}

	public void setUsuarioEmail(String usuarioEmail) {
		this.usuarioEmail = usuarioEmail;
	}

	public List<AuditoriaItem> getItems() {
		return items;
	}

	public void setItems(List<AuditoriaItem> items) {
		this.items = items;
	}
}
