/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author stevenfranco
 */
@Entity
@Table(name = "FACTURA_DATOS_CTE")
@Data
public class FacturaCompleta {
    
    	@Id
	@Column(name="FACTURA_ID",insertable=false, updatable=false)
        private String id;
	@Column(name = "PRECIO_REPUESTOS")
	private Long precioRepuestos;
	@Column(name = "PRECIO_MANO_OBRA")
	private Long precioManoObra;
	@Column(name = "SUBTOTAL")
	private Long SubTotal;
	@Column(name = "IVA")
	private Long iva;
        @Column(name = "TOTAL")
	private Long total;
	@Column(name = "NOMBRE_COMPLETO_CLIENTE")
	private String nombreCompletoCliente;
	@Column(name = "NOMBRE_COMPLETO_MECANICO")
	private String nombreCompletoMecanico;
        @Column(name = "INDENTIFICACION")
	private String cedula;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

        
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getPrecioRepuestos() {
        return precioRepuestos;
    }

    public void setPrecioRepuestos(Long precioRepuestos) {
        this.precioRepuestos = precioRepuestos;
    }

    public Long getPrecioManoObra() {
        return precioManoObra;
    }

    public void setPrecioManoObra(Long precioManoObra) {
        this.precioManoObra = precioManoObra;
    }

    public Long getSubTotal() {
        return SubTotal;
    }

    public void setSubTotal(Long SubTotal) {
        this.SubTotal = SubTotal;
    }

    public Long getIva() {
        return iva;
    }

    public void setIva(Long iva) {
        this.iva = iva;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getNombreCompletoCliente() {
        return nombreCompletoCliente;
    }

    public void setNombreCompletoCliente(String nombreCompletoCliente) {
        this.nombreCompletoCliente = nombreCompletoCliente;
    }

    public String getNombreCompletoMecanico() {
        return nombreCompletoMecanico;
    }

    public void setNombreCompletoMecanico(String nombreCompletoMecanico) {
        this.nombreCompletoMecanico = nombreCompletoMecanico;
    }
        
    
}
