/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.service;

import com.carcenter.api.DTO.TipoIdentificacionDTO;
import com.carcenter.api.mapper.TipoIdentificacionMapper;
import com.carcenter.api.mapper.TipoIdentificacionMapper;
import com.carcenter.api.model.TipoIdentificacion;
import com.carcenter.api.repository.TipoIdentificacionRepository;
import com.carcenter.api.service.iService.ITipoIdentificacionService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author stevenfranco
 */
@Service
public class TipoIdentificacionService implements ITipoIdentificacionService {
    
    
	@Autowired
	private TipoIdentificacionRepository tipoIdentificacionRepository;
	@Autowired
	private TipoIdentificacionMapper tipoIdentificacionMap;
	@Autowired
	private TipoIdentificacionMapper tipoIdMap;

	@Override
	public List<TipoIdentificacionDTO> findAllTipoIdentificacions() {
		// TODO Auto-generated method stub
		return tipoIdentificacionMap.mappAllTipoIdentificacionsToTipoIdentificacionsDTOs(
				tipoIdentificacionRepository.findTipoIdentificacions());
	}

	public Optional<TipoIdentificacionDTO> findTipoIdentificacionById(Long id) {
		Optional<TipoIdentificacion> oTipoIdentificacion = tipoIdentificacionRepository
				.findTipoIdentificacionById(id);
		return Optional.of(tipoIdentificacionMap.mapTipoIdentificacionToDTO(oTipoIdentificacion.get()));
	}

	@Override
	public TipoIdentificacionDTO updateTipoIdentificacion(TipoIdentificacionDTO tipoIdentificacionDTO, Long id) {

		Optional<TipoIdentificacion> oTipoIdentificacion = tipoIdentificacionRepository
				.findTipoIdentificacionById(id);
		if (oTipoIdentificacion.isPresent()) {

			if (tipoIdentificacionDTO.getDescripcion()!= null) {
				oTipoIdentificacion.get().setDescripcion(tipoIdentificacionDTO.getDescripcion());
			}
                        

			return tipoIdentificacionMap.mapTipoIdentificacionToDTO(
					tipoIdentificacionRepository.saveTipoIdentificacion(oTipoIdentificacion.get()));
		}
		return null;
	}

	@Override
	public TipoIdentificacionDTO deleteTipoIdentificacionById(Long id) {
		// TODO Auto-generated method stub
		Optional<TipoIdentificacion> tipoIdentificacionDeleted = tipoIdentificacionRepository
				.findTipoIdentificacionById(id);
		if (tipoIdentificacionDeleted.isPresent()) {
			tipoIdentificacionRepository.deleteTipoIdentificacionById(id);
			return tipoIdentificacionMap.mapTipoIdentificacionToDTO(tipoIdentificacionDeleted.get());
		}
		return null;
	}

	@Override
	public TipoIdentificacion saveTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
		// TODO Auto-generated method stub
		tipoIdentificacionRepository.saveTipoIdentificacion(tipoIdentificacion);
		return tipoIdentificacion;
	}
    
}
