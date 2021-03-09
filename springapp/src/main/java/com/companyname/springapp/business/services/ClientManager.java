package com.companyname.springapp.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.companyname.springapp.business.command.ClientCommand;
import com.companyname.springapp.business.entities.Client;
import com.companyname.springapp.business.entities.Product;
import com.companyname.springapp.business.repositories.ClientRepository;

@Service
public class ClientManager {

	@Autowired
	private ClientRepository clientRepository;

	public ClientCommand clientToClientCommand(Client client) {
		ClientCommand clientCommand = new ClientCommand();
		
		clientCommand.setCodigo(client.getCodigo());
		clientCommand.setDelegacion(client.getDelegacion());
		clientCommand.setId(client.getId());
		clientCommand.setLocalidad(client.getLocalidad());
		clientCommand.setNombre(client.getNombre());
		clientCommand.setProvincia(client.getProvincia());
		
		List<Product> products = client.getProducts();
		if(products != null) {
			clientCommand.setNumProductos(products.size());
		}
		
		return clientCommand;
	}
	
	public Client buscarClientById(Integer id) {
		return clientRepository.findById(id);
	}

	public Client buscarClientByCodigo(Integer codigo) {
		return clientRepository.findByCodigo(codigo);
	}

	@Transactional
	public Client guardarClient(ClientCommand clientCommand) {
		Client client = null;
		if(clientCommand.getId() == null) {
			client = new Client();
			//int id = obtenerClients().stream().map(Client::getId).max(Integer::compare).get();
			//client.setId(++id);
		}
		else {
			client = clientRepository.findById(clientCommand.getId());
		}
		
		client.setCodigo(clientCommand.getCodigo());
		client.setDelegacion(clientCommand.getDelegacion());
		client.setLocalidad(clientCommand.getLocalidad());
		client.setNombre(clientCommand.getNombre());
		client.setProvincia(clientCommand.getProvincia());
		
		clientRepository.save(client);
		return client;
	}

	@Transactional
	public boolean eliminarClient(Client client) {
		try {
			clientRepository.delete(client);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public List<Client> obtenerClients() {
		return (List<Client>)clientRepository.findAll();
	}

}
