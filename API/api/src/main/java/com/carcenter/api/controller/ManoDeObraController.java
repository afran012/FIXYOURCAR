/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.controller;

import com.carcenter.api.DTO.ManoDeObraDTO;
import com.carcenter.api.model.ManoDeObra;
import com.carcenter.api.repository.iRepository.IManoDeObraRepository;
import com.carcenter.api.service.ManoDeObraService;
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
@RequestMapping("api/ManoDeObra")
public class ManoDeObraController {
    
    @Autowired
	private ManoDeObraService manoDeObraService;
	
	@Autowired
	public IManoDeObraRepository iManoDeObraRepository;
	
	@GetMapping
	public List<ManoDeObraDTO> findAllManoDeObras(){
		return manoDeObraService.findAllManoDeObras();
	}
	
	@GetMapping("/{id}")
	public Optional<ManoDeObraDTO> findManoDeObraById(@PathVariable("id") Long id){
		return manoDeObraService.findManoDeObraById(id);
	}
	
	@PutMapping("/{id}")
	public ManoDeObraDTO updateManoDeObra(@RequestBody ManoDeObraDTO manoDeObraDTO,@PathVariable("id") Long id){
		System.out.println(manoDeObraDTO);
		return manoDeObraService.updateManoDeObra(manoDeObraDTO , id);
	}
	
	@DeleteMapping("/{id}")
	public ManoDeObraDTO deleteManoDeObra(@PathVariable("id") Long id){
		return manoDeObraService.deleteManoDeObraById(id);
	}
	
	@PostMapping("")
	public ManoDeObra saveManoDeObra(@RequestBody ManoDeObra manoDeObra) {
		System.out.println(manoDeObra);
		manoDeObraService.saveManoDeObra(manoDeObra);
		return manoDeObra;
	}
    
}
