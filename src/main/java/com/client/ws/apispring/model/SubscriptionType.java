package com.client.ws.apispring.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "subscriptions_type")
public class SubscriptionType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="subscriptions_type_id")
    private Long id;

    private String Nome;

    @Column(name="access_months")
    private Long AcessMonth;

    private BigDecimal price;

    @Column(name = "product_key", unique = true)
    private String productKey;

}
