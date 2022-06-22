/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.service;

import com.carcenter.api.DTO.InventarioDTO;
import com.carcenter.api.mapper.InventarioMapper;
import com.carcenter.api.mapper.TipoIdentificacionMapper;
import com.carcenter.api.model.Inventario;
import com.carcenter.api.repository.InventarioRepository;
import com.carcenter.api.service.iService.IInventarioService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author stevenfranco
 */
@Service
public class InventarioService implements IInventarioService {

	@Autowired
	private InventarioRepository inventarioRepository;
	@Autowired
	private InventarioMapper inventarioMap;
	@Autowired
	private TipoIdentificacionMapper tipoIdMap;

	@Override
	public List<InventarioDTO> findAllInventarios() {
		// TODO Auto-generated method stub
		return inventarioMap.mappAllInventariosToInventariosDTOs(
				inventarioRepository.findInventarios());
	}

	public Optional<InventarioDTO> findInventarioById(Long id) {
		Optional<Inventario> oInventario = inventarioRepository
				.findInventarioById(id);
		return Optional.of(inventarioMap.mapInventarioToDTO(oInventario.get()));
	}

	@Override
	public InventarioDTO updateInventario(InventarioDTO inventarioDTO, Long id) {

		Optional<Inventario> oInventario = inventarioRepository
				.findInventarioById(id);
		if (oInventario.isPresent()) {

			if (inventarioDTO.getIdRepuesto()!= null) {
				oInventario.get().setIdRepuesto(inventarioDTO.getIdRepuesto());
			}
                        
                        if (inventarioDTO.getCantidad()!= null) {
				oInventario.get().setCantidad(inventarioDTO.getCantidad());
			}
                        
                        

			return inventarioMap.mapInventarioToDTO(
					inventarioRepository.saveInventario(oInventario.get()));
		}
		return null;
	}

	@Override
	public InventarioDTO deleteInventarioById(Long id) {
		// TODO Auto-generated method stub
		Optional<Inventario> inventarioDeleted = inventarioRepository
				.findInventarioById(id);
		if (inventarioDeleted.isPresent()) {
			inventarioRepository.deleteInventarioById(id);
			return inventarioMap.mapInventarioToDTO(inventarioDeleted.get());
		}
		return null;
	}

	@Override
	public Inventario saveInventario(Inventario inventario) {
		// TODO Auto-generated method stub
		inventarioRepository.saveInventario(inventario);
		return inventario;
	}

}
