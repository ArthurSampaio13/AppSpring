package com.client.ws.apispring.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="users_id")
    private Long id;

    private String Nome;

    private String email;

    private String cpf;

    @Column(name="dt_subscription")
    private LocalDate dtSubscription = LocalDate.now();

    @Column(unique = true)
    private String phone;

    @Column(name="dt_expiration")
    private LocalDate dtExperiration;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_type_id")
    private UserType userType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="subscriptions_type_id")
    private SubscriptionType subscriptionType;
}
