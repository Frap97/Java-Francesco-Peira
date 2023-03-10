//Data una stringa restituisce la stringa eliminando gli spazi. Usare substring!
import java.util.Scanner;

public class Es4 {
    // public static String noSpace(String str){
    //   String newStr = "";
    //   for(int i = 0; i < str.length(); i++){
    //      if(!str.substring(i, i+1).equals(" ")){
    //         newStr += str[i];
    //    }
    //   }
    //   return newStr;
    //  }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String result = str.replaceAll("\\s+","");
        System.out.println(result);

      // System.out.println(noSpace(str));
    }
}
