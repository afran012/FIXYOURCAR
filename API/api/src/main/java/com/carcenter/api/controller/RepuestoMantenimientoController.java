/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.controller;

import com.carcenter.api.DTO.RepuestoMantenimientoDTO;
import com.carcenter.api.model.RepuestoMantenimiento;
import com.carcenter.api.repository.iRepository.IRepuestoMantenimientoRepository;
import com.carcenter.api.service.RepuestoMantenimientoService;
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
@RequestMapping("api/RepuestoMantenimiento")
public class RepuestoMantenimientoController {
    
    @Autowired
	private RepuestoMantenimientoService repuestoMantenimientoService;
	
	@Autowired
	public IRepuestoMantenimientoRepository iRepuestoMantenimientoRepository;
	
	@GetMapping
	public List<RepuestoMantenimientoDTO> findAllRepuestoMantenimientos(){
		return repuestoMantenimientoService.findAllRepuestoMantenimientos();
	}
	
	@GetMapping("/{id}")
	public Optional<RepuestoMantenimientoDTO> findRepuestoMantenimientoById(@PathVariable("id") Long id){
		return repuestoMantenimientoService.findRepuestoMantenimientoById(id);
	}
	
	@PutMapping("/{id}")
	public RepuestoMantenimientoDTO updateRepuestoMantenimiento(@RequestBody RepuestoMantenimientoDTO repuestoMantenimientoDTO,@PathVariable("id") Long id){
		System.out.println(repuestoMantenimientoDTO);
		return repuestoMantenimientoService.updateRepuestoMantenimiento(repuestoMantenimientoDTO , id);
	}
	
	@DeleteMapping("/{id}")
	public RepuestoMantenimientoDTO deleteRepuestoMantenimiento(@PathVariable("id") Long id){
		return repuestoMantenimientoService.deleteRepuestoMantenimientoById(id);
	}
	
	@PostMapping("")
	public RepuestoMantenimiento saveRepuestoMantenimiento(@RequestBody RepuestoMantenimiento repuestoMantenimiento) {
		System.out.println(repuestoMantenimiento);
		repuestoMantenimientoService.saveRepuestoMantenimiento(repuestoMantenimiento);
		return repuestoMantenimiento;
	}
    
}
