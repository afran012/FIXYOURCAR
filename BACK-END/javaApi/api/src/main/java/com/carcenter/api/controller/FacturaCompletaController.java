/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.controller;

import com.carcenter.api.DTO.Cedula;
import com.carcenter.api.repository.iRepository.IFacturaCompletaRepository;
import com.carcenter.api.service.FacturaCompletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.carcenter.api.model.FacturaCompleta;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author stevenfranco
 */
@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("api/FacturaCompleta")
public class FacturaCompletaController {

    @Autowired
    FacturaCompletaService facturaComletaService;

    @GetMapping
    public List<FacturaCompleta> findFacturaCompleta(@RequestBody Cedula cedula ) {
        System.out.println(cedula.getCedula());
        return facturaComletaService.buscarPorCedula(cedula.getCedula());   
    }
    
    @GetMapping("/q")
    public List<FacturaCompleta> findFacturaCompletaQ(@RequestBody Cedula cedula ) {
        System.out.println(cedula.getCedula());
        return facturaComletaService.buscarPorCedulaQ(cedula.getCedula());   
    }

}
