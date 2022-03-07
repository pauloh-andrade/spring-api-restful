package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@Controller
public class TopicosController {
    //definindo mapeamento do  request
    @RequestMapping("/topicos")
    //Indicando que os response será enviado no body
    @ResponseBody
    public List<Topico> lista(){
        Topico topico = new Topico("Dúvida", "Dúvida com Spring", new Curso("SpringBoot", "Programação"));
        return Arrays.asList(topico, topico, topico);
    }
}