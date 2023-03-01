package src.Util;

public class Util {
    public static void stampa(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }
    public static void minimo(int[] array){
        int min = 1000000;
        for(int i = 0; i < array.length; i++){
           if(array[i] < min) array[i] = min;
        }
    }
    public static void indiceMinimo(int[] array){
        int min = 1000000;
        for(int i = 0; i < array.length; i++){
            if(array[i] < min) i = min;
        }
    }
    public static void sommaVettoriale(int[] array, int[] array2){
        for(int i = 0; i < array.length; i ++){
            for(int j = 0 ; j < )
        }
    }
}
