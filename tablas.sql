create table CARCENTERADMIN.ESTADO_MANTENIMIENTO
(
ID_ESTADO_MANTENIMIENTO         INT GENERATED ALWAYS AS IDENTITY,
DESCRIPCION                     VARCHAR2(20)
);

/************************************************************************************
Descripción: Objeto de encargado de ...
Autor:       Nombre del desarrollador y usuario
Fecha:       01-01-2022
IdGestión:   Ticket-2132123
@copyright: NombreDeLaEmpresa
************************************************************************************/

create table CARCENTERADMIN.ESTADO_MECANICO 
(
ID_ESTADO_MECANICO              INT GENERATED ALWAYS AS IDENTITY,
DESCRIPCION                     VARCHAR2(20)
);

/************************************************************************************
Descripción: Objeto de encargado de ...
Autor:       Nombre del desarrollador y usuario
Fecha:       01-01-2022
IdGestión:   Ticket-2132123
@copyright: NombreDeLaEmpresa
************************************************************************************/

create table CARCENTERADMIN.FACTURA 
(
ID_FACTURA                      INT GENERATED ALWAYS AS IDENTITY,
SUBTOTAL                        NUMBER(15),
VALOR_IMPUESTOS                 NUMBER(15),
VALOR_DESCUENTO                 NUMBER(15),
VALOR_TOTAL                     NUMBER(15)
);

/************************************************************************************
Descripción: Objeto de encargado de ...
Autor:       Nombre del desarrollador y usuario
Fecha:       01-01-2022
IdGestión:   Ticket-2132123
@copyright: NombreDeLaEmpresa
************************************************************************************/

create table CARCENTERADMIN.MANTENIMIENTO
(
ID_MANTENIMIENTO                INT GENERATED ALWAYS AS IDENTITY,
ID_FACTURA                      NUMBER(15)  ,
ID_ESTADO_MANTENIMIENTO         NUMBER(4)   ,
ID_VEHICULO                     NUMBER(4)   ,
ID_MECANICO                     NUMBER(15)  ,
MANO_DE_OBRA                    NUMBER(20)  ,
DESCRIPCION                     VARCHAR2(20)
);


/************************************************************************************
Descripción: Objeto de encargado de ...
Autor:       Nombre del desarrollador y usuario
Fecha:       01-01-2022
IdGestión:   Ticket-2132123
@copyright: NombreDeLaEmpresa
************************************************************************************/

create table CARCENTERADMIN.MECANICO 
(
ID_MECANICO                     INT GENERATED ALWAYS AS IDENTITY,
ID_ESTADO_MECANICO              NUMBER(2)   ,
ID_TIPO_IDENTIFICACION          NUMBER(2)   ,
IDENTIFICACION                  VARCHAR2(20),
PRIMER_NOMBRE                   VARCHAR2(20),
SEGUNDO_NOMBRE                  VARCHAR2(20),
PRIMER_APELLIDO                 VARCHAR2(20),
SEGUNDO_APELLIDO                VARCHAR2(20),
CELULAR                         VARCHAR2(20),
DIRECCIÓN                       VARCHAR2(20),
CORREO_ELECTRONICO              VARCHAR2(20)
);

/************************************************************************************
Descripción: Objeto de encargado de ...
Autor:       Nombre del desarrollador y usuario
Fecha:       01-01-2022
IdGestión:   Ticket-2132123
@copyright: NombreDeLaEmpresa
************************************************************************************/

create table CARCENTERADMIN.PERSONA 
(
ID_PERSONA                      INT GENERATED ALWAYS AS IDENTITY,
ID_TIPO_IDENTIFICACION          NUMBER(2)   ,
IDENTIFICACION                  VARCHAR2(20),
PRIMER_NOMBRE                   VARCHAR2(20),
SEGUNDO_NOMBRE                  VARCHAR2(20),
PRIMER_APELLIDO                 VARCHAR2(20),
SEGUNDO_APELLIDO                VARCHAR2(20),
CELULAR                         VARCHAR2(20),
DIRECCIÓN                       VARCHAR2(20),
CORREO_ELECTRONICO              VARCHAR2(20)
);

/************************************************************************************
Descripción: Objeto de encargado de ...
Autor:       Nombre del desarrollador y usuario
Fecha:       01-01-2022
IdGestión:   Ticket-2132123
@copyright: NombreDeLaEmpresa
************************************************************************************/

create table CARCENTERADMIN.REPUESTO_MANTENIMIENTO
(
ID_REPUESTO_MANTENIMIENTO       INT GENERATED ALWAYS AS IDENTITY,
ID_REPUESTO                     NUMBER(15),
ID_MANTENIMIENTO                NUMBER(15)
);

/************************************************************************************
Descripción: Objeto de encargado de ...
Autor:       Nombre del desarrollador y usuario
Fecha:       01-01-2022
IdGestión:   Ticket-2132123
@copyright: NombreDeLaEmpresa
************************************************************************************/

create table CARCENTERADMIN.REPUESTO
(
ID_REPUESTO                     INT GENERATED ALWAYS AS IDENTITY,    
DESCRIPCION                     VARCHAR2(200),
VALOR_ARTICULO                  NUMBER(15),
PORCENTAJE_DESCUENTO            NUMBER(15)
);

/************************************************************************************
Descripción: Objeto de encargado de ...
Autor:       Nombre del desarrollador y usuario
Fecha:       01-01-2022
IdGestión:   Ticket-2132123
@copyright: NombreDeLaEmpresa
************************************************************************************/

create table CARCENTERADMIN.TIPO_IDENTIFICACION 
(
ID_TIPO_IDENTIFICACION          INT GENERATED ALWAYS AS IDENTITY,
DESCRIPCION                     VARCHAR2(20)
);

/************************************************************************************
Descripción: Objeto de encargado de ...
Autor:       Nombre del desarrollador y usuario
Fecha:       01-01-2022
IdGestión:   Ticket-2132123
@copyright: NombreDeLaEmpresa
************************************************************************************/

create table CARCENTERADMIN.VEHICULO 
(
ID_VEHICULO                     INT GENERATED ALWAYS AS IDENTITY,
ID_PERSONA                      NUMBER(15)  ,
PLACAS                          VARCHAR2(20),
MARCA                           VARCHAR2(20)
);
