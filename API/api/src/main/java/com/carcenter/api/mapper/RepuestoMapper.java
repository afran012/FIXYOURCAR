/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.carcenter.api.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.carcenter.api.DTO.RepuestoDTO;
import com.carcenter.api.model.Repuesto;

/**
 *
 * @author stevenfranco
 */
@Mapper(componentModel = "spring")
public interface RepuestoMapper {

    public List<RepuestoDTO> mappAllRepuestosToRepuestosDTOs(List<Repuesto> repuestos);

    public RepuestoDTO mapRepuestoToDTO(Repuesto repuesto);
    
}
