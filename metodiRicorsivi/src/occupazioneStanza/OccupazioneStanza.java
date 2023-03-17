package occupazioneStanza;
/**ES 6 P 450: Si crei la classe OccupazioneStanza che può essere usata per memorizzare il numero di persone presenti
 * in una stanza di un edificio. Questa classe presenta i seguenti attributi:
 ♦ personeNellaStanza — numero di persone nella stanza;
 ♦ numeroTotale - variabile statica che indica il numero totale di persone in tutte le stanze.
 La classe deve presentare i seguenti metodi:
 ♦ aggiungiUnoAllaStanza : aggiunge una persona alla stanza e incrementa il valore di numeroTotale;
 ♦ rimuoviUnoDallaStanza : rimuove una persona dalla stanza, assicurandosi che numeroNellaStanza non diventi minore di 0 e decrementa il valore di numeroTotale come richiesto;
 ♦ getNumero - restituisce il numero di perone nella stanza;
 ♦ getTotale - metodo statico che restituisce il numero di persone totali.
 creare un main per collaudare la classe sopra

 */
public class OccupazioneStanza {
    private int personeNellaStanza;
    private static int numeroTotale;

    public void aggiungiPersonaAllaStanza(){
        personeNellaStanza++ ;
            numeroTotale++;
    }
    public void rimuoviPersonaAllaStanza(){
        if(numeroTotale < 0) {
            personeNellaStanza--;
            numeroTotale--;
        }else{
            System.out.println("Stanza vuota!");
        }

    }
    public int getPersone(){
        return personeNellaStanza;
    }
    public static int getTotale(){
        return numeroTotale;
    }

    @Override
    public String toString() {
        return "personeNellaStanza=" + personeNellaStanza;

    }
}

