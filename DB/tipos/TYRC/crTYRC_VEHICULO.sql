/************************************************************************************
Descripci�n: Objeto de encargado de ...
Autor:       Nombre del desarrollador y usuario
Fecha:       01-01-2022
IdGesti�n:   Ticket-2132123
@copyright:  NombreDeLaEmpresa
************************************************************************************/

CREATE TYPE TYRC_VEHICULO AS OBJECT
(
ID_VEHICULO                     NUMBER(4)   ,
ID_PERSONA                      NUMBER(15)  ,
PLACAS                          VARCHAR2(20),
MARCA                           VARCHAR2(20)
);
/