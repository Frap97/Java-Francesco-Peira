
    /** metodo dado() che restituisce un numero da 1 a 6. Usare la classe Random
     * @return      int da 1 a 6
     */


import java.util.Random;


public class Dado {
    public static void main(String[] args) {
       System.out.println(dado());
    }
    public static int dado(){
        Random rand = new Random();
        int max = 6;
        return rand.nextInt(max) + 1;
    };
}