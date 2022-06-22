/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.controller;

import com.carcenter.api.DTO.PersonaDTO;
import com.carcenter.api.model.Persona;
import com.carcenter.api.repository.iRepository.IPersonaRepository;
import com.carcenter.api.service.PersonaService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author stevenfranco
 */
@RestController
@CrossOrigin(origins= {"*"})
@RequestMapping("api/Ciudad")
public class PersonaController {
    
    @Autowired
	private PersonaService personaService;
	
	@Autowired
	public IPersonaRepository iPersonaRepository;
	
	@GetMapping
	public List<PersonaDTO> findAllPersonas(){
		return personaService.findAllPersonas();
	}
	
	@GetMapping("/{id}")
	public Optional<PersonaDTO> findPersonaById(@PathVariable("id") Long id){
		return personaService.findPersonaById(id);
	}
	
	@PutMapping("/{id}")
	public PersonaDTO updatePersona(@RequestBody PersonaDTO personaDTO,@PathVariable("id") Long id){
		System.out.println(personaDTO);
		return personaService.updatePersona(personaDTO , id);
	}
	
	@DeleteMapping("/{id}")
	public PersonaDTO deletePersona(@PathVariable("id") Long id){
		return personaService.deletePersonaById(id);
	}
	
	@PostMapping("")
	public Persona savePersona(@RequestBody Persona persona) {
		System.out.println(persona);
		personaService.savePersona(persona);
		return persona;
	}
    
}
