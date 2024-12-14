package ifpi.edu.projeto.Controllers;

import ifpi.edu.projeto.Models.Player;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
public class PlayerController {
    List<Player> players = new ArrayList<>();

    @GetMapping("/registro")
    public String showForm(Model model) {
        model.addAttribute("player", new Player());
        return "homepage"; // nome da view
    }

    @PostMapping("/criarJogador")
    public String salvarJogador(@ModelAttribute("player") Player player) {
        player.setData(LocalDate.now());
        player.setId(UUID.randomUUID());
        players.add(player);
        return "redirect:/jogar";
    }
}
