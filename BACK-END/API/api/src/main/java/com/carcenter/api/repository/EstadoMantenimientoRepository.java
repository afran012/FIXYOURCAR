/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.carcenter.api.model.EstadoMantenimiento;
import com.carcenter.api.repository.iRepository.IEstadoMantenimientoRepository;

/**
 *
 * @author stevenfranco
 */
@Repository
public class EstadoMantenimientoRepository {

    @Autowired
    private IEstadoMantenimientoRepository estadoMantenimientoRepository;

    public List<EstadoMantenimiento> findEstadoMantenimientos() {
        System.out.println("Aca");
        // System.out.println(estadoMantenimientoRepository.findAll());
        return estadoMantenimientoRepository.findAll();
    }

    public Optional<EstadoMantenimiento> findEstadoMantenimientoById(Long id) {
        return estadoMantenimientoRepository.findById(id);
    }

    public EstadoMantenimiento saveEstadoMantenimiento(EstadoMantenimiento estadoMantenimiento) {
        return estadoMantenimientoRepository.save(estadoMantenimiento);
    }

    public void deleteEstadoMantenimientoById(Long id) {
        estadoMantenimientoRepository.deleteById(id);
    }

}
