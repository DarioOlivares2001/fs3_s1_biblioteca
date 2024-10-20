package com.biblioteca.mibiblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.biblioteca.mibiblioteca.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long> {
}