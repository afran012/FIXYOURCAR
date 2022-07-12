/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.repository;

import com.carcenter.api.model.FacturaCompleta;

import com.carcenter.api.repository.iRepository.IFacturaCompletaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author stevenfranco
 */
@Repository
public class FacturaCompletaRepository {

    @Autowired
    IFacturaCompletaRepository facturaCompletaRepository;

    public List<FacturaCompleta> buscarPorCedula(String cedula) {
        System.out.println(cedula);
        System.out.println(facturaCompletaRepository.findAllByCedula(cedula));
        return facturaCompletaRepository.findAllByCedula(cedula);
    }

    public List<FacturaCompleta> buscarPorCedulaQuery(String cedula) {
        System.out.println(cedula);
        System.out.println(facturaCompletaRepository.buscarPorCedulaQ(cedula));
        return facturaCompletaRepository.buscarPorCedulaQ(cedula);
    }

}
