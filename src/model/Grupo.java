package model;

import java.time.LocalDate;

public class Grupo {
    private String id;
    private String nome;
    private double valorMensal;
    private LocalDate dataInicio;
    private boolean estado;


    public Grupo(String id, String nome, double valorMensal, LocalDate dataInicio, boolean estado) {
        this.id = id;
        this.nome = nome;
        this.valorMensal = valorMensal;
        this.dataInicio = dataInicio;
        this.estado = estado;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(double valorMensal) {
        this.valorMensal = valorMensal;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", valorMensal=" + valorMensal +
                ", dataInicio=" + dataInicio +
                ", estado=" + estado +
                '}';
    }
}
