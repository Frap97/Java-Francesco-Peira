package Lezione3;
import java.util.Scanner;
public class CheckData{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci un giorno in formato numerico");
        int day = input.nextInt();
        System.out.println("Inserisci un mese in formato numerico");
        int month = input.nextInt();
     /*f(month == 2 && day > 28){
            System.out.println("Febbraio ha soli 28 giorni!");
        }else if((month == 4 || month == 6 || month == 9 || month == 11) && day > 30){
            System.out.println("Questo mese ha solo 30 giorni!");
        }else if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day > 31){
            System.out.println("Questo mese ha solo 31 giorni!");
        }else if(month > 12 || month == 0 || day == 0){
            System.out.println("Dati inseriti non validi!");

        }else{
            System.out.println("Sembra plausibile");
        }*/


        int soglia = 31;

        if(month == 2)
            soglia = 28;
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            soglia = 30;
        else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            soglia = 31;
        boolean corretto = 1<=month&& month<=12 && 1<=day && day>=soglia;
    }
}

