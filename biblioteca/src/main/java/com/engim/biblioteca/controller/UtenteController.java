package com.engim.biblioteca.controller;

import com.engim.biblioteca.model.Libro;
import com.engim.biblioteca.model.Utente;
import com.engim.biblioteca.repository.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UtenteController {
    @Autowired
    UtenteRepository utenteRepository;
    @GetMapping("/addUtente")
    public String addUtente(@RequestParam(value = "nome")
                           String nome,
                           @RequestParam(value = "cognome")
                           String cognome)
    {
        Utente utente = new Utente(nome, cognome);
        utenteRepository.save(utente);
        return "Utente aggiunto correttamente al database";
    }

    @GetMapping("/getUtenti")
    public List<Utente> getUtenti(){

        return utenteRepository.findAll();
    }

    @GetMapping("/getUtenteById")
    public Utente getUtenteById(
            @RequestParam(value = "id")
            int id)
    {
        return utenteRepository.findById(id);
    }
   /*
   @GetMapping("/deleteUtenteById")
  public String deleteUtenteById(   @RequestParam(value = "id")
                                      int id){

       utenteRepository.deleteUtenteBy(id);
       return "Utente eliminato correttamente";
    }*/

}
