public class Metodi {
    
    // esistono metodi di classe (statici) e di istanza (metodi degli oggetti, presenti nei linguaggi OOP, sono quelli in cui bisogna fare new OGGETTO)
    // un metodo è una sequenza di codice riutilizzabile (difinizione e chiamata)
    // definizione identificare se è publico o meno (public/private), se è statico (se non lo è non si scrive nulla),
    // il tipo di ritorno (void se vuoto, tipo se ritorna qualcosa), nome metodo {  METODO }
    public static void main(String[] args) {
        saluta("Francesco");
        System.out.println(somma(3, 4)); 
        int bigger = max(10, 5);
        System.out.println(bigger);
        String a = capital("ciao");

    }

    public static void saluta(String nome){  // DISEGNA STACK A CASA
        System.out.println("Ciao " + nome);
    }
    public static int somma (int num1, int num2){
        return num1 + num2;
    }
    public static int max(int num1, int num2){

        int a = num1 - num2;
        int b = num2 - num1;
        int res;
        if(a > b)
            res = num1;
        else 
            res = num2;
        return res;
    }
    public static void capital(String word){  //da finire a casa
        char c = word.charAt(0);
        String[] wordNoCap = "";

        for(int i = 0; i < word.length(); i++){
            if(i == 0) continue;
            else    
               worldNoCap.push(word(i))
        }

    }
    
}

