/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.carcenter.api.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.carcenter.api.DTO.InventarioDTO;
import com.carcenter.api.model.Inventario;

/**
 *
 * @author stevenfranco
 */
@Mapper(componentModel = "spring")
public interface InventarioMapper {

    public List<InventarioDTO> mappAllInventariosToInventariosDTOs(List<Inventario> inventarios);

    public InventarioDTO mapInventarioToDTO(Inventario inventario);

}
