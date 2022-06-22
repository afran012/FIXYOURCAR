/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.model;

import java.util.Date;
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
@Table(name = "MANTENIMIENTO")
@Data
public class Mantenimiento {

	@Id
	@Column(name = "ID_MANTENIMIENTO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "ID_FACTURA")
	private Long idFactura;
	@Column(name = "ID_ESTADO_MANTENIMIENTO")
	private Long idEstadoMantenimiento;
	@Column(name = "ID_VEHICULO")
	private Long idVehiculo;
	@Column(name = "ID_MECANICO")
	private Long idVecanico;
	@Column(name = "ID_MANO_DE_OBRA")
	private Long idManoDeObra;
	@Column(name = "DESCRIPCION")
	private String descripcion;
	@Column(name = "FECHA")
	private Date fecha;
        
        public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Long idFactura) {
        this.idFactura = idFactura;
    }

    public Long getIdEstadoMantenimiento() {
        return idEstadoMantenimiento;
    }

    public void setIdEstadoMantenimiento(Long idEstadoMantenimiento) {
        this.idEstadoMantenimiento = idEstadoMantenimiento;
    }

    public Long getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Long idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public Long getIdVecanico() {
        return idVecanico;
    }

    public void setIdVecanico(Long idVecanico) {
        this.idVecanico = idVecanico;
    }

    public Long getIdManoDeObra() {
        return idManoDeObra;
    }

    public void setIdManoDeObra(Long idManoDeObra) {
        this.idManoDeObra = idManoDeObra;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
