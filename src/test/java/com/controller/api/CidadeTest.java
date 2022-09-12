package com.controller.api;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.controller.api.model.Cidade;
import com.controller.api.repository.CidadeRepository;


@SpringBootTest
public class CidadeTest {
	@Autowired
	CidadeRepository cidadeRepository;

	
	@Test
	void Cidade() {
	Cidade cidade = new Cidade();
	cidade.setNome("Olinda");
	cidade.setEstado("Pernambuco");
	cidadeRepository.save(cidade);
	}
	
	
	@Test
	public void listaEstados(String estado) {
	List<Cidade> list =  cidadeRepository.findAllByEstado(estado);
	assertThat(list).size().isGreaterThan(0);
		
	}
	
	
}
