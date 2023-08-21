package br.com.alura.screenmatchjavawebapp.controller;
import br.com.alura.screenmatchjavawebapp.domain.filme.DadosCadastroFilme;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/filmes")
public class FilmeController {
    @GetMapping
    public String carregaPaginaFormulario() {
        return "filmes/formulario";
    }

    @PostMapping
    public String cadastraFilme(DadosCadastroFilme dados) {
        System.out.println(dados);
        return "filmes/formulario";
    }
}
