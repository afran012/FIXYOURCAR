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
public class FacturaDTO {

    private Long id;
    private Long subtotal;
    private Long valorImpuestos;
    private Long valorDescuento;
    private Long valorTotal;

}
