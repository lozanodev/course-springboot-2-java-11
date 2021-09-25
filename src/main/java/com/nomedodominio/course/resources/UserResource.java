package com.nomedodominio.course.resources;

import com.nomedodominio.course.entities.User;
import com.nomedodominio.course.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Classe Controller do Programa

@RestController
@RequestMapping("/users")
public class UserResource {

    // Get básico com instanciamento de User
    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){ // Response Entity é um método padrão do Springboot
        // Junto do parametro "FindAll()" que é utilizado para encontrar todos os usuários.
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list); // Retornar se encontrar algo.
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
