package com.engim.biblioteca.controller;
import com.engim.biblioteca.repository.LibroRepository;
import com.engim.biblioteca.repository.UtenteRepository;
import com.engim.biblioteca.repository.PrestitoRepository;
import com.engim.biblioteca.model.Libro;
import com.engim.biblioteca.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BibliotecaController {
    @Autowired
    LibroRepository libroRepository;
    @GetMapping("/addLibro")
    public String addLibro(@RequestParam(value = "titolo")
                               String titolo,
                           @RequestParam(value = "autore")
                           String autore)
    {
    Libro libro = new Libro(titolo, autore);
    libroRepository.save(libro);
        return "Libro aggiunto correttamente al database";
    }
    @GetMapping("/getLibri")
    public List<Libro> getLibri(){
        return libroRepository.findAll();
    }
    @GetMapping("/getLibroById")
    public Libro getLibroById(
            @RequestParam(value = "id")
            int id)
    {
        return libroRepository.findById(id);
    }

}
