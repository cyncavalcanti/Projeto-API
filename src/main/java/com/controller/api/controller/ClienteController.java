package com.controller.api.controller;


import com.controller.api.model.Cliente;
import com.controller.api.repository.ClienteRepository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ClienteController {
	
	
	@Autowired
    private  ClienteRepository clienteRepository;
       
    
    @PostMapping("cadastrar/cliente")
    @ResponseBody
    public String cadastrar_cliente(@RequestParam String nome, String sobrenome,String sexo, String ddn, int idade, String cidade){
    	
    Cliente new_cliente = new Cliente(nome=nome, sobrenome=sobrenome, sexo, ddn, idade, cidade);
    clienteRepository.save(new_cliente);
    return nome + " " + sobrenome + " " + "foi cadastrado(a) com sucesso.";
    }
    
    @DeleteMapping(path = "/remover-cliente-por-id/{id}")
	
	public ResponseEntity<HttpStatus> removerClientePorID(@PathVariable("id") long id) {
    	clienteRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);	
	}
    @GetMapping("pesquisar/cliente_nome/{nome}")
    @ResponseBody
    
    public String pesquisar_pelo_nome_do_cliente(@PathVariable String nome){
        Cliente cliente = clienteRepository.findByNome(nome);
        return cliente.toString();
    }

    @GetMapping("pesquisar/cliente_id/{id}")
    @ResponseBody
    public String pesquisar_pelo_id_do_cliente(@PathVariable long id){
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.toString();
    }
    @GetMapping ("listar/clientes")
    @ResponseBody
    public List<Cliente> listar() {
	  return clienteRepository.findAll();// buscar todos os clientes
 }     
}
