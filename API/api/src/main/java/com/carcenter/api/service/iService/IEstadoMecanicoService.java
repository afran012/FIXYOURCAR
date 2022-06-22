/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.carcenter.api.service.iService;

import java.util.List;

import com.carcenter.api.DTO.EstadoMecanicoDTO;
import com.carcenter.api.model.EstadoMecanico;

/**
 *
 * @author stevenfranco
 */
public interface IEstadoMecanicoService {
	public List<EstadoMecanicoDTO> findAllEstadoMecanicos();

	public EstadoMecanicoDTO updateEstadoMecanico(EstadoMecanicoDTO estadoMecanicoDTO, Long id);

	public EstadoMecanicoDTO deleteEstadoMecanicoById(Long id);

	public EstadoMecanico saveEstadoMecanico(EstadoMecanico estadoMecanico);

}
