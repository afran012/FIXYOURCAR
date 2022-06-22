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
@Table(name = "MANO_DE_OBRA")
@Data
public class ManoDeObra {

	@Id
	@Column(name = "ID_MANO_DE_OBRA")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "SERVICIO")
	private String servicio;
	@Column(name = "DESCRIPCION")
	private String descripcion;
	@Column(name = "PRECIO_MAXIMO")
	private Long precioMaximo;
	@Column(name = "PRECIO_MINIMO")
	private Long precioMinimo;
	@Column(name = "PRECIO_TOTAL")
	private Long precioTotal;
        
            public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getPrecioMaximo() {
        return precioMaximo;
    }

    public void setPrecioMaximo(Long precioMaximo) {
        this.precioMaximo = precioMaximo;
    }

    public Long getPrecioMinimo() {
        return precioMinimo;
    }

    public void setPrecioMinimo(Long precioMinimo) {
        this.precioMinimo = precioMinimo;
    }

    public Long getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Long precioTotal) {
        this.precioTotal = precioTotal;
    }

}
