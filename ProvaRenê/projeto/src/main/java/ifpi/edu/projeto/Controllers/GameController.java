package ifpi.edu.projeto.Controllers;

import ifpi.edu.projeto.Models.Game;
import ifpi.edu.projeto.Services.GameService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GameController {
    GameService gameService= new GameService();

    @GetMapping("/")
    public String home(){
        return "redirect:/registro";
    }

    @GetMapping("/jogar")
    public String game(Model model){
        gameService.gerarPalavra();
        model.addAttribute("chances", gameService.getChances());
        model.addAttribute("dica", gameService.getDica());
        model.addAttribute("palavra", gameService.getPalavraDesconhecida());
        model.addAttribute("nletras", gameService.getPalavraDesconhecida().length());
        return "tela-jogo";
    }

    @PostMapping("/chutar")
    public String chutar(@RequestParam("chute") char chute, Model model){
        gameService.chutar(chute);
        model.addAttribute("dica", gameService.getDica());
        model.addAttribute("chances", gameService.getChances());
        model.addAttribute("palavra", gameService.getPalavraDesconhecida());
        model.addAttribute("nletras", gameService.getPalavraDesconhecida().length());

        return gameService.testar();
    }

}
