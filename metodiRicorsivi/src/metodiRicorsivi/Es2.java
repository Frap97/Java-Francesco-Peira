package metodiRicorsivi;
/*
ES2: Si scriva un metodo ricorsivo che conti il numero di vocali in una stringa.
        Suggerimento: ogni volta che si effettua una chiamata ricorsiva, si utilizzi il metodo substring della classe String
        per ottenere una nuova stringa formata dai caratteri compresi tra il secondo e l'ultimo della stringa originale.
        Lultima chiamata ricorsiva avverrà quando la stringa non contiene caratteri.
 */

public class Es2 {
    public static int countVocals(String str){
        if(str.length() == 0){
            return 0;
        }else{
           char firstChar = Character.toLowerCase(str.charAt(0));
           if(firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u'){
               return 1 + countVocals(str.substring(1));
           }else{
              return countVocals(str.substring(1));
           }
        }

    }

    public static void main(String[] args) {
        String str = "Quante vocali ho?";
        int vocals = countVocals(str);
        System.out.println(vocals);
    }
}
