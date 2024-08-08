package com.client.ws.apispring.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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

    @NotBlank(message="não pode ser nulo ou vazio.")
    @Size(min = 5, max = 30, message = "deve ter tamanho entre 5 e 30.")
    private String Nome;

    @Max(value = 12, message = "acess month não pode ser maior que 12.")
    private Long AcessMonth;

    @NotNull(message = "price não pode ser nulo")
    private BigDecimal price;

    @NotBlank(message = "product key não pode ser nulo ou vazio")
    @Size(min = 5, max = 15, message = "productKey deve ter tamanho entre 5 e 15.")
    private String productKey;
}
