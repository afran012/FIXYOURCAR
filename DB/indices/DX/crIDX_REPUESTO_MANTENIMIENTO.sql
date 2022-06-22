/************************************************************************************
Descripci�n: Objeto de encargado de ...
Autor:       Nombre del desarrollador y usuario
Fecha:       01-01-2022
IdGesti�n:   Ticket-2132123
@copyright:  NombreDeLaEmpresa
************************************************************************************/

CREATE UNIQUE INDEX IDX_REPUESTO_MANTENIMIENTO_01 ON REPUESTO_MANTENIMIENTO (ID_REPUESTO_MANTENIMIENTO)
/

CREATE INDEX IDX_REPUESTO_MANTENIMIENTO_02 ON REPUESTO_MANTENIMIENTO (ID_REPUESTO)
/

CREATE INDEX IDX_REPUESTO_MANTENIMIENTO_03 ON REPUESTO_MANTENIMIENTO (ID_MANTENIMIENTO)
/