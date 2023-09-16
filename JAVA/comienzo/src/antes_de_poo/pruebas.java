package antes_de_poo;
import javax.swing.*;

public class pruebas {
    public static void main(String[] args){
        String numero_1 = JOptionPane.showInputDialog("Hola, pon un número: ");
        String numero_2 = JOptionPane.showInputDialog("introduce el primer número: ");

        int numero_1_num = Integer.parseInt(numero_1);
        int numero_2_num = Integer.parseInt(numero_2);

        int suma = numero_1_num + numero_2_num;

        System.out.println(suma);
        JOptionPane.showMessageDialog(null, suma);
    }
}
