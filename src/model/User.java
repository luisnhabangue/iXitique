package model;

public class User {
    private long id;
    private String username;
    private String password;
    private String nome;
    private String apelido;

    public User(long id, String username, String password, String nome, String apelido) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nome = nome;
        this.apelido = apelido;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
}
