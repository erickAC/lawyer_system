package com.apiadv.nadine_sistema.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "processo")
public class Processo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idProcesso;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate dataCriada;
    @Column(nullable = false)
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate dataEsperada;
    @Column(nullable = false)
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate dataFinalizada;

    @ManyToOne
    @JoinColumn(name = "tipo_processo")
    private TipoProcesso tipoProcesso;

    public Processo() {

    }

    public Processo(Integer idProcesso, String nome, LocalDate dataCriada, LocalDate dataEsperada, LocalDate dataFinalizada, TipoProcesso tipoProcesso ) {
        this.idProcesso = idProcesso;
        this.nome = nome;
        this.dataCriada = dataCriada;
        this.dataEsperada = dataEsperada;
        this.dataFinalizada = dataFinalizada;
        this.tipoProcesso = tipoProcesso;
    }

    public Integer getIdProcesso() {
        return idProcesso;
    }

    public void setIdProcesso(Integer idProcesso) {
        this.idProcesso = idProcesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataCriada() {
        return dataCriada;
    }

    public void setDataCriada(LocalDate dataCriada) {
        this.dataCriada = dataCriada;
    }

    public LocalDate getDataEsperada() {
        return dataEsperada;
    }

    public void setDataEsperada(LocalDate dataEsperada) {
        this.dataEsperada = dataEsperada;
    }

    public LocalDate getDataFinalizada() {
        return dataFinalizada;
    }

    public void setDataFinalizada(LocalDate dataFinalizada) {
        this.dataFinalizada = dataFinalizada;
    }

    public TipoProcesso getTipoProcesso() {
        return tipoProcesso;
    }

    public void setTipoProcesso(TipoProcesso tipoProcesso) {
        this.tipoProcesso = tipoProcesso;
    }
}
