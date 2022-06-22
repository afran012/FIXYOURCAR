/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.service;

import com.carcenter.api.DTO.PersonaDTO;
import com.carcenter.api.mapper.PersonaMapper;
import com.carcenter.api.mapper.TipoIdentificacionMapper;
import com.carcenter.api.model.Persona;
import com.carcenter.api.repository.PersonaRepository;
import com.carcenter.api.service.iService.IPersonaService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author stevenfranco
 */
@Service
public class PersonaService implements IPersonaService {

	@Autowired
	private PersonaRepository personaRepository;
	@Autowired
	private PersonaMapper personaMap;
	@Autowired
	private TipoIdentificacionMapper tipoIdMap;

	@Override
	public List<PersonaDTO> findAllPersonas() {
		// TODO Auto-generated method stub
		return personaMap.mappAllPersonasToPersonasDTOs(
				personaRepository.findPersonas());
	}

	public Optional<PersonaDTO> findPersonaById(Long id) {
		Optional<Persona> oPersona = personaRepository
				.findPersonaById(id);
		return Optional.of(personaMap.mapPersonaToDTO(oPersona.get()));
	}

	@Override
	public PersonaDTO updatePersona(PersonaDTO personaDTO, Long id) {

		Optional<Persona> oPersona = personaRepository
				.findPersonaById(id);
		if (oPersona.isPresent()) {

			if (personaDTO.getIdTipoIdentificacion() != null) {
				oPersona.get().setIdTipoIdentificacion(personaDTO.getIdTipoIdentificacion());
			}
			if (personaDTO.getIdentificacion() != null) {
				oPersona.get().setIdentificacion(personaDTO.getIdentificacion());
			}
			if (personaDTO.getPrimerNombre() != null) {
				oPersona.get().setPrimerNombre(personaDTO.getPrimerNombre());
			}
			if (personaDTO.getSegundoNombre() != null) {
				oPersona.get().setSegundoNombre(personaDTO.getSegundoNombre());
			}
			if (personaDTO.getPrimerApellido() != null) {
				oPersona.get().setPrimerApellido(personaDTO.getPrimerApellido());
			}
			if (personaDTO.getSegundoApellido() != null) {
				oPersona.get().setSegundoApellido(personaDTO.getSegundoApellido());
			}
			if (personaDTO.getCelular() != null) {
				oPersona.get().setCelular(personaDTO.getCelular());
			}
			if (personaDTO.getDirección() != null) {
				oPersona.get().setDirección(personaDTO.getDirección());
			}
			if (personaDTO.getCorreoElectronico() != null) {
				oPersona.get().setCorreoElectronico(personaDTO.getCorreoElectronico());
			}

			return personaMap.mapPersonaToDTO(
					personaRepository.savePersona(oPersona.get()));
		}
		return null;
	}

	@Override
	public PersonaDTO deletePersonaById(Long id) {
		// TODO Auto-generated method stub
		Optional<Persona> personaDeleted = personaRepository
				.findPersonaById(id);
		if (personaDeleted.isPresent()) {
			personaRepository.deletePersonaById(id);
			return personaMap.mapPersonaToDTO(personaDeleted.get());
		}
		return null;
	}

	@Override
	public Persona savePersona(Persona persona) {
		// TODO Auto-generated method stub
		personaRepository.savePersona(persona);
		return persona;
	}

}
