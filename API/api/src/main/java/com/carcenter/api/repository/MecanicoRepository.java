/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.carcenter.api.model.Mecanico;
import com.carcenter.api.repository.iRepository.IMecanicoRepository;

/**
 *
 * @author stevenfranco
 */
@Repository
public class MecanicoRepository {

    @Autowired
    private IMecanicoRepository mecanicoRepository;

    public List<Mecanico> findMecanicos() {
        System.out.println("Aca");
        // System.out.println(mecanicoRepository.findAll());
        return mecanicoRepository.findAll();
    }

    public Optional<Mecanico> findMecanicoById(Long id) {
        return mecanicoRepository.findById(id);
    }

    public Mecanico saveMecanico(Mecanico mecanico) {
        return mecanicoRepository.save(mecanico);
    }

    public void deleteMecanicoById(Long id) {
        mecanicoRepository.deleteById(id);
    }

}
