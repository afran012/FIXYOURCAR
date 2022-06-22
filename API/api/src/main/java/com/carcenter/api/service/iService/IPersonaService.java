/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.carcenter.api.service.iService;

import java.util.List;

import com.carcenter.api.DTO.PersonaDTO;
import com.carcenter.api.model.Persona;

/**
 *
 * @author stevenfranco
 */
public interface IPersonaService {
	public List<PersonaDTO> findAllPersonas();

	public PersonaDTO updatePersona(PersonaDTO personaDTO, Long id);

	public PersonaDTO deletePersonaById(Long id);

	public Persona savePersona(Persona persona);

}
