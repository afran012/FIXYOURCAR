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
	private String subtotal;
	@Column(name = "VALOR_IMPUESTOS")
	private Long valorImpuestos;
	@Column(name = "VALOR_DESCUENTO")
	private Long valorDescuento;
	@Column(name = "VALOR_TOTAL")
	private Long valorTotal;

}
