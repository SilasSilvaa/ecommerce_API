package com.ssilvadev.api.domain.mapper;

import com.ssilvadev.api.domain.dto.CartDTO;
import com.ssilvadev.api.domain.dto.CartItemDTO;
import com.ssilvadev.api.domain.model.Cart;
import com.ssilvadev.api.domain.model.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CartMapper {

    @Mapping(target = "userId", source = "user.id")
    CartDTO toDTO(Cart cart);

    @Mapping(target = "user.id", source = "userId")
    Cart toEntity(CartDTO cartDTO);

    @Mapping(target = "productId", source = "product.id")
    CartItemDTO toDto(CartItem cartItem);

    @Mapping(target = "product.id", source = "productId")
    CartItem toEntity(CartItemDTO cartItemDTO);
}
