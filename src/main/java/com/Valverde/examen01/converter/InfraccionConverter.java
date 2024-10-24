package com.valverde.facturacion.almacen.converter;
import org.springframework.stereotype.Component;



@Component
public class InfraccionConverter extends AbstractConverter<Producto,ProductoDto> { 
    @Override
    public ProductoDto fromEntity(Producto entity) {
        if (entity == null) return null;

        return ProductoDto.builder()
                .id(entity.getId())
                .nombre(entity.getNombre())
                .despricion(entity.getDescripcion())
                .stock(entity.getStock())
                .precio(entity.getPrecio())
                .build();
    }

    @Override
    public Producto fromDTO(ProductoDto dto) {
        if (dto == null) return null;

        return Producto.builder()
                .id(dto.getId())
                .nombre(dto.getNombre())
                .descripcion(dto.getDespricion())
                .stock(dto.getStock())
                .precio(dto.getPrecio())
                .build();
    }

}
