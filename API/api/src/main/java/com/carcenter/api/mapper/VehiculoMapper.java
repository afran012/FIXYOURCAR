/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.carcenter.api.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.carcenter.api.DTO.VehiculoDTO;
import com.carcenter.api.model.Vehiculo;

/**
 *
 * @author stevenfranco
 */
@Mapper(componentModel = "spring")
public interface VehiculoMapper {

    public List<VehiculoDTO> mappAllVehiculosToVehiculosDTOs(List<Vehiculo> vehiculos);

    public VehiculoDTO mapVehiculoToDTO(Vehiculo vehiculo);
    
}
