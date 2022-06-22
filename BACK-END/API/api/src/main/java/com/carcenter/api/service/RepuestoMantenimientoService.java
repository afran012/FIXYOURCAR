/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.service;

import com.carcenter.api.DTO.RepuestoMantenimientoDTO;
import com.carcenter.api.mapper.RepuestoMantenimientoMapper;
//import com.carcenter.api.mapper.TipoIdentificacionMapper;
import com.carcenter.api.model.RepuestoMantenimiento;
import com.carcenter.api.repository.RepuestoMantenimientoRepository;
import com.carcenter.api.service.iService.IRepuestoMantenimientoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author stevenfranco
 */
@Service
public class RepuestoMantenimientoService implements IRepuestoMantenimientoService {
    
    
	@Autowired
	private RepuestoMantenimientoRepository repuestoMantenimientoRepository;
	@Autowired
	private RepuestoMantenimientoMapper repuestoMantenimientoMap;
	/*@Autowired
	private TipoIdentificacionMapper tipoIdMap;*/

	@Override
	public List<RepuestoMantenimientoDTO> findAllRepuestoMantenimientos() {
		// TODO Auto-generated method stub
		return repuestoMantenimientoMap.mappAllRepuestoMantenimientosToRepuestoMantenimientosDTOs(
				repuestoMantenimientoRepository.findRepuestoMantenimientos());
	}

	public Optional<RepuestoMantenimientoDTO> findRepuestoMantenimientoById(Long id) {
		Optional<RepuestoMantenimiento> oRepuestoMantenimiento = repuestoMantenimientoRepository
				.findRepuestoMantenimientoById(id);
		return Optional.of(repuestoMantenimientoMap.mapRepuestoMantenimientoToDTO(oRepuestoMantenimiento.get()));
	}

	@Override
	public RepuestoMantenimientoDTO updateRepuestoMantenimiento(RepuestoMantenimientoDTO repuestoMantenimientoDTO, Long id) {

		Optional<RepuestoMantenimiento> oRepuestoMantenimiento = repuestoMantenimientoRepository
				.findRepuestoMantenimientoById(id);
		if (oRepuestoMantenimiento.isPresent()) {

			if (repuestoMantenimientoDTO.getIdMantenimiento()!= null) {
				oRepuestoMantenimiento.get().setIdMantenimiento(repuestoMantenimientoDTO.getIdMantenimiento());
			}
                        if (repuestoMantenimientoDTO.getIdRepuesto()!= null) {
				oRepuestoMantenimiento.get().setIdRepuesto(repuestoMantenimientoDTO.getIdRepuesto());
			}

			return repuestoMantenimientoMap.mapRepuestoMantenimientoToDTO(
					repuestoMantenimientoRepository.saveRepuestoMantenimiento(oRepuestoMantenimiento.get()));
		}
		return null;
	}

	@Override
	public RepuestoMantenimientoDTO deleteRepuestoMantenimientoById(Long id) {
		// TODO Auto-generated method stub
		Optional<RepuestoMantenimiento> repuestoMantenimientoDeleted = repuestoMantenimientoRepository
				.findRepuestoMantenimientoById(id);
		if (repuestoMantenimientoDeleted.isPresent()) {
			repuestoMantenimientoRepository.deleteRepuestoMantenimientoById(id);
			return repuestoMantenimientoMap.mapRepuestoMantenimientoToDTO(repuestoMantenimientoDeleted.get());
		}
		return null;
	}

	@Override
	public RepuestoMantenimiento saveRepuestoMantenimiento(RepuestoMantenimiento repuestoMantenimiento) {
		// TODO Auto-generated method stub
		repuestoMantenimientoRepository.saveRepuestoMantenimiento(repuestoMantenimiento);
		return repuestoMantenimiento;
	}
    
}
