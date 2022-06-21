/************************************************************************************
Descripción: Objeto de encargado de ...
Autor:       Nombre del desarrollador y usuario
Fecha:       01-01-2022
IdGestión:   Ticket-2132123
@copyright: NombreDeLaEmpresa
************************************************************************************/

create table CARCENTERADMIN.VEHICULO 
(
ID_VEHICULO                     NUMBER(4)  GENERATED ALWAYS AS IDENTITY ,
ID_PERSONA                      NUMBER(15)  ,
PLACAS                          VARCHAR2(20),
MARCA                           VARCHAR2(20)
)
/