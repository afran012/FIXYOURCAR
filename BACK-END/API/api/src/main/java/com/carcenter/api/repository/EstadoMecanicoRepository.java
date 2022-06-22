/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.carcenter.api.model.EstadoMecanico;
import com.carcenter.api.repository.iRepository.IEstadoMecanicoRepository;

/**
 *
 * @author stevenfranco
 */
@Repository
public class EstadoMecanicoRepository {

    @Autowired
    private IEstadoMecanicoRepository estadoMecanicoRepository;

    public List<EstadoMecanico> findEstadoMecanicos() {
        System.out.println("Aca");
        // System.out.println(estadoMecanicoRepository.findAll());
        return estadoMecanicoRepository.findAll();
    }

    public Optional<EstadoMecanico> findEstadoMecanicoById(Long id) {
        return estadoMecanicoRepository.findById(id);
    }

    public EstadoMecanico saveEstadoMecanico(EstadoMecanico estadoMecanico) {
        return estadoMecanicoRepository.save(estadoMecanico);
    }

    public void deleteEstadoMecanicoById(Long id) {
        estadoMecanicoRepository.deleteById(id);
    }

}
