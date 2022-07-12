/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.carcenter.api.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.carcenter.api.DTO.MecanicoDTO;
import com.carcenter.api.model.Mecanico;

/**
 *
 * @author stevenfranco
 */
@Mapper(componentModel = "spring")
public interface MecanicoMapper {

    public List<MecanicoDTO> mappAllMecanicosToMecanicosDTOs(List<Mecanico> mecanicos);

    public MecanicoDTO mapMecanicoToDTO(Mecanico mecanico);
    
}
