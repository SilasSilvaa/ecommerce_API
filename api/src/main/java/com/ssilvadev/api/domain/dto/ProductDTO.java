package com.ssilvadev.api.domain.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ProductDTO {
    private Long id;

    @NotBlank(message = "Product name is required")
    private String name;

    @NotBlank(message = "Product message is required")
    private String description;

    @Positive(message = "Cannot be negative")
    private BigDecimal price;

    @PositiveOrZero(message = "Cannot be negative or zero")
    private Integer quantity;
    private List<CommentDTO> comments;
}
