/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.carcenter.api.repository.iRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carcenter.api.model.RepuestoMantenimiento;

/**
 *
 * @author stevenfranco
 */
public interface IRepuestoMantenimientoRepository extends JpaRepository<RepuestoMantenimiento,Long>{
    
}
