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
@Table(name = "FACTURA")
@Data
public class Factura {

	@Id
	@Column(name = "ID_FACTURA")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "SUBTOTAL")
	private Long subtotal;
	@Column(name = "VALOR_IMPUESTOS")
	private Long valorImpuestos;
	@Column(name = "VALOR_DESCUENTO")
	private Long valorDescuento;
	@Column(name = "VALOR_TOTAL")
	private Long valorTotal;
        
            public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Long subtotal) {
        this.subtotal = subtotal;
    }

    public Long getValorImpuestos() {
        return valorImpuestos;
    }

    public void setValorImpuestos(Long valorImpuestos) {
        this.valorImpuestos = valorImpuestos;
    }

    public Long getValorDescuento() {
        return valorDescuento;
    }

    public void setValorDescuento(Long valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    public Long getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Long valorTotal) {
        this.valorTotal = valorTotal;
    }

}
