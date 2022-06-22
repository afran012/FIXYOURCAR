/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.carcenter.api.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.carcenter.api.DTO.PersonaDTO;
import com.carcenter.api.model.Persona;

/**
 *
 * @author stevenfranco
 */
@Mapper(componentModel = "spring")
public interface PersonaMapper {

    public List<PersonaDTO> mappAllPersonasToPersonasDTOs(List<Persona> personas);

    public PersonaDTO mapPersonaToDTO(Persona persona);
    
}
