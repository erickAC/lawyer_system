package com.apiadv.nadine_sistema.models;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idUsuario;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String email;
    @Column(length = 11, nullable = false)
    private String cpf;

    public Usuario() {

    }

    public Usuario(Integer idUsuario, String nome, String email, String cpf) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
}
