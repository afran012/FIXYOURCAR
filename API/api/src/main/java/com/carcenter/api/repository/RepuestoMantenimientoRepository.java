/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.carcenter.api.model.RepuestoMantenimiento;
import com.carcenter.api.repository.iRepository.IRepuestoMantenimientoRepository;

/**
 *
 * @author stevenfranco
 */
@Repository
public class RepuestoMantenimientoRepository {

    @Autowired
    private IRepuestoMantenimientoRepository repuestoMantenimientoRepository;

    public List<RepuestoMantenimiento> findRepuestoMantenimientos() {
        System.out.println("Aca");
        // System.out.println(repuestoMantenimientoRepository.findAll());
        return repuestoMantenimientoRepository.findAll();
    }

    public Optional<RepuestoMantenimiento> findRepuestoMantenimientoById(Long id) {
        return repuestoMantenimientoRepository.findById(id);
    }

    public RepuestoMantenimiento saveRepuestoMantenimiento(RepuestoMantenimiento repuestoMantenimiento) {
        return repuestoMantenimientoRepository.save(repuestoMantenimiento);
    }

    public void deleteRepuestoMantenimientoById(Long id) {
        repuestoMantenimientoRepository.deleteById(id);
    }

}
