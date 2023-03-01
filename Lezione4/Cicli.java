/**
 * Ci sono 3 cicli in java, while, do while e ciclo for.
 * while(condizione){
 * //codice
 * }
 * Se la condizione è vera il codice viene ripetuta, se è falsa non entro proprio
 */

import java.util.Scanner;
 public class Cicli {
    public static void main(String[] args) {
      int n = 100;
      int i = 1;
        while(i <= n){
         System.out.println(i);
         i++;
        }

        for(int j = 0; j < n;j++){
          System.out.println(j + 1);  
        }
        //inizializzo e prendo l'index (quantità di numeri)
        Scanner input = new Scanner (System.in);
        System.out.println("Di quanti numeri vuoi fare la media?");
        int index = input.nextInt();
        double res = 0;

        //ciclo for(input e totale somma)
        for(int k = 0; k < index; k++){
          System.out.println("Inserisci numero:");
          int temp = input.nextInt();
          res += temp;
        }

        //media e stampa
        res = res / index;
        System.out.println("La media è " + res);

        int z = 0;
        res = 0;
        
        //stessa cosa ma con il ciclo while
        while(z < index){
          System.out.println("Inserisci numero:");
          int temp = input.nextInt();
          res += temp;
          z++;
        }
        res = res / index;
        System.out.println("La media è " + res);

        double result = 0;  //dichiarare result come double è sufficiente a trasformare il risultato finale in double
        index = 0;
        boolean run = true;
        while (run){  //in alternativa si può evitare di usare un boolean è mettere direttamente come condizione (temp (dichiarata in precedenza) != 0)
          System.out.println("Inserisci un numero alla volta e farò la media (-1 per interrompere):");
          int temp = input.nextInt();
          if (temp == -1)
              run = false;
          else
            result += temp;
            index++;
        }
        result = result / index;
        System.out.println("La media è " + result);
        
        result = 0;
        index = 0;
        double temp = 0;
        
        
        //do while, soluzione più compatta e leggibile ma in questo caso non è la soluzione migliore perchè in caso il primo numero fosse -1, verrebbe accettatp come valore
        do{
          System.out.println("Inserisci un numero alla volta e farò la media (-1 per interrompere):");
          temp = input.nextInt();
          result += temp;
          index++;
        }while(temp != -1);

        result = result / index;
        System.out.println("La media è " + result);
        }

  }

 