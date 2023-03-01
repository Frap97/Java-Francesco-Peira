import java.util.Scanner;
public class DoWhile {
 public static void main(String[] args) {
    // creare una calcolatrice
    Scanner input = new Scanner (System.in);
    String risposta;
    int cont = 0;
do {

System.out.println("1- Incrementa \n" + 
                    "2 - Decrementa\n" +
                    "3 - Esci");
         risposta = input.nextLine();
         if (risposta.equals("1")){
                    cont++;
                    System.out.println(cont);
         }else if(risposta.equals("2")){
                    cont--;
                    System.out.println(cont);
        }
}while(!risposta.equals("3"));

}   
}
