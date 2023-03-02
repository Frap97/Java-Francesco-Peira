package eserciziArray;

public class Util {
		public static void stampa(int[] array){
	        for(int i = 0; i < array.length; i++){
	            System.out.println(array[i]);
	        }

	    }
	    public static int minimo(int[] array){
	        int min = 1000000;
	        for(int i = 0; i < array.length; i++){
	           if(array[i] < min) min = array[i];
	        }
	        return min;
	    }
	    public static int indiceMinimo(int[] array){
	        int min = 1000000;
	        for(int i = 0; i < array.length; i++){
	            if(array[i] < min) min = i ;
	        }
	        return min;
	    }
	    public static int[] sommaVettoriale(int[] array, int[] array2){
	    	int[] res = new int[array.length];;
	        for(int i = 0; i < array.length; i ++){
	          
	            	res[i] = array[i]+array2[i];
	            
	        }	return res;
	    }

}
