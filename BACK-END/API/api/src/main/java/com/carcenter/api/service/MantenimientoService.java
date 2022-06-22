/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.service;

import com.carcenter.api.DTO.MantenimientoDTO;
import com.carcenter.api.mapper.MantenimientoMapper;
//import com.carcenter.api.mapper.TipoIdentificacionMapper;
import com.carcenter.api.model.Mantenimiento;
import com.carcenter.api.repository.MantenimientoRepository;
import com.carcenter.api.service.iService.IMantenimientoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author stevenfranco
 */
@Service
public class MantenimientoService implements IMantenimientoService {
    
    
	@Autowired
	private MantenimientoRepository mantenimientoRepository;
	@Autowired
	private MantenimientoMapper mantenimientoMap;
	/*@Autowired
	private TipoIdentificacionMapper tipoIdMap;*/

	@Override
	public List<MantenimientoDTO> findAllMantenimientos() {
		// TODO Auto-generated method stub
		return mantenimientoMap.mappAllMantenimientosToMantenimientosDTOs(
				mantenimientoRepository.findMantenimientos());
	}

	public Optional<MantenimientoDTO> findMantenimientoById(Long id) {
		Optional<Mantenimiento> oMantenimiento = mantenimientoRepository
				.findMantenimientoById(id);
		return Optional.of(mantenimientoMap.mapMantenimientoToDTO(oMantenimiento.get()));
	}

	@Override
	public MantenimientoDTO updateMantenimiento(MantenimientoDTO mantenimientoDTO, Long id) {

		Optional<Mantenimiento> oMantenimiento = mantenimientoRepository
				.findMantenimientoById(id);
		if (oMantenimiento.isPresent()) {

			if (mantenimientoDTO.getIdFactura()!= null) {
				oMantenimiento.get().setIdFactura(mantenimientoDTO.getIdFactura());
			}
                        
                        if (mantenimientoDTO.getIdEstadoMantenimiento()!= null) {
				oMantenimiento.get().setIdEstadoMantenimiento(mantenimientoDTO.getIdEstadoMantenimiento());
			}
                        
                        if (mantenimientoDTO.getIdVehiculo()!= null) {
				oMantenimiento.get().setIdVehiculo(mantenimientoDTO.getIdVehiculo());
			}
                        
                        if (mantenimientoDTO.getIdVecanico()!= null) {
				oMantenimiento.get().setIdVecanico(mantenimientoDTO.getIdVecanico());
			}
                        
                        if (mantenimientoDTO.getIdManoDeObra()!= null) {
				oMantenimiento.get().setIdManoDeObra(mantenimientoDTO.getIdManoDeObra());
			}
                        
                        if (mantenimientoDTO.getDescripcion()!= null) {
				oMantenimiento.get().setDescripcion(mantenimientoDTO.getDescripcion());
			}
                        
                        if (mantenimientoDTO.getFecha()!= null) {
				oMantenimiento.get().setFecha(mantenimientoDTO.getFecha());
			}
                        

			return mantenimientoMap.mapMantenimientoToDTO(
					mantenimientoRepository.saveMantenimiento(oMantenimiento.get()));
		}
		return null;
	}

	@Override
	public MantenimientoDTO deleteMantenimientoById(Long id) {
		// TODO Auto-generated method stub
		Optional<Mantenimiento> mantenimientoDeleted = mantenimientoRepository
				.findMantenimientoById(id);
		if (mantenimientoDeleted.isPresent()) {
			mantenimientoRepository.deleteMantenimientoById(id);
			return mantenimientoMap.mapMantenimientoToDTO(mantenimientoDeleted.get());
		}
		return null;
	}

	@Override
	public Mantenimiento saveMantenimiento(Mantenimiento mantenimiento) {
		// TODO Auto-generated method stub
		mantenimientoRepository.saveMantenimiento(mantenimiento);
		return mantenimiento;
	}
    
}
