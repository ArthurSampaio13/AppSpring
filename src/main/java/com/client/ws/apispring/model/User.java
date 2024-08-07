package com.client.ws.apispring.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name="users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="users_id")
    private Long id;

    private String Nome;
    private String email;
    private String cpf;

    @Column(name="dt_subscription")
    private LocalDate dtSubscription = LocalDate.now();

    @Column(name="dt_experiration")
    private LocalDate dtExperiration;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_type_id")
    private UserType userType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="subscriptions_type_id")
    private SubscriptionType subscriptionType;

    public User() {
    }

    public User(Long id, String nome, String email, String cpf, LocalDate dtSubscription, LocalDate dtExperiration, UserType userType, SubscriptionType subscriptionType) {
        this.id = id;
        Nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dtSubscription = dtSubscription;
        this.dtExperiration = dtExperiration;
        this.userType = userType;
        this.subscriptionType = subscriptionType;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDtSubscription() {
        return dtSubscription;
    }

    public void setDtSubscription(LocalDate dtSubscription) {
        this.dtSubscription = dtSubscription;
    }

    public LocalDate getDtExperiration() {
        return dtExperiration;
    }

    public void setDtExperiration(LocalDate dtExperiration) {
        this.dtExperiration = dtExperiration;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public SubscriptionType getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(SubscriptionType subscriptionType) {
        this.subscriptionType = subscriptionType;
    }
}
