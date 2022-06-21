/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.carcenter.api.mapper;

import java.util.List;
import org.mapstruct.Mapper;

import com.carcenter.api.DTO.EstadoMantenimientoDTO;
import com.carcenter.api.model.EstadoMantenimiento;

/**
 *
 * @author stevenfranco
 */
@Mapper(componentModel = "spring")
public interface EstadoMantenimientoMapper {

	public List<EstadoMantenimientoDTO> mappAllEstadoMantenimientosToEstadoMantenimientosDTOs(List<EstadoMantenimiento> estadoMantenimientos);

	public EstadoMantenimientoDTO mapEstadoMantenimientoToDTO(EstadoMantenimiento estadoMantenimiento);

}
