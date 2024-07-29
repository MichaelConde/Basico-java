public class Ciclowhile {
    public static void main(String[] args) {
         //Ciclo while
    int X=1;
    int Y=1;
    int Z=1;
    
        while (X<=10) { 
            System.out.println("Este ciclo se a repetido: "+X);
            X++;
        }

        while (Y<=10) { 
            System.out.println("1 + "+Y+" = "+ (1+Y));
            Y++;
        }

        while (Z<=10) { 
            switch (Z) {
                case 1 -> System.out.println("Armenia");
    
                case 2 -> System.out.println("Cali");
    
                case 3 -> System.out.println("Bogota");
    
                case 4 -> System.out.println("Medellin");
    
                case 5 -> System.out.println("Manizales");
            }
            Z++;
        }
    }
}
