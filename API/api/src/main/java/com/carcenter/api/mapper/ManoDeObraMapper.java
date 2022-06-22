/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.carcenter.api.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.carcenter.api.DTO.ManoDeObraDTO;
import com.carcenter.api.model.ManoDeObra;

/**
 *
 * @author stevenfranco
 */
@Mapper(componentModel = "spring")
public interface ManoDeObraMapper {

    public List<ManoDeObraDTO> mappAllManoDeObrasToManoDeObrasDTOs(List<ManoDeObra> manoDeObras);

    public ManoDeObraDTO mapManoDeObraToDTO(ManoDeObra manoDeObra);
    
}
