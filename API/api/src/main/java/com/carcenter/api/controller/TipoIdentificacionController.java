/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.controller;

import com.carcenter.api.DTO.TipoIdentificacionDTO;
import com.carcenter.api.model.TipoIdentificacion;
import com.carcenter.api.repository.iRepository.ITipoIdentificacionRepository;
import com.carcenter.api.service.TipoIdentificacionService;
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
public class TipoIdentificacionController {
    
    @Autowired
	private TipoIdentificacionService tipoIdentificacionService;
	
	@Autowired
	public ITipoIdentificacionRepository iTipoIdentificacionRepository;
	
	@GetMapping
	public List<TipoIdentificacionDTO> findAllTipoIdentificacions(){
		return tipoIdentificacionService.findAllTipoIdentificacions();
	}
	
	@GetMapping("/{id}")
	public Optional<TipoIdentificacionDTO> findTipoIdentificacionById(@PathVariable("id") Long id){
		return tipoIdentificacionService.findTipoIdentificacionById(id);
	}
	
	@PutMapping("/{id}")
	public TipoIdentificacionDTO updateTipoIdentificacion(@RequestBody TipoIdentificacionDTO tipoIdentificacionDTO,@PathVariable("id") Long id){
		System.out.println(tipoIdentificacionDTO);
		return tipoIdentificacionService.updateTipoIdentificacion(tipoIdentificacionDTO , id);
	}
	
	@DeleteMapping("/{id}")
	public TipoIdentificacionDTO deleteTipoIdentificacion(@PathVariable("id") Long id){
		return tipoIdentificacionService.deleteTipoIdentificacionById(id);
	}
	
	@PostMapping("")
	public TipoIdentificacion saveTipoIdentificacion(@RequestBody TipoIdentificacion tipoIdentificacion) {
		System.out.println(tipoIdentificacion);
		tipoIdentificacionService.saveTipoIdentificacion(tipoIdentificacion);
		return tipoIdentificacion;
	}
    
}
