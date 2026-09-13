package model;

import java.time.LocalDate;

public class Notificacao {
    private String id;
    private Membro membro;
    private TipoMensagem tipoMensagem;
    private String mensagem;
    private LocalDate data;
    private boolean lida;

    public Notificacao(String id, Membro membro, TipoMensagem tipoMensagem, String mensagem, LocalDate data, boolean lida) {
        this.id = id;
        this.membro = membro;
        this.tipoMensagem = tipoMensagem;
        this.mensagem = mensagem;
        this.data = data;
        this.lida = lida;
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

    public TipoMensagem getTipoMensagem() {
        return tipoMensagem;
    }

    public void setTipoMensagem(TipoMensagem tipoMensagem) {
        this.tipoMensagem = tipoMensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public boolean isLida() {
        return lida;
    }

    public void setLida(boolean lida) {
        this.lida = lida;
    }

    @Override
    public String toString() {
        return "Notificacao{" +
                "id='" + id + '\'' +
                ", membro=" + membro +
                ", tipoMensagem=" + tipoMensagem +
                ", mensagem='" + mensagem + '\'' +
                ", data=" + data +
                ", lida=" + lida +
                '}';
    }
}
