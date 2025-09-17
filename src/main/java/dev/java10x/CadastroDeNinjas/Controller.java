package dev.java10x.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/welcome")
    public String boasVindas() {
        return "Esta é a minha primeira mensagem nesta rota";
    }

    @GetMapping("/")
    public String homePage(){
        return "Esta é a homePage";
    }
}
