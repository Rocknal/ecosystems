package com.greentech.sistemawebambiental.model;

import jakarta.persistence.*;

@Entity
@Table(name = "checklist_items")
public class ChecklistItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String descripcion;

    private Integer seccion; 
    
    private Integer orden; 
    
    public ChecklistItem(Integer seccion, String descripcion, Integer orden) {
        this.seccion = seccion;
        this.descripcion = descripcion;
        this.orden = orden;
    }

    public ChecklistItem() {
    }

    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
    	this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getSeccion() {
        return seccion;
    }

    public void setSeccion(Integer seccion) {
        this.seccion = seccion;
    }

	public Integer getOrden() {
		return orden;
	}

	public void setOrden(Integer orden) {
		this.orden = orden;
	}
}