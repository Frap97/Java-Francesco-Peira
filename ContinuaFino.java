// */ Scrivere un programma ContinuaFino che chiede all'utente di inserire una sequenza di
// interi. Il programma continua a chiedere all'utente di inserire valori
//  tanto che i valori inseriti soddisfano
// almeno una delle seguenti condizioni:
// - è negativo e divisibile per 2
// - è positivo e divisibile per 3
// Al termine il programma stampa la somma di tutti i valori inseriti escluso quello ha violato le condizioni.
// Risolvere questo esercizio senza usare array.
// */

import java.util.Scanner;
public class ContinuaFino {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n < 0 && n%2 == 0 || n > 0 && n%3 == 0){
                n = input.nextInt();
        }       
    }
}
