package com.ssilvadev.api.domain.mapper;

import com.ssilvadev.api.domain.dto.OrderDTO;
import com.ssilvadev.api.domain.dto.OrderItemDTO;
import com.ssilvadev.api.domain.model.Order;
import com.ssilvadev.api.domain.model.OrderItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "orderItems", source = "items")
    OrderDTO toDTO(Order order);

    @Mapping(target = "user.id", source = "userId")
    @Mapping(target = "items", source = "orderItems")
    Order toEntity(OrderDTO orderDTO);

    List<OrderDTO> toDTOs(List<Order> orders);
    List<Order> toEntities(List<OrderDTO> ordersDTOs);

    @Mapping(target = "productId", source = "product.id")
    OrderItemDTO toOrderItemDTO(OrderItem orderItem);

    @Mapping(target = "product.id", source = "ProductId")
    OrderItem toOrderItemEntity(OrderItemDTO orderItemDTO);

    List<OrderItemDTO> toOrderItemsDTOs(List<OrderItem> orderItems);
    List<OrderItem> toOrderItemsEntities(List<OrderItemDTO> orderItemDTOs);
}
