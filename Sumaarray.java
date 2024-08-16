
import javax.swing.JOptionPane;

public class Sumaarray {
    public static void main(String[] args) {
        int x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo"));
        int array1[]=new int[x];
        int array2[]=new int[x];
        int array3[]=new int[x];
        for (int i = 0; i < array1.length; i++) {
            array1[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de la casilla "+i));
            System.out.print(array1[i]+"|");
        }
        System.out.println("");
        for (int i = 0; i < array2.length; i++) {
            array2[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de la casilla "+i));
            System.out.print(array2[i]+"|");
        }
        System.out.println("");
        for (int i = 0; i < array3.length; i++) {
            array3[i]=array1[i]+array2[i];
            System.out.print(array3[i]+"|");
        }
            System.err.println("");

         int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo"));
        int array1_0[]=new int[n];
        int array2_0[]=new int[n];
        int array3_0[]=new int[n];
        for (int i = 0; i < array1_0.length; i++) {
            array1_0[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de la casilla "+i));
            System.out.print(array1_0[i]+"|");
        }
        System.out.println("");
        for (int i = 0; i < array2_0.length; i++) {
            array2_0[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de la casilla "+i));
            System.out.print(array2_0[i]+"|");
        }
        System.out.println("");
        for (int i = 0; i < array3_0.length; i++) {
            array3_0[i]=array2_0[i]-array1_0[i];
            System.out.print(array3_0[i]+"|");
        }
    }
}
