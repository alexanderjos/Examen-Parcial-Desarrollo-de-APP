package com.valverde.facturacion.almacen.dto;

import java.sql.Date;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Infraccion {
    private int id;
    private String dni;
    private DateTime fecha;
    private String despricion;
    private int stock;
    private double precio;
}
