package com.client.ws.apispring.service;

import com.client.ws.apispring.dto.SubscriptionTypeDTO;
import com.client.ws.apispring.model.SubscriptionType;

import java.util.List;

public interface SubscriptionTypeService {
    List<SubscriptionType> findAll();

    SubscriptionType findById(Long id);

    SubscriptionType create(SubscriptionTypeDTO subscriptionType);

    SubscriptionType update(Long id, SubscriptionTypeDTO subscriptionType);

    void delete(Long id);
}
