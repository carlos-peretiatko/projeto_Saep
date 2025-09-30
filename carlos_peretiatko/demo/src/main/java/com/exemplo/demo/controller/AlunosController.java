package com.exemplo.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;


@Controller
public class AlunosController {

    @GetMapping("/alunos")
    public String listaProdutos(Model model) {
        //cria uma lista de produtos
        List<String> listaAlunos = Arrays.asList("André", "Carlos", "Rafael", "João");

        //add a lista ao moelo 
        model.addAttribute("alunos", listaAlunos);
        return "alunos";
    }
}
