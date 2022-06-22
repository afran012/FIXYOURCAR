/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.carcenter.api.service.iService;

import java.util.List;

import com.carcenter.api.DTO.RepuestoDTO;
import com.carcenter.api.model.Repuesto;

/**
 *
 * @author stevenfranco
 */
public interface IRepuestoService {
	public List<RepuestoDTO> findAllRepuestos();

	public RepuestoDTO updateRepuesto(RepuestoDTO repuestoDTO, Long id);

	public RepuestoDTO deleteRepuestoById(Long id);

	public Repuesto saveRepuesto(Repuesto repuesto);

}
