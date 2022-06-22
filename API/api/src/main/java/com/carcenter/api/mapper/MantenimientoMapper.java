/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.carcenter.api.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.carcenter.api.DTO.MantenimientoDTO;
import com.carcenter.api.model.Mantenimiento;

/**
 *
 * @author stevenfranco
 */
@Mapper(componentModel = "spring")
public interface MantenimientoMapper {

    public List<MantenimientoDTO> mappAllMantenimientosToMantenimientosDTOs(List<Mantenimiento> mantenimientos);

    public MantenimientoDTO mapMantenimientoToDTO(Mantenimiento mantenimiento);
    
}
