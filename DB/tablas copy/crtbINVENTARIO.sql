/************************************************************************************
Descripción: Objeto de encargado de ...
Autor:       Nombre del desarrollador y usuario
Fecha:       01-01-2022
IdGestión:   Ticket-2132123
@copyright: NombreDeLaEmpresa
************************************************************************************/

create table CARCENTERADMIN.INVENTARIO 
(
ID_INVENTARIO                   NUMBER(15) GENERATED ALWAYS AS IDENTITY ,
ID_REPUESTO                     NUMBER(15),
CANTIDAD                        NUMBER(15) 
)


/
COMMENT ON TABLE CARCENTERADMIN.MECANICO IS 'MECANICOS RESGISTRADAS' 
/