/*ES2:
Chiedere in input 10 numeri e stampare se i numeri sono ordinati crescentemente o decrescentemente.
*/
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Es2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int []a =new int [10];
        int []unsorted= a;
  //      int []sortedRev= new int[10];
        System.out.println("Inserisci 10 numeri");
        for(int i = 0; i < a.length; i++){
           a[i]=Integer.parseInt(input.nextLine());
        }
        Arrays.sort(a);
        if(unsorted == a) System.out.println("Crescente");
//        sortedRev =  Arrays.sort(a, Collections.reverseOrder());


    }
}
