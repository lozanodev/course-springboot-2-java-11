package com.nomedodominio.course.config;

import com.nomedodominio.course.entities.User;
import com.nomedodominio.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

// Classe para efetuar o teste de Seeding no Banco de Dados H2

@Configuration
@Profile("test") // Necessário estar igual a do aplication.properties (
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    // Seed no Banco de Dados

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
