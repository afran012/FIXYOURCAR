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

}
