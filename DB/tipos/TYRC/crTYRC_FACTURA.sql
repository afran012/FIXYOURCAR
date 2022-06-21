/************************************************************************************
Descripci�n: Objeto de encargado de ...
Autor:       Nombre del desarrollador y usuario
Fecha:       01-01-2022
IdGesti�n:   Ticket-2132123
@copyright:  NombreDeLaEmpresa
************************************************************************************/

CREATE TYPE CARCENTERADMIN.TYRC_FACTURA AS OBJECT
(
ID_FACTURA                      NUMBER(15),
SUBTOTAL                        NUMBER(15),
VALOR_IMPUESTOS                 NUMBER(15),
VALOR_DESCUENTO                 NUMBER(15),
VALOR_TOTAL                     NUMBER(15)
);
/