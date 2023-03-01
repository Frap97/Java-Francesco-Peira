    /**
    * metodo soloVocali(String s) che restituisce le vocali della stringa
     * esempio: "Ciao come stai?" -> "iaooeai"
     * @param   s   una stringa
     * @return      le vocali della stringa
     * */

    
import java.util.Scanner;
public class TutteVocali {
    public static void main(String[] args) {
        String sum = "";
        System.out.println("Inserisci una parola e ritornerò le vocali");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String output  = soloVocali(s, sum);
        System.out.println(output);

    }

    public static String soloVocali(String s, String sum){
            s = s.toLowerCase();

        for(int i = 0; i < s.length(); i++){

            if(s.substring(i , i + 1).equals("a"))  sum += "a";
            if(s.substring(i , i + 1).equals("e"))  sum += "e";
            if(s.substring(i , i + 1).equals("i"))  sum += "i";
            if(s.substring(i , i + 1).equals( "o") ) sum += "o";
            if(s.substring(i , i + 1).equals( "u"))  sum += "u";
         

    } 
    return sum;
}
}