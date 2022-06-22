/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.carcenter.api.model.Factura;
import com.carcenter.api.repository.iRepository.IFacturaRepository;

/**
 *
 * @author stevenfranco
 */
@Repository
public class FacturaRepository {

    @Autowired
    private IFacturaRepository facturaRepository;

    public List<Factura> findFacturas() {
        System.out.println("Aca");
        // System.out.println(facturaRepository.findAll());
        return facturaRepository.findAll();
    }

    public Optional<Factura> findFacturaById(Long id) {
        return facturaRepository.findById(id);
    }

    public Factura saveFactura(Factura factura) {
        return facturaRepository.save(factura);
    }

    public void deleteFacturaById(Long id) {
        facturaRepository.deleteById(id);
    }

}
