public class Condicionales {
    public static void main(String[] args) {
        
        String name="Michael";
        int yearsold=18;
        int num1=20;
        double decim=0.3;
        double resul=num1*decim;
        
        if(yearsold>=18){
            System.out.println("Usted es mayor de edad");
        }

        if(num1==20){
            System.out.println("Su numero es 20");
        }else{
            System.out.println("Su numero no es 20");
        }

        if(resul<num1){
            System.out.println("Su resultado del porcentaje es: "+resul);
            if (yearsold>=18) {
                System.out.println(name+" es mayor de edad");
            }
        } else{
            System.out.println("El porcentaje es incorrecto");
        }
    }
}
