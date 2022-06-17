/************************************************************************************
Descripción: Objeto de encargado de ...
Autor:       Nombre del desarrollador y usuario
Fecha:       01-01-2022
IdGestión:   Ticket-2132123
@copyright: NombreDeLaEmpresa
************************************************************************************/

ALTER TABLE CARCENTERADMIN.MECANICO ADD CONSTRAINT FK_MECANICO_ID_TIPO_IDENTIFICACION FOREIGN KEY (ID_TIPO_IDENTIFICACION)  REFERENCES CARCENTERADMIN.TIPO_IDENTIFICACION (ID_TIPO_IDENTIFICACION);
/