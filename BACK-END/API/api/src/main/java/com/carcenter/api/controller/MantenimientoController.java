/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.controller;

import com.carcenter.api.DTO.MantenimientoDTO;
import com.carcenter.api.model.Mantenimiento;
import com.carcenter.api.repository.iRepository.IMantenimientoRepository;
import com.carcenter.api.service.MantenimientoService;
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
@RequestMapping("api/Mantenimiento")
public class MantenimientoController {
    
        @Autowired
	private MantenimientoService mantenimientoService;
	
	@Autowired
	public IMantenimientoRepository iMantenimientoRepository;
	
	@GetMapping
	public List<MantenimientoDTO> findAllMantenimientos(){
		return mantenimientoService.findAllMantenimientos();
	}
	
	@GetMapping("/{id}")
	public Optional<MantenimientoDTO> findMantenimientoById(@PathVariable("id") Long id){
		return mantenimientoService.findMantenimientoById(id);
	}
	
	@PutMapping("/{id}")
	public MantenimientoDTO updateMantenimiento(@RequestBody MantenimientoDTO mantenimientoDTO,@PathVariable("id") Long id){
		System.out.println(mantenimientoDTO);
		return mantenimientoService.updateMantenimiento(mantenimientoDTO , id);
	}
	
	@DeleteMapping("/{id}")
	public MantenimientoDTO deleteMantenimiento(@PathVariable("id") Long id){
		return mantenimientoService.deleteMantenimientoById(id);
	}
	
	@PostMapping("")
	public Mantenimiento saveMantenimiento(@RequestBody Mantenimiento mantenimiento) {
		System.out.println(mantenimiento);
		mantenimientoService.saveMantenimiento(mantenimiento);
		return mantenimiento;
	}
    
}
