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
public class InventarioDTO {

    private Long id;
    private Long idRepuesto;
    private Long cantidad;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdRepuesto() {
        return idRepuesto;
    }

    public void setIdRepuesto(Long idRepuesto) {
        this.idRepuesto = idRepuesto;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

}
