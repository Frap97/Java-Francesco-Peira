import java.util.Scanner;
public class EsCicli {
    public static void main(String[] args) {
        // ESERCIZIO 1: calcolare la somma dei primi n numeri dispari.
        // esempio: n = 9, calcolare 1 + 3 + 5 + 7+ 9

        // ESERCIZIO 2: invertire una stringa s
        // esempio: s = "ciao", restituire "oaic"

        // ESERCIZIO 3: programma che controlla se una parola è palindroma
        // esempio: anna : true, carla : false

        Scanner input = new Scanner (System.in);
         System.out.println("Dimmi un numero e ti darò la somma di tutti i numeri dispari che contiene");
         int numb = Integer.parseInt(input.nextLine());  //utilizza sempre nextLine, converti prima in intero se serve, così eviti problemi per gli 'a capo' 
         int res = 0;
         for(int i = 1; i <= numb; i += 2){
            res += i;
         }    
        System.out.println(res);  
        


        String output = "";
        
        System.out.println("Dimmi parola e la reverserò");
        String word = input.nextLine();
        int wordLenght = word.length();
        for(int i = wordLenght - 1; i >= 0; i--){
            String temp = word.substring(i, i + 1);
            output += temp; 
        }
        System.out.println(output);


        String output2 = "";

        System.out.println("Inserisci una parola e ti dirò se è palindroma");       
        String word2 = input.nextLine();
        int wordLenght2 = word2.length();
        for(int i = wordLenght2 - 1; i >= 0; i--){
            String temp = word2.substring(i, i + 1);
            output2 += temp; 
        }
       String StrNoSpace = (word2.replaceAll("\\s+",""));
       String outNoSpace = (output2.replaceAll("\\s+",""));
       if(outNoSpace.equalsIgnoreCase(StrNoSpace))     
                    System.out.println("Palindroma!");
       else    
                    System.out.println("Non è palindroma");


                    //metodo alternativo che divide a metà la stringa e compara le due substring che ottengo come output (0-w/2)(w/2-w.length-1)
        boolean palindromo = true;
        int i = 0;
       
        while(i < word2.length()/2){
       
            String prima = word2.substring(i, i +1);
            String seconda = word2.substring(word2.length() - 1 - i, word2.length() - i);
            palindromo = palindromo && prima.equalsIgnoreCase(seconda);
            i++;           
        }
        System.out.println(palindromo);

    }
} 

