package model;

import java.time.LocalDate;

public class Contribuicao {
    private String id;
    private Membro membro;
    private Grupo grupo;
    private double valor;
    private LocalDate dataPagamento;
    private FormaPagamento formaPagamento;
    private Estado estado;


    public Contribuicao(String id, Membro membro, Grupo grupo, double valor, LocalDate dataPagamento, FormaPagamento formaPagamento, Estado estado) {
        this.id = id;
        this.membro = membro;
        this.grupo = grupo;
        this.valor = valor;
        this.dataPagamento = dataPagamento;
        this.formaPagamento = formaPagamento;
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Membro getMembro() {
        return membro;
    }

    public void setMembro(Membro membro) {
        this.membro = membro;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Contribuicao{" +
                "id='" + id + '\'' +
                ", membro=" + membro +
                ", grupo=" + grupo +
                ", valor=" + valor +
                ", dataPagamento=" + dataPagamento +
                ", formaPagamento=" + formaPagamento +
                ", estado=" + estado +
                '}';
    }
}
