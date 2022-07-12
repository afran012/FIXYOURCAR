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
public class RepuestoDTO {
    private Long id;
    private String descripcion;
    private Long valorArticulo;
    private Long porcentajeDescuento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getValorArticulo() {
        return valorArticulo;
    }

    public void setValorArticulo(Long valorArticulo) {
        this.valorArticulo = valorArticulo;
    }

    public Long getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(Long porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

}
