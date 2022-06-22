/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.DTO;

import java.util.Date;
import lombok.Data;

/**
 *
 * @author stevenfranco
 */
@Data
public class MantenimientoDTO {

    private Long id;
    private Long idFactura;
    private Long idEstadoMantenimiento;
    private Long idVehiculo;
    private Long idVecanico;
    private Long idManoDeObra;
    private String descripcion;
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
