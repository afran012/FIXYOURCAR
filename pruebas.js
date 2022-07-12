const detailOrderQuery = (orderID) => {
	query = `WITH orders_cte (product_quantity, product_name, items_total, order_id, payment_type, user_name, user_address, order_status, order_time) AS
(
	select count(p.productname) as product_quantity, p.productname as product_name, 
	sum(p.productprice) as items_total, o.orderid as order_id, o.paymenttype as payment_type,
	u.username as user_name, u.address as user_address, os.name as order_status, o.orderhour order_time
	from productorder po 
	join products p on 
	po.productid = p.productid 
	join orders o
	on o.orderid = po.orderid 
	join users u
	on u.userid = o.userid 
	join orderstate os
	on os.stateid = o.stateid 
	group by p.productname, o.orderid, payment_type, user_name, user_address, order_status, order_time  
)
select order_status as estado, order_time as hora, order_id as numero, array_agg(product_name) as productos, array_agg(product_quantity) as cantidad_productos,
payment_type as tipo_pago, sum(items_total) as total_pago, user_name usuario, user_address direccion
from orders_cte where order_id=${orderID} group by order_id, order_status, order_time, tipo_pago, numero, user_name, direccion ;`
	return query
}


WITH
cobros_cte (COBRO_MANTENIMIENTO,COBRO_MANO_DE_OBRA, ID_MANTENIMIENTO, ID_PERSONA) AS 
(
    SELECT sum(R.VALOR_ARTICULO) as COBRO_MANTENIMIENTO, 
    ID_MANTENIMIENTO as ID_MANTENIMIENTO,
    ID_PERSONA as ID_PERSONA,
    ID_MANO_DE_OBRA as COBRO_MANO_DE_OBRA
    from
    REPUESTO R 
    join REPUESTO_MANTENIMIENTO on 
    Repuestos.id_repuesto=repuesto_mantenimiento.id_repuesto 
    join Mantenimiento on  
    Mantenimiento.id_mantenimiento = repuesto_mantenimiento.id_mantenimiento
)
WHERE mantenimiento.estado like “Terminado” Group By (mantenimientoID, clienteID)
select cliente.primer_apellido, cliente.id from cliente, cobros.cobroMantenimiento from cliente join cliente.clientedID = cobros.clienteID


SELECT SUM(r.VALOR_ARTICULO) AS SumaRepuestos, 
(CASE
    WHEN SUM(r.VALOR_ARTICULO) > 3000000 THEN 50
    ELSE 0
END) AS DESCUENTO_MANO_OBRA , 
mdo.PRECIO_TOTAL preciomanoobra,
f.ID_FACTURA AS FACTURANUMERO
FROM 
FACTURA f 
JOIN MANTENIMIENTO m ON f.ID_FACTURA = m.ID_FACTURA
JOIN REPUESTO_MANTENIMIENTO rm ON	rm.ID_MANTENIMIENTO = m.ID_MANTENIMIENTO 
JOIN REPUESTO r ON	r.ID_REPUESTO = rm.ID_REPUESTO  
JOIN MANO_DE_OBRA mdo ON mdo.ID_MANO_DE_OBRA = m.ID_MANO_DE_OBRA
WHERE f.ID_FACTURA = 21
GROUP BY mdo.PRECIO_TOTAL , f.ID_FACTURA , r.VALOR_ARTICULO  ;


WITH	FACTURA_DATOS_CTE(SumaRepuestos,FacturaID,DESCUENTO_MANO_OBRA,preciomanoobra,FACTURANUMERO)AS
(
SELECT SUM(r.VALOR_ARTICULO) AS SumaRepuestos,
f.ID_FACTURA AS FacturaID, 
(CASE
    WHEN SUM(r.VALOR_ARTICULO) > 3000000 THEN 50
    ELSE 0
END) AS DESCUENTO_MANO_OBRA , 
mdo.PRECIO_TOTAL preciomanoobra,
f.ID_FACTURA AS FACTURANUMERO
FROM 
FACTURA f 
JOIN MANTENIMIENTO m ON f.ID_FACTURA = m.ID_FACTURA
JOIN REPUESTO_MANTENIMIENTO rm ON	rm.ID_MANTENIMIENTO = m.ID_MANTENIMIENTO 
JOIN REPUESTO r ON	r.ID_REPUESTO = rm.ID_REPUESTO  
JOIN MANO_DE_OBRA mdo ON mdo.ID_MANO_DE_OBRA = m.ID_MANO_DE_OBRA
GROUP BY mdo.PRECIO_TOTAL , f.ID_FACTURA ,  r.VALOR_ARTICULO
)
SELECT * FROM FACTURA_DATOS_CTE
WHERE FacturaID = 21
GROUP BY SumaRepuestos, FacturaID,DESCUENTO_MANO_OBRA,preciomanoobra,FACTURANUMERO;



WITH	FACTURA_DATOS_CTE(factura_id , indentificacion , suma_repuestos , precio_mano_obra)AS
(
SELECT
f.ID_FACTURA AS factura_id,
p.IDENTIFICACION AS indentificacion,
SUM(r.VALOR_ARTICULO) AS suma_repuestos,
(CASE
    WHEN SUM(r.VALOR_ARTICULO) > 3000000 THEN mdo.PRECIO_TOTAL*0.5
    ELSE mdo.PRECIO_TOTAL
END) AS precio_mano_obra
FROM 
FACTURA f 
JOIN MANTENIMIENTO m ON f.ID_FACTURA = m.ID_FACTURA
JOIN REPUESTO_MANTENIMIENTO rm ON	rm.ID_MANTENIMIENTO = m.ID_MANTENIMIENTO 
JOIN REPUESTO r ON	r.ID_REPUESTO = rm.ID_REPUESTO  
JOIN MANO_DE_OBRA mdo ON mdo.ID_MANO_DE_OBRA = m.ID_MANO_DE_OBRA
JOIN ESTADO_MANTENIMIENTO em ON m.ID_ESTADO_MANTENIMIENTO  = em.ID_ESTADO_MANTENIMIENTO
JOIN VEHICULO v ON m.ID_VEHICULO = v.ID_VEHICULO 
JOIN PERSONA p ON v.ID_PERSONA = p.ID_PERSONA 
WHERE em.DESCRIPCION  = 'Terminado'
GROUP BY p.IDENTIFICACION , p.IDENTIFICACION, mdo.PRECIO_TOTAL , f.ID_FACTURA 
)
SELECT
SUM( FACTURA_DATOS_CTE.suma_repuestos + FACTURA_DATOS_CTE.precio_mano_obra ) AS PrecioTotal ,
factura_id, suma_repuestos,precio_mano_obra
FROM FACTURA_DATOS_CTE
WHERE indentificacion = '3333333333'
GROUP BY suma_repuestos, factura_id , precio_mano_obra ;