package com.client.ws.apispring.service.Impl;

import com.client.ws.apispring.dto.SubscriptionTypeDTO;
import com.client.ws.apispring.exception.BadRequestException;
import com.client.ws.apispring.exception.NotFoundException;
import com.client.ws.apispring.model.SubscriptionType;
import com.client.ws.apispring.repository.SubscriptionTypeRepository;
import com.client.ws.apispring.service.SubscriptionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class SubscriptionTypeServiceImpl implements SubscriptionTypeService {

    @Autowired
    private SubscriptionTypeRepository subscriptionTypeRepository;

    @Override
    public List<SubscriptionType> findAll() {
        return subscriptionTypeRepository.findAll();
    }

    @Override
    public SubscriptionType findById(Long id) {
        Optional<SubscriptionType> optionalSubscriptionType = subscriptionTypeRepository.findById(id);
        return optionalSubscriptionType.orElseThrow(() -> new NotFoundException("SubscriptionType não encontrado"));
    }

    @Override
    public SubscriptionType create(SubscriptionTypeDTO subscriptionType) {
        if (Objects.nonNull(subscriptionType.getId())) {
            throw new BadRequestException("ID deve ser nulo");
        }
        return subscriptionTypeRepository.save(SubscriptionType.builder()
                        .id(subscriptionType.getId())
                        .Nome(subscriptionType.getNome())
                        .AcessMonth(subscriptionType.getAcessMonth())
                        .price(subscriptionType.getPrice())
                        .productKey(subscriptionType.getProductKey())
                 .build());
    }

    @Override
    public SubscriptionType update(Long id, SubscriptionTypeDTO subscriptionType) {
        findById(id);

        return subscriptionTypeRepository.save(SubscriptionType.builder()
                .id(id)
                .Nome(subscriptionType.getNome())
                .AcessMonth(subscriptionType.getAcessMonth())
                .price(subscriptionType.getPrice())
                .productKey(subscriptionType.getProductKey())
                .build());
    }

    @Override
    public void delete(Long id) {
        findById(id);
        subscriptionTypeRepository.deleteById(id);
    }
}
