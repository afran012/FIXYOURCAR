/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.service;

import com.carcenter.api.DTO.VehiculoDTO;
import com.carcenter.api.mapper.VehiculoMapper;
//import com.carcenter.api.mapper.TipoIdentificacionMapper;
import com.carcenter.api.model.Vehiculo;
import com.carcenter.api.repository.VehiculoRepository;
import com.carcenter.api.service.iService.IVehiculoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author stevenfranco
 */
@Service
public class VehiculoService implements IVehiculoService {
    
    
	@Autowired
	private VehiculoRepository vehiculoRepository;
	@Autowired
	private VehiculoMapper vehiculoMap;
	/*@Autowired
	private TipoIdentificacionMapper tipoIdMap;*/

	@Override
	public List<VehiculoDTO> findAllVehiculos() {
		// TODO Auto-generated method stub
		return vehiculoMap.mappAllVehiculosToVehiculosDTOs(
				vehiculoRepository.findVehiculos());
	}

	public Optional<VehiculoDTO> findVehiculoById(Long id) {
		Optional<Vehiculo> oVehiculo = vehiculoRepository
				.findVehiculoById(id);
		return Optional.of(vehiculoMap.mapVehiculoToDTO(oVehiculo.get()));
	}

	@Override
	public VehiculoDTO updateVehiculo(VehiculoDTO vehiculoDTO, Long id) {

		Optional<Vehiculo> oVehiculo = vehiculoRepository
				.findVehiculoById(id);
		if (oVehiculo.isPresent()) {

			if (vehiculoDTO.getIdPersona()!= null) {
				oVehiculo.get().setIdPersona(vehiculoDTO.getIdPersona());
			}
                        
                        if (vehiculoDTO.getPlacas()!= null) {
				oVehiculo.get().setPlacas(vehiculoDTO.getPlacas());
			}
                        
                        if (vehiculoDTO.getMarca()!= null) {
				oVehiculo.get().setMarca(vehiculoDTO.getMarca());
			}
                        

			return vehiculoMap.mapVehiculoToDTO(
					vehiculoRepository.saveVehiculo(oVehiculo.get()));
		}
		return null;
	}

	@Override
	public VehiculoDTO deleteVehiculoById(Long id) {
		// TODO Auto-generated method stub
		Optional<Vehiculo> vehiculoDeleted = vehiculoRepository
				.findVehiculoById(id);
		if (vehiculoDeleted.isPresent()) {
			vehiculoRepository.deleteVehiculoById(id);
			return vehiculoMap.mapVehiculoToDTO(vehiculoDeleted.get());
		}
		return null;
	}

	@Override
	public Vehiculo saveVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		vehiculoRepository.saveVehiculo(vehiculo);
		return vehiculo;
	}
    
}
