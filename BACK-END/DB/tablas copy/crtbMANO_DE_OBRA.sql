/************************************************************************************
Descripción: Objeto de encargado de ...
Autor:       Nombre del desarrollador y usuario
Fecha:       01-01-2022
IdGestión:   Ticket-2132123
@copyright: NombreDeLaEmpresa
************************************************************************************/

create table CARCENTERADMIN.MANO_DE_OBRA 
(
ID_MANO_DE_OBRA                 NUMBER(15) GENERATED ALWAYS AS IDENTITY ,
SERVICIO                        VARCHAR2(40)  ,
DESCRIPCION                     VARCHAR2(6)  ,
PRECIO_MAXIMO                   NUMBER(15),
PRECIO_MINIMO                   NUMBER(15),
PRECIO_TOTAL                    NUMBER(15)
)


/
COMMENT ON TABLE CARCENTERADMIN.MECANICO IS 'MECANICOS RESGISTRADAS' 
/