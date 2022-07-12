/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.carcenter.api.service.iService;

import java.util.List;

import com.carcenter.api.DTO.TipoIdentificacionDTO;
import com.carcenter.api.model.TipoIdentificacion;

/**
 *
 * @author stevenfranco
 */
public interface ITipoIdentificacionService {
	public List<TipoIdentificacionDTO> findAllTipoIdentificacions();

	public TipoIdentificacionDTO updateTipoIdentificacion(TipoIdentificacionDTO tipoIdentificacionDTO, Long id);

	public TipoIdentificacionDTO deleteTipoIdentificacionById(Long id);

	public TipoIdentificacion saveTipoIdentificacion(TipoIdentificacion tipoIdentificacion);

}
