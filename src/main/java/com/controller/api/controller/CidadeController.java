package com.controller.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.controller.api.model.Cidade;

import com.controller.api.repository.CidadeRepository;
@Controller
public class CidadeController {
	    @Autowired
	    private  CidadeRepository cidadeRepository;
	
        @ResponseBody
	    @GetMapping("listar/cidades")
	    public Iterable<Cidade> listarCidade() {
	    return cidadeRepository.findAll();// buscar todos os cidades
	    } 
     
	    @PostMapping ("cadastrar/cidade")
	    @ResponseBody
	    public String cadastrar_cidade(@RequestParam String nome, String estado){
	    Cidade new_cidade = new Cidade(nome=nome, estado=estado);
	    cidadeRepository.save(new_cidade);
	    return "O cidade e estado " + nome + ","+ estado + " foi adicionado ao banco de dados.";
	    }
	
	    @GetMapping("pesquisar/cidade_nome/{nome}")
	    @ResponseBody
	    public String pesquisar_pelo_nome_da_cidade(@PathVariable String nome){
	    Cidade cidade = cidadeRepository.findByNome(nome);
	    return cidade.toString();
	    }

	    @GetMapping("pesquisar/cidade_estado/{estado}")
	    @ResponseBody
	    public String pesquisar_pelo_estado_da_cidade(@PathVariable String estado){
	    List <Cidade> cidade = cidadeRepository.findAllByEstado(estado);
	    return cidade.toString();
	    }
}
