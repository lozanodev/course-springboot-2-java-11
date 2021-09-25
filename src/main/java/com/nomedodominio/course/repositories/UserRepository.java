package com.nomedodominio.course.repositories;

import com.nomedodominio.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

// Classe Mapeamento Objeto Relacional

public interface UserRepository extends JpaRepository<User, Long> {

}
