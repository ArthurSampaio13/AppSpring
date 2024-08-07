package com.client.ws.apispring.repository;

import com.client.ws.apispring.model.SubscriptionType;
import com.client.ws.apispring.model.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionTypeRepository extends JpaRepository<SubscriptionType, Long> {
}