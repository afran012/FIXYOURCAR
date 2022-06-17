/************************************************************************************
Descripci�n: Objeto de encargado de ...
Autor:       Nombre del desarrollador y usuario
Fecha:       01-01-2022
IdGesti�n:   Ticket-2132123
@copyright:  NombreDeLaEmpresa
************************************************************************************/

CREATE UNIQUE INDEX IDX_MANTENIMIENTO_01 ON MANTENIMIENTO (ID_MANTENIMIENTO)
/
CREATE INDEX IDX_MANTENIMIENTO_02 ON MANTENIMIENTO (ID_ESTADO_MANTENIMIENTO)
/
CREATE INDEX IDX_MANTENIMIENTO_03 ON MANTENIMIENTO (ID_VEHICULO)
/
CREATE INDEX IDX_MANTENIMIENTO_04 ON MANTENIMIENTO (ID_MECANICO)
/

