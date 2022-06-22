/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.carcenter.api.model.Persona;
import com.carcenter.api.repository.iRepository.IPersonaRepository;

/**
 *
 * @author stevenfranco
 */
@Repository
public class PersonaRepository {

    @Autowired
    private IPersonaRepository personaRepository;

    public List<Persona> findPersonas() {
        System.out.println("Aca");
        // System.out.println(personaRepository.findAll());
        return personaRepository.findAll();
    }

    public Optional<Persona> findPersonaById(Long id) {
        return personaRepository.findById(id);
    }

    public Persona savePersona(Persona persona) {
        return personaRepository.save(persona);
    }

    public void deletePersonaById(Long id) {
        personaRepository.deleteById(id);
    }

}
