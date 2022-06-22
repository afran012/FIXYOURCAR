/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.carcenter.api.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.carcenter.api.DTO.TipoIdentificacionDTO;
import com.carcenter.api.model.TipoIdentificacion;

/**
 *
 * @author stevenfranco
 */
@Mapper(componentModel = "spring")
public interface TipoIdentificacionMapper {

    public List<TipoIdentificacionDTO> mappAllTipoIdentificacionsToTipoIdentificacionsDTOs(List<TipoIdentificacion> tipoIdentificacions);

    public TipoIdentificacionDTO mapTipoIdentificacionToDTO(TipoIdentificacion tipoIdentificacion);
    
}
