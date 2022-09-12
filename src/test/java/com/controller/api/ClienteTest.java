package com.controller.api;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.controller.api.model.Cliente;
import com.controller.api.repository.ClienteRepository;

@SpringBootTest
public class ClienteTest {

	@Autowired
	ClienteRepository clienteRepository;
	
	//Teste cadastro cliente
	@Test
	void Cliente() {
		Cliente cliente = new Cliente();
		cliente.setNome("Marvel");
		cliente.setSobrenome("Cavalcanti");
		cliente.setSexo("M");
		cliente.setDdn("12/09/1990");
		cliente.setIdade(30);
		cliente.setCidade("Paulista");
		clienteRepository.save(cliente);
	}
	@Test
	public void listaCliente() {
		
		List<Cliente> list = clienteRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
		
	}
	//Vai testar o nome que estiver na posição  do id1 
	@Test
	public void clienteId() {
		Cliente cliente = clienteRepository.findByid(3);
		assertEquals("Jurema", cliente.getNome());// faz a comparação do nome que está no id
	}
	
		

}
