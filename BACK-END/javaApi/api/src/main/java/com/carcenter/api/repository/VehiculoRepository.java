/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.carcenter.api.model.Vehiculo;
import com.carcenter.api.repository.iRepository.IVehiculoRepository;

/**
 *
 * @author stevenfranco
 */
@Repository
public class VehiculoRepository {

    @Autowired
    private IVehiculoRepository vehiculoRepository;

    public List<Vehiculo> findVehiculos() {
        System.out.println("Aca");
        // System.out.println(vehiculoRepository.findAll());
        return vehiculoRepository.findAll();
    }

    public Optional<Vehiculo> findVehiculoById(Long id) {
        return vehiculoRepository.findById(id);
    }

    public Vehiculo saveVehiculo(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    public void deleteVehiculoById(Long id) {
        vehiculoRepository.deleteById(id);
    }

}
