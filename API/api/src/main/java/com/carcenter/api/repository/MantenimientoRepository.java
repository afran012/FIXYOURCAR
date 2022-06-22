/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.carcenter.api.model.Mantenimiento;
import com.carcenter.api.repository.iRepository.IMantenimientoRepository;

/**
 *
 * @author stevenfranco
 */
@Repository
public class MantenimientoRepository {

    @Autowired
    private IMantenimientoRepository mantenimientoRepository;

    public List<Mantenimiento> findMantenimientos() {
        System.out.println("Aca");
        // System.out.println(mantenimientoRepository.findAll());
        return mantenimientoRepository.findAll();
    }

    public Optional<Mantenimiento> findMantenimientoById(Long id) {
        return mantenimientoRepository.findById(id);
    }

    public Mantenimiento saveMantenimiento(Mantenimiento mantenimiento) {
        return mantenimientoRepository.save(mantenimiento);
    }

    public void deleteMantenimientoById(Long id) {
        mantenimientoRepository.deleteById(id);
    }

}
