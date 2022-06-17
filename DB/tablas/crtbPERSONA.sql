/************************************************************************************
Descripción: Objeto de encargado de ...
Autor:       Nombre del desarrollador y usuario
Fecha:       01-01-2022
IdGestión:   Ticket-2132123
@copyright: NombreDeLaEmpresa
************************************************************************************/

create table CARCENTERADMIN.PERSONA 
(
ID_PERSONA                      NUMBER(15)  ,
ID_TIPO_IDENTIFICACION          NUMBER(2)   ,
IDENTIFICACION                  VARCHAR2(20),
PRIMER_NOMBRE                   VARCHAR2(20),
SEGUNDO_NOMBRE                  VARCHAR2(20),
PRIMER_APELLIDO                 VARCHAR2(20),
SEGUNDO_APELLIDO                VARCHAR2(20),
CELULAR                         VARCHAR2(20),
DIRECCIÓN                       VARCHAR2(20),
CORREO_ELECTRONICO              VARCHAR2(20),
ULTIMA_ACTUALIZACION            TIMESTAMP   
)

/
COMMENT ON TABLE CARCENTERADMIN.PERSONA IS 'PERSONAS RESGISTRADAS' 
/