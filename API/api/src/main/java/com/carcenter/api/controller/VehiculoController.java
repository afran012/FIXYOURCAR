/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.controller;

import com.carcenter.api.DTO.VehiculoDTO;
import com.carcenter.api.model.Vehiculo;
import com.carcenter.api.repository.iRepository.IVehiculoRepository;
import com.carcenter.api.service.VehiculoService;
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
public class VehiculoController {
    
    @Autowired
	private VehiculoService vehiculoService;
	
	@Autowired
	public IVehiculoRepository iVehiculoRepository;
	
	@GetMapping
	public List<VehiculoDTO> findAllVehiculos(){
		return vehiculoService.findAllVehiculos();
	}
	
	@GetMapping("/{id}")
	public Optional<VehiculoDTO> findVehiculoById(@PathVariable("id") Long id){
		return vehiculoService.findVehiculoById(id);
	}
	
	@PutMapping("/{id}")
	public VehiculoDTO updateVehiculo(@RequestBody VehiculoDTO vehiculoDTO,@PathVariable("id") Long id){
		System.out.println(vehiculoDTO);
		return vehiculoService.updateVehiculo(vehiculoDTO , id);
	}
	
	@DeleteMapping("/{id}")
	public VehiculoDTO deleteVehiculo(@PathVariable("id") Long id){
		return vehiculoService.deleteVehiculoById(id);
	}
	
	@PostMapping("")
	public Vehiculo saveVehiculo(@RequestBody Vehiculo vehiculo) {
		System.out.println(vehiculo);
		vehiculoService.saveVehiculo(vehiculo);
		return vehiculo;
	}
    
}
