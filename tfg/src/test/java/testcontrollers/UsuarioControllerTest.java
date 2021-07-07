package testcontrollers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.ModuleLayer.Controller;
//import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.ui.Model;
import org.junit.jupiter.api.Test;
//import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.proyect.tfg.command.UsuarioCommand;
import com.proyecto.tfg.entities.Usuario;
import com.proyecto.tfg.web.controllers.UsuarioController;
import com.proyecto.tfg.entities.Usuario;
import com.proyecto.tfg.services.UsuarioManager;

public class UsuarioControllerTest {

    @Autowired
    private UsuarioController usuarioController;
    
    

    @Test
    public void testHandleRequestView() {
    	
    	//UsuarioCommand usuariosCommand = usuarioController.handleRequest("/usuarios");
        //assertEquals("usuariosCommand", usuariosCommand);
    }
}