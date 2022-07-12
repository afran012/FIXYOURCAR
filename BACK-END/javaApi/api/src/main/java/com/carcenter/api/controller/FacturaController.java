/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.controller;

import com.carcenter.api.DTO.FacturaDTO;
import com.carcenter.api.model.Factura;
import com.carcenter.api.repository.iRepository.IFacturaRepository;
import com.carcenter.api.service.FacturaService;
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
@RequestMapping("api/Factura")
public class FacturaController {
    
    @Autowired
	private FacturaService facturaService;
	
	@Autowired
	public IFacturaRepository iFacturaRepository;
	
	@GetMapping
	public List<FacturaDTO> findAllFacturas(){
		return facturaService.findAllFacturas();
	}
	
	@GetMapping("/{id}")
	public Optional<FacturaDTO> findFacturaById(@PathVariable("id") Long id){
		return facturaService.findFacturaById(id);
	}
	
	@PutMapping("/{id}")
	public FacturaDTO updateFactura(@RequestBody FacturaDTO facturaDTO,@PathVariable("id") Long id){
		System.out.println(facturaDTO);
		return facturaService.updateFactura(facturaDTO , id);
	}
	
	@DeleteMapping("/{id}")
	public FacturaDTO deleteFactura(@PathVariable("id") Long id){
		return facturaService.deleteFacturaById(id);
	}
	
	@PostMapping("")
	public Factura saveFactura(@RequestBody Factura factura) {
		System.out.println(factura);
		facturaService.saveFactura(factura);
		return factura;
	}
    
}
