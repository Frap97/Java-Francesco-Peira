package com.engim.biblioteca.repository;
import java.util.List;
import com.engim.biblioteca.model.Utente;
import org.springframework.data.repository.CrudRepository;

public interface UtenteRepository extends CrudRepository<Utente, Integer> {
    Utente findById(int id);
    List<Utente> findByNome(String nome);
    List<Utente> findByCognome(String cognome);
    List<Utente> findAll();
  /*  List<Utente> deleteUtenteBy(int id);*/
}
