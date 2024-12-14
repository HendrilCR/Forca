package ifpi.edu.projeto.Models;

public class Palavra {
    private int id;
    private String nome;
    private String nomeCheck;
    private String dica;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeCheck() {
        return nomeCheck;
    }

    public void setNomeCheck(String nomeCheck) {
        this.nomeCheck = nomeCheck;
    }

    public String getDica() {
        return dica;
    }

    public void setDica(String dica) {
        this.dica = dica;
    }
}
