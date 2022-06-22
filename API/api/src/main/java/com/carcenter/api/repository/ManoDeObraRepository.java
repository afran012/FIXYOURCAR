/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.carcenter.api.model.ManoDeObra;
import com.carcenter.api.repository.iRepository.IManoDeObraRepository;

/**
 *
 * @author stevenfranco
 */
@Repository
public class ManoDeObraRepository {

    @Autowired
    private IManoDeObraRepository manoDeObraRepository;

    public List<ManoDeObra> findManoDeObras() {
        System.out.println("Aca");
        // System.out.println(manoDeObraRepository.findAll());
        return manoDeObraRepository.findAll();
    }

    public Optional<ManoDeObra> findManoDeObraById(Long id) {
        return manoDeObraRepository.findById(id);
    }

    public ManoDeObra saveManoDeObra(ManoDeObra manoDeObra) {
        return manoDeObraRepository.save(manoDeObra);
    }

    public void deleteManoDeObraById(Long id) {
        manoDeObraRepository.deleteById(id);
    }

}
