/************************************************************************************
Descripción: Objeto de encargado de ...
Autor:       Nombre del desarrollador y usuario
Fecha:       01-01-2022
IdGestión:   Ticket-2132123
@copyright: NombreDeLaEmpresa
************************************************************************************/

ALTER TABLE CARCENTERADMIN.REPUESTO_MANTENIMIENTO ADD CONSTRAINT FK_REPUESTO_MANTENIMIENTO_ID_MANTENIMIENTO FOREIGN KEY (ID_MANTENIMIENTO)  REFERENCES CARCENTERADMIN.MANTENIMIENTO(ID_MANTENIMIENTO);
/