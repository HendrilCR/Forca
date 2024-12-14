package ifpi.edu.projeto.Services;
import ifpi.edu.projeto.Models.Game;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.random.RandomGenerator;

@Service
public class GameService {
    Game game = new Game();
    private String palavraDesconhecida;
    private String palavraCorreta;
    private String dica;
    private int pontosAtuais;

    public int getChances(){
        return game.getChances();
    }

    public void setChances(int chance){
        game.setChances(chance);
    }

    public String getDica(){
        return dica;
    }

    public String getPalavraDesconhecida() {
        return palavraDesconhecida;
    }

    public void setPalavraDesconhecida(String palavraDesconhecida) {
        this.palavraDesconhecida = palavraDesconhecida;
    }

    public void gerarPalavra() {
        int randomInt = RandomGenerator.getDefault().nextInt(game.getPalavras().length);
        palavraCorreta = game.getPalavras()[randomInt];

        palavraDesconhecida = palavraCorreta.replaceAll(".","_");
        dica = game.getDicas()[randomInt];
        setChances(5);

        System.out.println(palavraCorreta);
    }


    public void chutar(char chute){
        int perdeChances = 1;

        chute = Character.toLowerCase(chute);
        char[] letrasArray = getPalavraDesconhecida().toCharArray();

        //Deixa minusculo pra evitar letras maiusculas '-'


        //Mostra onde achou a letra
        for (int i = 0; i < palavraCorreta.length(); i++) {
            char letra = palavraCorreta.charAt(i);

            if (letra == chute){
                letrasArray[i] = chute;
                perdeChances = 0;
            }

        }

        System.out.println(String.valueOf(letrasArray));
        setPalavraDesconhecida(String.valueOf(letrasArray));

        //Se errar perde uma vida
        setChances(getChances()-perdeChances);
    }

    public String testar(){
        if (getChances() <= 0){
            return "paginaDerrota";
        }
        if(palavraDesconhecida.equals(palavraCorreta)){
            pontosAtuais+=10;
            return "paginaVitoria";
        }
        return "tela-jogo";
    }

}




