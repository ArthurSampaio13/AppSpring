package com.client.ws.apispring.dto;

import com.client.ws.apispring.model.SubscriptionType;
import com.client.ws.apispring.model.UserType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
    private Long id;
    @NotBlank(message = "Valor não pode ser nulo ou vazio.")
    private String Nome;
    @Email(message = "Invalido")
    private String email;
    private String cpf;
    private LocalDate dtSubscription = LocalDate.now();
    private LocalDate dtExperiration = LocalDate.now();
    private UserType userType;
    private SubscriptionType subscriptionType;
}
