/************************************************************************************
Descripción: Objeto de encargado de ...
Autor:       Nombre del desarrollador y usuario
Fecha:       01-01-2022
IdGestión:   Ticket-2132123
@copyright: NombreDeLaEmpresa
************************************************************************************/

ALTER TABLE CARCENTERADMIN.MANTENIMIENTO  ADD CONSTRAINT FK_MANTENIMIENTO_ID_MANO_DE_OBRA FOREIGN KEY (ID_MANO_DE_OBRA)  REFERENCES CARCENTERADMIN.MANO_DE_OBRA (ID_MANO_DE_OBRA);
/