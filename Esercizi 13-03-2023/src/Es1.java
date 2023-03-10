/* ES1 (tutti, 15 minuti): Si scriva un algoritmo per un semplice gioco che chieda
        di indovinare un codice numerico di cinque cifre. Quando l'utente scrive la risposta,
        il programma restituisce due valori: il numero di cifre al posto giusto e la somma di queste cifre.
        Per esempio, se il codice segreto è 53840 e l'utente ipotizza 83241, le cifre 3 e 4 sono al posto giusto.
        Il programma restituisce in output i numeri 2 (cifre corrette) e 7 (somma). Si permetta all'utente di provare per 10 volte.
        (per il confronto utilizzare in un ciclo substring oppure charAt)
*/

import java.util.Scanner;
import java.util.Random;
public class Es1 {
    //gen() spudoratamente copiata da StackOverflow (genera un numero tra 10000 e 99999)
    public static int gen() {
        Random r = new Random( System.currentTimeMillis() );
        return 10000 + r.nextInt(99999);
    }
    //metodo per controllare che i numeri digitati siano effettivamente 5
    public static boolean checkDigits(int t){
        int length = String.valueOf(t).length();
        boolean check = true;
        check = length == 5;
            return check;
    }
    //Contatore delle cifre corrette
    public static int cifreCorrette(int t, String numero){
        int cont = 0;
        String tStr = String.valueOf(t);
        for (int i = 0; i < numero.length(); i++){
            if(numero.charAt(i) == (tStr.charAt(i))){
                cont++;
            }
        }
    return cont;
    }
    //somma delle cifre corrette
    public static int sommaCifreCorrette(int t, String numero){
            int sum = 0;

            String tStr = String.valueOf(t);
            for (int i = 0; i < numero.length(); i++){
                if(numero.charAt(i) == (tStr.charAt(i))){
                    int num = (int)numero.charAt(i) - (int)'0';
                    sum += num;
                }
                }
        return sum;
        }


    //main
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String numero = String.valueOf(gen());

    //soluzione, attivare per debug e controlli
    // System.out.println(numero);
    System.out.println("Ciao! Sto pensando ad un numero di 5 cifre, prova ad indovinarlo!");

    //booleani per i due do while (controllo cifre, proseguimento programma)
    boolean run = true;
    boolean check;

    //contatore tentativi
    int cont = 1;

    //tentativo
    int t;
    do{
        System.out.println("Tentativo " + cont + ":");

        do {
            System.out.println("Inserisci un numero di 5 cifre. Tentativo " + cont);
            //input di testo e controllo che sia di 5 cifre
            t = input.nextInt();
            check = checkDigits(t);

            //debug/controllo
            //System.out.println(check);

        }while(check == false);

        // fine del programma se si indovina il numero
        if(t == Integer.parseInt(numero)) {
            System.out.println("Hai vinto!");
            System.exit (0);
        }

        System.out.println(cifreCorrette(t, numero));
        System.out.println(sommaCifreCorrette(t,numero));
        cont++;
        if(cont == 10) {
            System.out.println("Tentativi finiti!");
            run = false;
        }
    }while(run);

  }//end main
}
