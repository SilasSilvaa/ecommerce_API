package com.ssilvadev.api.domain.mapper;

import com.ssilvadev.api.domain.dto.ProductDTO;
import com.ssilvadev.api.domain.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductDTO toDTO(Product product);
    Product toEntity(ProductDTO productDTO);
}
