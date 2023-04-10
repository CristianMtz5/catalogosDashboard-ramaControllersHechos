package com.example.catalogosDashboard.Authentication.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.catalogosDashboard.Authentication.Entity.UsuariosEntity;
import com.example.catalogosDashboard.Authentication.Repository.UsuariosRepository;
import java.util.Optional;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT, })
@RestController
@RequestMapping("auth/Usuarios")
public class UsuariosController {

    @Autowired
    UsuariosRepository usuariosRepository;

    @GetMapping(value = "/{email}")
    public Optional<UsuariosEntity> getDataByIdUsuario(@PathVariable("email") String email) {
        return usuariosRepository.findOneByEmail(email);
    }
}


