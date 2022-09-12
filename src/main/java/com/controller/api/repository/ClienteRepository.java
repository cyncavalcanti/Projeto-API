package com.controller.api.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.controller.api.model.Cliente;

import java.util.List;
import java.util.Optional;
import java.util.function.IntPredicate;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>{
	
    Cliente findByNome(String nome);
    Cliente findByid (long id);
    List<Cliente> findAll();
	

	

	

	
}