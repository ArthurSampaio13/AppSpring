package com.client.ws.apispring.mapper;

import com.client.ws.apispring.dto.UserDTO;
import com.client.ws.apispring.model.SubscriptionType;
import com.client.ws.apispring.model.User;
import com.client.ws.apispring.model.UserType;

public class UserMapper {
    public static User fromDtoToEntity (UserDTO userDTO, UserType userType, SubscriptionType subscriptionType) {
        return User.builder()
                .id(userDTO.getId())
                .cpf(userDTO.getCpf())
                .Nome(userDTO.getNome())
                .email(userDTO.getEmail())
                .dtExperiration(userDTO.getDtExperiration())
                .dtSubscription(userDTO.getDtSubscription())
                .phone(userDTO.getPhone())
                .subscriptionType(subscriptionType)
                .userType(userType)
                .build();

    }
}
