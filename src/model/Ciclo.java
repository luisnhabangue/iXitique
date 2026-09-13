package model;

public class Ciclo {
    private int numero;
    private Membro beneficiario;
    private double totalArrecadado;
    private Contribuicao contribuicao;

    public Ciclo(int numero, Membro beneficiario, double totalArrecadado, Contribuicao contribuicoes) {
        this.numero = numero;
        this.beneficiario = beneficiario;
        this.totalArrecadado = totalArrecadado;
        this.contribuicao = contribuicoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Membro getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Membro beneficiario) {
        this.beneficiario = beneficiario;
    }

    public double getTotalArrecadado() {
        return totalArrecadado;
    }

    public void setTotalArrecadado(double totalArrecadado) {
        this.totalArrecadado = totalArrecadado;
    }

    public Contribuicao getContribuicao() {
        return contribuicao;
    }

    public void setContribuicao(Contribuicao contribuicao) {
        this.contribuicao = contribuicao;
    }

    @Override
    public String toString() {
        return "Ciclo{" +
                "numero=" + numero +
                ", beneficiario=" + beneficiario +
                ", totalArrecadado=" + totalArrecadado +
                ", contribuicoes=" + contribuicao +
                '}';
    }
}
