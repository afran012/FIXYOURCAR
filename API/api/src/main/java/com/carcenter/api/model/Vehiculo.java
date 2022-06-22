/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author stevenfranco
 */

@Entity
@Table(name="VEHICULO")
@Data
public class Vehiculo {
    
        @Id
	@Column(name="ID_VEHICULO")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="ID_PERSONA")
	private Long idPersona;
	@Column(name="PLACAS")
	private String placas;
	@Column(name="MARCA")
	private String marca;
        
        public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
