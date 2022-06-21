/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.DTO;

import lombok.Data;

/**
 *
 * @author stevenfranco
 */
@Data
public class ManoDeObraDTO {

    private Long id;
    private String servicio;
    private String descripcion;
    private Long precioMaximo;
    private Long precioMinimo;
    private Long precioTotal;

}
