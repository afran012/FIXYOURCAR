/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.carcenter.api.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.carcenter.api.DTO.FacturaDTO;
import com.carcenter.api.model.Factura;

/**
 *
 * @author stevenfranco
 */
@Mapper(componentModel = "spring")
public interface FacturaMapper {

    public List<FacturaDTO> mappAllFacturasToFacturasDTOs(List<Factura> facturas);

    public FacturaDTO mapFacturaToDTO(Factura factura);

}
