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
@Table(name = "REPUESTO")
@Data
public class Repuesto {

	@Id
	@Column(name = "ID_REPUESTO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "DESCRIPCION")
	private String descripcion;
	@Column(name = "VALOR_ARTICULO")
	private Long valorArticulo;
	@Column(name = "PORCENTAJE_DESCUENTO")
	private Long porcentajeDescuento;
        
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

    public Long getValorArticulo() {
        return valorArticulo;
    }

    public void setValorArticulo(Long valorArticulo) {
        this.valorArticulo = valorArticulo;
    }

    public Long getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(Long porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

}
