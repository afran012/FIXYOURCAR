/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.carcenter.api.service.iService;

import com.carcenter.api.model.FacturaCompleta;
import java.util.List;

/**
 *
 * @author stevenfranco
 */
public interface IFacturaCompletaService {
    public List<FacturaCompleta> buscarPorCedula(String cedula);
    public List<FacturaCompleta> buscarPorCedulaQ(String cedula);
}
