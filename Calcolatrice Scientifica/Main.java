
/**
 * @author Francesco Peira
 *  In questa classe andremo ad implementare le funzionalità di una calcolatrice classica e scietifica.
 *  Le operazioni possibili saranno:
 *  1. Addizione
 *  2. Sottrazione
 *  3. Moltiplicazione
 *  4. Divisione
 *  5. Y è un multiplo di X?
 *  6. Coseno
 *  7. Seno
 *  8. Radice quadrata
 *  9. Logaritmo in base 10
 *  10. X è multplo di(2, 3, 4, 5)?
 * 
 */
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        // variabile boolean che interrompe il programma se richiesto
        boolean run = true;

        // ciclo per proeguire il programma
        while (run) {

            Scanner input = new Scanner(System.in);

            // Divido le calcolatrici in base agli input che dovrò ricevere
            System.out.println("1 - Calcolatrice\n" +
                    "2 - Calcolatrice Scientifica");
            int TypeCalc = input.nextInt();

            // input numerico e scelta dell'operazione
            if (TypeCalc == 1) {
                System.out.print(
                        "Scegli l'operazione:\n" +
                                "1 - Addizione\n" +
                                "2 - Sottrazione\n" +
                                "3 - Moltiplicazione\n" +
                                "4 - Divisione\n" +
                                "5 - Y è un multiplo di X?\n");

                int operator = input.nextInt();
                System.out.println("Inserisci il primo numero");
                int number1 = input.nextInt();
                System.out.println("Inserisci il secondo numero");
                int number2 = input.nextInt();

                // richiamo del metodo per efettuare l'operazione
                // stampare il risultato
                switch (operator) {
                    case 1:
                        System.out.println(addizione(number1, number2));
                        break;
                    case 2:
                        System.out.println(sottrazione(number1, number2));
                        break;
                    case 3:
                        System.out.println(moltiplicazione(number1, number2));
                        break;
                    // controllo la possibilità di eseguire l'operazione fuori dal metodo, se diverso da zero stampo il risultato, altrimenti un messaggio d'errore
                    case 4:
                        double checkDiv = divisione(number1, number2);
                        if (number2 != 0)
                            System.out.println(checkDiv);
                        else
                            System.out.println("Non è possibile dividere un numero per 0");
                        break;
                    // operazione che ritorna true se number1 è un multiplo di number2 
                    // se isMultiple resta true anche dopo l'operazione N, number2 è un multiplo di number1 perchè la divisione non da resto
                    case 5:
                        if (number2 % number1 == 0)  /* (isMultiple = isMultiple && number2 % number1 == 0) = N */ 
                            System.out.println(number1 + " è un multiplo di " + number2);
                        else 
                            System.out.println(number1 + " non è un multiplo " + number2);
                }
            // stessa identica logica con operazioni che richiedono solo un input (Math class)
            } else {
                System.out.println(
                                "1 - Coseno\n" +
                                "2 - Seno\n" +
                                "3 - Radice\n" +
                                "4 - Logaritmo in base 10\n" +
                                "5 - Multiplo di 2, 3, 4 o 5?\n");
                int operator = input.nextInt();
                System.out.println("Inserisci il numero");
                double number1 = input.nextInt();
                switch (operator) {
                    case 1:
                        System.out.println(coseno(number1));
                        break;
                    case 2:
                        System.out.println(seno(number1));
                        break;
                    case 3:
                        double checkSqrt = radiceQuadrata(number1);
                        if (checkSqrt > 0)
                            System.out.println(checkSqrt);
                        else
                            System.out.println("Non possibile fare la radice quadrata di un numero negativo");
                        break;
                    case 4:
                        double checkLog = logaritmo(number1);
                        if (checkLog > 0)
                            System.out.println(checkLog);
                        else
                            System.out.println("Non è possibile calcolare il logaritmo di un numero minore di 0");
                        break;
                    // stessa logica del 'case 5' dello switch precedente ma applicata a 4 numeri noti e non ad una variabile
                    case 5:
                        if (number1 % 2 == 0) {
                            System.out.println("Multiplo di 2");
                        }else
                            System.out.println("Non è un multiplo di 2");

                        if (number1 % 3 == 0) {
                            System.out.println("Multiplo di 3");
                        }else 
                            System.out.println("Non è un multiplo di 3");

                        if (number1 % 4 == 0) {
                            System.out.println("Multiplo di 4");
                        }else
                        System.out.println("Non è un multiplo di 4");

                        if (number1 % 5 == 0) {
                            System.out.println("Multiplo di 5");
                        }else 
                        System.out.println("Non è un multiplo di 5");

                }
            }

            // Interruzione/Proseguimento programma tramite input
            System.out.println("Inserisci qualunque numero per continuare, 1 per interrompere");
            int askRun = input.nextInt();
            if (askRun == 1)
                run = false;
        }

    }

    // definisco i metodi per le operazioni
    public static int addizione(int number1, int number2) {
        return number1 + number2;
    }

    public static int sottrazione(int number1, int number2) {
        return number1 - number2;
    }

    public static int moltiplicazione(int number1, int number2) {
        return number1 * number2;
    }

    public static double divisione(int number1, int number2) {
        return number1 / (double) number2;
    }

    public static double coseno(double number1) {
        double num1Radiant = Math.toRadians(number1);
        return Math.cos(num1Radiant);
    }

    public static double seno(double number1) {
        double num1Radiant = Math.toRadians(number1);
        return Math.sin(num1Radiant);
    }

    public static double radiceQuadrata(double number1) {
        return Math.sqrt(number1);
    }

    public static double logaritmo(double number1) {
        return Math.log(number1);
    }

}