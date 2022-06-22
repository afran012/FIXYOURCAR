/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.carcenter.api.service.iService;

import java.util.List;

import com.carcenter.api.DTO.MantenimientoDTO;
import com.carcenter.api.model.Mantenimiento;

/**
 *
 * @author stevenfranco
 */
public interface IMantenimientoService {
    	public List<MantenimientoDTO> findAllMantenimientos();
	public MantenimientoDTO updateMantenimiento(MantenimientoDTO mantenimientoDTO, Long id);
	public MantenimientoDTO deleteMantenimientoById(Long id);
	public Mantenimiento saveMantenimiento(Mantenimiento mantenimiento);
    
}
