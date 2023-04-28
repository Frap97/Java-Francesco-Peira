package com.engim.verificapratica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorteggio {
    private List<Squadra> squadre = new ArrayList<>();
    private boolean daMischiare = true;
    private int nextName = 0;

    public void aggiungi(String nome, String nazione) {
        squadre.add(new Squadra(nome, nazione));
        daMischiare = true;
        nextName = 0;
    }

    public Squadra next() {
        if (daMischiare) {
            Collections.shuffle(squadre);
            daMischiare = false;
            nextName = 0;
        }
        if (nextName >= squadre.size())
            throw new IndexOutOfBoundsException("squadre finite");
        return squadre.get(nextName++);
    }


    public List<Squadra> getSquadre() {
        return squadre;
    }

    public boolean isDaMischiare() {
        return daMischiare;
    }

    public List<Partita> sorteggiaPartite() {
        List<Squadra> sq = squadre;
        int size = sq.size();
        double isLog = Math.log(size) / Math.log(2);
        if (isLog == Math.floor(isLog)) {
            throw new RuntimeException("Il numero delle squadre deve essere una potenza di 2");
        }

        List<Partita> partite = new ArrayList<>();

        while(size != 0) {
            for (int i = 0; i < squadre.size(); i=i+2) {
                for (int j = i + 1; j < squadre.size(); j++) {
                    Partita partita = new Partita(squadre.get(i), squadre.get(j));
                    partite.add(partita);
                    size--;
                }
            }
        }
        return partite;
    }
}
