
/*
ES3 (tutti):
Scrivere i seguenti metodi:
dato un array, restituisce l'array al contrario. Es: {1,2,3,4,5,6} ritorna: {6,5,4,3,2,1}
params: array: int[]
return: int[]
 */
import java.util.Arrays;
public class Es3 {
    public static int[] inverti(int[] array) {
        int[] reversed = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reversed[j] = array[i];
            j++;
        }
        return reversed;
    }

    public static void main(String[] args) {
        int[]a={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(inverti(a)));
    }
}
