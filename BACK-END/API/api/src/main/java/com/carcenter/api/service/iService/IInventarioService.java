/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.carcenter.api.service.iService;

import java.util.List;

import com.carcenter.api.DTO.InventarioDTO;
import com.carcenter.api.model.Inventario;

/**
 *
 * @author stevenfranco
 */
public interface IInventarioService {
	public List<InventarioDTO> findAllInventarios();

	public InventarioDTO updateInventario(InventarioDTO inventarioDTO, Long id);

	public InventarioDTO deleteInventarioById(Long id);

	public Inventario saveInventario(Inventario inventario);

}
