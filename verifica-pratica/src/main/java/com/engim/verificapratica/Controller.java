package com.engim.verificapratica;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    private static Sorteggio sorteggio = new Sorteggio();


    /*
    * ES 1: get ("/add?nome=n&nazione=m") che aggiunge al sorteggio una squadra con nome n e nazione m (utilizzare
    * la classe Sorteggio) - 15 p
    *
    * ES 2: get ("/listaSquadre?nazione=n") che restituisce la lista delle squadre di nazione n - 20 p
    *
    * ES 3: get ("/sorteggia") che restituisce 2 squadre di nazioni diverse (utilizzare la classe Sorteggio, il metodo
    * next. Consiglio: dopo aver sorteggiato la prima, continuare a sorteggiare finché la seconda
    * non è di una nazione diversa) - 20 p
    *
    * ES 4: implementare il sorteggio delle squadre di una fase finale di un torneo a eliminazione diretta.
    * Creare il metodo sorteggiaPartite che:
    * - controlla se il numero di squadre aggiunte è una potenza di 2. Se non lo è lancia una RuntimeException.
    * - Finché ci sono squadre non sorteggiate: sorteggia 2 squadre e le inserisce in un oggetto della classe Partita (da creare)
    * - restituisce la lista di Partite.
    * creare get ("/getPartite") che restituisce la lista appena creata - 30 p
    * */
    @GetMapping("/add")
    public String addSquadra(@RequestParam("nome") String nome, @RequestParam("nazione") String nazione){
        if(nome != "" && nazione != "") {
            sorteggio.aggiungi(nome, nazione);
            return "squadra aggiunta con successo";
        }else{
            return "Inserisci nome e nazione della squadra";
        }
    }
    @GetMapping("/listasquadre")
    public List<String> listaSquadre(@RequestParam("n")String n){
        List<String> squadreNazionalita = new ArrayList<>();
        List<Squadra> squadre = sorteggio.getSquadre();
        for(Squadra squadra : squadre){
            String nazione = squadra.getNazione();
            if(nazione == n){
                squadreNazionalita.add(n);
            }
        }
        return squadreNazionalita;
    }
    @GetMapping("/sorteggia")
    public List <String> sorteggia(){
        List<Partita> partite = new ArrayList<>();
        List<Squadra> squadre = sorteggio.getSquadre();
        List<String> squadreSorteggiate = new ArrayList<>();
         for (int i = 0; i < squadre.size(); i++) {
            String temp = squadre.get(i).getNome();
            if(!squadreSorteggiate.contains(temp) && squadreSorteggiate.size() < 3) {
                squadreSorteggiate.add(temp);
            }
         }
        return squadreSorteggiate;
    }

    @GetMapping("/getPartite")
    public List<Partita> getPartite(){
        return sorteggio.sorteggiaPartite();
    }
}
