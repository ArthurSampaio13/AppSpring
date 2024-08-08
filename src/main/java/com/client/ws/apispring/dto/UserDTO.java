package com.client.ws.apispring.dto;

import com.client.ws.apispring.model.SubscriptionType;
import com.client.ws.apispring.model.UserType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

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

    @CPF(message = "Invalido")
    private String cpf;

    private LocalDate dtSubscription = LocalDate.now();

    @Size(min = 11, message = "Minimo de 6 digitos")
    private String phone;

    private LocalDate dtExperiration = LocalDate.now();

    @NotNull(message = "Valor não pode ser nulo ou vazio.")
    private Long userTypeId;

    private Long subscriptionTypeId;
}
