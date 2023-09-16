// package antes_de_poo;

// import java.util.Scanner;

// import javax.swing.JOptionPane;

// public class con_switch_case {
    
//     public static void main(String[] args){

//         Scanner entrada = new Scanner(System.in);
//         System.out.println("Elige una opción:\n1 - Cuadrado\n2 - Rectángulo\n3 - Triángulo\n4 - Círculo");
//         int figura = entrada.nextInt();
        
//         switch (figura){
//         case 1:
            
//             int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado: "));
            
//             System.out.println("El área del cuadrado es: " + Math.pow(lado, 2));
//             break;
        
//         case 2:
//             int base_rectangulo = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del rectágulo: "));
//             int altura_rectangulo = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del rectágulo: "));

//             System.out.println("El área del cuadrado es: " + (base_rectangulo * altura_rectangulo));
//             break;

//         case 3:
//             int base_triangulo = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del triángulo: "));
//             int altura_triangulo = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del triángulo: "));

//             System.out.println("El área del cuadrado es: " + (base_triangulo * altura_triangulo)/2);
//             break;

//         case 4:
//             int radio_circulo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del círculo: "));

//             System.out.print("El área del círculo es: ");
//             System.out.printf("%1.2", (Math.pow(radio_circulo, 2) * Math.PI));
//             break;
        
//             default:
//                 System.out.print("La opción no es correcta.");
//                 break;
//         }

//     }

// }
