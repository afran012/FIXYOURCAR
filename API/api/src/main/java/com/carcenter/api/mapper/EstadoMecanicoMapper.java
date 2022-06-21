/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.carcenter.api.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.carcenter.api.DTO.EstadoMecanicoDTO;
import com.carcenter.api.model.EstadoMecanico;

/**
 *
 * @author stevenfranco
 */
@Mapper(componentModel = "spring")
public interface EstadoMecanicoMapper {

    public List<EstadoMecanicoDTO> mappAllEstadoMecanicosToEstadoMecanicosDTOs(List<EstadoMecanico> estadoMecanicos);

	public EstadoMecanicoDTO mapEstadoMecanicoToDTO(EstadoMecanico estadoMecanico);
    
}
