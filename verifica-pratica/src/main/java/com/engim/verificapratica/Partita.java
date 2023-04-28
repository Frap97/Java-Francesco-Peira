package com.engim.verificapratica;

import java.util.Map;

public class Partita {
    Squadra squadraCasa;
    Squadra trasferta;

    public Partita(Squadra squadraCasa, Squadra trasferta) {
        this.squadraCasa = squadraCasa;
        this.trasferta = trasferta;
    }
    public Partita() {
        this.squadraCasa = squadraCasa;
        this.trasferta = trasferta;
    }


    public Squadra getSquadraCasa() {
        return squadraCasa;
    }

    public void setSquadraCasa(Squadra squadraCasa) {
        this.squadraCasa = squadraCasa;
    }

    public Squadra getTrasferta() {
        return trasferta;
    }

    public void setTrasferta(Squadra trasferta) {
        this.trasferta = trasferta;
    }
}
