package ifpi.edu.projeto.Models;


public class Game {
    private String[] palavras = {"banana", "onibus"};
    private String[] dicas = {"Fruta amarela longa", "Veículo coletivo"};

    private int chances = 5;

    public String[] getPalavras() {
        return palavras;
    }

    public void setPalavras(String[] palavras) {
        this.palavras = palavras;
    }

    public int getChances() {
        return chances;
    }

    public void setChances(int chances) {
        this.chances = chances;
    }

    public String[] getDicas() {
        return dicas;
    }

    public void setDicas(String[] dicas) {
        this.dicas = dicas;
    }
}
