package com.engim.biblioteca.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Libro {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String titolo;
    private String autore;

    private Stato stato;

    enum Stato {
        DISPONIBILE, IN_PRESTITO
    }

    public Libro() {
    }


    public Libro(String titolo, String autore) {
        this.titolo = titolo;
        this.autore = autore;
        this.stato = Stato.DISPONIBILE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", stato=" + stato +
                '}';
    }
}
