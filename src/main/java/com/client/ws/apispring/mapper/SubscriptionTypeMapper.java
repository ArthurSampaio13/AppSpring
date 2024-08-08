package com.client.ws.apispring.mapper;

import com.client.ws.apispring.dto.SubscriptionTypeDTO;
import com.client.ws.apispring.model.SubscriptionType;

public class SubscriptionTypeMapper {

    public static SubscriptionType fromDtoToEntity(SubscriptionTypeDTO subscriptionType) {
        return SubscriptionType.builder()
                .id(subscriptionType.getId())
                .Nome(subscriptionType.getNome())
                .AcessMonth(subscriptionType.getAcessMonth())
                .price(subscriptionType.getPrice())
                .productKey(subscriptionType.getProductKey())
                .build();
    }
}
