package com.apiadv.nadine_sistema.models;

import javax.persistence.*;

@Entity
@Table(name = "tipo_processo")
public class TipoProcesso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idTipoProcesso;
    @Column(name = "nome", nullable = false)
    private String nome;

    public TipoProcesso() {    }

    public TipoProcesso(Integer idTipoProcesso, String nome) {
        this.idTipoProcesso = idTipoProcesso;
        this.nome = nome;
    }

    public Integer getIdTipoProcesso() {
        return idTipoProcesso;
    }

    public void setIdTipoProcesso(Integer idTipoProcesso) {
        this.idTipoProcesso = idTipoProcesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "TipoProcesso{" +
                "idTipoProcesso=" + idTipoProcesso +
                ", nome='" + nome + '\'' +
                '}';
    }
}
