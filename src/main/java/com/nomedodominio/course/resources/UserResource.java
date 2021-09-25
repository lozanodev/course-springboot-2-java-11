package com.nomedodominio.course.resources;

import com.nomedodominio.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Classe Controller do Programa

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    // Get básico com instanciamento de User

    @GetMapping
    public ResponseEntity<User> findAll(){ // Response Entity é uma classe padrão do Springboot
        // Junto do parametro "FindAll()" que é utilizado para encontrar todos os usuários.
        User u = new User(1L,"Maria","Maria@Gmail.com","888888","12345");
        return ResponseEntity.ok().body(u); // Retornar se encontrar algo.
    }
}
