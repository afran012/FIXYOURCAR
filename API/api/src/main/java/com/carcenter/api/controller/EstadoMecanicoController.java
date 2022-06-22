/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.controller;

import com.carcenter.api.DTO.EstadoMecanicoDTO;
import com.carcenter.api.model.EstadoMecanico;
import com.carcenter.api.repository.iRepository.IEstadoMecanicoRepository;
import com.carcenter.api.service.EstadoMecanicoService;
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
public class EstadoMecanicoController {
    
    @Autowired
	private EstadoMecanicoService estadoMecanicoService;
	
	@Autowired
	public IEstadoMecanicoRepository iEstadoMecanicoRepository;
	
	@GetMapping
	public List<EstadoMecanicoDTO> findAllEstadoMecanicos(){
		return estadoMecanicoService.findAllEstadoMecanicos();
	}
	
	@GetMapping("/{id}")
	public Optional<EstadoMecanicoDTO> findEstadoMecanicoById(@PathVariable("id") Long id){
		return estadoMecanicoService.findEstadoMecanicoById(id);
	}
	
	@PutMapping("/{id}")
	public EstadoMecanicoDTO updateEstadoMecanico(@RequestBody EstadoMecanicoDTO estadoMecanicoDTO,@PathVariable("id") Long id){
		System.out.println(estadoMecanicoDTO);
		return estadoMecanicoService.updateEstadoMecanico(estadoMecanicoDTO , id);
	}
	
	@DeleteMapping("/{id}")
	public EstadoMecanicoDTO deleteEstadoMecanico(@PathVariable("id") Long id){
		return estadoMecanicoService.deleteEstadoMecanicoById(id);
	}
	
	@PostMapping("")
	public EstadoMecanico saveEstadoMecanico(@RequestBody EstadoMecanico estadoMecanico) {
		System.out.println(estadoMecanico);
		estadoMecanicoService.saveEstadoMecanico(estadoMecanico);
		return estadoMecanico;
	}
    
}
