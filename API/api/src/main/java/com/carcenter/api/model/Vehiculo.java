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
@Table(name="CIUDAD")
@Data
public class Vehiculo {
    
        @Id
	@Column(name="ID_CIUDAD")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="NOMBRE_CIUDAD")
	private String nombre;
	@Column(name="ID_DEPARTAMENTO")
	private Long idPais;
    
}
