package antes_de_poo;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class seguimos_bucleseifs {
    public static void main(String[] args){

        Scanner entrada_datos = new Scanner(JOptionPane.showInputDialog("Mete tu edad: "));

        int edad = entrada_datos.nextInt();
        
        if (edad < 18){
            JOptionPane.showMessageDialog(null, "Buenas xavalín.");
        }
        else if (edad < 40) {
            JOptionPane.showMessageDialog(null, "Aún no llegaste a la vejez, enhorabuena.");
        }
        else if (edad < 60){
            JOptionPane.showMessageDialog(null, "Poco te queda pa la jubilación.");
        }
        else{
            JOptionPane.showMessageDialog(null, "Pringao");
        }

        double edad_double = ((double)edad);

        System.out.print("Tienes ");
        System.out.printf("%1.2f", edad_double);
        System.out.print(" Años");
    }
}
