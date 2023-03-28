package com.engim.biblioteca.controller;
import com.engim.biblioteca.model.Libro;
import com.engim.biblioteca.model.Prestito;
import com.engim.biblioteca.model.Utente;
import com.engim.biblioteca.repository.LibroRepository;
import com.engim.biblioteca.repository.PrestitoRepository;
import com.engim.biblioteca.repository.UtenteRepository;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PrestitoController {
    UtenteRepository utenteRepository;
    LibroRepository libroRepository;
    PrestitoRepository prestitoRepository;
    public String addPrestito(@RequestParam(value = "idUtente")
                              int idUtente,
                              @RequestParam(value = "idLibro")
                              int idLibro) {

        Utente u = utenteRepository.findById(idUtente);
        Libro l = libroRepository.findById(idLibro);
        Prestito p = new Prestito(u, l);
        prestitoRepository.save(p);
    }
}
