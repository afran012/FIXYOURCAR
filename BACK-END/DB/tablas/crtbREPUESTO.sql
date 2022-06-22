/************************************************************************************
Descripción: Objeto de encargado de ...
Autor:       Nombre del desarrollador y usuario
Fecha:       01-01-2022
IdGestión:   Ticket-2132123
@copyright: NombreDeLaEmpresa
************************************************************************************/

create table CARCENTERADMIN.REPUESTO
(
ID_REPUESTO                     NUMBER(15),    
DESCRIPCION                     VARCHAR2(200),
VALOR_ARTICULO                  NUMBER(15),
PORCENTAJE_DESCUENTO            NUMBER(15),
ULTIMA_ACTUALIZACION            TIMESTAMP 
);
/
COMMENT ON TABLE CARCENTERADMIN.REPUESTO IS 'LISTADO DE REPUESTO' 
/