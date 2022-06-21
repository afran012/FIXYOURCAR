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
@Table(name="TIPO_IDENTIFICACION")
@Data
public class TipoIdentificacion {
    
        @Id
	@Column(name="ID_TIPO_IDENTIFICACION")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="DESCRIPCION")
	private String descripcion;
      
}
