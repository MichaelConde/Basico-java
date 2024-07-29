public class Casos {
    public static void main(String[] args) {
        Integer caso1=1;
        Integer caso2=4;
        Integer caso3=5;


        switch (caso1) {
            case 1 -> System.out.println("Pera");

                case 2 -> System.out.println("Manzana");

                case 3 -> System.out.println("Naranjan");

                case 4 -> System.out.println("Uva");

                case 5 -> System.out.println("Fresa");
        }

        switch (caso2) {
            case 1 -> System.out.println("Perro");

                case 2 -> System.out.println("Pajaro");

                case 3 -> System.out.println("Gato");

                case 4 -> System.out.println("Hamster");

                case 5 -> System.out.println("Conejo");
        }

        switch (caso3) {
            case 1 -> System.out.println("Armenia");

            case 2 -> System.out.println("Cali");

            case 3 -> System.out.println("Bogota");

            case 4 -> System.out.println("Medellin");

            case 5 -> System.out.println("Manizales");
        }
    }
}
