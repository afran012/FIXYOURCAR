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
@Table(name="PERSONA")
@Data
public class Persona {
    
	@Id
	@Column(name = "ID_PERSONA")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "ID_TIPO_IDENTIFICACION")
	private Long idTipoIdentificacion;
	@Column(name = "IDENTIFICACION")
	private String identificacion;
	@Column(name = "PRIMER_NOMBRE")
	private String primerNombre;
	@Column(name = "SEGUNDO_NOMBRE")
	private String segundoNombre;
	@Column(name = "PRIMER_APELLIDO")
	private String primerApellido;
	@Column(name = "SEGUNDO_APELLIDO")
	private String segundoApellido;
	@Column(name = "CELULAR")
	private String celular;
	@Column(name = "DIRECCIÓN")
	private String dirección;
	@Column(name = "CORREO_ELECTRONICO")
	private String correoElectronico;
    
}
