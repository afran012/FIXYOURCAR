/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.carcenter.api.service.iService;

import java.util.List;

import com.carcenter.api.DTO.FacturaDTO;
import com.carcenter.api.model.Factura;

/**
 *
 * @author stevenfranco
 */
public interface IFacturaService {
	public List<FacturaDTO> findAllFacturas();

	public FacturaDTO updateFactura(FacturaDTO facturaDTO, Long id);

	public FacturaDTO deleteFacturaById(Long id);

	public Factura saveFactura(Factura factura);

}
