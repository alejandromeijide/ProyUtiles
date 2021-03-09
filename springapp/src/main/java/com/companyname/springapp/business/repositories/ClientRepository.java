package com.companyname.springapp.business.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.companyname.springapp.business.entities.Client;

public interface ClientRepository extends CrudRepository<Client, Long>{
	
	public Client findById(Integer id);
	
	public Client findByCodigo(Integer codigo);
	
	public Client findByIdAndCodigo(Integer id, Integer codigo);
	/*
	@Query("SELECT cli FROM Client cli WHERE cli.codigo = 4")
	public List<Client> findByCodigo4();
	
	@Query("SELECT distinct cli FROM Client cli join cli.products prod WHERE prd.price > 100")
	public List<Client> findByProduct();
*/
}
