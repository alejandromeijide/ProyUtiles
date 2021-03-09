package com.companyname.springapp.web.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.companyname.springapp.business.command.ClientCommand;
import com.companyname.springapp.business.entities.Client;
import com.companyname.springapp.business.services.ClientManager;


@Component
public class ClienteValidator implements Validator {

	@Autowired private ClientManager clientManager;
	
	@Override
	public boolean supports(Class<?> clazz) {
		return ClientCommand.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ClientCommand command = (ClientCommand) target;

		Integer id = command.getId();

		if (StringUtils.isEmpty(id) == true) {
			Integer codigo = command.getCodigo();
			Client clienteBusqueda = clientManager.buscarClientByCodigo(codigo);
			if (clienteBusqueda != null) {
				errors.rejectValue("codigo", "codigo", "El codigo ya existe");
			}
		}

	}

}
