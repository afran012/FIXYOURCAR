/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.service;

import com.carcenter.api.DTO.FacturaDTO;
import com.carcenter.api.mapper.FacturaMapper;
import com.carcenter.api.mapper.TipoIdentificacionMapper;
import com.carcenter.api.model.Factura;
import com.carcenter.api.repository.FacturaRepository;
import com.carcenter.api.service.iService.IFacturaService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author stevenfranco
 */
@Service
public class FacturaService implements IFacturaService {

	@Autowired
	private FacturaRepository facturaRepository;
	@Autowired
	private FacturaMapper facturaMap;
	@Autowired
	private TipoIdentificacionMapper tipoIdMap;

	@Override
	public List<FacturaDTO> findAllFacturas() {
		// TODO Auto-generated method stub
		return facturaMap.mappAllFacturasToFacturasDTOs(
				facturaRepository.findFacturas());
	}

	public Optional<FacturaDTO> findFacturaById(Long id) {
		Optional<Factura> oFactura = facturaRepository
				.findFacturaById(id);
		return Optional.of(facturaMap.mapFacturaToDTO(oFactura.get()));
	}

	@Override
	public FacturaDTO updateFactura(FacturaDTO facturaDTO, Long id) {

		Optional<Factura> oFactura = facturaRepository
				.findFacturaById(id);
		if (oFactura.isPresent()) {

			if (facturaDTO.getSubtotal() != null) {
				oFactura.get().setSubtotal(facturaDTO.getSubtotal());
			}
			if (facturaDTO.getValorDescuento() != null) {
				oFactura.get().setValorDescuento(facturaDTO.getValorDescuento());
			}
			if (facturaDTO.getValorImpuestos() != null) {
				oFactura.get().setValorImpuestos(facturaDTO.getValorImpuestos());
			}
			if (facturaDTO.getValorTotal() != null) {
				oFactura.get().setValorTotal(facturaDTO.getValorTotal());
			}

			return facturaMap.mapFacturaToDTO(
					facturaRepository.saveFactura(oFactura.get()));
		}
		return null;
	}

	@Override
	public FacturaDTO deleteFacturaById(Long id) {
		// TODO Auto-generated method stub
		Optional<Factura> facturaDeleted = facturaRepository
				.findFacturaById(id);
		if (facturaDeleted.isPresent()) {
			facturaRepository.deleteFacturaById(id);
			return facturaMap.mapFacturaToDTO(facturaDeleted.get());
		}
		return null;
	}

	@Override
	public Factura saveFactura(Factura factura) {
		// TODO Auto-generated method stub
		facturaRepository.saveFactura(factura);
		return factura;
	}

}
