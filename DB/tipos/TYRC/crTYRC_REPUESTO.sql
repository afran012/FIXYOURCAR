/************************************************************************************
Descripci�n: Objeto de encargado de ...
Autor:       Nombre del desarrollador y usuario
Fecha:       01-01-2022
IdGesti�n:   Ticket-2132123
@copyright:  NombreDeLaEmpresa
************************************************************************************/

CREATE TYPE CARCENTERADMIN.TYRC_REPUESTO AS OBJECT
(
ID_REPUESTO                     NUMBER(15),    
DESCRIPCION                     VARCHAR2(200),
VALOR_ARTICULO                  NUMBER(15),
PORCENTAJE_DESCUENTO            NUMBER(15)
);
/