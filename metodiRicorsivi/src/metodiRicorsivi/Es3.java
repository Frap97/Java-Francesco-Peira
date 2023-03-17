package metodiRicorsivi;
//ES3: Si scriva un metodo ricorsivo che inverta Perdine dei caratteri in una stringa data e
// restituisca il risultato sotto forma di una nuova stringa.
// Per esempio, se Targomento è "libro" il risultato dovrebbe essere "orbil".
public class Es3 {
    public static String reverseString(String str){
        if(str.length() == 1){
            return str;
        }else{
            String lastChar = str.substring(str.length() -1, str.length());
            String reversed = reverseString(str.substring(0, str.length() - 1));
            return lastChar + reversed;
        }

    }

    public static void main(String[] args) {
        String str = "woooooowe";
        String rev = reverseString(str);
        System.out.println(rev);
    }
}
