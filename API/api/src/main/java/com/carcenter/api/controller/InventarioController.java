/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.controller;

import com.carcenter.api.DTO.InventarioDTO;
import com.carcenter.api.model.Inventario;
import com.carcenter.api.repository.iRepository.IInventarioRepository;
import com.carcenter.api.service.InventarioService;
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
public class InventarioController {
    
    @Autowired
	private InventarioService inventarioService;
	
	@Autowired
	public IInventarioRepository iInventarioRepository;
	
	@GetMapping
	public List<InventarioDTO> findAllInventarios(){
		return inventarioService.findAllInventarios();
	}
	
	@GetMapping("/{id}")
	public Optional<InventarioDTO> findInventarioById(@PathVariable("id") Long id){
		return inventarioService.findInventarioById(id);
	}
	
	@PutMapping("/{id}")
	public InventarioDTO updateInventario(@RequestBody InventarioDTO inventarioDTO,@PathVariable("id") Long id){
		System.out.println(inventarioDTO);
		return inventarioService.updateInventario(inventarioDTO , id);
	}
	
	@DeleteMapping("/{id}")
	public InventarioDTO deleteInventario(@PathVariable("id") Long id){
		return inventarioService.deleteInventarioById(id);
	}
	
	@PostMapping("")
	public Inventario saveInventario(@RequestBody Inventario inventario) {
		System.out.println(inventario);
		inventarioService.saveInventario(inventario);
		return inventario;
	}
    
}
