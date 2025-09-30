package com.empresa.cadastro.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;


@Controller
public class ProdutosController {

    @GetMapping("/produtos")
    public String listaProdutos(Model model) {
        //cria uma lista de produtos
        List<String> listaProdutos = Arrays.asList("Mouse", "Teclado", "Camera", "Monitor");

        //add a lista ao moelo 
        model.addAttribute("produtos", listaProdutos);
        return "produtos";
    }
}
