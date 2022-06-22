/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.carcenter.api.service.iService;

import java.util.List;

import com.carcenter.api.DTO.RepuestoMantenimientoDTO;
import com.carcenter.api.model.RepuestoMantenimiento;

/**
 *
 * @author stevenfranco
 */
public interface IRepuestoMantenimientoService {
	public List<RepuestoMantenimientoDTO> findAllRepuestoMantenimientos();

	public RepuestoMantenimientoDTO updateRepuestoMantenimiento(RepuestoMantenimientoDTO repuestoMantenimientoDTO,
			Long id);

	public RepuestoMantenimientoDTO deleteRepuestoMantenimientoById(Long id);

	public RepuestoMantenimiento saveRepuestoMantenimiento(RepuestoMantenimiento repuestoMantenimiento);

}
