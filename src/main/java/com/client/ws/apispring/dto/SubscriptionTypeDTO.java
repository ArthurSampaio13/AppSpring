package com.client.ws.apispring.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubscriptionTypeDTO {
    private Long id;

    private String Nome;

    private Long AcessMonth;

    private BigDecimal price;

    private String productKey;
}
