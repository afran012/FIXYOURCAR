/************************************************************************************
Descripción: Objeto de encargado de ...
Autor:       Nombre del desarrollador y usuario
Fecha:       01-01-2022
IdGestión:   Ticket-2132123
@copyright: NombreDeLaEmpresa
************************************************************************************/

ALTER TABLE CARCENTERADMIN.MECANICO ADD CONSTRAINT FK_MECANICO_ID_ESTADO_MECANICO FOREIGN KEY (ID_ESTADO_MECANICO)  REFERENCES CARCENTERADMIN.ESTADO_MECANICO (ID_ESTADO_MECANICO);
/