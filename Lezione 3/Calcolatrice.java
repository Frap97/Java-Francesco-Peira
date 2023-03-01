/**
 * @author Francesco Peira
 *  In questa classe andremo ad implementare le funzionalità di una calcolatrice classica,
 *  cioè possiede le quattro operazioni fondamentali:
 *  1. Addizione
 *  2. Sottrazione
 *  3. Moltiplicazione
 *  4. Divisione
 *
 */

import java.util.Scanner;
public class Calcolatrice {
    public static void main(String[] args) {
        //dichiaro variabili
        int num1;
        int num2;
        //creo una variabile Scanner per effettuare la valorizzazione delle variabili
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il primo numero");
        num1 = input.nextInt();
        System.out.println("Inserisci il secondo numero");
        num2 = input.nextInt();
        //faccio l'operazione
        int risultatoSomma = num1 + num2;
        System.out.println(risultatoSomma);
    } //end main
} //end Calcolatrice class