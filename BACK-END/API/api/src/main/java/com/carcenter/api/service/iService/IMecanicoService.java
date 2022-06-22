/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.carcenter.api.service.iService;

import java.util.List;

import com.carcenter.api.DTO.MecanicoDTO;
import com.carcenter.api.model.Mecanico;

/**
 *
 * @author stevenfranco
 */
public interface IMecanicoService {
	public List<MecanicoDTO> findAllMecanicos();

	public MecanicoDTO updateMecanico(MecanicoDTO mecanicoDTO, Long id);

	public MecanicoDTO deleteMecanicoById(Long id);

	public Mecanico saveMecanico(Mecanico mecanico);

}
