/************************************************************************************
Descripción: Objeto de encargado de ...
Autor:       Nombre del desarrollador y usuario
Fecha:       01-01-2022
IdGestión:   Ticket-2132123
@copyright: NombreDeLaEmpresa
************************************************************************************/

create table CARCENTERADMIN.MANTENIMIENTO
(
ID_MANTENIMIENTO                NUMBER(4)   ,
ID_FACTURA                      NUMBER(15)  ,
ID_ESTADO_MANTENIMIENTO         NUMBER(4)   ,
ID_VEHICULO                     NUMBER(4)   ,
ID_MECANICO                     NUMBER(15)  ,
ID_MANO_DE_OBRA                 NUMBER(20)  ,
DESCRIPCION                     VARCHAR2(20),
ULTIMA_ACTUALIZACION            TIMESTAMP   
);
/
