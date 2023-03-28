package com.engim.biblioteca.repository;
import java.util.List;
import com.engim.biblioteca.model.Libro;
import com.engim.biblioteca.model.Prestito;
import org.springframework.data.repository.CrudRepository;

public interface PrestitoRepository extends CrudRepository<Libro, Integer> {
    Prestito findById(int id);
    List<Prestito> findAll():
}
