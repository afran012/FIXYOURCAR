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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Long subtotal) {
        this.subtotal = subtotal;
    }

    public Long getValorImpuestos() {
        return valorImpuestos;
    }

    public void setValorImpuestos(Long valorImpuestos) {
        this.valorImpuestos = valorImpuestos;
    }

    public Long getValorDescuento() {
        return valorDescuento;
    }

    public void setValorDescuento(Long valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    public Long getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Long valorTotal) {
        this.valorTotal = valorTotal;
    }

}
