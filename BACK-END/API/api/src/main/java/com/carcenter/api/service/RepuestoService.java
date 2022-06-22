/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.service;

import com.carcenter.api.DTO.RepuestoDTO;
import com.carcenter.api.mapper.RepuestoMapper;
//import com.carcenter.api.mapper.TipoIdentificacionMapper;
import com.carcenter.api.model.Repuesto;
import com.carcenter.api.repository.RepuestoRepository;
import com.carcenter.api.service.iService.IRepuestoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author stevenfranco
 */
@Service
public class RepuestoService implements IRepuestoService {
    
    
	@Autowired
	private RepuestoRepository repuestoRepository;
	@Autowired
	private RepuestoMapper repuestoMap;
	/*@Autowired
	private TipoIdentificacionMapper tipoIdMap;*/

	@Override
	public List<RepuestoDTO> findAllRepuestos() {
		// TODO Auto-generated method stub
		return repuestoMap.mappAllRepuestosToRepuestosDTOs(
				repuestoRepository.findRepuestos());
	}

	public Optional<RepuestoDTO> findRepuestoById(Long id) {
		Optional<Repuesto> oRepuesto = repuestoRepository
				.findRepuestoById(id);
		return Optional.of(repuestoMap.mapRepuestoToDTO(oRepuesto.get()));
	}

	@Override
	public RepuestoDTO updateRepuesto(RepuestoDTO repuestoDTO, Long id) {

		Optional<Repuesto> oRepuesto = repuestoRepository
				.findRepuestoById(id);
		if (oRepuesto.isPresent()) {

			if (repuestoDTO.getDescripcion()!= null) {
				oRepuesto.get().setDescripcion(repuestoDTO.getDescripcion());
			}
                        
                        if (repuestoDTO.getValorArticulo()!= null) {
				oRepuesto.get().setValorArticulo(repuestoDTO.getValorArticulo());
			}
                        
                        if (repuestoDTO.getPorcentajeDescuento()!= null) {
				oRepuesto.get().setPorcentajeDescuento(repuestoDTO.getPorcentajeDescuento());
			}
                        
                        

			return repuestoMap.mapRepuestoToDTO(
					repuestoRepository.saveRepuesto(oRepuesto.get()));
		}
		return null;
	}

	@Override
	public RepuestoDTO deleteRepuestoById(Long id) {
		// TODO Auto-generated method stub
		Optional<Repuesto> repuestoDeleted = repuestoRepository
				.findRepuestoById(id);
		if (repuestoDeleted.isPresent()) {
			repuestoRepository.deleteRepuestoById(id);
			return repuestoMap.mapRepuestoToDTO(repuestoDeleted.get());
		}
		return null;
	}

	@Override
	public Repuesto saveRepuesto(Repuesto repuesto) {
		// TODO Auto-generated method stub
		repuestoRepository.saveRepuesto(repuesto);
		return repuesto;
	}
    
}
