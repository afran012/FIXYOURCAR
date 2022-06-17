/************************************************************************************
Descripci�n: Objeto de encargado de ...
Autor:       Nombre del desarrollador y usuario
Fecha:       01-01-2022
IdGesti�n:   Ticket-2132123
@copyright:  NombreDeLaEmpresa
************************************************************************************/

CREATE TYPE TYRC_REPUESTO_MANTENIMIENTO AS OBJECT
(
ID_REPUESTO_MANTENIMIENTO       NUMBER(15),
ID_REPUESTO                     NUMBER(15),
ID_MANTENIMIENTO                NUMBER(15)
);
/