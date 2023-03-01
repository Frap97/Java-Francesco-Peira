package Lezione3;
import java.util.Scanner;
public class Lezione3 {
    public static void main(String[] args) {
        System.out.println("Inserisci il tuo nome");
        Scanner tastiera = new Scanner(System.in);
        String nome = tastiera.nextLine();
        if(nome.substring(0, 1).equalsIgnoreCase("A")){
            System.out.println("Ciao");
        }else{
            System.out.println("Buongiorno");
        }

    }
}
