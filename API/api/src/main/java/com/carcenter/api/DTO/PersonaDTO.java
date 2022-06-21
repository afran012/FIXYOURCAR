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
public class PersonaDTO {

    private Long id;
    private Long idTipoIdentificacion;
    private String identificacion;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String celular;
    private String dirección;
    private String correoElectronico;

}
