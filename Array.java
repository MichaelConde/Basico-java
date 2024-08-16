
import javax.swing.JOptionPane;

public class Array {
    public static void main(String[] args) {
        String arreglo1[]=new String[5];
        arreglo1[0]="A";
        arreglo1[1]="B";
        arreglo1[2]="C";
        arreglo1[3]="D";
        arreglo1[4]="E";
        System.out.println(arreglo1[0]);
        System.out.println(arreglo1[1]);
        System.out.println(arreglo1[2]);
        System.out.println(arreglo1[3]);
        System.out.println(arreglo1[4]);

        int arreglo2[]={1,2,3,4,5};
        System.out.println(arreglo2[0]);
        System.out.println(arreglo2[1]);
        System.out.println(arreglo2[2]);
        System.out.println(arreglo2[3]);
        System.out.println(arreglo2[4]);

        
           int x= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo"));
            int arreglo3[]=new int[x];

            for (int i = 0; i < arreglo3.length; i++) {
                arreglo3[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la posicion "+i));
                System.out.print("|"+arreglo3[i]);
            }
    
    }
}
