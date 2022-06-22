/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carcenter.api.DTO.EstadoMantenimientoDTO;
import com.carcenter.api.mapper.EstadoMantenimientoMapper;
//import com.carcenter.api.mapper.TipoIdentificacionMapper;
import com.carcenter.api.model.EstadoMantenimiento;
import com.carcenter.api.repository.EstadoMantenimientoRepository;
import com.carcenter.api.service.iService.IEstadoMantenimientoService;

/**
 *
 * @author stevenfranco
 */
@Service
public class EstadoMantenimientoService implements IEstadoMantenimientoService {

	@Autowired
	private EstadoMantenimientoRepository estadoMantenimientoRepository;
	@Autowired
	private EstadoMantenimientoMapper estadoMantenimientoMap;
	/*@Autowired
	private TipoIdentificacionMapper tipoIdMap;*/

	@Override
	public List<EstadoMantenimientoDTO> findAllEstadoMantenimientos() {
		// TODO Auto-generated method stub
		return estadoMantenimientoMap.mappAllEstadoMantenimientosToEstadoMantenimientosDTOs(
				estadoMantenimientoRepository.findEstadoMantenimientos());
	}

	public Optional<EstadoMantenimientoDTO> findEstadoMantenimientoById(Long id) {
		Optional<EstadoMantenimiento> oEstadoMantenimiento = estadoMantenimientoRepository
				.findEstadoMantenimientoById(id);
		return Optional.of(estadoMantenimientoMap.mapEstadoMantenimientoToDTO(oEstadoMantenimiento.get()));
	}

	@Override
	public EstadoMantenimientoDTO updateEstadoMantenimiento(EstadoMantenimientoDTO estadoMantenimientoDTO, Long id) {

		Optional<EstadoMantenimiento> oEstadoMantenimiento = estadoMantenimientoRepository
				.findEstadoMantenimientoById(id);
		if (oEstadoMantenimiento.isPresent()) {

			if (estadoMantenimientoDTO.getDescripcion()!= null) {
				oEstadoMantenimiento.get().setDescripcion(estadoMantenimientoDTO.getDescripcion());
			}
                        

			return estadoMantenimientoMap.mapEstadoMantenimientoToDTO(
					estadoMantenimientoRepository.saveEstadoMantenimiento(oEstadoMantenimiento.get()));
		}
		return null;
	}

	@Override
	public EstadoMantenimientoDTO deleteEstadoMantenimientoById(Long id) {
		// TODO Auto-generated method stub
		Optional<EstadoMantenimiento> estadoMantenimientoDeleted = estadoMantenimientoRepository
				.findEstadoMantenimientoById(id);
		if (estadoMantenimientoDeleted.isPresent()) {
			estadoMantenimientoRepository.deleteEstadoMantenimientoById(id);
			return estadoMantenimientoMap.mapEstadoMantenimientoToDTO(estadoMantenimientoDeleted.get());
		}
		return null;
	}

	@Override
	public EstadoMantenimiento saveEstadoMantenimiento(EstadoMantenimiento estadoMantenimiento) {
		// TODO Auto-generated method stub
		estadoMantenimientoRepository.saveEstadoMantenimiento(estadoMantenimiento);
		return estadoMantenimiento;
	}

}
