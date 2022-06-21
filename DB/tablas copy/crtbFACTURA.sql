/************************************************************************************
Descripción: Objeto de encargado de ...
Autor:       Nombre del desarrollador y usuario
Fecha:       01-01-2022
IdGestión:   Ticket-2132123
@copyright: NombreDeLaEmpresa
************************************************************************************/

create table CARCENTERADMIN.FACTURA 
(
ID_FACTURA                      NUMBER(15) GENERATED ALWAYS AS IDENTITY,
SUBTOTAL                        NUMBER(15),
VALOR_IMPUESTOS                 NUMBER(15),
VALOR_DESCUENTO                 NUMBER(15),
VALOR_TOTAL                     NUMBER(15)
)
/