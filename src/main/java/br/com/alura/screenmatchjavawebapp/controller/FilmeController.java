package br.com.alura.screenmatchjavawebapp.controller;
import br.com.alura.screenmatchjavawebapp.domain.filme.DadosCadastroFilme;
import br.com.alura.screenmatchjavawebapp.domain.filme.Filme;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/filmes")
public class FilmeController {
    private List<Filme> filmes = new ArrayList<>();

    @GetMapping("/formulario")
    public String carregaPaginaFormulario() {
        return "filmes/formulario";
    }

    @PostMapping
    public String cadastraFilme(DadosCadastroFilme dados) {
        var filme = new Filme(dados);
        this.filmes.add(filme);
        return "filmes/formulario";
    }

    @GetMapping("/listagem")
    public String carregaPaginaListagem(Model model) {
        model.addAttribute("lista", filmes);
        return "filmes/listagem";
    }
}
