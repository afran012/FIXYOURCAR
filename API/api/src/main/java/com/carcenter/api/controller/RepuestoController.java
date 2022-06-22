/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.controller;

import com.carcenter.api.DTO.RepuestoDTO;
import com.carcenter.api.model.Repuesto;
import com.carcenter.api.repository.iRepository.IRepuestoRepository;
import com.carcenter.api.service.RepuestoService;
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
public class RepuestoController {
    
   @Autowired
	private RepuestoService repuestoService;
	
	@Autowired
	public IRepuestoRepository iRepuestoRepository;
	
	@GetMapping
	public List<RepuestoDTO> findAllRepuestos(){
		return repuestoService.findAllRepuestos();
	}
	
	@GetMapping("/{id}")
	public Optional<RepuestoDTO> findRepuestoById(@PathVariable("id") Long id){
		return repuestoService.findRepuestoById(id);
	}
	
	@PutMapping("/{id}")
	public RepuestoDTO updateRepuesto(@RequestBody RepuestoDTO repuestoDTO,@PathVariable("id") Long id){
		System.out.println(repuestoDTO);
		return repuestoService.updateRepuesto(repuestoDTO , id);
	}
	
	@DeleteMapping("/{id}")
	public RepuestoDTO deleteRepuesto(@PathVariable("id") Long id){
		return repuestoService.deleteRepuestoById(id);
	}
	
	@PostMapping("")
	public Repuesto saveRepuesto(@RequestBody Repuesto repuesto) {
		System.out.println(repuesto);
		repuestoService.saveRepuesto(repuesto);
		return repuesto;
	}
    
}
