/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.carcenter.api.model.TipoIdentificacion;
import com.carcenter.api.repository.iRepository.ITipoIdentificacionRepository;

/**
 *
 * @author stevenfranco
 */
@Repository
public class TipoIdentificacionRepository {

    @Autowired
    private ITipoIdentificacionRepository tipoIdentificacionRepository;

    public List<TipoIdentificacion> findTipoIdentificacions() {
        System.out.println("Aca");
        // System.out.println(tipoIdentificacionRepository.findAll());
        return tipoIdentificacionRepository.findAll();
    }

    public Optional<TipoIdentificacion> findTipoIdentificacionById(Long id) {
        return tipoIdentificacionRepository.findById(id);
    }

    public TipoIdentificacion saveTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
        return tipoIdentificacionRepository.save(tipoIdentificacion);
    }

    public void deleteTipoIdentificacionById(Long id) {
        tipoIdentificacionRepository.deleteById(id);
    }

}
