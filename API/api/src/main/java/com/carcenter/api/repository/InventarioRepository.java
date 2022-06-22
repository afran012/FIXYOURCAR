/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.carcenter.api.model.Inventario;
import com.carcenter.api.repository.iRepository.IInventarioRepository;

/**
 *
 * @author stevenfranco
 */
@Repository
public class InventarioRepository {

    @Autowired
    private IInventarioRepository inventarioRepository;

    public List<Inventario> findInventarios() {
        System.out.println("Aca");
        // System.out.println(inventarioRepository.findAll());
        return inventarioRepository.findAll();
    }

    public Optional<Inventario> findInventarioById(Long id) {
        return inventarioRepository.findById(id);
    }

    public Inventario saveInventario(Inventario inventario) {
        return inventarioRepository.save(inventario);
    }

    public void deleteInventarioById(Long id) {
        inventarioRepository.deleteById(id);
    }

}
