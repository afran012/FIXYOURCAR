set serveroutput on;

declare
  codicoid NUMBER(4) := &codigo;
begin
  GETTIPO_ID(codicoid);
end;


create or replace NONEDITIONABLE PROCEDURE GETTIPO_ID 
(
  ID_TIPOID IN tipo_identificacion.id_tipo_identificacion%TYPE ,
  orc in out nocopy tipo_identificacion%rowtype
) 
is
    variable TIPO_IDENTIFICACION%rowtype;
    cursor cuTIPO_IDENTIFICACION is
        select /*+INDEX(TIPO_IDENTIFICACION PK_TIPO_IDENTIFICACION)*/
            TIPO_IDENTIFICACION .* 
        from TIPO_IDENTIFICACION 
        where /*+PKG_TIPO_IDENTIFICACION.getTIPO_IDENTIFICACION*/
        ID_TIPO_IDENTIFICACION = ID_TIPOID;
BEGIN

    open cuTIPO_IDENTIFICACION;
    fetch cuTIPO_IDENTIFICACION into variable;
    close cuTIPO_IDENTIFICACION;

    
        select /*+INDEX(TIPO_IDENTIFICACION PK_TIPO_IDENTIFICACION)*/
        
            TIPO_IDENTIFICACION .* INTO variable
        from TIPO_IDENTIFICACION 
        where /*+PKG_TIPO_IDENTIFICACION.getTIPO_IDENTIFICACION*/
        ID_TIPO_IDENTIFICACION = ID_TIPOID;
        DBMS_OUTPUT.PUT_line('LA CEDULA ES ' || orc.id_tipo_identificacion);

        
END GETTIPO_ID;



docker run --name oracle18cdb \
-p 51521:1521 -p 55500:5500 \
-e ORACLE_PWD=oracle \
-e ORACLE_CHARACTERSET=AL32UTF8 \
-v /home/myuser/Docker/myxedb/oradata:/opt/oracle/oradata \
oracle/database:21.3.0-xe

docker run --name oracle18cdb \
-p 51521:1521 -p 55500:5500 \
-e ORACLE_PWD=oracle \
-e ORACLE_CHARACTERSET=AL32UTF8 \
oracle/database:18.4.0-xe


docker run --name myxedb \
    -d \
    -p 51521:1521 \
    -p 55500:5500 \
    -e ORACLE_PWD=mysecurepassword \
    -e ORACLE_CHARACTERSET=AL32UTF8 \
    oracle/database:18.4.0-xe



     docker run -d -e WEB_CONSOLE=false --name oracle-18cc-container -p 1523:1523 dockerhelp/docker-oracle-ee-18c:latest




procedure insTIPO_IDENTIFICACION (iorcdesc in tipo_identificacion.descripcion%type) is

id_Tipo_id tipo_identificacion.ID_TIPO_IDENTIFICACION%type;
desc_Tipo_id tipo_identificacion.descripcion%type;
ult_act_Tipo_id tipo_identificacion.ULTIMA_ACTUALIZACION%type;

begin

    --  Inicializo Valores
    id_Tipo_id.ID_TIPO_IDENTIFICACION := SEQ_TIPO_IDENTIFICACION.NEXTVAL;
    desc_Tipo_id.ULTIMA_ACTUALIZACION := systimestamp;
    ult_act_Tipo_id.descripcion := iorcdesc;

    -- Se insgresa el Valor
    INSERT INTO TIPO_IDENTIFICACION VALUES (id_Tipo_id,desc_Tipo_id,ult_act_Tipo_id);
      

end insTIPO_IDENTIFICACION;
