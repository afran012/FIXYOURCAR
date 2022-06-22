/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.carcenter.api.model.Repuesto;
import com.carcenter.api.repository.iRepository.IRepuestoRepository;

/**
 *
 * @author stevenfranco
 */
@Repository
public class RepuestoRepository {

    @Autowired
    private IRepuestoRepository repuestoRepository;

    public List<Repuesto> findRepuestos() {
        System.out.println("Aca");
        // System.out.println(repuestoRepository.findAll());
        return repuestoRepository.findAll();
    }

    public Optional<Repuesto> findRepuestoById(Long id) {
        return repuestoRepository.findById(id);
    }

    public Repuesto saveRepuesto(Repuesto repuesto) {
        return repuestoRepository.save(repuesto);
    }

    public void deleteRepuestoById(Long id) {
        repuestoRepository.deleteById(id);
    }

}
