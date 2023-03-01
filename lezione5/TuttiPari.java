    /**
     * metodo tuttiPari(int n) che chiede n numeri e ritorna true se sono tutti pari
     * non usare array (non memorizzare i numeri)
     * @param   n   quanti numeri chiedere
     * @return      true se tutti i numeri chiesti sono pari, altrimenti false
     */


import java.util.Scanner;

public class TuttiPari {
    public static void main(String[] args) {
        System.out.println("Quanti numeri vuoi inserire?");
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        boolean v = tuttiPari(n);
        if(v){
            System.out.println("Tutti numeri pari");
        }else{
            System.out.println("Non tutti i numeri sono pari");
        }
        
    }

    public static boolean tuttiPari(int n){
    Scanner input = new Scanner (System.in);
    boolean v = true;
        for(int i = 0; i < n && v; i++){
            System.out.println("inserisci numero");
            int temp = input.nextInt();
            if(temp%2 != 0){
                    v = false;
            }
            // v = v && n % 2 == 0;

        }
            return v;
    }   
}
