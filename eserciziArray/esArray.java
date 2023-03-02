package eserciziArray;
/* metodo minimo -> restituisce il valore più piccolo
*  metodo indiceMinimo -> restituisce l'indice del valore più piccolo
*  metodo sommaVettoriale: dati due array a1 e a2, restituire a3
*  che somma elemento per elemento
*  ES: [1,2,3] e [2,3,4,5] : ritorno [3,5,7,5]
*  @author Francesco Peira
*/
import eserciziArray.Util;
public class esArray {
	public static void main(String [] args) {
		int[]a = {1,2,3};
		int[]b = {4,5,6};
		System.out.println("Stampa:");
		Util.stampa(a);
		System.out.println("Minimo:\n" + Util.minimo(a));
		System.out.println("Indice minimo:\n" + Util.indiceMinimo(a));
		System.out.println("Somma vettoriale:");
		int[] res = Util.sommaVettoriale(a, b);
		for(int i = 0; i < res.length; i++) {
		System.out.println(res[i]);	
		}
	}
}
