package com.client.ws.apispring.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="user_type")
public class UserType  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_type_id")
    private Long id;
    private String nome;
    private String description;

    public UserType() {
    }

    public UserType(Long id, String nome, String description) {
        this.id = id;
        this.nome = nome;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
