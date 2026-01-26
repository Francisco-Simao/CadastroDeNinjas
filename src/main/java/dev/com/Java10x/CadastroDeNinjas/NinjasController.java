package dev.com.Java10x.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjasController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Hello Word , esta minha primeiras mensagem da rota";
    }
}
