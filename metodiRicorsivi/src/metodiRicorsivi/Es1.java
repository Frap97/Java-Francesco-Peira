package metodiRicorsivi;
//ES1: scrivere un metodo ricorsivo che calcoli la somma di un array di interi
public class Es1 {
    public static int ricorsiveSum(int[] array, int n){
        int sum = 0;
        if(n == 0){
            return 0;
        }else{
            sum += array[n-1] + ricorsiveSum(array, n-1);
        }

        return sum;
    }
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5, 6};
        System.out.println(ricorsiveSum(a, a.length));
    }
}
