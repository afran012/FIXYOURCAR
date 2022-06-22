/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.carcenter.api.service.iService;

import java.util.List;

import com.carcenter.api.DTO.ManoDeObraDTO;
import com.carcenter.api.model.ManoDeObra;

/**
 *
 * @author stevenfranco
 */
public interface IManoDeObraService {
	public List<ManoDeObraDTO> findAllManoDeObras();

	public ManoDeObraDTO updateManoDeObra(ManoDeObraDTO manoDeObraDTO, Long id);

	public ManoDeObraDTO deleteManoDeObraById(Long id);

	public ManoDeObra saveManoDeObra(ManoDeObra manoDeObra);

}
