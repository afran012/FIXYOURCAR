/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.service;

import com.carcenter.api.model.FacturaCompleta;
import com.carcenter.api.repository.FacturaCompletaRepository;
import com.carcenter.api.repository.iRepository.IFacturaCompletaRepository;
import com.carcenter.api.service.iService.IFacturaCompletaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author stevenfranco
 */
@Service
public class FacturaCompletaService implements IFacturaCompletaService {
    @Autowired 
    FacturaCompletaRepository facturaRepository;

    @Override
    public List<FacturaCompleta> buscarPorCedula(String cedula) {
        return facturaRepository.buscarPorCedula(cedula);
    }

    @Override
    public List<FacturaCompleta> buscarPorCedulaQ(String cedula) {
        return facturaRepository.buscarPorCedulaQuery(cedula);
    }
    
}
