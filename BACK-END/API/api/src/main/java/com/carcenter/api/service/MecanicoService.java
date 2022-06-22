/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.service;

import com.carcenter.api.DTO.MecanicoDTO;
import com.carcenter.api.mapper.MecanicoMapper;
//import com.carcenter.api.mapper.TipoIdentificacionMapper;
import com.carcenter.api.model.Mecanico;
import com.carcenter.api.repository.MecanicoRepository;
import com.carcenter.api.service.iService.IMecanicoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author stevenfranco
 */
@Service
public class MecanicoService implements IMecanicoService {
    
    
	@Autowired
	private MecanicoRepository mecanicoRepository;
	@Autowired
	private MecanicoMapper mecanicoMap;
	/*@Autowired
	private TipoIdentificacionMapper tipoIdMap;*/

	@Override
	public List<MecanicoDTO> findAllMecanicos() {
		// TODO Auto-generated method stub
		return mecanicoMap.mappAllMecanicosToMecanicosDTOs(
				mecanicoRepository.findMecanicos());
	}

	public Optional<MecanicoDTO> findMecanicoById(Long id) {
		Optional<Mecanico> oMecanico = mecanicoRepository
				.findMecanicoById(id);
		return Optional.of(mecanicoMap.mapMecanicoToDTO(oMecanico.get()));
	}

	@Override
	public MecanicoDTO updateMecanico(MecanicoDTO mecanicoDTO, Long id) {

		Optional<Mecanico> oMecanico = mecanicoRepository
				.findMecanicoById(id);
		if (oMecanico.isPresent()) {

			if (mecanicoDTO.getIdEstadoMecanico()!= null) {
				oMecanico.get().setIdEstadoMecanico(mecanicoDTO.getIdEstadoMecanico());
			}
                        if (mecanicoDTO.getIdTipoIdentificacion()!= null) {
				oMecanico.get().setIdTipoIdentificacion(mecanicoDTO.getIdTipoIdentificacion());
			}
                        if (mecanicoDTO.getIdentificacion()!= null) {
				oMecanico.get().setIdentificacion(mecanicoDTO.getIdentificacion());
			}
                        if (mecanicoDTO.getPrimerNombre()!= null) {
				oMecanico.get().setPrimerNombre(mecanicoDTO.getPrimerNombre());
			}
                        if (mecanicoDTO.getSegundoNombre()!= null) {
				oMecanico.get().setSegundoNombre(mecanicoDTO.getSegundoNombre());
			}
                        if (mecanicoDTO.getPrimerApellido()!= null) {
				oMecanico.get().setPrimerApellido(mecanicoDTO.getPrimerApellido());
			}
                        if (mecanicoDTO.getSegundoApellido()!= null) {
				oMecanico.get().setSegundoApellido(mecanicoDTO.getSegundoApellido());
			}
                        if (mecanicoDTO.getCelular()!= null) {
				oMecanico.get().setCelular(mecanicoDTO.getCelular());
			}
                        if (mecanicoDTO.getDirección()!= null) {
				oMecanico.get().setDirección(mecanicoDTO.getDirección());
			}
                        if (mecanicoDTO.getCorreoElectronico()!= null) {
				oMecanico.get().setCorreoElectronico(mecanicoDTO.getCorreoElectronico());
			}
                        

			return mecanicoMap.mapMecanicoToDTO(
					mecanicoRepository.saveMecanico(oMecanico.get()));
		}
		return null;
	}

	@Override
	public MecanicoDTO deleteMecanicoById(Long id) {
		// TODO Auto-generated method stub
		Optional<Mecanico> mecanicoDeleted = mecanicoRepository
				.findMecanicoById(id);
		if (mecanicoDeleted.isPresent()) {
			mecanicoRepository.deleteMecanicoById(id);
			return mecanicoMap.mapMecanicoToDTO(mecanicoDeleted.get());
		}
		return null;
	}

	@Override
	public Mecanico saveMecanico(Mecanico mecanico) {
		// TODO Auto-generated method stub
		mecanicoRepository.saveMecanico(mecanico);
		return mecanico;
	}
    
}
