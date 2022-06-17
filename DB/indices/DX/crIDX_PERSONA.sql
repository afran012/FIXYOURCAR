/************************************************************************************
Descripci�n: Objeto de encargado de ...
Autor:       Nombre del desarrollador y usuario
Fecha:       01-01-2022
IdGesti�n:   Ticket-2132123
@copyright:  NombreDeLaEmpresa
************************************************************************************/

CREATE UNIQUE INDEX IDX_PERSONA_01 ON PERSONA (IDENTIFICACION, ID_PERSONA)
/

CREATE INDEX IDX_PERSONA_02 ON PERSONA (ID_TIPO_IDENTIFICACION)
/