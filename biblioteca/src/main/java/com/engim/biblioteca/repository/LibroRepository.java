package com.engim.biblioteca.repository;
import java.util.List;
import com.engim.biblioteca.model.Libro;
import org.springframework.data.repository.CrudRepository;

public interface LibroRepository extends CrudRepository<Libro, Integer> {
    Libro findById(int id);
    List<Libro> findByAutore(String autore);
    List<Libro> findAll();
}
