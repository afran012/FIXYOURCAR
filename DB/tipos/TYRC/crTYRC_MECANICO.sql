/************************************************************************************
Descripci�n: Objeto de encargado de ...
Autor:       Nombre del desarrollador y usuario
Fecha:       01-01-2022
IdGesti�n:   Ticket-2132123
@copyright:  NombreDeLaEmpresa
************************************************************************************/

CREATE TYPE TYRC_MECANICO AS OBJECT
(
ID_MECANICO                     NUMBER(15)  ,
ID_ESTADO_MECANICO              NUMBER(2)   ,
ID_TIPO_IDENTIFICACION          NUMBER(2)   ,
IDENTIFICACION                  VARCHAR2(20),
PRIMER_NOMBRE                   VARCHAR2(20),
SEGUNDO_NOMBRE                  VARCHAR2(20),
PRIMER_APELLIDO                 VARCHAR2(20),
SEGUNDO_APELLIDO                VARCHAR2(20),
CELULAR                         VARCHAR2(20),
DIRECCIÓN                       VARCHAR2(20),
CORREO_ELECTRONICO              VARCHAR2(20)
);
/