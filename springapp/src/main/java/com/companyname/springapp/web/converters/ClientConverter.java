package com.companyname.springapp.web.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.companyname.springapp.business.entities.Client;
import com.companyname.springapp.business.repositories.ClientRepository;

@Component
public class ClientConverter implements Converter<String, Client>  {

	@Autowired
	ClientRepository clientRepository;
	
	@Override
	public Client convert(String idString) {
		Integer idInt = Integer.parseInt(idString);
		// Buscamos el cliente con ese id
		try {
			Client client = clientRepository.findById(idInt);
			return client;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
