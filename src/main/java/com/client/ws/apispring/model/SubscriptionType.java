package com.client.ws.apispring.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "subscriptions_type")
public class SubscriptionType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="subscriptions_type_id")
    private Long id;

    private String Nome;

    @Column(name="acess_months")
    private Long AcessMonth;

    private BigDecimal price;

    @Column(name = "product_key")
    private String productKey;

    public SubscriptionType() {
    }

    public SubscriptionType(Long id, String nome, Long acessMonth, BigDecimal price, String productKey) {
        this.id = id;
        Nome = nome;
        AcessMonth = acessMonth;
        this.price = price;
        this.productKey = productKey;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Long getAcessMonth() {
        return AcessMonth;
    }

    public void setAcessMonth(Long acessMonth) {
        AcessMonth = acessMonth;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getProductKey() {
        return productKey;
    }

    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }
}
