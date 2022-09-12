package com.controller.api.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.controller.api.model.Cidade;

@Repository
public interface CidadeRepository extends CrudRepository<Cidade, Long> {
	
 Cidade findByNome(String nome);
 List <Cidade> findAllByEstado(String estado);
 


}

