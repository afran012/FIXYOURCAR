/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.controller;

import com.carcenter.api.DTO.EstadoMantenimientoDTO;
import com.carcenter.api.model.EstadoMantenimiento;
import com.carcenter.api.repository.iRepository.IEstadoMantenimientoRepository;
import com.carcenter.api.service.EstadoMantenimientoService;
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
@RequestMapping("api/EstadoMantenimiento")
public class EstadoMantenimientoController {
    
    @Autowired
	private EstadoMantenimientoService estadoMantenimientoService;
	
	@Autowired
	public IEstadoMantenimientoRepository iEstadoMantenimientoRepository;
	
	@GetMapping
	public List<EstadoMantenimientoDTO> findAllEstadoMantenimientos(){
		return estadoMantenimientoService.findAllEstadoMantenimientos();
	}
	
	@GetMapping("/{id}")
	public Optional<EstadoMantenimientoDTO> findEstadoMantenimientoById(@PathVariable("id") Long id){
		return estadoMantenimientoService.findEstadoMantenimientoById(id);
	}
	
	@PutMapping("/{id}")
	public EstadoMantenimientoDTO updateEstadoMantenimiento(@RequestBody EstadoMantenimientoDTO estadoMantenimientoDTO,@PathVariable("id") Long id){
		System.out.println(estadoMantenimientoDTO);
		return estadoMantenimientoService.updateEstadoMantenimiento(estadoMantenimientoDTO , id);
	}
	
	@DeleteMapping("/{id}")
	public EstadoMantenimientoDTO deleteEstadoMantenimiento(@PathVariable("id") Long id){
		return estadoMantenimientoService.deleteEstadoMantenimientoById(id);
	}
	
	@PostMapping("")
	public EstadoMantenimiento saveEstadoMantenimiento(@RequestBody EstadoMantenimiento estadoMantenimiento) {
		System.out.println(estadoMantenimiento);
		estadoMantenimientoService.saveEstadoMantenimiento(estadoMantenimiento);
		return estadoMantenimiento;
	}
    
}
