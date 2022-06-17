-- INSERTA PEDIDOS
insert into CARCENTERADMIN.PEDIDO (ID_PEDIDO, ID_PERSONA,DIRECCION,SUBTOTAL,VALOR_IMPUESTOS,VALOR_TOTAL,ESTADO,FECHA_PEDIDO,ULTIMA_ACTUALIZACION)
select SEQ_PEDIDO.NEXTVAL,id_persona,'SIN DIRECCION' ,0,0,0,2,TO_DATE(tmp_VALUE||'/MAR/2022','DD/MON/YYYY'), TO_TIMESTAMP(tmp_VALUE||'/MAR/2022','DD/MON/YYYY')
FROM (SELECT id_persona,ROUND(dbms_random.value(1,30),0) tmp_VALUE from persona);
/
commit
/
-- INSERTA DETALLES Genera datos aleatorios en DETALLE_PEDIDO
declare
nuID_Pedido number;
nuID_articulo number;
nu_Cantidad number;
nu_CantidadDetalle number;
dt_ULTIMA_ACTUALIZACION timestamp;
id number;
begin
for rc in (select ID_PEDIDO from CARCENTERADMIN.PEDIDO) loop
    nuID_Pedido :=rc.ID_PEDIDO;
    nu_CantidadDetalle:= ROUND(dbms_random.value(3,9),0);
    for i in 1..nu_CantidadDetalle loop
        nu_Cantidad:= ROUND(dbms_random.value(1,99),0);
        Id := SEQ_DETALLE_PEDIDO.NEXTVAL;
        SELECT round(dbms_random.value(MIN(ID_ARTICULO),MAX(ID_ARTICULO)),0) into nuID_articulo FROM ARTICULO;
        --dbms_output.put_line('Salida=>Id:'||Id||'-nuID_Pedido:'||nuID_Pedido||'-nuID_articulo:'||nuID_articulo||'-nu_Cantidad:'||nu_Cantidad);
        insert into CARCENTERADMIN.DETALLE_PEDIDO (ID_DETALLE_PEDIDO,ID_PEDIDO,ID_ARTICULO,VALOR_ARTICULO,VALOR_IMPUESTOS,CANTIDAD,ULTIMA_ACTUALIZACION)
        values (Id,nuID_Pedido,nuID_articulo,0,0,nu_Cantidad,systimestamp);
    end loop;
    commit;
end loop;
end;
/
--  Actualiza Valor de los detalles Y FECHA en  DETALLE_PEDIDO 
    UPDATE CARCENTERADMIN.DETALLE_PEDIDO 
    SET DETALLE_PEDIDO.VALOR_ARTICULO =  DETALLE_PEDIDO.CANTIDAD * (SELECT ARTICULO.VALOR_ARTICULO FROM ARTICULO WHERE ARTICULO.ID_ARTICULO=DETALLE_PEDIDO.ID_ARTICULO),
    DETALLE_PEDIDO.VALOR_IMPUESTOS = DETALLE_PEDIDO.CANTIDAD * (SELECT ARTICULO.VALOR_IMPUESTOS FROM ARTICULO WHERE ARTICULO.ID_ARTICULO=DETALLE_PEDIDO.ID_ARTICULO),
    DETALLE_PEDIDO.ULTIMA_ACTUALIZACION = (SELECT PEDIDO.ULTIMA_ACTUALIZACION FROM PEDIDO WHERE PEDIDO.ID_PEDIDO = DETALLE_PEDIDO.ID_PEDIDO) ;
/    
commit
/
--  Actualiza Valores en pedido
begin
  for rc in (SELECT DETALLE_PEDIDO.ID_PEDIDO, SUM(DETALLE_PEDIDO.VALOR_ARTICULO) SUBTOTAL, SUM(DETALLE_PEDIDO.VALOR_IMPUESTOS) VALOR_IMPUESTOS, SUM(DETALLE_PEDIDO.VALOR_ARTICULO)+SUM(DETALLE_PEDIDO.VALOR_IMPUESTOS) TOTAL
    FROM DETALLE_PEDIDO GROUP BY ID_PEDIDO ) loop
    UPDATE CARCENTERADMIN.PEDIDO
    SET PEDIDO.SUBTOTAL = rc.SUBTOTAL ,PEDIDO.VALOR_IMPUESTOS=rc.VALOR_IMPUESTOS, PEDIDO.VALOR_TOTAL=rc.TOTAL 
    WHERE PEDIDO.ID_PEDIDO=rc.ID_PEDIDO;
  end loop;
  commit;
end;
/
