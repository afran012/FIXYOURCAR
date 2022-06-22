/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carcenter.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author stevenfranco
 */

@Entity
@Table(name="REPUESTO_MANTENIMIENTO")
@Data
public class RepuestoMantenimiento {
    
    	@Id
	@Column(name="ID_REPUESTO_MANTENIMIENTO")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="ID_REPUESTO")
	private Long idRepuesto;
	@Column(name="ID_MANTENIMIENTO")
	private Long idMantenimiento;
        
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

    public Long getIdMantenimiento() {
        return idMantenimiento;
    }

    public void setIdMantenimiento(Long idMantenimiento) {
        this.idMantenimiento = idMantenimiento;
    }
    
}
