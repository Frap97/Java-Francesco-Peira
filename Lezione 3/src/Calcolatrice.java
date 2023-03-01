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
import java.lang.Math;
import java.sql.SQLOutput;
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

        //effettuo la somma e la stampo
        int risultatoSomma = num1 + num2;
        System.out.println("Il risultato della somma è " + risultatoSomma);

        //controllo che i date superino le verifiche necessarie per la divisione, in caso positivo, effettuo la divisione
        if (num2 != 0){
            double risultatoDivisione = num1 / (double) num2;
            System.out.println("Il risultato della divisione è " + risultatoDivisione);
        }else
            System.out.println("Non è possible dividere per zero");

        // effettuo sottrazione e moltiplicazione e stampo i risultati
        int risultatoSottrazione = num1 - num2;
        int risultatoMoltiplicazione = num1 * num2;
        System.out.println("Il risultato della sottrazione è " + risultatoSottrazione);
        System.out.println("Il risultato della moltiplicazione è " + risultatoMoltiplicazione);

        //converto i numeri in radianti per calcolare funzioni trigonometriche
        double num1Radiant = Math.toRadians(num1);
        double num2Radiant = Math.toRadians(num2);

        //calcolo le funzioni
        double cosenoNum1 = Math.cos(num1Radiant);
        double cosenoNum2 = Math.cos(num2Radiant);
        double sinNum1 = Math.sin(num1Radiant);
        double sinNum2 = Math.sin(num2Radiant);

        //controllo che non ci siano numeri negativi prima di calcolare la radice
        if(num1 >= 0) {
            double sqrtNum1 = Math.sqrt((double) num1);
            System.out.println("La radice quadrata del primo numero è " + sqrtNum1);
        }else
            System.out.println("Non è possibile fare la radice quadrata di un numero negativo");

        if(num2 >= 0) {
            double sqrtNum2 = Math.sqrt((double)num2);
            System.out.println("La radice quadrata del primo numero è " + sqrtNum2);
        }else
            System.out.println("Non è possibile fare la radice quadrata di un numero negativo");



        //stampo i risultati
        System.out.println("Il coseno del primo numero è " + cosenoNum1);
        System.out.println("Il coseno del secondo numero è " + cosenoNum2);
        System.out.println("Il seno del primo numero è " + sinNum1);
        System.out.println("Il seno del secondo numero è " + sinNum2);

    } //end main
} //end Calcolatrice class





















