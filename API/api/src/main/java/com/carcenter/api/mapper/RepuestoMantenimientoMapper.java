/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.carcenter.api.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.carcenter.api.DTO.RepuestoMantenimientoDTO;
import com.carcenter.api.model.RepuestoMantenimiento;

/**
 *
 * @author stevenfranco
 */
@Mapper(componentModel = "spring")
public interface RepuestoMantenimientoMapper {

    public List<RepuestoMantenimientoDTO> mappAllRepuestoMantenimientosToRepuestoMantenimientosDTOs(List<RepuestoMantenimiento> repuestoMantenimientos);

    public RepuestoMantenimientoDTO mapRepuestoMantenimientoToDTO(RepuestoMantenimiento repuestoMantenimiento);
    
}
