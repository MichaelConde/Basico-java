public class Ciclodowhile {
    public static void main(String[] args) {
        // Ciclo Do While
        int A=1;
        int B=1;
        int C=1;


        do {
            if(A%2==0){
                System.out.println(A+" Es par");
            } else {
                System.out.println(A+" Es inpar");
            }
            A++;
        } while (A<=10);
        
        do {
            switch (B) {
                case 1 -> System.out.println("Este es el caso 1");
    
                case 2 -> System.out.println("Este es el caso 2");
    
                case 3 -> System.out.println("Este es el caso 3");
    
                case 4 -> System.out.println("Este es el caso 4");
    
                case 5 -> System.out.println("Este es el caso 5");
            }
            B++;
        } while (B<=10);
        
        do {
          System.out.println(C);
            C++;
        } while (C<=50);
    }
}
