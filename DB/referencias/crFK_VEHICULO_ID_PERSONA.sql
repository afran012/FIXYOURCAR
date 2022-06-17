/************************************************************************************
Descripción: Objeto de encargado de ...
Autor:       Nombre del desarrollador y usuario
Fecha:       01-01-2022
IdGestión:   Ticket-2132123
@copyright: NombreDeLaEmpresa
************************************************************************************/

ALTER TABLE CARCENTERADMIN.VEHICULO ADD CONSTRAINT FK_VEHICULO_ID_PERSONA FOREIGN KEY (ID_PERSONA)  REFERENCES CARCENTERADMIN.PERSONA(ID_PERSONA);
/