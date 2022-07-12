/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.carcenter.api.repository.iRepository;

import com.carcenter.api.model.FacturaCompleta;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author stevenfranco
 */
@Repository
public interface IFacturaCompletaRepository extends JpaRepository<FacturaCompleta, String> {

    public List<FacturaCompleta> findAllByCedula(String cedula);

    @Query(value
            = "WITH	FACTURA_DATOS_CTE(factura_id , indentificacion , suma_repuestos , precio_mano_obra , nombre_completo_cliente ,nombre_completo_mecanico)AS  "
            + "(  "
            + "	SELECT  "
            + "	f.ID_FACTURA AS factura_id,  "
            + "	p.IDENTIFICACION AS indentificacion,  "
            + "	SUM(r.VALOR_ARTICULO) AS suma_repuestos,  "
            + "	(CASE  "
            + "	    WHEN SUM(r.VALOR_ARTICULO) > 3000000 THEN mdo.PRECIO_TOTAL*0.5  "
            + "	    ELSE mdo.PRECIO_TOTAL  "
            + "	END)   "
            + "	AS precio_mano_obra,  "
            + "	p.PRIMER_NOMBRE || ' ' || p.SEGUNDO_NOMBRE  || ' ' || p.PRIMER_APELLIDO    "
            + "	|| ' ' || p.SEGUNDO_APELLIDO  || '. Identificación: ' || p.IDENTIFICACION   "
            + "	|| '. Celular: ' || p.CELULAR  || '. Dirección: ' || p.DIRECCIÓN  || '. Correo :' || p.CORREO_ELECTRONICO    "
            + "	AS nombre_completo_cliente,  "
            + "	m2.PRIMER_NOMBRE || ' ' || m2.SEGUNDO_NOMBRE  || ' ' || m2.PRIMER_APELLIDO    "
            + "	|| ' ' || m2.SEGUNDO_APELLIDO  || '. Identificación: ' || m2.IDENTIFICACION   "
            + "	|| '. Celular: ' || m2.CELULAR  || '. Dirección: ' || m2.DIRECCIÓN  || '. Correo :' || m2.CORREO_ELECTRONICO    "
            + "	|| '. Estado :' || em2.DESCRIPCION    "
            + "	AS nombre_completo_mecanico  "
            + "	FROM   "
            + "	FACTURA f   "
            + "	JOIN MANTENIMIENTO m ON f.ID_FACTURA = m.ID_FACTURA  "
            + "	JOIN REPUESTO_MANTENIMIENTO rm ON	rm.ID_MANTENIMIENTO = m.ID_MANTENIMIENTO   "
            + "	JOIN REPUESTO r ON	r.ID_REPUESTO = rm.ID_REPUESTO    "
            + "	JOIN MANO_DE_OBRA mdo ON mdo.ID_MANO_DE_OBRA = m.ID_MANO_DE_OBRA  "
            + "	JOIN ESTADO_MANTENIMIENTO em ON m.ID_ESTADO_MANTENIMIENTO  = em.ID_ESTADO_MANTENIMIENTO  "
            + "	JOIN VEHICULO v ON m.ID_VEHICULO = v.ID_VEHICULO   "
            + "	JOIN PERSONA p ON v.ID_PERSONA = p.ID_PERSONA   "
            + "	JOIN MECANICO m2 ON m.ID_MECANICO = m2.ID_MECANICO   "
            + "	JOIN ESTADO_MECANICO em2 ON m2.ID_ESTADO_MECANICO = em2.ID_ESTADO_MECANICO    "
            + "	WHERE em.DESCRIPCION  LIKE 'Terminado'  "
            + "	GROUP BY p.IDENTIFICACION , p.IDENTIFICACION, mdo.PRECIO_TOTAL , f.ID_FACTURA ,   "
            + "	p.PRIMER_NOMBRE , p.SEGUNDO_NOMBRE , p.PRIMER_APELLIDO , p.SEGUNDO_APELLIDO ,  "
            + "	p.CELULAR , p.DIRECCIÓN , p.CORREO_ELECTRONICO ,  "
            + "	m2.PRIMER_NOMBRE , m2.SEGUNDO_NOMBRE , m2.PRIMER_APELLIDO , m2.SEGUNDO_APELLIDO,  "
            + "	m2.CELULAR , m2.DIRECCIÓN , m2.CORREO_ELECTRONICO , m2.IDENTIFICACION , em2.DESCRIPCION  "
            + ")  "
            + "SELECT  "
            + "factura_id , suma_repuestos AS PRECIO_REPUESTOS , precio_mano_obra , indentificacion,  "
            + "( FACTURA_DATOS_CTE.suma_repuestos + FACTURA_DATOS_CTE.precio_mano_obra ) AS SUBTOTAL,  "
            + "( FACTURA_DATOS_CTE.suma_repuestos + FACTURA_DATOS_CTE.precio_mano_obra ) * 0.19 AS IVA,  "
            + "(FACTURA_DATOS_CTE.suma_repuestos + FACTURA_DATOS_CTE.precio_mano_obra ) * 0.19   "
            + "+ ( FACTURA_DATOS_CTE.suma_repuestos + FACTURA_DATOS_CTE.precio_mano_obra ) AS TOTAL,  "
            + " nombre_completo_cliente , nombre_completo_mecanico   "
            + "FROM FACTURA_DATOS_CTE  "
            + "WHERE indentificacion = ':cedula'  "
            + "GROUP BY suma_repuestos, factura_id , precio_mano_obra  , nombre_completo_cliente , nombre_completo_mecanico , indentificacion;"
            ,
             nativeQuery = true)
    List<FacturaCompleta> buscarPorCedulaQ(@Param("cedula") String cedula);

}
