package model;

import java.time.LocalDate;

public class Recebimento {
    private String id;
    private Grupo grupo;
    private Membro membro;
    private double valorRecebido;
    private LocalDate dataRecebimento;
    private Estado estadoRecebimento;

    public Recebimento(String id, Grupo grupo, Membro membro, double valorRecebido, LocalDate dataRecebimento, Estado estadoRecebimento) {
        this.id = id;
        this.grupo = grupo;
        this.membro = membro;
        this.valorRecebido = valorRecebido;
        this.dataRecebimento = dataRecebimento;
        this.estadoRecebimento = estadoRecebimento;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Membro getMembro() {
        return membro;
    }

    public void setMembro(Membro membro) {
        this.membro = membro;
    }

    public double getValorRecebido() {
        return valorRecebido;
    }

    public void setValorRecebido(double valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    public LocalDate getDataRecebimento() {
        return dataRecebimento;
    }

    public void setDataRecebimento(LocalDate dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    }

    public Estado getEstadoRecebimento() {
        return estadoRecebimento;
    }

    public void setEstadoRecebimento(Estado estadoRecebimento) {
        this.estadoRecebimento = estadoRecebimento;
    }

    @Override
    public String toString() {
        return "Recebimento{" +
                "id='" + id + '\'' +
                ", grupo=" + grupo +
                ", membro=" + membro +
                ", valorRecebido=" + valorRecebido +
                ", dataRecebimento=" + dataRecebimento +
                ", estadoRecebimento=" + estadoRecebimento +
                '}';
    }
}
