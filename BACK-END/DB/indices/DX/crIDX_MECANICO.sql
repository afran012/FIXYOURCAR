/************************************************************************************
Descripci�n: Objeto de encargado de ...
Autor:       Nombre del desarrollador y usuario
Fecha:       01-01-2022
IdGesti�n:   Ticket-2132123
@copyright:  NombreDeLaEmpresa
************************************************************************************/

CREATE UNIQUE INDEX IDX_MECANICO_01 ON MECANICO (ID_MECANICO , IDENTIFICACION)
/

CREATE INDEX IDX_MECANICO_02 ON MECANICO (ID_ESTADO_MECANICO)
/

CREATE INDEX IDX_MECANICO_03 ON MECANICO (ID_TIPO_IDENTIFICACION)
/