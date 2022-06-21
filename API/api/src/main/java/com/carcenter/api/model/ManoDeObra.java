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

}
