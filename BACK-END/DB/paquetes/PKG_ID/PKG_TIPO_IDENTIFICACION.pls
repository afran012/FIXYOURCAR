create or replace PACKAGE PKG_TIPO_IDENTIFICACION IS
/************************************************************************************
Descripci�n: Objeto de encargado de gestionar las transacciones dml sobre la entidad TIPO_IDENTIFICACION
Autor:       Nombre del desarrollador y usuario
Fecha:       01-01-2022
IdGesti�n:   Ticket-2132123
@copyright: NombreDeLaEmpresa
------------------------------------------------------------------------------------
Historial de modificaciones=>
Fecha         Orden          Persona                 Acci�n        
------------------------------------------------------------------------------------
01-01-2022    Ticketxxx        NombreDevModifica       Creaci�n 

************************************************************************************/

    /* Declaraci�n de tipo de datos publicos */

    subtype tyrcTIPO_IDENTIFICACION is  TIPO_IDENTIFICACION%rowtype ;

    type tytbTIPO_IDENTIFICACION is table of tyrcTIPO_IDENTIFICACION index by binary_integer;

    /* Declaraci�n de variables publicas */

    -- tbTIPO_IDENTIFICACION tytbTIPO_IDENTIFICACION;

    /* Declaraci�n de  metodos y funciones publicas */

    /************************************************************************************
    Descripci�n: Objeto usado para ... 
    Autor:       Nombre del desarrollador y usuario
    Fecha:       01-01-2022
    IdGesti�n:   Ticket-2132123
    @copyright: NombreDeLaEmpresa
    ------------------------------------------------------------------------------------
    Historial de modificaciones=>
    Fecha         Orden          Persona                 Acci�n        
    ------------------------------------------------------------------------------------
    01-01-2022    Ticketxxx        NombreDevModifica       Creaci�n  
    ************************************************************************************/

    procedure insTIPO_IDENTIFICACION (iorc in out nocopy tyrcTIPO_IDENTIFICACION);

    /************************************************************************************
    Descripci�n: Objeto usado para ... 
    Autor:       Nombre del desarrollador y usuario
    Fecha:       01-01-2022
    IdGesti�n:   Ticket-2132123
    @copyright: NombreDeLaEmpresa
    ------------------------------------------------------------------------------------
    Historial de modificaciones=>
    Fecha         Orden          Persona                 Acci�n        
    ------------------------------------------------------------------------------------
    01-01-2022    Ticketxxx        NombreDevModifica       Creaci�n      
    ************************************************************************************/

    procedure getTIPO_IDENTIFICACION (id in number, orc out nocopy tyrcTIPO_IDENTIFICACION);


END PKG_TIPO_IDENTIFICACION;