/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.service;

import com.carcenter.api.DTO.EstadoMecanicoDTO;
import com.carcenter.api.mapper.EstadoMecanicoMapper;
//import com.carcenter.api.mapper.TipoIdentificacionMapper;
import com.carcenter.api.model.EstadoMecanico;
import com.carcenter.api.repository.EstadoMecanicoRepository;
import com.carcenter.api.service.iService.IEstadoMecanicoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author stevenfranco
 */
@Service
public class EstadoMecanicoService implements IEstadoMecanicoService {
    
    
	@Autowired
	private EstadoMecanicoRepository estadoMecanicoRepository;
	@Autowired
	private EstadoMecanicoMapper estadoMecanicoMap;
	//@Autowired
	//private TipoIdentificacionMapper tipoIdMap;

	@Override
	public List<EstadoMecanicoDTO> findAllEstadoMecanicos() {
		// TODO Auto-generated method stub
		return estadoMecanicoMap.mappAllEstadoMecanicosToEstadoMecanicosDTOs(
				estadoMecanicoRepository.findEstadoMecanicos());
	}

	public Optional<EstadoMecanicoDTO> findEstadoMecanicoById(Long id) {
		Optional<EstadoMecanico> oEstadoMecanico = estadoMecanicoRepository
				.findEstadoMecanicoById(id);
		return Optional.of(estadoMecanicoMap.mapEstadoMecanicoToDTO(oEstadoMecanico.get()));
	}

	@Override
	public EstadoMecanicoDTO updateEstadoMecanico(EstadoMecanicoDTO estadoMecanicoDTO, Long id) {

		Optional<EstadoMecanico> oEstadoMecanico = estadoMecanicoRepository
				.findEstadoMecanicoById(id);
		if (oEstadoMecanico.isPresent()) {

			if (estadoMecanicoDTO.getDescripcion()!= null) {
				oEstadoMecanico.get().setDescripcion(estadoMecanicoDTO.getDescripcion());
			}
                        

			return estadoMecanicoMap.mapEstadoMecanicoToDTO(
					estadoMecanicoRepository.saveEstadoMecanico(oEstadoMecanico.get()));
		}
		return null;
	}

	@Override
	public EstadoMecanicoDTO deleteEstadoMecanicoById(Long id) {
		// TODO Auto-generated method stub
		Optional<EstadoMecanico> estadoMecanicoDeleted = estadoMecanicoRepository
				.findEstadoMecanicoById(id);
		if (estadoMecanicoDeleted.isPresent()) {
			estadoMecanicoRepository.deleteEstadoMecanicoById(id);
			return estadoMecanicoMap.mapEstadoMecanicoToDTO(estadoMecanicoDeleted.get());
		}
		return null;
	}

	@Override
	public EstadoMecanico saveEstadoMecanico(EstadoMecanico estadoMecanico) {
		// TODO Auto-generated method stub
		estadoMecanicoRepository.saveEstadoMecanico(estadoMecanico);
		return estadoMecanico;
	}
    
}
