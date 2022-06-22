/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.controller;

import com.carcenter.api.DTO.MecanicoDTO;
import com.carcenter.api.model.Mecanico;
import com.carcenter.api.repository.iRepository.IMecanicoRepository;
import com.carcenter.api.service.MecanicoService;
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
@RequestMapping("api/Mecanico")
public class MecanicoController {
    
    @Autowired
	private MecanicoService mecanicoService;
	
	@Autowired
	public IMecanicoRepository iMecanicoRepository;
	
	@GetMapping
	public List<MecanicoDTO> findAllMecanicos(){
		return mecanicoService.findAllMecanicos();
	}
	
	@GetMapping("/{id}")
	public Optional<MecanicoDTO> findMecanicoById(@PathVariable("id") Long id){
		return mecanicoService.findMecanicoById(id);
	}
	
	@PutMapping("/{id}")
	public MecanicoDTO updateMecanico(@RequestBody MecanicoDTO mecanicoDTO,@PathVariable("id") Long id){
		System.out.println(mecanicoDTO);
		return mecanicoService.updateMecanico(mecanicoDTO , id);
	}
	
	@DeleteMapping("/{id}")
	public MecanicoDTO deleteMecanico(@PathVariable("id") Long id){
		return mecanicoService.deleteMecanicoById(id);
	}
	
	@PostMapping("")
	public Mecanico saveMecanico(@RequestBody Mecanico mecanico) {
		System.out.println(mecanico);
		mecanicoService.saveMecanico(mecanico);
		return mecanico;
	}
    
}
