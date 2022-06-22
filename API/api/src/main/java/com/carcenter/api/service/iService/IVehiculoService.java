/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.carcenter.api.service.iService;

import java.util.List;

import com.carcenter.api.DTO.VehiculoDTO;
import com.carcenter.api.model.Vehiculo;

/**
 *
 * @author stevenfranco
 */
public interface IVehiculoService {
	public List<VehiculoDTO> findAllVehiculos();

	public VehiculoDTO updateVehiculo(VehiculoDTO vehiculoDTO, Long id);

	public VehiculoDTO deleteVehiculoById(Long id);

	public Vehiculo saveVehiculo(Vehiculo vehiculo);

}
