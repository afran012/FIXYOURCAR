/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.carcenter.api.service.iService;

import java.util.List;

import com.carcenter.api.DTO.EstadoMantenimientoDTO;
import com.carcenter.api.model.EstadoMantenimiento;

/**
 *
 * @author stevenfranco
 */
public interface IEstadoMantenimientoService {
    	public List<EstadoMantenimientoDTO> findAllEstadoMantenimientos();
	public EstadoMantenimientoDTO updateEstadoMantenimiento(EstadoMantenimientoDTO estadoMantenimientoDTO, Long id);
	public EstadoMantenimientoDTO deleteEstadoMantenimientoById(Long id);
	public EstadoMantenimiento saveEstadoMantenimiento(EstadoMantenimiento estadoMantenimiento);
    
}
