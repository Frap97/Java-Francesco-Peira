import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        // variabile boolean che interrompe il programma se richiesto
        boolean run = true;

        // ciclo per proeguire il programma
        while (run) {
            
            // Inizializzo
            Scanner tastiera = new Scanner(System.in);
            int res = 0;

            // Divido le calcolatrici in base agli input che dovrò ricevere
            System.out.println(
                    "1 - Calcolatrice\n" +
                    "2 - Calcolatrice Scientifica");
            int TypeCalcolatrice = tastiera.nextInt();

            // scelta operatore e input numerici
            if (TypeCalcolatrice == 1) {
                System.out.print(
                        "Scegli l'operazione:\n" +
                        "1 - Addizione\n" +
                        "2 - Sottrazione\n" +
                        "3 - Moltiplicazione\n" +
                        "4 - Divisione\n");

                int operatore = tastiera.nextInt();
                System.out.println("Inserisci il primo numero");
                int num1 = tastiera.nextInt();
                System.out.println("Inserisci il secondo numero");
                int num2 = tastiera.nextInt();

                // richiamo del metodo che si occuoera di fare le dovute verifiche, calcolare e
                // stampare il risultato
                switch (operatore) {
                    case 1:
                        Addizione(num1, num2, res);
                        break;
                    case 2:
                        Sottrazione(num1, num2, res);
                        break;
                    case 3:
                        Moltiplicazione(num1, num2, res);
                        break;
                    case 4:
                        Divisione(num1, num2, res);
                        break;
                    default:
                        System.out.println("Scelta non valida");
                }
            } else {
                System.out.println(
                                "1 - Coseno\n" +
                                "2 - Seno\n" +
                                "3 - Radice\n" +
                                "4 - Logaritmo in base 10");
                int operatore = tastiera.nextInt();
                System.out.println("Inserisci il numero");
                double num1 = tastiera.nextInt();
                switch (operatore) {
                    case 1:
                        Coseno(num1, res);
                        break;
                    case 2:
                        Seno(num1, res);
                        break;
                    case 3:
                        RadiceQuadrata(num1, res);
                        break;
                    case 4:
                        Logaritmo(num1, res);
                        break;
                    default:
                        System.out.println("Scelta non valida");
                }
            }

            // Interruzione/Proseguimento programma tramite input
            System.out.println("Inserisci qualunque numero per continuare, 1 per interrompere");
            int askRun = tastiera.nextInt();
            if (askRun == 1)
                run = false;
        }

    }

    // definisco i metodi per le operazioni
    public static void Addizione(int num1, int num2, int res) {
        res = num1 + num2;
        System.out.println(res);
    }

    public static void Sottrazione(int num1, int num2, int res) {
        res = num1 - num2;
        System.out.println(res);
    }

    public static void Moltiplicazione(int num1, int num2, int res) {
        res = num1 * num2;
        System.out.println(res);
    }

    public static void Divisione(int num1, int num2, double res) {
        if (num2 != 0) {
            res = num1 / (double) num2;
            System.out.println(res);
        } else
            System.out.println("Non è possibile diviere un numero per 0");

    }

    public static void Coseno(double num1, double res) {
        double num1Radiant = Math.toRadians(num1);
        res = Math.cos(num1Radiant);
        System.out.println(res);
    }

    public static void Seno(double num1, double res) {
        double num1Radiant = Math.toRadians(num1);
        res = Math.sin(num1Radiant);
        System.out.println(res);
    }

    public static void RadiceQuadrata(double num1, double res) {
        if (num1 > 0) {
            res = Math.sqrt(num1);
            System.out.println(res);
        } else {
            System.out.println("Non è possibile calcolare la radice quadrata di un numero minore di 0");

        }
    }

    public static void Logaritmo(double num1, double res) {
        if (num1 > 0) {
            res = Math.log(num1);
            System.out.println(res);
        } else {
            System.out.println("Non è possibile calcolare il logaritmo di un numero minore di 0");

        }
    }

}