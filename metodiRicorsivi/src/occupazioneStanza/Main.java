package occupazioneStanza;

public class Main {
    public static void main(String[] args) {
        OccupazioneStanza stanza1 = new OccupazioneStanza();
        stanza1.aggiungiPersonaAllaStanza();
        stanza1.aggiungiPersonaAllaStanza();
        stanza1.aggiungiPersonaAllaStanza();
        stanza1.rimuoviPersonaAllaStanza();
        System.out.println(OccupazioneStanza.getTotale());
    }
}
