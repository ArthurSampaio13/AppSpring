package com.client.ws.apispring.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="user_type")
public class UserType  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_type_id")
    private long id;
    private String nome;
    private String description;
}
