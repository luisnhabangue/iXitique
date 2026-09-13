package model;

public class Membro {
    private String id;
    private String nome;
    private String telefone;
    private int pontuacao;

    public Membro(String id, String nome, String telefone, int pontuacao) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.pontuacao = pontuacao;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    @Override
    public String toString() {
        return "Membro{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", pontuacao='" + pontuacao + '\'' +
                '}';
    }



}
